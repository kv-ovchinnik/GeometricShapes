public class Tetragon extends Figure {
    double heigt;
    public Tetragon(double heigt){
        name = "Tetragon";
        this.heigt = heigt;
    }

    @Override
    String ShowName() {
        System.out.println("Квадрат");
        return null;
    }

    @Override
    double Perimeter() {
        return heigt * 4;
    }

    @Override
    double Area() {
        return heigt * heigt;
    }



    }


