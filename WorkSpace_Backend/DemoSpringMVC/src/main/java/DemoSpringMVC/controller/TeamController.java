package DemoSpringMVC.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DemoSpringMVC.Entity.Department;
import DemoSpringMVC.Entity.Team;
import DemoSpringMVC.Service.DepartmentServiceImpl;
import DemoSpringMVC.Service.TeamServiceImpl;

@Controller
public class TeamController {
	private TeamServiceImpl teamServiceImpl;
	private DepartmentServiceImpl departmentServiceImpl;
	
	@Autowired
	private void setDepartmentServiceImpl(DepartmentServiceImpl departmentServiceImpl) {
		this.departmentServiceImpl = departmentServiceImpl;
	}
	
	@Autowired
	private void setTeamServiceImpl(TeamServiceImpl teamServiceImpl) {
		this.teamServiceImpl = teamServiceImpl;
	}
	
	@RequestMapping("/team")
	public ModelAndView getlistteam(){
		ModelAndView mv = new ModelAndView("team");
		mv.addObject("teamlist", teamServiceImpl.GetDataTeam());
		return mv;
	}
	
	@RequestMapping(value = "/Create Team",  method = RequestMethod.GET)	
	public ModelAndView createTeam(){
		ModelAndView mv = new ModelAndView("createTeam");
		java.util.List<Department> list = departmentServiceImpl.GetDataDepartment();
		mv.addObject("dplist", list);
		return mv;
	}
	@RequestMapping(value ="SaveT", method = RequestMethod.POST)
	public String saveTeam(HttpServletRequest request){
	Team team = new Team();
	team.setDepartmentid(request.getParameter("idpb"));
	team.setTeamid(request.getParameter("idteam"));
	team.setTeamname(request.getParameter("tenteam"));
	teamServiceImpl.insertTeam(team);
	return "redirect:/team";
}
}
