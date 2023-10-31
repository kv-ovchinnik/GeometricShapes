public class Triangle extends Figure {

    double a, b, c;

    public Triangle(double a, double b, double c) {
        name = "Triangle";
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    String ShowName() {
        System.out.println("Треугольник");
        return null;
    }

    @Override
    double Perimeter() {
        double p = a + b + c;
        return p;
    }

    @Override
    double Area() {
        if (((a+b)<c) || ((b+c)<a) || ((a+c)<b))
            return 0.0;
        double pp = (a+b+c)/2;
        double s;
        s = Math.sqrt(pp*(pp-a)*(pp-b)*(pp-c));
        return s;
    }
}
