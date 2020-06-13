package com.app.web;
import com.app.model.Student;
import com.app.service.api.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = StudentDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Student.class)
public class StudentDeserializer extends JsonObjectDeserializer<Student> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private StudentService studentService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param studentService
     * @param conversionService
     */
    @Autowired
    public StudentDeserializer(@Lazy StudentService studentService, ConversionService conversionService) {
        this.studentService = studentService;
        this.conversionService = conversionService;
    }
}
