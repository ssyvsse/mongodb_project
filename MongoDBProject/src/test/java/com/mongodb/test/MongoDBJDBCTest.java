package com.mongodb.test;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * @author llb
 *
 * @Date 2018年2月3日
 */
public class MongoDBJDBCTest {
	public static void main(String args[]) {
		try {
			// 连接到 mongodb 服务 
			MongoClient mongoClient = new MongoClient("localhost", 27017);

			// 连接到数据库
			MongoDatabase mongoDatabase = mongoClient.getDatabase("ssyvsse");
			mongoDatabase.drop();
			mongoClient.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
	}
}
