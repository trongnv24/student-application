package TranningjavaSpring.boot.student.controller;

import TranningjavaSpring.boot.student.dto.Request.CourseRequest;
import TranningjavaSpring.boot.student.dto.Response.CourseResponse;
import TranningjavaSpring.boot.student.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/course")
@Slf4j
public class CourseController {
    private final StudentService service;

    public CourseController(StudentService service) {
        this.service = service;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CourseResponse create(@RequestBody CourseRequest request){
        log.info(" === Start api create new course === ");
        log.info(" === Request Body : {} === ", request);
        CourseResponse response = service.create(request);
        log.info(" === Finish api create new course,Course Id : {} === ", response.getId());
        return response;
    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CourseResponse update(@RequestBody CourseRequest request,@PathVariable ("id") String id){
        log.info(" === Start api getById course === ");
        log.info(" === Request Body :{}, String id : {} === ", id, request);
        CourseResponse response = service.update(request, id);
        log.info(" === Finish api update course, Course Id : {} ===", response.getId());
        return response;
    }
}
