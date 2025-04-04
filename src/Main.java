package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyRunnable run = new MyRunnable();
        Thread secondThread = new Thread(run);
        secondThread.setDaemon(true);
        secondThread.start();

        System.out.println("You have 10 seconds to enter your name");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();
    }
}
