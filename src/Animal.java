import java.time.LocalDate;
import java.util.List;

public class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List <String> vaccinations;
    protected String illness;
    protected String owner;

    public Animal(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccinations = vaccinations;
        this.illness = illness;
        this.owner = owner;
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
        System.out.println(String.format("%s is wakeup !!", this.name));
    }

    private void Eat (){
        System.out.println(String.format("%s ate", this.name));
    }

    private void Play (){
        System.out.println(String.format("%s played", this.name));
    }

    private void Sleep () {
        System.out.println(String.format("%s sleeping", this.name));
    }

    public void ToGo (){
        System.out.println(String.format("%s goes", this.name));
    }

    public void Fly (){
        System.out.println(String.format("%s flies", this.name));
    }

    public void Swim () {
        System.out.println(String.format("%s swimming", this.name));
    }

    public void LifeCycle () {
        this.Wakeup();
        this.Eat();
        this.Play();
        this.Sleep();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}