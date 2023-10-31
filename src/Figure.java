public abstract class Figure {
protected String name = "";
protected double pi = 3.1415;
abstract String ShowName();
abstract double Perimeter();
abstract double Area();
//abstract String Pict();
String GetName(){
    return name;
}

}
