package repositories;

import entities.AnesthesiaRecord;
import entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AnesthesiaRecordRepository extends JpaRepository<AnesthesiaRecord, Long> {

    List<AnesthesiaRecord> findByType(String type);

    List<AnesthesiaRecord> findByDosageGreaterThan(double dosage);

    List<AnesthesiaRecord> findByStartTimeAfter(LocalDateTime startTime);

    List<AnesthesiaRecord> findByOperation(Operation operation);


}
