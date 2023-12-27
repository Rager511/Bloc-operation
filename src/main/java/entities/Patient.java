package entities;
import jakarta.persistence.*;
import java.util.List;
import java.time.LocalDate;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    private LocalDate dateOfBirth;

    private String gender;

    private String phoneNumber;

    private String email;

    private String address;
    private String allergies;
    private String insurancePhoneNumber;
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<File> fileAttachments;

    public Patient(){

    }

    public Patient(int id, String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber, String email, String address,String allergies,String insurancePhoneNumber, List<File> fileAttachments) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.allergies=allergies;
        this.insurancePhoneNumber=insurancePhoneNumber;
        this.fileAttachments = fileAttachments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
    public String getInsurancePhoneNumber() {
        return insurancePhoneNumber;
    }
    public void setInsurancePhoneNumber(String insurancePhoneNumber) {
        this.insurancePhoneNumber = insurancePhoneNumber;
    }
    public List<File> getFileAttachments() {
        return fileAttachments;
    }

    public void setFileAttachments(List<File> fileAttachments) {
        this.fileAttachments = fileAttachments;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", allergies='" + allergies + '\'' +
                ", insurancePhoneNumber='" + insurancePhoneNumber + '\'' +
                ", fileAttachments=" + fileAttachments +
                '}';
    }
}