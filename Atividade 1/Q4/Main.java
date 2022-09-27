package Q4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int numShapes = sc.nextInt();

        Shape[] shapes = new Shape[numShapes];

        for (int i = 0; i < numShapes; i++) {
            System.out.println("**Shape #" + (i+1) + " data:**");
            System.out.println("Rectangle or Circle (r/c)? ");
            String shape = sc.nextLine();
            System.out.println("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.nextLine());
            if(shape == "r"){
                System.out.println("Width: ");
                Double width = sc.nextDouble();
                System.out.println("Heigth");
                Double height = sc.nextDouble();

                shapes[i] = new Rectangle(width, height, color);
            }else if(shape == "c"){
                System.out.println("Radius: ");
                Double radius = sc.nextDouble();
                shapes[i] = new Circle(radius, color);
            }
        }

        System.out.println("SHAPE AREAS: ");
        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }

        sc.close();
    }
}
