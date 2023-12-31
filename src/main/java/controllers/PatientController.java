package controllers;

import entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.PatientService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Integer id) {
        return patientService.getPatientById(id);
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        return patientService.createPatient(patient);
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Integer id, @RequestBody Patient patient) {
        return patientService.updatePatient(id, patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Integer id) {
        patientService.deletePatient(id);
    }

    @GetMapping("/byLastName/{lastName}")
    public List<Patient> getPatientsByLastName(@PathVariable String lastName) {
        return patientService.getPatientsByLastName(lastName);
    }

    @GetMapping("/withAllergies")
    public List<Patient> getPatientsWithAllergies() {
        return patientService.getPatientsWithAllergies();
    }

    @GetMapping("/withAttachments")
    public List<Patient> getPatientsWithFileAttachments() {
        return patientService.getPatientsWithFileAttachments();
    }

    @GetMapping("/bornAfter/{date}")
    public List<Patient> getPatientsBornAfter(@PathVariable String date) {
        LocalDate localDate = LocalDate.parse(date);
        return patientService.getPatientsBornAfter(localDate);
    }
}
