package TranningjavaSpring.boot.student.advice;

import TranningjavaSpring.boot.student.exception.StudentServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(value = SecurityException.class)
    public ResponseEntity<String> ExceptionHandler(StudentServiceException studentServiceException){
        return new ResponseEntity<>(
                studentServiceException.getStudentServiceError().getErrorMessage(),
                HttpStatus.valueOf(studentServiceException.getStudentServiceError().getErrorCode())

        );
    }
}
