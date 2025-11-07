package com.midtermgitcode2.ice3;

import java.util.Random;

public class LittleGirl {

	private Client[] clients;
	private int nextClient;

        public LittleGirl(Client[] clients) {
            this.clients = clients;
        }
        
	public void breadReady() {
            if (clients.length == 0) return;

            Client client = clients[nextClient];
            System.out.println("******* delivered bread to " + client.getName());
            client.breadReady();

            nextClient = (nextClient + 1) % clients.length;
	}

	public void startClientActivities() {
	        new Thread(() -> {
                    Random rand = new Random();
                    while (true) {
                        for (Client client : clients) {
                            client.doActivity();
                        }
                        try {
                            Thread.sleep(3000 + rand.nextInt(3000));
                        } catch (InterruptedException e) {
                            System.out.println("Activity thread interrupted: " + e.getMessage());
                        }
                    }
                }).start();
            }
	}

