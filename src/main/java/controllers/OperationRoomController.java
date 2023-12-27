package controllers;

import entities.OperationRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.OperationRoomService;

import java.util.List;

@RestController
@RequestMapping("/api/operation-rooms")
public class OperationRoomController {

    @Autowired
    private OperationRoomService operationRoomService;

    @GetMapping
    public List<OperationRoom> getAllOperationRooms() {
        return operationRoomService.getAllOperationRooms();
    }

    @GetMapping("/{id}")
    public OperationRoom getOperationRoomById(@PathVariable Long id) {
        return operationRoomService.getOperationRoomById(id);
    }

    @PostMapping
    public OperationRoom createOperationRoom(@RequestBody OperationRoom operationRoom) {
        return operationRoomService.createOperationRoom(operationRoom);
    }

    @PutMapping("/{id}")
    public OperationRoom updateOperationRoom(@PathVariable Long id, @RequestBody OperationRoom operationRoom) {
        return operationRoomService.updateOperationRoom(id, operationRoom);
    }

    @DeleteMapping("/{id}")
    public void deleteOperationRoom(@PathVariable Long id) {
        operationRoomService.deleteOperationRoom(id);
    }
}
