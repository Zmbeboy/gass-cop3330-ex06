/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example;
import java.util.Scanner;
import java.util.Calendar;

public class App
{
    public static void main( String[] args )
    {
        Calendar cal = Calendar.getInstance();
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your current age? ");
        String current = scan.nextLine();
        System.out.print("At what age would you like to retire? ");
        String retire = scan.nextLine();

        int cur = Integer.parseInt(current);
        int ret = Integer.parseInt(retire);
        int currentyear = cal.get(Calendar.YEAR);

        int difference = ret-cur;
        int newYear = difference+currentyear;

        System.out.println(String.format("You have %s years left until you can retire.\nIt's %s, so you can retire in %s.",difference,currentyear,newYear));
    }
}