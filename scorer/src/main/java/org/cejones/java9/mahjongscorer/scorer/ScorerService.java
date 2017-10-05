package org.cejones.java9.mahjongscorer.scorer;

public interface ScorerService {
    public int getScore(String hand, ScorerType type);
}
