package cn.wilmar.roo.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import cn.wilmar.roo.domain.Department;

/**
 * = DepartmentRepositoryImpl
 *
 * TODO Auto-generated class documentation
 *
 */ 
@RooJpaRepositoryCustomImpl(repository = DepartmentRepositoryCustom.class)
public class DepartmentRepositoryImpl extends QueryDslRepositorySupportExt<Department> {

    /**
     * TODO Auto-generated constructor documentation
     */
    DepartmentRepositoryImpl() {
        super(Department.class);
    }
}