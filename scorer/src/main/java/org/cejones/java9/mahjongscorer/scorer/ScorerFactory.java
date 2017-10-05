package org.cejones.java9.mahjongscorer.scorer;

public interface ScorerFactory {
    public Scorer getScorer(ScorerType scorer);
}
