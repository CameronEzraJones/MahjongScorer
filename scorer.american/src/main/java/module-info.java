module org.cejones.java9.mahjongscorer.scorer.american {
    requires java.base;

    requires org.cejones.java9.mahjongscorer.scorer;

    provides org.cejones.java9.mahjongscorer.scorer.Scorer with
            org.cejones.java9.mahjongscorer.scorer.american.AmericanScorer;

    exports org.cejones.java9.mahjongscorer.scorer.american;
}