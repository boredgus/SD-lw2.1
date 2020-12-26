package DTO;

import base.Bus;

public class BusDTO {
    private String driverName;
    private int num;
    private String route;
    private long mileage;

    public String getDriverName(){
        return driverName;
    }
    public void setDriverName(String driverName){
        this.driverName = driverName;
    }

    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }

    public String getRoute(){
        return route;
    }
    public void setRoute(String route){
        this.route = route;
    }

    public long getMileage(){
        return mileage;
    }
    public void setMileage(long mileage){
        this.mileage = mileage;
    }

    public void setAll(Bus bus){
        this.driverName = bus.getDriverName();
        this.num = bus.getNum();
        this.route = bus.getRoute();
        this.mileage = bus.getMileage();
    }
}
