package repositories;

import entities.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NurseRepository extends JpaRepository<Nurse, Long> {

    List<Nurse> findBySpecialization(String specialization);

    List<Nurse> findByOperations_Id(int operationId);

    List<Nurse> findBySurgicalTeams_Id(Long surgicalTeamId);


}
