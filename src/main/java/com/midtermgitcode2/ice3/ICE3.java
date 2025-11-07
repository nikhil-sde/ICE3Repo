/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.midtermgitcode2.ice3;

/**
 *
 * @author nikhil
 */
public class ICE3 {

    public static void main(String[] args) {
        // Create clients
        Client peter = new Client("Peter");
        Client paula = new Client("Paula");

        // Register clients with the LittleGirl
        Client[] clients = {peter, paula};
        LittleGirl littleGirl = new LittleGirl(clients);

        // Register LittleGirl with the Bakery
        Bakery bakery = new Bakery(littleGirl);

        // Start client activities and bakery thread
        littleGirl.startClientActivities();
        bakery.run();
    }
}
