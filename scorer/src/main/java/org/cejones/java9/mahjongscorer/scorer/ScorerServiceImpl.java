package org.cejones.java9.mahjongscorer.scorer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScorerServiceImpl implements ScorerService {

    @Autowired
    private ScorerFactory factory;

    @Override
    public int getScore(int[] hand, ScorerType type) {
        Scorer scorer = factory.getScorer(type);
        return scorer.scoreHand(hand);
    }
}
