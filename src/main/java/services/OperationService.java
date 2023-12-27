package services;

import entities.Doctor;
import entities.Operation;
import entities.OperationRoom;
import entities.Patient;
import entities.File;
import repositories.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationService {

    @Autowired
    private OperationRepository operationRepository;

    public List<Operation> getAllOperations() {
        return operationRepository.findAll();
    }

    public Operation getOperationById(int id) {
        return operationRepository.findById(id).orElse(null);
    }

    public Operation createOperation(Operation operation) {
        return operationRepository.save(operation);
    }

    public Operation updateOperation(int id, Operation operation) {
        if (operationRepository.existsById(id)) {
            operation.setId(id);
            return operationRepository.save(operation);
        }
        return null;
    }

    public void deleteOperation(int id) {
        operationRepository.deleteById(id);
    }

    public List<Operation> getOperationsByPatient(Patient patient) {
        return operationRepository.findByPatient(patient);
    }

    public List<Operation> getOperationsByDoctor(Doctor doctor) {
        return operationRepository.findByDoctorsContains(doctor);
    }

    public List<Operation> getOperationsByOperationRoom(OperationRoom operationRoom) {
        return operationRepository.findByOperationRoom(operationRoom);
    }

    public List<Operation> getOperationsWithAttachments() {
        return operationRepository.findByAttachmentsIsNotNull();
    }

    public List<File> getAttachmentsByOperation(Operation operation) {
        return operation.getAttachments();
    }
}
