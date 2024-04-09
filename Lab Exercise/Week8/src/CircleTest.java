import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CircleTest {

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(5) + 5;
        Circle[] circles = new Circle[n];//创建数组
        int minRadiusIndex = 0;
        int maxPositionIndex = 0;
        for (int i = 0; i < circles.length; i++) {
            double radius = random.nextDouble() * 2 + 1;
            double x = random.nextDouble() * 3 + 2;
            double y = random.nextDouble() * 3 + 2;
            circles[i] = new Circle(radius, x, y);
            if (circles[minRadiusIndex].getRadius() > radius)
                minRadiusIndex = i;
            if (circles[maxPositionIndex].distanceToOrigin() < circles[i].distanceToOrigin())
                maxPositionIndex = i;
        }
        for (int i = 0; i < circles.length; i++) {
            System.out.printf("Circle #%d: %s\n", i + 1, circles[i]);
        }
        System.out.printf("Circle #%d is the smallest circle, area = %.2f\n", minRadiusIndex + 1, circles[minRadiusIndex].area());
        System.out.printf("Circle #%d is the farthest circle, distance to origin = %.2f\n", maxPositionIndex + 1, circles[maxPositionIndex].distanceToOrigin());
    }
}