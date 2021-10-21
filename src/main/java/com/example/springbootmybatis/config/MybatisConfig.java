package com.example.springbootmybatis.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com/example/springbootmybatis/mapper")
public class MybatisConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource, ApplicationContext application) throws Exception {

        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(dataSource);
        factory.setVfs(SpringBootVFS.class); // Spring Boot 전용 VFS 사용
        factory.setMapperLocations(application.getResources("classpath:sqls/*.xml"));
        factory.setTypeAliasesPackage("com/example/springbootmybatis/dto");
        return (SqlSessionFactory)factory.getObject();
    }
}
