package TranningjavaSpring.boot.student.repository;

import TranningjavaSpring.boot.student.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository <StudentEntity, String> {
    Optional<StudentEntity> findByName(String name);
}
