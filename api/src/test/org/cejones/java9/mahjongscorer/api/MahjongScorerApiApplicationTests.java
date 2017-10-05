package org.cejones.java9.mahjongscorer.api;

import org.hibernate.validator.internal.metadata.raw.BeanConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = {BeanConfiguration.class})
@RunWith(SpringRunner.class)
@SpringBootTest
public class MahjongScorerApiApplicationTests {
	@Test
	public void contextLoads() {
	}

}
