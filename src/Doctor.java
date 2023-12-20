import java.time.LocalDate;

public class Doctor extends Staff{
    Nurse nurse;
    public Doctor(String name, String post, LocalDate dateOfEmployment, int Experience, Nurse nurse) {
        super(name, post, dateOfEmployment, Experience);
        this.nurse = nurse;
    }

    public void Examination(Animal animal){
        System.out.println(this.type + " " + this.name +" started the examination of the patient " + animal);
    }

}
