package base;

import java.util.ArrayList;

public class BusController {
    private ArrayList<Bus> model;
    private BusView view;

    public BusController(ArrayList<Bus> model, BusView view){
        this.model = model;
        this.view = view;
    }

    public void setCourseName(int num, String name){
        model.get(num).setDriverName(name);
    }

    public String getCourseName(int num){
        return model.get(num).getDriverName();
    }

    public void setNumber(int num, int newNumber){
        model.get(num).setNum(newNumber);
    }

    public long getNumber(int num){
        return model.get(num).getNum();
    }

    public void setRoute(int num, String route){
        model.get(num).setRoute(route);
    }

    public String getRoute(int num){
        return model.get(num).getRoute();
    }

    public void setMileage(int num, long mileage){
        model.get(num).setMileage(mileage);
    }

    public long getMileage(int num){
        return model.get(num).getMileage();
    }

    public Bus getWholeBus(int index){
        return model.get(index);
    }

    public void updateView(){
        for(int i = 0; i < model.size(); i++){
            view.showBus(model.get(i).getDriverName(),
                    model.get(i).getNum(),
                    model.get(i).getRoute(),
                    model.get(i).getMileage());
        }
    }
}
