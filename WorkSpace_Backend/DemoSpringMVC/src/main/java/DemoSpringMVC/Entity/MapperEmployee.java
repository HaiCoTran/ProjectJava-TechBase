package DemoSpringMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperEmployee implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmployeeid(rs.getString("employeeid"));
		employee.setEmployeename(rs.getString("employeename"));
		employee.setDepartmentid(rs.getString("departmentid"));
		employee.setTeamid(rs.getString("teamid"));
		employee.setAddress(rs.getString("address"));
		employee.setPhone(rs.getInt("phone"));
		return employee;
	}

}
