package com.app.web;
import com.app.model.Course;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = CoursesCollectionThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Course.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class CoursesCollectionThymeleafController {
}
