import classes.Sports;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the training program");
        String sports = "Valid exercises...\n" +
                "Burpee\n" +
                "Pushup\n" +
                "Situp\n" +
                "Squat";
        System.out.println(sports);
        System.out.println("Create a workout...");
        System.out.print("Number of Burpees: ");
        int burpee = sc.nextInt();
        System.out.print("Number of Pushups: ");
        int pushup = sc.nextInt();
        System.out.print("Number of Situps: ");
        int situp = sc.nextInt();
        System.out.print("Number of Squats: ");
        int squat = sc.nextInt();

        sc.nextLine();

        Sports sport = new Sports(burpee, pushup, situp, squat);
        System.out.println("Your workout is starting...");

        while (!sport.trainingIsOver()) {
            System.out.print("Type of Exercise (Burpee, Pushup, Situp, Squat): ");
            String exerciseType = sc.nextLine();
            System.out.print("How many of this exercise will you do?: ");
            int exerciseCount = sc.nextInt();
            sc.nextLine();
            sport.makeMove(exerciseType, exerciseCount);
        }
    }
}
