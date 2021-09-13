import java.util.Objects;

public class AirMechanic extends Person{
    private boolean tool;

    public AirMechanic(String name, String surname, int age, boolean tool) {
        super(name, surname, age);
        this.tool = tool;
    }

    public String isTool() {
        if (tool){
            return "есть";
        }
        else return "нет";
    }

    public void setTool(boolean tool) {
        this.tool = tool;
    }

    @Override
    public String toString() {
        return "Бортмеханик:" +
                "наличие инстриумента:" + isTool() +
                ", имя:" + getName() +
                ", фамилия:" + getSurname() +
                ", возраст:" + getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirMechanic that = (AirMechanic) o;
        return tool == that.tool;
    }
    @Override
    public int hashCode() {
        return Objects.hash(tool);
    }
}
