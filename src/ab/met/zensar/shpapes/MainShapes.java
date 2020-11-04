package ab.met.zensar.shpapes;

public class MainShapes {

    public static void main(String[] args) {

        Square S = new Square("Square", 5.5f);
        System.out.println("\n\nShape Detail = ");
        S.print();

        System.out.println("Shape Area = " + S.getArea());



        EquilateralTriangle E = new EquilateralTriangle("Equilateral Triangle", 5);
        System.out.println("\n\nShape Detail = ");
        E.print();

        System.out.println("Shape Area = " + E.getArea());

    }

}
