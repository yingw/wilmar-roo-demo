package cn.wilmar.roo.web;
import cn.wilmar.roo.domain.Department;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooJsonMixin;
import cn.wilmar.roo.domain.Employee;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * = DepartmentJsonMixin
 TODO Auto-generated class documentation
 *
 */
@RooJsonMixin(entity = Department.class)
public abstract class DepartmentJsonMixin {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @JsonDeserialize(using = EmployeeDeserializer.class)
    private Employee employee;

    /**
     * TODO Auto-generated method documentation
     *
     * @return Employee
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param employee
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
