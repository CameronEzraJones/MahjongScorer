package org.cejones.java9.mahjongscorer.scorer;

public enum ScorerType {
    AMERICAN("american"),
    CHINESE("chinese"),
    HONGKONG("hongkong"),
    JAPANESE("japanese");

    private final String value;

    ScorerType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
