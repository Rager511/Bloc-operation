package controllers;

import entities.AnesthesiaRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.AnesthesiaRecordService;

import java.util.List;

@RestController
@RequestMapping("/api/anesthesia-records")
public class AnesthesiaRecordController {

    @Autowired
    private AnesthesiaRecordService anesthesiaRecordService;

    @GetMapping
    public List<AnesthesiaRecord> getAllAnesthesiaRecords() {
        return anesthesiaRecordService.getAllAnesthesiaRecords();
    }

    @GetMapping("/{id}")
    public AnesthesiaRecord getAnesthesiaRecordById(@PathVariable Long id) {
        return anesthesiaRecordService.getAnesthesiaRecordById(id);
    }

    @PostMapping
    public AnesthesiaRecord createAnesthesiaRecord(@RequestBody AnesthesiaRecord anesthesiaRecord) {
        return anesthesiaRecordService.createAnesthesiaRecord(anesthesiaRecord);
    }

    @PutMapping("/{id}")
    public AnesthesiaRecord updateAnesthesiaRecord(@PathVariable Long id, @RequestBody AnesthesiaRecord anesthesiaRecord) {
        return anesthesiaRecordService.updateAnesthesiaRecord(id, anesthesiaRecord);
    }

    @DeleteMapping("/{id}")
    public void deleteAnesthesiaRecord(@PathVariable Long id) {
        anesthesiaRecordService.deleteAnesthesiaRecord(id);
    }
}
