package controllers;

import entities.MedicalEquipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.MedicalEquipmentService;

import java.util.List;

@RestController
@RequestMapping("/api/medical-equipments")
public class MedicalEquipmentController {

    @Autowired
    private MedicalEquipmentService medicalEquipmentService;

    @GetMapping
    public List<MedicalEquipment> getAllMedicalEquipments() {
        return medicalEquipmentService.getAllMedicalEquipments();
    }

    @GetMapping("/{id}")
    public MedicalEquipment getMedicalEquipmentById(@PathVariable Long id) {
        return medicalEquipmentService.getMedicalEquipmentById(id);
    }

    @PostMapping
    public MedicalEquipment createMedicalEquipment(@RequestBody MedicalEquipment medicalEquipment) {
        return medicalEquipmentService.createMedicalEquipment(medicalEquipment);
    }

    @PutMapping("/{id}")
    public MedicalEquipment updateMedicalEquipment(@PathVariable Long id, @RequestBody MedicalEquipment medicalEquipment) {
        return medicalEquipmentService.updateMedicalEquipment(id, medicalEquipment);
    }

    @DeleteMapping("/{id}")
    public void deleteMedicalEquipment(@PathVariable Long id) {
        medicalEquipmentService.deleteMedicalEquipment(id);
    }
}
