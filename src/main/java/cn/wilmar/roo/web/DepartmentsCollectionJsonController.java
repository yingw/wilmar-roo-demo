package cn.wilmar.roo.web;
import cn.wilmar.roo.domain.Department;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = DepartmentsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Department.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class DepartmentsCollectionJsonController {
}
