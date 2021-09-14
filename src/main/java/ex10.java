/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Chase Cutshall
 */

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String item1;
        System.out.print(" What is the quantity of item 1? ");

        item1 = input.next();

        Integer a = Integer.parseInt(item1);

        String price1;
        System.out.print(" What is the price of item 1? ");

        price1 = input.next();

        Integer b = Integer.parseInt(price1);

        String item2;
        System.out.print(" What is the quantity of item 2? ");

        item2 = input.next();

        Integer c = Integer.parseInt(item2);

        String price2;
        System.out.print(" What is the price of item 2? ");

        price2 = input.next();

        Integer d = Integer.parseInt(price2);

        String item3;
        System.out.print(" What is the quantity of item 3? ");

        item3 = input.next();

        Integer e = Integer.parseInt(item3);

        String price3;
        System.out.print(" What is the price of item 3? ");

        price3 = input.next();

        Integer f = Integer.parseInt(price3);

        int subtotal = (a * b) + (c * d) + (e * f);
        double salestax = subtotal * .055;
        double total = subtotal + salestax;

        System.out.print("Subtotal = " + subtotal + System.lineSeparator());
        System.out.print("Sales Tax = " + salestax + System.lineSeparator());
        System.out.print("Total = " + total + System.lineSeparator());

    }
}
