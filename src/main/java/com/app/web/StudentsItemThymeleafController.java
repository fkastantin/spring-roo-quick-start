package com.app.web;
import com.app.model.Student;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = StudentsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Student.class, type = ControllerType.ITEM)
@RooThymeleaf
public class StudentsItemThymeleafController implements ConcurrencyManager<Student> {
}
