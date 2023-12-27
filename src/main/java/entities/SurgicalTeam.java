package entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class SurgicalTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "surgical_team_member",
            joinColumns = @JoinColumn(name = "surgical_team_id"),
            inverseJoinColumns = @JoinColumn(name = "doctor_id")
    )
    private List<Doctor> doctors;
    @ManyToMany
    @JoinTable(
            name = "surgical_team_nurse",
            joinColumns = @JoinColumn(name = "surgical_team_id"),
            inverseJoinColumns = @JoinColumn(name = "nurse_id")
    )
    private List<Nurse> nurses;

    @ManyToMany(mappedBy = "surgicalTeams")
    private List<Operation> operations;

    public SurgicalTeam(){}

    public SurgicalTeam(Long id, List<Doctor> doctors, List<Nurse> nurses, List<Operation> operations) {
        this.id = id;
        this.doctors = doctors;
        this.nurses = nurses;
        this.operations = operations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(List<Nurse> nurses) {
        this.nurses = nurses;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "SurgicalTeam{" +
                "id=" + id +
                ", doctors=" + doctors +
                ", nurses=" + nurses +
                ", operations=" + operations +
                '}';
    }
}