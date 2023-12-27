package entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Nurse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String specialization;

    @ManyToMany(mappedBy = "nurses")
    private List<Operation> operations;
    @ManyToMany(mappedBy = "nurses")
    private List<SurgicalTeam> surgicalTeams;
    public Nurse(){}

    public Nurse(Long id, String firstName, String lastName, String specialization, List<Operation> operations, List<SurgicalTeam> surgicalTeams) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
        this.operations = operations;
        this.surgicalTeams = surgicalTeams;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public List<SurgicalTeam> getSurgicalTeams() {
        return surgicalTeams;
    }

    public void setSurgicalTeams(List<SurgicalTeam> surgicalTeams) {
        this.surgicalTeams = surgicalTeams;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialization='" + specialization + '\'' +
                ", operations=" + operations +
                ", surgicalTeams=" + surgicalTeams +
                '}';
    }
}
