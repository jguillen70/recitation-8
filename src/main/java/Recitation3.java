import java.util.Scanner;

public class Recitation3 {
    public static void main(String[] argv)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = scan.nextInt();
        System.out.println("Enter y:");
        int y = scan.nextInt();

        Circle circle16 = new Circle(new Point(x,y), 16.0);

        Circle circle40 = new Circle(new Point(14,12),40.0);

        if(circle16.intersects(circle40)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }





    }
}
