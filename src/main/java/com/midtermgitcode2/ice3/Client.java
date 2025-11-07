package com.midtermgitcode2.ice3;

import java.util.Random;

public class Client {

	private String name;
	private Random rand = new Random();
        
        public Client(String name) {
            this.name = name;
        }

	// Randomly choose an activity
	public void doActivity() {
            String[] activities = {
                "cleaning the barn",
                "walking the animals",
                "washing his truck",
                "churning butter",
                "and Paula line dancing"
            };
            System.out.println(name + " " + activities[rand.nextInt(activities.length)] + ".");
	}

	public void breadReady() {
            System.out.println(name + " received his bread.");
	}

	public String getName() {
            return this.name;
	}

}
