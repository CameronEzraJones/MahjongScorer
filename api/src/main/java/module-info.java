module org.cejones.java9.mahjongscorer.api {
    requires spring.boot;
    requires spring.boot.autoconfigure;

    requires spring.web;
    requires spring.beans;

    requires org.cejones.java9.mahjongscorer.config;
    requires org.cejones.java9.mahjongscorer.scorer;

    uses org.cejones.java9.mahjongscorer.scorer.Scorer;

    exports org.cejones.java9.mahjongscorer.api;
}