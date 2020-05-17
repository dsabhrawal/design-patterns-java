package dp.creational.factorymethod;

public class FactoryMethodExample {
    public static void main(String[] args) {
        Ractangle ractangle = Ractangle.Factory.ractangle(10,20);
        System.out.println("Area of Ractangle "+ ractangle.calculateArea());
        Ractangle square = Ractangle.Factory.square(20);
        System.out.println("Area of Square: "+ square.calculateArea());
    }
}

class Ractangle{
    private int length,breadth=0;
    private Ractangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    static class Factory{
        public static Ractangle square(int side){
            return new Ractangle(side, side);
        }
        public static Ractangle ractangle(int length, int breadth){
            return new Ractangle(length, breadth);
        }
    }

    public int calculateArea(){
        return length*breadth;
    }
}