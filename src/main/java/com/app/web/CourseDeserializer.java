package com.app.web;
import com.app.model.Course;
import com.app.service.api.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = CourseDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Course.class)
public class CourseDeserializer extends JsonObjectDeserializer<Course> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private CourseService courseService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param courseService
     * @param conversionService
     */
    @Autowired
    public CourseDeserializer(@Lazy CourseService courseService, ConversionService conversionService) {
        this.courseService = courseService;
        this.conversionService = conversionService;
    }
}
