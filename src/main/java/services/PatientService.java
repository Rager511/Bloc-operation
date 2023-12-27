package services;

import entities.Patient;
import entities.File;
import repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(int id) {
        return patientRepository.findById(id).orElse(null);
    }

    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient updatePatient(int id, Patient patient) {
        if (patientRepository.existsById(id)) {
            patient.setId(id);
            return patientRepository.save(patient);
        }
        return null;
    }

    public void deletePatient(int id) {
        patientRepository.deleteById(id);
    }

    public List<Patient> getPatientsByLastName(String lastName) {
        return patientRepository.findByLastName(lastName);
    }

    public List<Patient> getPatientsWithAllergies() {
        return patientRepository.findByAllergiesIsNotNull();
    }

    public List<Patient> getPatientsWithFileAttachments() {
        return patientRepository.findByFileAttachmentsIsNotNull();
    }

    public List<Patient> getPatientsBornAfter(LocalDate date) {
        return patientRepository.findByDateOfBirthAfter(date);
    }

    public List<File> getFilesByPatient(Patient patient) {
        return patientRepository.findFilesByPatient(patient);
    }
}
