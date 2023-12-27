package repositories;

import entities.File;
import entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface FileRepository extends JpaRepository<File, Integer> {

    List<File> findByPatient(Patient patient);

    List<File> findByUploadDateTimeAfter(LocalDateTime uploadDateTime);


}
