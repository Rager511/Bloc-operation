package entities;
import jakarta.persistence.*;

@Entity
public class MedicalEquipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String status;

    @ManyToOne
    @JoinColumn(name = "operation_room_id")
    private OperationRoom operationRoom;


    public MedicalEquipment(){}

    public MedicalEquipment(Long id, String name, String status, OperationRoom operationRoom) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.operationRoom = operationRoom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OperationRoom getOperationRoom() {
        return operationRoom;
    }

    public void setOperationRoom(OperationRoom operationRoom) {
        this.operationRoom = operationRoom;
    }

    @Override
    public String toString() {
        return "MedicalEquipment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", operationRoom=" + operationRoom +
                '}';
    }
}