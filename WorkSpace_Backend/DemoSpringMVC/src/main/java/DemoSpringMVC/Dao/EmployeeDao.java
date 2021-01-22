package DemoSpringMVC.Dao;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DemoSpringMVC.Entity.Employee;
import DemoSpringMVC.Entity.MapperEmployee;

@Repository
public class EmployeeDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	public List<Employee> GetDataEmployee() {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>();
		String sql = "SELECT *FROM employee_tbl";
		list = _jdbcTemplate.query(sql, new MapperEmployee());
		return list;
	}
	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String employee_id = employee.getEmployeeid();
		String sqlcount = "SELECT count(*) FROM employee_tbl WHERE employeeid = ?";
		int count = _jdbcTemplate.queryForObject(sqlcount, new Object[] { employee_id }, Integer.class);
		
		if (count == 0) {
			 String sql = "INSERT INTO employee_tbl " +
		            "(employeeid, employeename, departmentid, teamid, address, phone) VALUES (?, ?, ?, ?, ?, ?)"; 
			 _jdbcTemplate.update(sql, new Object[]{employee.getEmployeeid(),employee.getEmployeename(), employee.getDepartmentid(), employee.getTeamid(), employee.getAddress(), employee.getPhone()});
		}
		else {
			Component mainFrame = null;
			JOptionPane.showMessageDialog (mainFrame, "Nhân viên này đã tồn tại");
		}
	}

}
