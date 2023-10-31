public class Main {
    public static void main(String[] args) {
        Figure[] figure = {
                new Rectangle(8, 12),
                new Triangle(5, 8, 5),
                new Circle(10),
                new Tetragon(4)};

        for(Figure fig : figure)
            System.out.println(fig.GetName()+ fig.ShowName() + ": area = " + fig.Area() + "; perimeter = " + fig.Perimeter());
    }
}