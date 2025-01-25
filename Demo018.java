import java.util.Scanner;

public class Demo018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();
        long minutesInHour = 60;
        long minutesInDay = 1440; // 60 minutes * 24 hours
        long minutesInYear = 525600; // 60 minutes * 24 hours * 365 days
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / minutesInDay;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
        scanner.close();
    }
}

