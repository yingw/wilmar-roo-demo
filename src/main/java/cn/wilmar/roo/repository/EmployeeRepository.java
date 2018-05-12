package cn.wilmar.roo.repository;
import cn.wilmar.roo.domain.Employee;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = EmployeeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Employee.class)
public interface EmployeeRepository {
}
