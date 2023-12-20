import java.time.LocalDate;

public class Nurse extends Staff{
    public Nurse(String name, String post, LocalDate dateOfEmployment, int Experience) {
        super(name, post, dateOfEmployment, Experience);
    }

    public void WorkplacePreparation(Doctor doctor) {
        System.out.println(this.type + " " + this.name +" started the examination of the patient  has prepared a workplace for the" + doctor.type + " " + doctor.name);
    }
}
