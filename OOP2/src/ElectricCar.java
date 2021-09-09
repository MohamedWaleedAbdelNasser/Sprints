
public class ElectricCar extends Car{
    private int electricalPower;

    public ElectricCar(int electricalPower) {
        this.electricalPower = electricalPower;
    }
    public ElectricCar(String type, int electricalPower, int price, int model, String name){
        super(type,price,model,name);
        this.electricalPower=electricalPower;
    }

    public ElectricCar(int electricalPower, int price, int model, String name){
        super(price,model,name);
        this.electricalPower=electricalPower;
    }
    public ElectricCar(int electricalPower, int model, String name){
        super(model,name);
        this.electricalPower=electricalPower;
    }
    public int getElectricalPower() {
        return electricalPower;
    }

    public void setElectricalPower(int electricalPower) {
        this.electricalPower = electricalPower;
    }
    @Override
    public String getFuelType(){
        return getElectricalPower()+" Watts are required for this "+getName()+" car";
    }
}