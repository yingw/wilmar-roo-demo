package cn.wilmar.roo.web;
import cn.wilmar.roo.domain.Department;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = DepartmentsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Department.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class DepartmentsItemJsonController {
}
