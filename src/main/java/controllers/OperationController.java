package controllers;

import entities.Operation;
import entities.Doctor;
import entities.OperationRoom;
import entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.OperationService;

import java.util.List;

@RestController
@RequestMapping("/api/operations")
public class OperationController {

    @Autowired
    private OperationService operationService;

    @GetMapping
    public List<Operation> getAllOperations() {
        return operationService.getAllOperations();
    }

    @GetMapping("/{id}")
    public Operation getOperationById(@PathVariable Integer id) {
        return operationService.getOperationById(id);
    }

    @PostMapping
    public Operation createOperation(@RequestBody Operation operation) {
        return operationService.createOperation(operation);
    }

    @PutMapping("/{id}")
    public Operation updateOperation(@PathVariable Integer id, @RequestBody Operation operation) {
        return operationService.updateOperation(id, operation);
    }

    @DeleteMapping("/{id}")
    public void deleteOperation(@PathVariable Integer id) {
        operationService.deleteOperation(id);
    }
}
