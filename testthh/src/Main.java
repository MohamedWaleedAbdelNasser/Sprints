public class Main {
    public static void main(String[] args){
        ElectricCar c1=new ElectricCar("Sedan",3000,2000000,2021,"Tesla");
        GasCar c2=new GasCar(95,3000000,2021,"Mercedes C63");
        GasCar c3=new GasCar(95,1200000,2020,"PORSCHE 918");
        System.out.println(c1.getFuelType());
        System.out.println(c2.getFuelType());
        System.out.println(c3.getFuelType());
    }
}