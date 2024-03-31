public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);

        c1.setRadius(5);
        System.out.println(c1.getRadius());

        System.out.printf("The area of c1 is %.2f\n", c1.area());
        System.out.printf("The perimeter of c1 is %.2f\n", c1.perimeter());
        c1.position();
    }
}
