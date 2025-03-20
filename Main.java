public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the intrest calculator");
        System.out.println("Please enter the principal amount: ");
        double principal = Double.parseDouble(System.console().readLine());

        System.out.println("Please enter the rate of interest: ");
        double rate = Double.parseDouble(System.console().readLine());

        System.out.println("Please enter the number of years: ");
        double years = Double.parseDouble(System.console().readLine());

        double interest = principal * rate * years / 100;
        double total = principal + interest;
        System.out.println("The interest is: " + interest);
        System.out.println("The total amount is: " + total);
    }
}