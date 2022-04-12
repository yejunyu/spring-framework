package com.spring.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author : YeJunyu
 * @description :
 * @email : yyyejunyu@gmail.com
 * @date : 2022/2/20
 */
@Slf4j
public class TestSpring {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void test(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.refresh();
		logger.debug("aaaaa");
	}

}
