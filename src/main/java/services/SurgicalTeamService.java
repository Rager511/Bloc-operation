package services;

import entities.SurgicalTeam;
import repositories.SurgicalTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurgicalTeamService {

    @Autowired
    private SurgicalTeamRepository surgicalTeamRepository;

    public List<SurgicalTeam> getAllSurgicalTeams() {
        return surgicalTeamRepository.findAll();
    }

    public SurgicalTeam getSurgicalTeamById(Long id) {
        return surgicalTeamRepository.findById(id).orElse(null);
    }

    public SurgicalTeam createSurgicalTeam(SurgicalTeam surgicalTeam) {
        return surgicalTeamRepository.save(surgicalTeam);
    }

    public SurgicalTeam updateSurgicalTeam(Long id, SurgicalTeam surgicalTeam) {
        if (surgicalTeamRepository.existsById(id)) {
            surgicalTeam.setId(id);
            return surgicalTeamRepository.save(surgicalTeam);
        }
        return null;
    }

    public void deleteSurgicalTeam(Long id) {
        surgicalTeamRepository.deleteById(id);
    }

    public List<SurgicalTeam> getSurgicalTeamsByDoctorId(Long doctorId) {
        return surgicalTeamRepository.findByDoctorsId(doctorId);
    }

    public List<SurgicalTeam> getSurgicalTeamsByNurseId(Long nurseId) {
        return surgicalTeamRepository.findByNursesId(nurseId);
    }
}
