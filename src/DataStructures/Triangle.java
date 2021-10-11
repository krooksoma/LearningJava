package DataStructures;

public class Triangle {
    double base, height, sideOne, sideTwo, sideThree;


    public Triangle( double base, double height, double sideOne, double sideTwo, double sideThree){
        this.base = base;
        this.height = height;
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public double calculateArea(){
        return (this.base * this.height)/2;
    }


}
