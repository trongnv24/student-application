package TranningjavaSpring.boot.student.repository;

import TranningjavaSpring.boot.student.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, String> {
}
