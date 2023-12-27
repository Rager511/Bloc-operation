package services;

import entities.AnesthesiaRecord;
import entities.Operation;
import repositories.AnesthesiaRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AnesthesiaRecordService {

    @Autowired
    private AnesthesiaRecordRepository anesthesiaRecordRepository;

    public List<AnesthesiaRecord> getAllAnesthesiaRecords() {
        return anesthesiaRecordRepository.findAll();
    }

    public AnesthesiaRecord getAnesthesiaRecordById(Long id) {
        return anesthesiaRecordRepository.findById(id).orElse(null);
    }

    public AnesthesiaRecord createAnesthesiaRecord(AnesthesiaRecord anesthesiaRecord) {
        return anesthesiaRecordRepository.save(anesthesiaRecord);
    }

    public AnesthesiaRecord updateAnesthesiaRecord(Long id, AnesthesiaRecord anesthesiaRecord) {
        if (anesthesiaRecordRepository.existsById(id)) {
            anesthesiaRecord.setId(id);
            return anesthesiaRecordRepository.save(anesthesiaRecord);
        }
        return null;
    }

    public void deleteAnesthesiaRecord(Long id) {
        anesthesiaRecordRepository.deleteById(id);
    }

    public List<AnesthesiaRecord> getAnesthesiaRecordsByType(String type) {
        return anesthesiaRecordRepository.findByType(type);
    }

    public List<AnesthesiaRecord> getAnesthesiaRecordsByDosageGreaterThan(double dosage) {
        return anesthesiaRecordRepository.findByDosageGreaterThan(dosage);
    }

    public List<AnesthesiaRecord> getAnesthesiaRecordsByStartTimeAfter(LocalDateTime startTime) {
        return anesthesiaRecordRepository.findByStartTimeAfter(startTime);
    }

    public List<AnesthesiaRecord> getAnesthesiaRecordsByOperation(Operation operation) {
        return anesthesiaRecordRepository.findByOperation(operation);
    }
}
