import java.time.LocalDate;
import java.util.List;

public abstract class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List <String> vaccinations;
    protected String illness;
    protected String owner;
    protected String type;

    public Animal(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccinations = vaccinations;
        this.illness = illness;
        this.owner = owner;
        this.type = getClass().getSimpleName();
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public List<String> getVaccinations() {
        return this.vaccinations;
    }

    public String getIllness() {
        return this.illness;
    }

    public String getOwner() {
        return this.owner;
    }

    private void Wakeup (){
        System.out.println(String.format("%s %s is wakeup !!", this.type, this.name));
    }


    private void Eat (){
        System.out.println(String.format("%s %s ate", this.type, this.name));
    }

    private void Play (){
        System.out.println(String.format("%s %s played", this.type, this.name));
    }

    private void Sleep () {
        System.out.println(String.format("%s %s sleeping", this.type, this.name));
    }

    public void LifeCycle () {
        this.Wakeup();
        this.Eat();
        this.Play();
        this.Sleep();
    }



    @Override
    public String toString() {
        return  type + '\'' +
                "{name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}