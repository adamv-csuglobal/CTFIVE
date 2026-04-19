import java.util.ArrayList;
import java.util.Scanner;

public class CT5 {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	ArrayList<String> days = new ArrayList<>();
	ArrayList<Double> temperatures = new ArrayList<>();

		days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        System.out.println("Enter average temperatures for the week:");

        for (int i = 0; i < days.size(); i++) {
        	System.out.print(days.get(i) + ": ");
            double temp = input.nextDouble();
            temperatures.add(temp);
	        }

	        input.nextLine(); 

	        while (true) {

            System.out.println("\nEnter a day (Sunday to Saturday) or type 'week' to see report (or 'exit' to quit): ");
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("exit")) {
            	System.out.println("Program ended.");
                break;
	            }

    		if (!choice.equalsIgnoreCase("week")) {

            int index = days.indexOf(capitalize(choice));

            if (index != -1) {
                System.out.println(days.get(index) + " temperature: " + temperatures.get(index) + "°");
            } else {
                System.out.println("Invalid day entered.");
            }
    		
    		} else {

            double sum = 0;

            System.out.println("\n--- Weekly Temperature Report ---");

            for (int i = 0; i < days.size(); i++) {
                System.out.println(days.get(i) + ": " + temperatures.get(i) + "°");
                sum += temperatures.get(i);
                }

                double average = sum / days.size();

                System.out.println("------------------------------");
                System.out.println("Weekly Average Temperature: " + average + "°");
		            }
		        }

		        input.close();
		    }

		    public static String capitalize(String day) {
		        day = day.toLowerCase();
		        return day.substring(0, 1).toUpperCase() + day.substring(1);
		    }
}