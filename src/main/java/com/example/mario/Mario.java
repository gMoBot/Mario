package com.example.mario;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.Console;
import java.util.Scanner;

/**
 * Created on 5/4/15.
 * "Mario" from CS50 in java form
 */
public class Mario {

    // Solicit and validate user input for height of pyramid and output type
    public static void main(String[] args) {

        // Employs Spring Dependency Injection Framework
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Mario obj = (Mario) context.getBean("mario");
        obj.start();
//
//        Mario mario = new Mario(Printer.getInstance());
//        mario.start();

    }

    private final Printer printer;

    public Mario(Printer printer) {
        this.printer = printer;
    }

    public void start() {
        Scanner input = new Scanner(System.in);
        Console c = System.console();
        // Solicit and validate user input for pyramid height
        do {
            System.out.print("Enter a positive int less than 23: ");
            height = input.nextInt();
        } while (height < 0 || height > 23);

        // Solicit user input for output type
        String type;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            stringBuilder.setLength(0);
            System.out.print("Please enter preferred output type: console or file: ");
            stringBuilder.append(input.next());
            type = stringBuilder.toString();
        } while (!"file".equalsIgnoreCase(type) && !"console".equalsIgnoreCase(type));

        // Set Spring DI context
//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        // Employs Spring Dependency Injection to implement pyramid
        if ("file".equalsIgnoreCase(type)) {
//            Printer fileprinter = (Printer) context.getBean("printToFile");
//            fileprinter.printToFile();
            printer.printToFile();
        }
        else if ("console".equalsIgnoreCase(type)) {
//            Printer consoleprinter = (Printer) context.getBean("printToConsole");
//            consoleprinter.printToConsole();
            printer.printToConsole();
        }
    }
    // Creates accessible variable height for use without passing through functions
    public static int height;

}
