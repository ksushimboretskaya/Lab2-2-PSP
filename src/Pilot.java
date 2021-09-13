import java.util.Objects;

public class Pilot extends Person implements Aviating {
    private int hour;

    public Pilot(String name, String surname, int age, int hour) {
        super(name, surname, age);
        this.hour = hour;

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Пилот:" +
                "налётано часов:" + hour +
                ", имя:" + getName() +
                ", фамилия:" + getSurname() +
                ", возраст:" + getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pilot pilot = (Pilot) o;
        return hour == pilot.hour;
    }

    @Override
    public int hashCode() {

        return Objects.hash(hour);
    }

    @Override
    public  void aviating() {
        System.out.println("Я умею летать");
    }
}