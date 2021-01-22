package DemoSpringMVC.controller;

import java.awt.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import DemoSpringMVC.Entity.Department;
import DemoSpringMVC.Entity.Employee;
import DemoSpringMVC.Entity.Team;
import DemoSpringMVC.Service.DepartmentServiceImpl;
import DemoSpringMVC.Service.EmployeeServiceImpl;
import DemoSpringMVC.Service.TeamServiceImpl;

@Controller
public class EmployeeController {
	
	private EmployeeServiceImpl employeeServiceImpl;
	private DepartmentServiceImpl departmentServiceImpl;
	private TeamServiceImpl teamServiceImpl;
	
	@Autowired
	private void setEmployeeServiceImpl(EmployeeServiceImpl employeeServiceImpl) {
		this.employeeServiceImpl = employeeServiceImpl;
	}
	
	@Autowired
	private void setDepartmentServiceImpl(DepartmentServiceImpl departmentServiceImpl) {
		this.departmentServiceImpl = departmentServiceImpl;
	}
	
	@Autowired
	private void setTeamServiceImpl(TeamServiceImpl teamServiceImpl) {
		this.teamServiceImpl = teamServiceImpl;
	}
	
	@RequestMapping("/employee")
	public ModelAndView getlistemployee(){
		ModelAndView mv = new ModelAndView("employee");
		mv.addObject("employeelist", employeeServiceImpl.GetDataEmployee());
		return mv;
	}
	
	
	@RequestMapping(value = "/Create Employee",  method = RequestMethod.GET)	
	public ModelAndView createEmployee(){
		ModelAndView mv = new ModelAndView("createEmployee");
		java.util.List<Department> listpb = departmentServiceImpl.GetDataDepartment();
		java.util.List<Team> listTeamforDP = teamServiceImpl.GetDataTeam();
		mv.addObject("listTeamforDP", listTeamforDP);
		mv.addObject("dplist", listpb);
		return mv;
	}
	
	
	@RequestMapping(value ="SaveE", method = RequestMethod.POST)
	public String saveEmployee(HttpServletRequest request){
	Employee employee = new Employee();
	employee.setEmployeeid(request.getParameter("idnv"));
	employee.setEmployeename(request.getParameter("tennv"));
	employee.setDepartmentid(request.getParameter("idpb"));
	employee.setTeamid(request.getParameter("idteam"));
	employee.setAddress(request.getParameter("address"));
	employee.setPhone(Integer.parseInt(request.getParameter("phone")));
	employeeServiceImpl.insertEmployee(employee);
	return "redirect:/employee";
}
}
