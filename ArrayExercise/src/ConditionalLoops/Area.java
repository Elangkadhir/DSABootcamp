package ConditionalLoops;

public class Area {
    public static void main(String[] args) {
        System.out.println(areaOfCircle(10));
        System.out.println(areaOfTriangle(8, 6));
        System.out.println(areaOfTriangle(8, 6));
    }

    static double areaOfCircle(int r) {

        return Math.PI * (r * r);
    }

    static double areaOfTriangle(int b, int h) {
        return 0.5 * (b * h);
    }

    static double areaOfRectangle(int l, int w) {
        return (l * w);
    }

    static double areaOfParallelogram(int b, int h) {
        return (b * h);
    }

    static double areaOfRhombus(int d1, int d2) {
        return 0.5 * (d1 * d2);
    }

    static double areaOfEquilateralTriangle(int a) {
        return Math.sqrt(3) / 4 * (a * a);
    }

    static double perimeterofCircle(int r) {
        return Math.PI * 2 * r;
    }

    static double perimeterofEquilateralTriangle(int a) {
        return 3 * a;
    }

    static double perimeterofParallelogram(int a, int b) {
        return 2 * (a + b);
    }

    static double perimeterofRectangle(int l, int w) {
        return 2 * (l + w);
    }

    static double perimeterofSquare(int a) {
        return 4 * a;
    }

    static double perimeterofRhombus(int a) {
        return 4 * a;
    }

    static double volumeOfCone(int r, int h) {
        return (1.0 / 3) * Math.PI * r * r * h;
    }

    static double volumeOfPrism(int B, int h) {
        return B * h;
    }

    static double volumeOfCylinder(int r, int h) {
        return Math.PI * (r * r) * h;
    }

    static double volumeOfSphere(int r) {
        return (4.0 / 3) * Math.PI * r * r * r;
    }

    static double volumeOfPyramid(int B, int h) {
        return (1.0 / 3) * B * h;
    }

    static double CurvedSurfaceAreaofCylinder(int r, int h) {
        return 2 * Math.PI * r * h;
    }

    static double TotalSurfaceAreaofCube(int a) {
        return 6 * (a * a);
    }
}
