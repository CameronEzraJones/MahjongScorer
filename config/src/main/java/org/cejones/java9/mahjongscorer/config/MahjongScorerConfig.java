package org.cejones.java9.mahjongscorer.config;

import org.cejones.java9.mahjongscorer.scorer.ScorerFactory;
import org.cejones.java9.mahjongscorer.scorer.ScorerService;
import org.cejones.java9.mahjongscorer.scorer.ScorerServiceImpl;
import org.cejones.java9.mahjongscorer.scorer.american.AmericanScorer;
import org.cejones.java9.mahjongscorer.scorer.chinese.ChineseScorer;
import org.cejones.java9.mahjongscorer.scorer.hongkong.HongKongScorer;
import org.cejones.java9.mahjongscorer.scorer.japanese.JapaneseScorer;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = {"org.cejones.java9.mahjongscorer.scorer",
        "org.cejones.java9.mahjongscorer.scorer.american",
        "org.cejones.java9.mahjongscorer.scorer.chinese",
        "org.cejones.java9.mahjongscorer.scorer.hongkong",
        "org.cejones.java9.mahjongscorer.scorer.japanese"})
public class MahjongScorerConfig {
    @Bean
    public FactoryBean serviceLocatorFactoryBean() {
        ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
        factoryBean.setServiceLocatorInterface(ScorerFactory.class);
        return factoryBean;
    }

    @Bean(name = "american")
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public AmericanScorer getAmericanScorer() {
        return new AmericanScorer();
    }

    @Bean(name = "chinese")
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ChineseScorer getChineseScorer() {
        return new ChineseScorer();
    }

    @Bean(name = "hongkong")
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public HongKongScorer getHongKongScorer() {
        return new HongKongScorer();
    }

    @Bean(name = "japanese")
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public JapaneseScorer getJapaneseScorer() {
        return new JapaneseScorer();
    }

    @Bean
    public ScorerService scorerService() {
        return new ScorerServiceImpl();
    }
}
