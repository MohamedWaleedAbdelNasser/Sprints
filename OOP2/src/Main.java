public class Main {
    public static void main(String[] args){
        // The Car Task
        ElectricCar c1=new ElectricCar("Sedan",3000,3000000,2021,"Tesla S");
        GasCar c2=new GasCar(95,3000000,2016,"Mercedes C63");
        GasCar c3=new GasCar("Cabriolet",95,1200000,2013,"Nissan GTR");
        System.out.println(c1.getFuelType());
        System.out.println(c2.getFuelType());
        System.out.println(c3.getFuelType());
        System.out.println("The total number of cars is "+Car.getNumberOfCars());


        // The Shape Task
        Shape c=new Circle(10);
        Shape s=new Square(10);
        displayShape(c);
        displayShape(s);
    }
    public static void displayShape(Shape shape){
        System.out.println("This shape is "+shape.getShapeName()+" and its area is equal to " +shape.getArea());
    }
}