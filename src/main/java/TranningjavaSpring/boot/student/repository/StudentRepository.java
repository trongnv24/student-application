package TranningjavaSpring.boot.student.repository;

import TranningjavaSpring.boot.student.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <StudentEntity, String> {
}
