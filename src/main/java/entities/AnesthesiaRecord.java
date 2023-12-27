package entities;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class AnesthesiaRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private double dosage;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @ManyToOne
    @JoinColumn(name = "operation_id")
    private Operation operation;

    public AnesthesiaRecord(){}
    public AnesthesiaRecord(Long id, String type, double dosage, LocalDateTime startTime, LocalDateTime endTime, Operation operation) {
        this.id = id;
        this.type = type;
        this.dosage = dosage;
        this.startTime = startTime;
        this.endTime = endTime;
        this.operation = operation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDosage() {
        return dosage;
    }

    public void setDosage(double dosage) {
        this.dosage = dosage;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "AnesthesiaRecord{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", dosage=" + dosage +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", operation=" + operation +
                '}';
    }
}
