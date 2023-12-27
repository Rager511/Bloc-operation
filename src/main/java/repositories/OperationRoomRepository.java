package repositories;

import entities.OperationRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperationRoomRepository extends JpaRepository<OperationRoom, Long> {

    List<OperationRoom> findByAvailable(boolean available);


}
