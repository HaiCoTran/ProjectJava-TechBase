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

@Repository
public class DeparmentDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	public List<Department> GetDataDepartment(){
		List<Department> list = new ArrayList<Department>();
		String sql = "SELECT *FROM department_tbl";
		list = _jdbcTemplate.query(sql, new MapperDepartment());
		return list;
		
	}
	
	
	public void insertDepartment(Department dep) {
		// TODO Auto-generated method stub
		String department_id = dep.getDepartmentid();
		String sqlcount = "SELECT count(*) FROM department_tbl WHERE departmentid = ?";
		int count = _jdbcTemplate.queryForObject(sqlcount, new Object[] { department_id }, Integer.class);
		
		if (count == 0) {
			String sql = "INSERT INTO department_tbl " +
		            "(departmentid, departmentname) VALUES (?, ?)";   
		        _jdbcTemplate.update(sql, new Object[]{dep.getDepartmentid(),dep.getDepartmentname()});
		}
		else {
			Component mainFrame = null;
			JOptionPane.showMessageDialog (mainFrame, "Phòng ban này đã tồn tại");
		}
	}
}
