package com.learnquest.demos;

public class java1 {
    public static void main(String[] args) {
        // Step 2: Initialize an array with the days of the week
        String[] daysOfWeek = {
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };

        // Step 3: Print each day of the week using two different loops

        // Step 3.1: Using a standard for loop to print days of the week
        System.out.println("Printing days using standard for loop:");
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println(daysOfWeek[i]);  // Prints each day from the array
        }

        // Step 3.2: Using a for-each loop to print days of the week
        System.out.println("\nPrinting days using for-each loop:");
        for (String day : daysOfWeek) {
            System.out.println(day);  // Prints each day using for-each loop
        }

        // Step 4: Print the days of the week in reverse order using a for loop
        System.out.println("\nPrinting days in reverse using standard for loop:");
        for (int i = daysOfWeek.length - 1; i >= 0; i--) {
            System.out.println(daysOfWeek[i]);  // Prints days from last to first
        }

        // Step 5: Print even numbers between 1 and 20 using a while loop
        System.out.println("\nEven numbers between 1 and 20:");
        int i = 1;  // Initialize the counter
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);  // Print if the number is even
            }
            i++;  // Increment the counter
        }

        // Step 6: Use the continue statement to skip odd numbers in a while loop
        System.out.println("\nEven numbers using continue statement:");
        i = 1;  // Reset the counter
        while (i <= 20) {
            if (i % 2 != 0) {
                i++;  // If the number is odd, increment and skip to the next iteration
                continue;
            }
            System.out.println(i);  // Print the even number
            i++;  // Increment the counter
        }

        // Step 7: For loop to print numbers between 1 and 100, excluding 50 to 60
        System.out.println("\nNumbers between 1 and 100 excluding 50 to 60:");
        for (i = 1; i <= 100; i++) {
            if (i >= 50 && i <= 60) {
                continue;  // Skip the numbers between 50 and 60
            }
            System.out.println(i);  // Print the number
        }

        // Step 8-11: Print the number of days in each month using a while loop and switch statement
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        System.out.println("\nNumber of days in each month:");
        int counter = 1;  // Initialize a counter for the months
        while (counter <= 12) {
            System.out.print(monthNames[counter - 1] + ": ");  // Print the name of the month
            switch (counter) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    // These months have 31 days
                    System.out.println("31 days");
                    break;
                case 4: case 6: case 9: case 11:
                    // These months have 30 days
                    System.out.println("30 days");
                    break;
                case 2:
                    // February has 28 days (ignoring leap years)
                    System.out.println("28 days");
                    break;
            }
            counter++;  // Increment the month counter
        }

        // Challenge Exercise: Print March as a calendar
        System.out.println("\nMarch Calendar:");
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int daysInMarch = 31;  // March has 31 days
        int startingDay = 5;   // March starts on Friday (5th index in the week)

        // Print the days of the week header (Sunday to Saturday)
        for (String day : weekDays) {
            System.out.print(day + "\t");  // Print each day of the week with a tab
        }
        System.out.println();  // Move to the next line

        // First row - print spaces for days before March 1 (because March starts on Friday)
        for (i = 0; i < startingDay; i++) {
            System.out.print("\t");  // Print tabs for empty days
        }

        // Print the first few days of March
        int dayCounter = 1;  // Start with March 1
        for (i = startingDay; i < 7; i++) {
            System.out.print(dayCounter + "\t");  // Print the days from March 1 onward
            dayCounter++;
        }
        System.out.println();  // Move to the next line after the first week

        // Remaining weeks of March
        while (dayCounter <= daysInMarch) {
            for (i = 0; i < 7 && dayCounter <= daysInMarch; i++) {
                System.out.print(dayCounter + "\t");  // Print the next set of days
                dayCounter++;  // Increment the day counter
            }
            System.out.println();  // Move to the next line for the next week
        }
    }
}
