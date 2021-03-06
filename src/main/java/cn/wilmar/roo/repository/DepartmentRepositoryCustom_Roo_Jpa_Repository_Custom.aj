// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package cn.wilmar.roo.repository;

import cn.wilmar.roo.domain.Department;
import cn.wilmar.roo.domain.Employee;
import cn.wilmar.roo.repository.DepartmentRepositoryCustom;
import io.springlets.data.domain.GlobalSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect DepartmentRepositoryCustom_Roo_Jpa_Repository_Custom {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param employee
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Department> DepartmentRepositoryCustom.findByEmployee(Employee employee, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Department> DepartmentRepositoryCustom.findAll(GlobalSearch globalSearch, Pageable pageable);
    
}
