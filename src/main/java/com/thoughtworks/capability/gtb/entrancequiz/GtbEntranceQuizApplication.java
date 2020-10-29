package com.thoughtworks.capability.gtb.entrancequiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// TODO GTB-工程实践: * 注意单一职责，group和student应该有单独的Controller和Service
// TODO GTB-知识点: * 需要了解Restful实践
// TODO GTB-知识点: * 需要了解下三层架构
// TODO GTB-知识点: * 需要了解依赖注入
// TODO GTB-知识点: * 了解下lombok的使用
// TODO GTB-知识点: * 需要了解Java8 Stream的使用
// TODO GTB-测试: * 无测试
// TODO GTB-完成度: * 完成度太低，其它维度无法正常考察
@SpringBootApplication
public class GtbEntranceQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtbEntranceQuizApplication.class, args);
	}

}
