public class ElectricCar extends Car{
    private int electricPower;

    public ElectricCar(int electricalPower) {
        this.electricPower = electricalPower;
    }
    public ElectricCar(String type, int electricalPower, int price, int model, String name){
        super(type,price,model,name);
        this.electricPower =electricalPower;
    }

    public ElectricCar(int electricalPower, int price, int model, String name){
        super(price,model,name);
        this.electricPower =electricalPower;
    }
    public ElectricCar(int electricalPower, int model, String name){
        super(model,name);
        this.electricPower =electricalPower;
    }
    public int getElectricPower() {
        return electricPower;
    }

    public void setElectricPower(int electricPower) {
        this.electricPower = electricPower;
    }
    @Override
    public String getFuelType(){
        return getElectricPower()+" Watts are required for this "+getName()+" car";
    }
}