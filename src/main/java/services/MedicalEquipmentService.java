package services;

import entities.MedicalEquipment;
import entities.OperationRoom;
import repositories.MedicalEquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalEquipmentService {

    @Autowired
    private MedicalEquipmentRepository medicalEquipmentRepository;

    public List<MedicalEquipment> getAllMedicalEquipments() {
        return medicalEquipmentRepository.findAll();
    }

    public MedicalEquipment getMedicalEquipmentById(Long id) {
        return medicalEquipmentRepository.findById(id).orElse(null);
    }

    public MedicalEquipment createMedicalEquipment(MedicalEquipment medicalEquipment) {
        return medicalEquipmentRepository.save(medicalEquipment);
    }

    public MedicalEquipment updateMedicalEquipment(Long id, MedicalEquipment medicalEquipment) {
        if (medicalEquipmentRepository.existsById(id)) {
            medicalEquipment.setId(id);
            return medicalEquipmentRepository.save(medicalEquipment);
        }
        return null;
    }

    public void deleteMedicalEquipment(Long id) {
        medicalEquipmentRepository.deleteById(id);
    }

    public List<MedicalEquipment> getMedicalEquipmentsByStatus(String status) {
        return medicalEquipmentRepository.findByStatus(status);
    }

    public List<MedicalEquipment> getMedicalEquipmentsByOperationRoom(OperationRoom operationRoom) {
        return medicalEquipmentRepository.findByOperationRoom(operationRoom);
    }
}
