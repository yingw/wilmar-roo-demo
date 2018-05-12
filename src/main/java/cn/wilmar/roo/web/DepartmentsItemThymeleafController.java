package cn.wilmar.roo.web;
import cn.wilmar.roo.domain.Department;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = DepartmentsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Department.class, type = ControllerType.ITEM)
@RooThymeleaf
public class DepartmentsItemThymeleafController {
}
