// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package cn.wilmar.roo.web;

import cn.wilmar.roo.service.api.DepartmentService;
import cn.wilmar.roo.web.DepartmentsItemJsonController;

privileged aspect DepartmentsItemJsonController_Roo_Controller {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private DepartmentService DepartmentsItemJsonController.departmentService;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return DepartmentService
     */
    public DepartmentService DepartmentsItemJsonController.getDepartmentService() {
        return departmentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param departmentService
     */
    public void DepartmentsItemJsonController.setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    
}
