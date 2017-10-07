package org.cejones.java9.mahjongscorer.api.controller;

import org.cejones.java9.mahjongscorer.scorer.Scorer;
import org.cejones.java9.mahjongscorer.scorer.ScorerService;
import org.cejones.java9.mahjongscorer.scorer.ScorerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MahjongScorerController {
    @Autowired
    private ScorerService scorerService;

    @RequestMapping("/ping")
    public String ping() {
        return "ping";
    }

    @RequestMapping("/scoreHand/{method}")
    public int scoreHand(@PathVariable String method, @RequestParam int[] exposed, @RequestParam int[] concealed, @RequestParam int winType) {
        //126976 - First Mahjong tile
        //127018 - Last Mahjong tile
        ScorerType scoreMethodEnum = ScorerType.valueOf(method);
        System.out.println(exposed);
        return scorerService.getScore(exposed, scoreMethodEnum);
    }
}