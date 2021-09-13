public class Stewardess extends Person {
    private boolean medical_training;
    public int count;

    public Stewardess() {
    }

    public Stewardess(String name, String surname, int age, boolean medical_training) {
        super(name, surname, age);
        this.medical_training = medical_training;

    }

    public String isMedical_training() {
        if(medical_training){
            return "есть";
        }
        else{
            return "нет";
        }
    }

    public void setMedical_training(boolean medical_training) {
        this.medical_training = medical_training;
    }

    @Override
    public String toString() {
        return "Стюардесса:" +
                "наличие медицинской подготовки:" + isMedical_training() +
                ", имя:" + getName()+
                ", фамилия:" + getSurname() +
                ", возраст:" + getAge();
    }
}