import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hay nhap vao do dai 3 canh tam giac");
        double size1 = scanner.nextDouble();
        double size2 = scanner.nextDouble();
        double size3 = scanner.nextDouble();
        if (size1<=0||size2<=0||size3<=0||size1+size2<=size3||size1+size3<=size2||size2+size3<=size1) {
            System.out.println("Not a TriangleTest");
        } else {
            Triangle triangle = new Triangle(size1,size2,size3,"red",true);
            System.out.println(triangle);
        }
    }
}
