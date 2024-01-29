package TranningjavaSpring.boot.student.controller;

import TranningjavaSpring.boot.student.dto.Request.StudentRequest;
import TranningjavaSpring.boot.student.dto.Response.StudentResponse;
import TranningjavaSpring.boot.student.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/student")
@Slf4j
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public StudentResponse create(@RequestBody StudentRequest request){
        log.info(" === Start api create new student === ");
        log.info(" === Request Body : {} === ",request);
        StudentResponse response = service.create(request);
        log.info(" === Finish api create new student, Student id {} : === ", response.getId());
        return response;
    }
}
