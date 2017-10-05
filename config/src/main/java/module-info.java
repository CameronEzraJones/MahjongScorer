module org.cejones.java9.mahjongscorer.config {
    requires java.base;
    requires spring.beans;
    requires spring.context;
    requires spring.core;

    requires org.cejones.java9.mahjongscorer.scorer;
    requires org.cejones.java9.mahjongscorer.scorer.american;
    requires org.cejones.java9.mahjongscorer.scorer.chinese;
    requires org.cejones.java9.mahjongscorer.scorer.hongkong;
    requires org.cejones.java9.mahjongscorer.scorer.japanese;

    exports org.cejones.java9.mahjongscorer.config;
}