import java.time.LocalDate;
import java.util.List;

public class Beaver extends Animal {
    public Beaver(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
            super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public String toString() {
        return "Beaver{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    @Override
    public void Fly() {
        System.out.println(String.format("%s can't fly, it's just a beaver.", this.name));
    }
}
