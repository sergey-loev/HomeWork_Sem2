import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal {

    private int legsCount;
    public Dog(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, int legsCount) {
        super(name, birthDate, vaccinations, illness, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    @Override
    public void Fly() {
        System.out.println(String.format("%s can't fly, it's just a dog.", this.name));
    }
}