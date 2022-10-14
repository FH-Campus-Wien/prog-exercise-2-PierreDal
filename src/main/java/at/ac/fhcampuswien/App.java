package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        // input your solution here
        int zaehler = 1;
        double num;
        double max = 0;

        Scanner tk1 = new Scanner(System.in);
        do {
            System.out.print("Number " + zaehler + ": ");
            num = tk1.nextDouble();

            if (zaehler == 1 && num <= 0) {
                System.out.println("No number entered.");
                break;
            }
            if (num > max) {
                max = num;
            }

            if (num <= 0) {
                System.out.printf("The largest number is " + "%.2f", max);
                System.out.println();

            }
            zaehler++;

        } while (num > 0);


    }

    //todo Task 2
    public void stairs() {
        // input your solution here
        Scanner tk2 = new Scanner(System.in);
        int zahl = 1;


        System.out.print("n: ");
        int row = tk2.nextInt();

        if (row <= 0) {
            System.out.println("Invalid number!");
        } else {
            for (int i = 1; i <= row; i++) {
                for (int x = 0; x < i; x++) {
                    System.out.print(zahl++ + " ");

                }
                System.out.println();
            }
        }
    }


    //todo Task 3
    public void printPyramid() {
        // input your solution here
        int num = 6;

        for (int i = 1; i <= num; i++) {
            for (int x = num - i; x > 0; x--) {
                System.out.print(" ");
            }
            for (int y = 1; y <= (i * 2) - 1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus() {
        // input your solution here
        Scanner tk4 = new Scanner(System.in);
        System.out.print("h: ");
        int h = tk4.nextInt();
        System.out.print("c: ");
        char c = tk4.next().charAt(0);

        if (h % 2 == 0) {
            System.out.println("Invalid number!");
        } else {
            for (int i = 1; i <= h / 2 + 1; i++) {
                for (int x = h / 2; x >= i; x--) {
                    System.out.print(" ");
                }
                for (int y = i; y > 0; y--) {
                    System.out.print((char) (c - y + 1));
                }
                {
                    for (int z = 1; z < i; z++) {
                        System.out.print((char) (c - z));
                    }
                    System.out.println();
                }
            }
            for (int i = h / 2; i > 0; i--) {
                for (int x = h / 2; x >= i; x--) {
                    System.out.print(" ");
                }
                for (int y = i; y > 0; y--) {
                    System.out.print((char) (c - y + 1));
                }
                for (int z = 1; z < i; z++) {
                    System.out.print((char) (c - z));
                }
                System.out.println();
            }
        }
    }


    //todo Task 5
    public void marks() {
        // input your solution here
        Scanner tk5 = new Scanner(System.in);
        int counter = 1;
        int note = 1;
        int notecount = 0;
        int count5 = 0;
        float sum = 0;
        float avg;

        while (note > 0) {
            System.out.print("Mark " + counter + ": ");
            note = tk5.nextInt();
            counter++;


            if ((counter == 2) && (note == 0)) {
                System.out.println("Average: 0,00");
                System.out.println("Negative marks: 0");
            }
            else if ((note > 5) && (note != 0)) {
                System.out.println("Invalid mark!");
                counter--;

            }
            else if ((note > 0) && (note < 6)) {
                sum = sum + note;
                notecount++;

                if (note == 5) {
                    count5++;
                }
            }
            else if (note == 0) {
                    avg = sum / notecount;
                    //System.out.printf("Average: "+ "%.2f" ,avg);
                    System.out.println("Average: " + String.format("%.2f", avg));
                    System.out.println("Negative marks: " + count5);
                }
            }

        }




    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        Scanner tk6 = new Scanner(System.in);
        System.out.print("n: ");
        int ziffer;
        int num = tk6.nextInt();
        int sum = 0;

        while (num != 1 && num !=4)
        {
            while (num > 0)
            {
                ziffer = num %10;
                sum = (ziffer*ziffer) + sum;
                num = num / 10;
            }
            num = sum;
            sum =0;
        }

        if (num == 1)
        {
            System.out.println("Happy number!");
        }
        else
        {
            System.out.println("Sad number!");
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}