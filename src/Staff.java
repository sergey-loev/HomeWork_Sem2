import java.time.LocalDate;
import java.util.List;

public abstract class Staff {
    protected String name;
    protected String post;
    protected LocalDate dateOfEmployment;
    protected int Experience;
    protected boolean Working;
    protected String type;

    public Staff(String name,String post,LocalDate dateOfEmployment,int Experience){
        this.name = name;
        this.post = post;
        this.dateOfEmployment = dateOfEmployment;
        this.Experience = Experience;
        this.Working = false;
        this.type = getClass().getSimpleName();
    }

    public void StartWork() {
        if(this.Working){
            System.out.println(type + " " + name + " is already at work!");
        }else{
            System.out.println(type + " " + name + "  started work!");
            this.Working = true;
        }

    }

    public void EndWork() {
        if(this.Working){
            System.out.println(type + " " + name + " finished working!");
            this.Working = false;
        }else{
            System.out.println(type + " " + name + " has already completed the work!");
        }
    }
    @Override
    public String toString() {
        return  type + '\'' +
                " {name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", dateOfEmployment=" + dateOfEmployment +
                ", Experience=" + Experience +
                '}';
    }
}
