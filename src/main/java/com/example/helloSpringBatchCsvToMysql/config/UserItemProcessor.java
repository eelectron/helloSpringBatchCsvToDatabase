package com.example.helloSpringBatchCsvToMysql.config;

import org.springframework.batch.item.ItemProcessor;

import com.example.helloSpringBatchCsvToMysql.model.User;

public class UserItemProcessor implements ItemProcessor<User, User>{

	@Override
	public User process(User item) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
