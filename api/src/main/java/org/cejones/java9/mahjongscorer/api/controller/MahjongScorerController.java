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

    @RequestMapping("/scoreHand/{hand}")
    public int scoreHand(@PathVariable String hand, @RequestParam String scoreMethod) {
        ScorerType scoreMethodEnum = ScorerType.valueOf(scoreMethod);
        return scorerService.getScore(hand, scoreMethodEnum);
    }
}