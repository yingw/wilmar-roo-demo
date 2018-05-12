package cn.wilmar.roo.service.api;
import cn.wilmar.roo.domain.Department;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import java.util.List;
import io.springlets.data.domain.GlobalSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = DepartmentService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Department.class)
public interface DepartmentService {

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    public abstract List<Department> findAll(Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    public abstract List<Department> findAll();

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Department> findAll(GlobalSearch globalSearch, Pageable pageable);
}
