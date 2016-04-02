package com.chakannom.chakanmodule.multipledatasource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.chakannom.chakanmodule.multipledatasource.MultipleDataSourceApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MultipleDataSourceApplication.class)
@WebAppConfiguration
public class MultipleDataSourceApplicationTests {

	@Test
	public void contextLoads() {}

}