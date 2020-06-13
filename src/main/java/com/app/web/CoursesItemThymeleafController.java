package com.app.web;
import com.app.model.Course;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = CoursesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Course.class, type = ControllerType.ITEM)
@RooThymeleaf
public class CoursesItemThymeleafController implements ConcurrencyManager<Course> {
}
