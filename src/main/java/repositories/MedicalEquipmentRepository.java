package repositories;

import entities.MedicalEquipment;
import entities.OperationRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicalEquipmentRepository extends JpaRepository<MedicalEquipment, Long> {

    List<MedicalEquipment> findByStatus(String status);

    List<MedicalEquipment> findByOperationRoom(OperationRoom operationRoom);


}
