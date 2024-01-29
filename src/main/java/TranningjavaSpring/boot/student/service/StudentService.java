package TranningjavaSpring.boot.student.service;

import TranningjavaSpring.boot.student.dto.Request.StudentRequest;
import TranningjavaSpring.boot.student.dto.Response.StudentResponse;

public interface StudentService {

    StudentResponse create(StudentRequest request);

    StudentResponse getById(String id);

    StudentResponse update(StudentRequest request, String id);

    void deleteById(String id);
}
