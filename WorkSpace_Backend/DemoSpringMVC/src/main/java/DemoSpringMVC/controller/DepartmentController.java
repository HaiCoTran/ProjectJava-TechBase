package DemoSpringMVC.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DemoSpringMVC.Entity.Department;
import DemoSpringMVC.Service.DepartmentServiceImpl;

@Controller
public class DepartmentController {
	private DepartmentServiceImpl departmentServiceImpl;
	
	@Autowired
	private void setDepartmentServiceImpl(DepartmentServiceImpl departmentServiceImpl) {
		this.departmentServiceImpl = departmentServiceImpl;
	}
	
	@RequestMapping("/department")
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("department");
		mv.addObject("departmentlist", departmentServiceImpl.GetDataDepartment());
		return mv;
	}
	@RequestMapping("/Create Department")
	public String createDepartment(){
		return "createDepartment";
	}
	@RequestMapping(value ="Save", method = RequestMethod.POST)
		public String saveDepartment(HttpServletRequest request){
		Department dep = new Department();
		dep.setDepartmentid(request.getParameter("idpb"));
		dep.setDepartmentname(request.getParameter("tenpb"));
		departmentServiceImpl.insertDepartment(dep);
		return "redirect:/department";
	}
	
}
