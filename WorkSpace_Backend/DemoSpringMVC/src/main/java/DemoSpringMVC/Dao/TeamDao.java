package DemoSpringMVC.Dao;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DemoSpringMVC.Entity.Department;
import DemoSpringMVC.Entity.MapperDepartment;
import DemoSpringMVC.Entity.MapperTeam;
import DemoSpringMVC.Entity.Team;



@Repository
public class TeamDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	public List<Team> GetDataTeam(){
		List<Team> list = new ArrayList<Team>();
		String sql = "SELECT *FROM team_tbl";
		list = _jdbcTemplate.query(sql, new MapperTeam());
		return list;
	}
	public void insertTeam(Team team) {
		// TODO Auto-generated method stub
		String team_id = team.getTeamid();
		String sqlcount = "SELECT count(*) FROM team_tbl WHERE teamid = ?";
		int count = _jdbcTemplate.queryForObject(sqlcount, new Object[] { team_id }, Integer.class);
		
		if (count == 0) {
			String sql = "INSERT INTO team_tbl " +
		            "(teamid, teamname, departmentid) VALUES (?, ?, ?)";   
		        _jdbcTemplate.update(sql, new Object[]{team.getTeamid(),team.getTeamname(), team.getDepartmentid()});
		}
		else {
			Component mainFrame = null;
			JOptionPane.showMessageDialog (mainFrame, "Team này đã tồn tại");
		}
	}
}
