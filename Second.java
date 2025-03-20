public class Second {
    public static void main(String[] args) {
      System.out.println("Enter the length of the rectangle: ");
        double length = Double.parseDouble(System.console().readLine());

        System.out.println("Enter the width of the rectangle: ");
        double width = Double.parseDouble(System.console().readLine());

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
    
}
