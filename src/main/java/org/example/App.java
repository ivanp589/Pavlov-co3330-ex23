package org.example;

import java.util.Scanner;

import static java.lang.System.out;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ivan pavlov
 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App ask = new App();
        ask.diag();
    }

    private void diag() {
        String stry = "y";
        String strY = "Y";
        out.print("Is the car silent when you turn the key? ");
        String resp = in.next();
        if (resp.equals("y") | resp.equals("Y")) {
            out.print("Are the battery terminals corroded? ");
            resp = in.next();
            if (resp.equals("y") | resp.equals("Y")) {
                out.println("Clean terminals and try starting again.");
            } else out.println("Replace cables and try again");
        } else if (!resp.equals("y") | resp.equals("Y")) {
            out.print("Does the car make a slicking noise? ");
            resp = in.next();
            if (resp.equals("Y") | resp.equals("y")) {
                out.println("Replace the battery.");
            }
        else {out.print("Does the car crank up but fail to start? ");
            resp = in.next();
                if (resp.equals("Y") | resp.equals("y")) {
                    out.println("Check spark plug connections. ");
                } else if (!resp.equals("Y") | !resp.equals("y")) {
                    out.print("Does the engine start and then die? ");
                    resp = in.next();
                    if (resp.equals("Y") | resp.equals("y")){
                        out.print("Does your car have fuel injection? ");
                        resp = in.next();
                        if (resp.equals("Y") | resp.equals("y")) {
                        out.println("Get it in for service.");}
                        else {
                        out.print("Check to ensure the choke is opening and closing.");}
                } else {
                    out.println("This should not be possible. ");
                }
            }
        }
    }}}
