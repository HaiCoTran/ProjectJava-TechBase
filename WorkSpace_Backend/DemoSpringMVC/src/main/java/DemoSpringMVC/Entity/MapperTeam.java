package DemoSpringMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperTeam implements RowMapper<Team> {

	public Team mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Team team = new Team();
		team.setTeamid(rs.getString("teamid"));
		team.setTeamname(rs.getString("teamname"));
		team.setDepartmentid(rs.getString("departmentid"));
		return team;
	}

}
