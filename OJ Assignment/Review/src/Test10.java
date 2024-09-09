public class Test10 {
    public static void main(String[] args) {
        // Creating triangle instances
        BuildATriangle triangle1 = new BuildATriangle(3, 4, 5);
        BuildATriangle triangle2 = new BuildATriangle(5, 12, 13);
        BuildATriangle triangle3 = new BuildATriangle(7, 24, 25);

        // Printing the areas of the triangles
        System.out.println("Area of triangle1: " + triangle1.area());
        System.out.println("Area of triangle2: " + triangle2.area());
        System.out.println("Area of triangle3: " + triangle3.area());

        // Comparing the triangles
        System.out.println("Comparing triangle1 and triangle2: " + triangle1.compareTo(triangle2));
        System.out.println("Comparing triangle2 and triangle3: " + triangle2.compareTo(triangle3));
        System.out.println("Comparing triangle1 and triangle3: " + triangle1.compareTo(triangle3));

        // Creating an array of triangles
        BuildATriangle[] triangles = {triangle1, triangle2, triangle3};

        // Sorting the array of triangles based on their area
        java.util.Arrays.sort(triangles);

        // Printing the sorted triangles based on their area
        System.out.println("Triangles sorted by area:");
        for (BuildATriangle triangle : triangles) {
            System.out.println("Triangle with sides (" + triangle.a + ", " + triangle.b + ", " + triangle.c + ") has area: " + triangle.area());
        }
    }
}
