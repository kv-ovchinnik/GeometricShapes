public class Rectangle extends Figure {
    double width;
    double height;
    public Rectangle(double width, double height) {
        name = "Rectangle";
        this.width = width;
        this.height = height;
    }

    @Override
    String ShowName() {
        System.out.println("Прямоугольник");
        return null;
    }

    @Override
    double Perimeter() {

        return 2 * (width + height);
    }

    @Override
    double Area() {
        return width * height;
    }


}
