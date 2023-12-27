package entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String operationName;
    private String description;
    private int quantity;
    private double cost;
    @OneToMany(mappedBy = "operation", cascade = CascadeType.ALL)
    private List<File> attachments;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToMany
    @JoinTable(
            name = "operation_doctor",
            joinColumns = @JoinColumn(name = "operation_id"),
            inverseJoinColumns = @JoinColumn(name = "doctor_id")
    )
    private List<Doctor> doctors;
    @ManyToOne
    @JoinColumn(name = "operation_room_id")
    private OperationRoom operationRoom;


    public Operation() {

    }

    public Operation(int id, String operationName, String description, int quantity, double cost) {
        this.id = id;
        this.operationName = operationName;
        this.description = description;
        this.quantity = quantity;
        this.cost = cost;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<File> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<File> attachments) {
        this.attachments = attachments;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", operationName='" + operationName + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                ", attachments=" + attachments +
                ", patient=" + patient +
                ", doctors=" + doctors +
                ", operationRoom=" + operationRoom +
                '}';
    }
}
