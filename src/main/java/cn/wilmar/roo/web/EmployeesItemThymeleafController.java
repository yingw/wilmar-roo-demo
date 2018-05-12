package cn.wilmar.roo.web;
import cn.wilmar.roo.domain.Employee;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = EmployeesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Employee.class, type = ControllerType.ITEM)
@RooThymeleaf
public class EmployeesItemThymeleafController {
}
