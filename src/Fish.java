import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal {
    public Fish(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    @Override
    public void Fly() {
        System.out.println(String.format("%s can't fly, it's just a fish.", this.name));
    }

    @Override
    public void ToGo() {
        System.out.println(String.format("%s can't goes, it's just a fish.", this.name));
    }
}