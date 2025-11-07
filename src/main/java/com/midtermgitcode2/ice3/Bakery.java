package com.midtermgitcode2.ice3;

import java.util.Random;

public class Bakery {

	private LittleGirl littleGirl;
	private Random rand = new Random();
        
        public Bakery(LittleGirl littleGirl) {
            this.littleGirl = littleGirl;
        }

	public void run() {
            while (true) {
                try {
                    Thread.sleep((1 + rand.nextInt(10)) * 1000);
                } catch (InterruptedException e) {
                    System.out.println("Exception happened: " + e.getMessage());
                }

                littleGirl.breadReady();
            }
	}

}