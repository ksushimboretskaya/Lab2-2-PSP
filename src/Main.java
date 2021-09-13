import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Pilot pilot1 = new Pilot("Игорь", "Кабушков", 20, 200);
        Pilot pilot2 = new Pilot("Павел", "Блинец", 19, 300);

        ArrayList<Stewardess> stewardessList = new ArrayList<>();

        Stewardess stewardess1 = new Stewardess("Татьяна", "Хамрителева", 18, false);
        Stewardess stewardess2 = new Stewardess("Татьяна", "Черняк", 19, true);
        Stewardess stewardess3 = new Stewardess("Ольга", "Пелеванюк", 18, false);

        stewardessList.add(stewardess1);
        stewardessList.add(stewardess2);
        stewardessList.add(stewardess3);

        AirMechanic airMechanic1= new AirMechanic("Шарафанович","Иван",20,true);
        AirMechanic airMechanic2= new AirMechanic("Булахов","Антон",20,true);

        System.out.println("Состав экипажа:");
        System.out.println(pilot1.toString());
        System.out.println(pilot2.toString());
        if( pilot1 instanceof Aviating)
            System.out.println("Первый пилот может управлять самолетом");
        if( pilot2 instanceof Aviating)
            System.out.println("Второй пилот может управлять самолетом");
        for (Stewardess stewardess : stewardessList) {
            System.out.println(stewardess);
        }
        System.out.println(airMechanic1.toString());
        System.out.println(airMechanic2.toString());
        System.out.println("Есть ли инструменты у двух бортмехаников? " + airMechanic1.equals(airMechanic2));
        System.out.print("Есть ли два пилота с одинаковой налёткой часов? ");
        System.out.println(pilot1.hashCode()==pilot2.hashCode());
    }

}
