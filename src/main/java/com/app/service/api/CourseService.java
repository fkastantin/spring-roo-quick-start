package com.app.service.api;
import com.app.model.Course;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = CourseService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Course.class)
public interface CourseService extends EntityResolver<Course, Long>, ValidatorService<Course> {
}
