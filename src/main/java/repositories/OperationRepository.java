package repositories;

import entities.Doctor;
import entities.Operation;
import entities.OperationRoom;
import entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OperationRepository extends JpaRepository<Operation, Integer> {

    List<Operation> findByPatient(Patient patient);

    List<Operation> findByDoctorsContains(Doctor doctor);

    List<Operation> findByOperationRoom(OperationRoom operationRoom);

    List<Operation> findByAttachmentsIsNotNull();



}
