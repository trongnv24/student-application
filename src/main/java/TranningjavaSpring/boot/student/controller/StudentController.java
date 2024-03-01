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
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public StudentResponse getById( @PathVariable ("id") String id){
        log.info(" === Start api getById student === ");
        log.info(" === String id {} : === ", id);
        StudentResponse response = service.getById(id);
        log.info(" === Finish api getById student, Student id {} :", response.getId());
        return response;
    }
    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public StudentResponse update(@RequestBody StudentRequest request, @PathVariable("id") String id){
        log.info(" === Start api update student === ");
        log.info(" === Request Body : {}, String id", request, id);
        StudentResponse response = service.update(request, id);
        log.info(" === Finish api update student, Student id", response.getId());
        return response;
    }
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(@PathVariable("id") String id){
        log.info(" === Start api delete student === ");
        log.info(" === String id {} : === ", id);
        log.info(" === Finish api delete student, Student id {} : ");
        service.deleteById(id);
    }
    @GetMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    public StudentResponse searchByName(@RequestParam String name){
        log.info(" === Start api searchByName student === ");
        log.info(" === String name {} : === ", name);
        StudentResponse response = service.searchByName(name);
        log.info(" === Finish api search student, Student name {} : === ", name);
        return response;
    }
}

