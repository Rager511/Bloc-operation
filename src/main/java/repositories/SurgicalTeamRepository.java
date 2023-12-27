package repositories;

import entities.SurgicalTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SurgicalTeamRepository extends JpaRepository<SurgicalTeam, Long> {

    List<SurgicalTeam> findByDoctorsId(Long doctorId);

    List<SurgicalTeam> findByNursesId(Long nurseId);

}
