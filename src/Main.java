package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You have 5 seconds to enter your name");
        for(int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                System.out.println("Thread was interrupted");
            }

            if(i == 5) {
                System.out.println("Time's up!");
            }
        }
        System.out.print("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();
    }
}
