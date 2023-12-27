package entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class OperationRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roomNumber;
    private boolean available;
    @OneToMany(mappedBy = "operationRoom")
    private List<Operation> operations;

    @OneToMany(mappedBy = "operationRoom")
    private List<MedicalEquipment> medicalEquipments;
    public OperationRoom(){}

    public OperationRoom(Long id, String roomNumber, boolean available, List<Operation> operations, List<MedicalEquipment> medicalEquipments) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.available = available;
        this.operations = operations;
        this.medicalEquipments = medicalEquipments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public List<MedicalEquipment> getMedicalEquipments() {
        return medicalEquipments;
    }

    public void setMedicalEquipments(List<MedicalEquipment> medicalEquipments) {
        this.medicalEquipments = medicalEquipments;
    }

    @Override
    public String toString() {
        return "OperationRoom{" +
                "id=" + id +
                ", roomNumber='" + roomNumber + '\'' +
                ", available=" + available +
                ", operations=" + operations +
                ", medicalEquipments=" + medicalEquipments +
                '}';
    }
}
