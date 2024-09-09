public class BuildATriangle implements Comparable<BuildATriangle> {
    public double a, b, c;

    public BuildATriangle(double a, double b, double c) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public int compareTo(BuildATriangle t) {
        if (this.area() < t.area()) {
            return -1;
        } else if (this.area() > t.area()) {
            return 1;
        } else {
            return 0;
        }
    }
}