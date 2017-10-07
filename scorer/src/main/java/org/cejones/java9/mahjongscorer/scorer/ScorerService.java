package org.cejones.java9.mahjongscorer.scorer;

public interface ScorerService {
    public int getScore(int[] hand, ScorerType type);
}
