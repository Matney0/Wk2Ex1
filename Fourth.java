public class Fourth {
    public static void main(String[] args) {
        System.out.println("Welcome to the hypotenuse calculator");
        System.out.println("Please enter the length of the first side: ");
        double side1 = Double.parseDouble(System.console().readLine());

        System.out.println("Please enter the length of the second side: ");
        double side2 = Double.parseDouble(System.console().readLine());

        double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.println("The length of the hypotenuse is: " + hypotenuse);
    
}
}

