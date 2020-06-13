package com.app.service.api;
import com.app.model.Student;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = StudentService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Student.class)
public interface StudentService extends EntityResolver<Student, Long>, ValidatorService<Student> {
}
