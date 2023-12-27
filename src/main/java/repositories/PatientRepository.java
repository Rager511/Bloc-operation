package repositories;

import entities.File;
import entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

    List<Patient> findByLastName(String lastName);

    List<Patient> findByAllergiesIsNotNull();

    List<Patient> findByFileAttachmentsIsNotNull();

    List<Patient> findByDateOfBirthAfter(LocalDate date);


    List<File> findFilesByPatient(Patient patient);
}
