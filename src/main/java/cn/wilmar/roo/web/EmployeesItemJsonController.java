package cn.wilmar.roo.web;
import cn.wilmar.roo.domain.Employee;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = EmployeesItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Employee.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class EmployeesItemJsonController {
}
