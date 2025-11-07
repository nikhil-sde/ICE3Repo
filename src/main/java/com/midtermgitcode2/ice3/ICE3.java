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
        Client peter = new Client("Peter");
        Client paula = new Client("Paula");

        Client[] clients = {peter, paula};
        LittleGirl littleGirl = new LittleGirl(clients);

        Bakery bakery = new Bakery(littleGirl);

        littleGirl.startClientActivities();
        bakery.run();
    }
}
