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
					// Bake bread at random intervals (1–10 seconds)
                    Thread.sleep((1 + rand.nextInt(10)) * 1000);
                } catch (InterruptedException e) {
                    System.out.println("Exception happened: " + e.getMessage());
                }

				// When bread is ready, notify the LittleGirl
                littleGirl.breadReady();
            }
	}

}
