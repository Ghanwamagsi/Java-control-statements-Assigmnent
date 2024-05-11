public class TrafficLightSimulator {
    public static void main(String[] args) {
        String colorInput = "Ruk Ja"; // Example input

        if (colorInput.equals("Ruk Ja")) {
            System.out.println("Red light: Stop");
        } else if (colorInput.equals("Tyari Kar le")) {
            System.out.println("Yellow light: Get ready");
        } else if (colorInput.equals("Chal Nikal")) {
            System.out.println("Green light: Go");
        } else {
            System.out.println("Invalid input");
        }
    }
}



public class MovieRecommendationSystem {
    public static void main(String[] args) {
        int age = 15; // Example age

        // Using if-else statements
        if (age < 13) {
            System.out.println("Recommended genre: Animated");
        } else if (age < 18) {
            System.out.println("Recommended genre: Comedy");
        } else {
            System.out.println("Recommended genre: Action");
        }

        // Using switch statement
        switch(age) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Recommended genre: Animated");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("Recommended genre: Comedy");
                break;
            default:
                System.out.println("Recommended genre: Action");
                break;
        }
    }
}

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter your password: ");
            password = scanner.nextLine();

            // Check password criteria (e.g., length and complexity)
            if (isStrongPassword(password)) {
                System.out.println("Password accepted.");
                isValid = true;
            } else {
                System.out.println("Weak password! Please try again.");
            }
        }

        scanner.close();
    }

    public static boolean isStrongPassword(String password) {
        // Password criteria (you can customize this according to your requirements)
        int minLength = 8;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;

        if (password.length() < minLength) {
            return false;
        }

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasDigit;
    }
}


import java.util.Scanner;

public class CricketInningsSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalRuns = 0;
        int ballsFaced = 0;

        System.out.println("Welcome to Cricket Innings Simulator!");

        while (true) {
            System.out.print("Enter runs scored in the next ball (or enter 'out' if the batsman is out): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("out")) {
                System.out.println("The batsman is out!");
                break;
            }

            try {
                int runs = Integer.parseInt(input);
                totalRuns += runs;
                ballsFaced++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number or 'out'.");
            }
        }

        System.out.println("\nInnings Summary:");
        System.out.println("Total runs scored: " + totalRuns);
        System.out.println("Balls faced: " + ballsFaced);

        scanner.close();
    }
}



import java.util.Scanner;

public class CricketInningsSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalRuns = 0;
        int ballsFaced = 0;

        System.out.println("Welcome to Cricket Innings Simulator!");

        while (true) {
            System.out.print("Enter runs scored in the next ball (or enter 'out' if the batsman is out): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("out")) {
                System.out.print("How was the batsman out? (caught, bowled, LBW, run out, etc.): ");
                String dismissal = scanner.nextLine();
                System.out.println("The batsman is out! " + getDismissalMessage(dismissal));
                break;
            }

            try {
                int runs = Integer.parseInt(input);
                totalRuns += runs;
                ballsFaced++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number or 'out'.");
            }
        }

        System.out.println("\nInnings Summary:");
        System.out.println("Total runs scored: " + totalRuns);
        System.out.println("Balls faced: " + ballsFaced);

        scanner.close();
    }

    public static String getDismissalMessage(String dismissal) {
        switch (dismissal.toLowerCase()) {
            case "caught":
                return "Caught! What a catch!";
            case "bowled":
                return "Bowled! The batsman is walking back to the pavilion.";
            case "lbw":
                return "LBW? That umpire needs some Lassi to cool down!";
            case "run out":
                return "Run out! Miscommunication between the batsmen.";
            default:
                return "The batsman is out!"; // Default message for other dismissals
        }
    }
}



public class MangoSeasonShopping {
    public static void main(String[] args) {
        String[] mangoVarieties = {"Chaunsa", "Sindhri", "Langra"};
        double[] prices = {100.0, 120.0, 90.0}; // Prices of mango varieties
        boolean[] inStock = {true, false, true}; // Availability of mango varieties

        System.out.println("Mango Season Shopping Spree:");

        for (int i = 0; i < mangoVarieties.length; i++) {
            if (!inStock[i] || prices[i] > 100.0) {
                continue; // Skip if out of stock or too expensive
            }

            System.out.println("Buying " + mangoVarieties[i] + " for Rs. " + prices[i]);
        }
    }
}

public class TrafficLightSimulator {
    public static void main(String[] args) {
        String colorInput = "Ruk Ja"; // Example color input

        if (colorInput.equals("Ruk Ja")) {
            System.out.println("Red light: Stop");
        } else if (colorInput.equals("Tyari Kar le")) {
            System.out.println("Yellow light: Get ready");
        } else if (colorInput.equals("Chal Nikal")) {
            System.out.println("Green light: Go");
        } else {
            System.out.println("Invalid input");
        }
    }
}
