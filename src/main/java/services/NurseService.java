package services;

import entities.Nurse;
import repositories.NurseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NurseService {

    @Autowired
    private NurseRepository nurseRepository;

    public List<Nurse> getAllNurses() {
        return nurseRepository.findAll();
    }

    public Nurse getNurseById(Long id) {
        return nurseRepository.findById(id).orElse(null);
    }

    public Nurse createNurse(Nurse nurse) {
        return nurseRepository.save(nurse);
    }

    public Nurse updateNurse(Long id, Nurse nurse) {
        if (nurseRepository.existsById(id)) {
            nurse.setId(id);
            return nurseRepository.save(nurse);
        }
        return null;
    }

    public void deleteNurse(Long id) {
        nurseRepository.deleteById(id);
    }

    public List<Nurse> getNursesBySpecialization(String specialization) {
        return nurseRepository.findBySpecialization(specialization);
    }

    public List<Nurse> getNursesByOperationId(int operationId) {
        return nurseRepository.findByOperations_Id(operationId);
    }

    public List<Nurse> getNursesBySurgicalTeamId(Long surgicalTeamId) {
        return nurseRepository.findBySurgicalTeams_Id(surgicalTeamId);
    }
}
