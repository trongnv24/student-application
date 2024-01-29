package TranningjavaSpring.boot.student.service.Impl;

import TranningjavaSpring.boot.student.dto.Request.StudentRequest;
import TranningjavaSpring.boot.student.dto.Response.StudentResponse;
import TranningjavaSpring.boot.student.entity.StudentEntity;
import TranningjavaSpring.boot.student.repository.StudentRepository;
import TranningjavaSpring.boot.student.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static TranningjavaSpring.boot.student.service.mapping.StudentMapping.convertDtoToEntity;
import static TranningjavaSpring.boot.student.service.mapping.StudentMapping.convertEntityToStudentResponse;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentResponse create(StudentRequest request) {
        log.info(" === Start api create new Student === ");
        log.info( " === Request Body {} : === ", request);
        StudentEntity studentEntity = convertDtoToEntity(request);
        studentEntity = studentRepository.save(studentEntity);
        StudentResponse response = convertEntityToStudentResponse(studentEntity);
        log.info(" === Finish api create new student {} === ",response.getId());
        return response;
    }


}
