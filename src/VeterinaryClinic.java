import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();
    private List<Staff> personal = new ArrayList<>();

    public void addPatient(Animal animal){
        patients.add(animal);
    }
    public void addPatients(Animal ... animals){
        Collections.addAll(patients, animals);
    }
    public void addPatients(List<Animal> animalList){
        patients = animalList;
    }
    public void addPersonal(Staff staff){
        personal.add(staff);
    }
    public void addPersonals(Staff ... staff){
        Collections.addAll(personal, staff);
    }
    public void addPersonals(List<Staff> staffList){
        personal = staffList;
    }
    public List<Goable> getGoables(){
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Goable)
                result.add((Goable) animal);
        }
        return result;
    }
    public List<Swimable> getSwimables(){
        List<Swimable> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Swimable)
                result.add((Swimable) animal);
        }
        return result;
    }
    public List<Flyable> getFlyables(){
        List<Flyable> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Flyable)
                result.add((Flyable) animal);
        }
        return result;
    }
    public List<Animal> getPatients() {
        return patients;
    }
    public List<Staff> getPersonal() {
        return personal;
    }
    public void StartWorking(){
        for (Staff people:personal) {
            people.StartWork();
        }
    }
    public void EndWorking(){
        for (Staff people:personal) {
            people.EndWork();
        }
    }

}