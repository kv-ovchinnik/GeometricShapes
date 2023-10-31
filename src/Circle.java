public class Circle extends Figure {
    double r;

    Circle( double r){
        name = "Circle";
        this.r = r;
    }

    @Override
    double Perimeter() {

        return 2 * pi * r;
    }

    @Override
    double Area() {
        return pi * r * r;
    }

    @Override
    String ShowName() {
        System.out.println("Круг");
        return null;
    }
}
