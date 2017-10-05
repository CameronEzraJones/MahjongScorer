module org.cejones.java9.mahjongscorer.scorer.chinese {
    requires java.base;

    requires transitive org.cejones.java9.mahjongscorer.scorer;

    provides org.cejones.java9.mahjongscorer.scorer.Scorer with
            org.cejones.java9.mahjongscorer.scorer.chinese.ChineseScorer;

    exports org.cejones.java9.mahjongscorer.scorer.chinese;
}