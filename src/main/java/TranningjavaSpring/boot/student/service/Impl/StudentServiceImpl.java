package TranningjavaSpring.boot.student.service.Impl;

import TranningjavaSpring.boot.student.dto.Request.StudentRequest;
import TranningjavaSpring.boot.student.dto.Response.StudentResponse;
import TranningjavaSpring.boot.student.entity.StudentEntity;
import TranningjavaSpring.boot.student.exception.StudentNotFoundException;
import TranningjavaSpring.boot.student.exception.StudentServiceException;
import TranningjavaSpring.boot.student.repository.StudentRepository;
import TranningjavaSpring.boot.student.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.swing.undo.CannotRedoException;
import java.util.Optional;

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

    @Override
    public StudentResponse getById(String id) {
        log.info(" === Start api getById student === ");
        log.info(" === String id {} :  === ", id);
        Optional<StudentEntity> optionalEntity = studentRepository.findById(id);
        if (optionalEntity.isPresent()) {
            throw new StudentNotFoundException();
        }
      StudentEntity studententity = optionalEntity.get();
      StudentResponse response = convertEntityToStudentResponse(studententity);
      log.info( " === Finish api getById student , Student id {} : === ", response.getId());
        return response;
    }
    @Override
    public StudentResponse update(StudentRequest request, String id){
        log.info(" === Start api update student === ");
        log.info(" === Request Body {} :, String id {} : === ",request, id);
        Optional<StudentEntity> optionalStudent = studentRepository.findById(id);
        if(!optionalStudent.isPresent()){
            throw new RuntimeException();
        }
        StudentEntity studentEntity = optionalStudent.get();
        studentEntity.setName(request.getName());
        studentEntity.setAge(request.getAge());
        studentEntity.setStudentCode(request.getStudentCode());
        studentEntity.setHometown(request.getHometown());
        studentEntity = studentRepository.save(studentEntity);
        StudentResponse response = convertEntityToStudentResponse(studentEntity);
        log.info(" === Finish api update student, Student id {} : ", response.getId());
        return response;
    }
    @Override
    public void deleteById(String id){
        log.info(" === Start api delete student ==== ");
        log.info(" === String id {} : === ", id);
        Optional<StudentEntity>optionalStudent = studentRepository.findById(id);
        if(!optionalStudent.isPresent()){
            throw new RuntimeException()    ;
        }
        log.info(" === Finish api delete student, Student id {} :  ");
        studentRepository.deleteById(id);
    }

    @Override
    public StudentResponse searchByName (String name) {
        log.info(" === Start api searchByName student === ");
        log.info(" === String name {} : === ", name);
        Optional<StudentEntity> optionalStudent = studentRepository.findByName(name);
        if (!optionalStudent.isPresent()){
            throw new RuntimeException();
        }
        StudentEntity studentEntity = optionalStudent.get();
        studentEntity = studentRepository.save(studentEntity);
        StudentResponse response = convertEntityToStudentResponse(studentEntity);
        log.info(" === Finish api searchByName, Student name {} : === ", name);
        return response;
    }

}
