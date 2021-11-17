package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //  double myDouble = 3.14159;
        mainmenu();
    }

    public static void mainmenu() { //NO SCANNERS / INPUTS
        try {
            while (true) {
                Random random = new Random();
                int raffleNumber = random.nextInt(500);
                for (int i = 0; raffleNumber < 500; i++) {

                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Would you like to buy or check a raffle ticket? (if you want to buy, type 'buy'; and if you want to check type 'check'.");
                //int option = Integer.parseInt(bufferedReader.readLine());
                String option = bufferedReader.readLine();
                switch (option) {
                    case "buy":
                        System.out.println("Your number is " + raffleNumber + ", what is your name?");
                break;
                }
                String name = bufferedReader.readLine();
                        switch (name) {
                            case "check":
                                System.out.println("Your name is " + name + ", and your number is " + raffleNumber);
                        }
                 //   default:
                 //       System.out.println("Very Interesting");
                 //       System.exit(0);

            }
        } catch (Exception e) {
            System.out.println("Error in mainmenu method");
        }
    }
}
