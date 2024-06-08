import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QueueCustom<Person> queue = new QueueCustom<>();
        String name, lastN, firstN, s;
        int age = 0;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to the class!\n Please enter the students names:\n");
        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.println("Enter the first and last name of student " + (i + 1) + ": ");
                name = scnr.nextLine();

                String[] nameSplit = name.split(" "); // split user input

                //Check if input has two names
                if (nameSplit.length == 2) {
                    firstN = nameSplit[0];
                    lastN = nameSplit[1];
                    break;
                } else {
                    System.out.println("Please enter a valid first and last name");
                }
            }
                // Handle user input for age
                while (true) {
                    System.out.println("Enter the age of student " + (i+1) + ": ");
                    s = scnr.nextLine();
                    try {
                        age = Integer.parseInt(s);
                        break;
                    }
                    catch (Exception e) {
                        System.out.println("Please enter a valid number for age");
                    }
                }
            queue.enqueue(new Person(lastN, firstN, age));
        }
        // Display students in the queue
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
        scnr.close();
    }
}