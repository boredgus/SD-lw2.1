package base;
/**
 * Class consists of basic fields, <i>get/set</i> methods and method returning information.
 * @author <h3>Daryna Kharchenko</h3>
 * @version 23, December 2020
 */
public class Bus {
    private String driverName;
    private int num;
    private String route;
    private long mileage;

    public Bus(String drName,
               int num,
               String route,
               long mileage) {
        this.driverName = drName;
        this.num = num;
        this.route = route;
        this.mileage = mileage;
    }

    public void setDriverName(String _driverName) {
        this.driverName = _driverName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setRoute(String _route) {
        this.route = _route;
    }

    public String getRoute() {
        return route;
    }

    public void setMileage(long _mileage) {
        this.mileage = _mileage;
    }

    public long getMileage() {
        return mileage;
    }

}