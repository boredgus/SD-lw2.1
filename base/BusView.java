package base;

public class BusView {
    public void showBus(String name, int num, String route, long mileage){
        System.out.print("\tDriver name: " + name +
                "\n\tBus:\nnumber: " + num +
                "\nroute: " + route +
                "\nmileage: " + mileage + "\n");
    }
}
