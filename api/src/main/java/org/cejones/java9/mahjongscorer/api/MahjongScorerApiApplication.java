package org.cejones.java9.mahjongscorer.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.cejones.java9.mahjongscorer.config", "org.cejones.java9.mahjongscorer.api"})
public class MahjongScorerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MahjongScorerApiApplication.class, args);
	}
}
