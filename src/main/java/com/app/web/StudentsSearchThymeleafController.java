package com.app.web;
import com.app.model.Student;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.finder.RooSearch;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = StudentsSearchThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Student.class, type = ControllerType.SEARCH)
@RooSearch(finders = { "findByFirstNameAndLastName" })
@RooThymeleaf
public class StudentsSearchThymeleafController {
}
