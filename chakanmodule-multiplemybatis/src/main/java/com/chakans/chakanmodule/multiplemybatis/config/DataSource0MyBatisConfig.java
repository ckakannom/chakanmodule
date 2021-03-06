package com.chakans.chakanmodule.multiplemybatis.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chakans.chakanmodule.multiplemybatis.annotation.DataSource0;

@Configuration
@MapperScan(basePackages=MyBatisConfig.BASE_PACKAGE, annotationClass=DataSource0.class, sqlSessionFactoryRef="dataSource0SqlSessionFactory")
public class DataSource0MyBatisConfig extends MyBatisConfig {

	@Override
	@Bean(name="dataSource0SqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource0") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		configureSqlSessionFactory(sqlSessionFactoryBean, dataSource);
		return sqlSessionFactoryBean.getObject();
	}


}
