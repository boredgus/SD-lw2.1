package base;

import DAO.BusDAO;
import DTO.BusDTO;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // створюю об'єкт доступу до БД та об'єкт, який буде передаватися
        BusDAO dao = new BusDAO();
        BusDTO dto = new BusDTO();

        // створюю список елементів, вигляд та контролер елементів
        ArrayList<Bus> busList = new ArrayList<>();
        busList.add(new Bus("Petro",1,"453a", 38789));
        busList.add(new Bus("Ivan",2,"787",22767));
        busList.add(new Bus("Vasyliy",3,"121c",12908));
        busList.add(new Bus("Pavlo",4,"11",121909));
        busList.add(new Bus("Serhii",5,"90r",87999));
        busList.add(new Bus("Oleksii",6,"434",565656));
        BusView busView = new BusView();
        BusController busController = new BusController(busList, busView);

        // записую елементи до БД
        for (int i = 0; i < busList.size(); i++){
            dto.setAll(busController.getWholeBus(i));
            dao.addRow(dto);
        }

        // змінюю деякі значення елементів
        busController.getWholeBus(0).setDriverName("Mykola");
        busController.getWholeBus(1).setMileage(12000);
        busController.getWholeBus(2).setRoute("622n");

        // вношу зміни до БД
        for(int i = 0; i < 3; i++) {
            dto.setAll(busController.getWholeBus(i));
            dao.updateRow(dto, i + 1);
        }

        // видаляю деякі елементи з БД
        dao.deleteRow(4);
        dao.deleteRow(6);
    }
}
