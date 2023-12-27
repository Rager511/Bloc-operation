package services;

import entities.OperationRoom;
import repositories.OperationRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationRoomService {

    @Autowired
    private OperationRoomRepository operationRoomRepository;

    public List<OperationRoom> getAllOperationRooms() {
        return operationRoomRepository.findAll();
    }

    public OperationRoom getOperationRoomById(Long id) {
        return operationRoomRepository.findById(id).orElse(null);
    }

    public OperationRoom createOperationRoom(OperationRoom operationRoom) {
        return operationRoomRepository.save(operationRoom);
    }

    public OperationRoom updateOperationRoom(Long id, OperationRoom operationRoom) {
        if (operationRoomRepository.existsById(id)) {
            operationRoom.setId(id);
            return operationRoomRepository.save(operationRoom);
        }
        return null;
    }

    public void deleteOperationRoom(Long id) {
        operationRoomRepository.deleteById(id);
    }

    public List<OperationRoom> getAvailableOperationRooms() {
        return operationRoomRepository.findByAvailable(true);
    }

}
