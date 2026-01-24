package com.reflection.jsongenerator;

public class UseJsonGenerator {
    public static void main(String[] args) {
	User user = new User("Ramanujan", 28);
	
	String json = JsonUtil.toJson(user);
	System.out.println(json);
    }
}
