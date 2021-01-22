package DemoSpringMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperDepartment implements RowMapper<Department> {

	public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Department department = new Department();
		department.setDepartmentid(rs.getString("departmentid"));
		department.setDepartmentname(rs.getString("departmentname"));
		return department;
	}

}
