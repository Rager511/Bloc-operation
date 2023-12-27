package repositories;

import entities.Doctor;
import entities.OperationRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

    List<Doctor> findByName(String name);

    List<Doctor> findBySpecialization(String specialization);

    List<Doctor> findByContactNumber(String contactNumber);

    List<Doctor> findByOperations_OperationRoom(OperationRoom operationRoom);


}


