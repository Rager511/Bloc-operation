package entities;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String fileName;
    private String Treatment;
    private LocalDateTime uploadDateTime;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public File(){}

    public File(int id, String fileName, String Treatment, LocalDateTime uploadDateTime, Patient patient) {
        this.id = id;
        this.fileName = fileName;
        this.Treatment = Treatment;
        this.uploadDateTime = uploadDateTime;
        this.patient = patient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getTreatment() {
        return Treatment;
    }

    public void setTreatment(String Treatment){
        this.Treatment = Treatment;
    }

    public LocalDateTime getUploadDateTime() {
        return uploadDateTime;
    }

    public void setUploadDateTime(LocalDateTime uploadDateTime) {
        this.uploadDateTime = uploadDateTime;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", Treatment='" + Treatment + '\'' +
                ", uploadDateTime=" + uploadDateTime +
                ", patient=" + patient +
                '}';
    }
}
