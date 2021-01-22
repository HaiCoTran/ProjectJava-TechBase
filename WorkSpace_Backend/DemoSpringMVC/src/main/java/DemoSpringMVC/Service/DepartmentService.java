package DemoSpringMVC.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoSpringMVC.Entity.Department;
@Service
public interface DepartmentService {
	@Autowired
	public List<Department> GetDataDepartment();
	public void insertDepartment(Department dep);
}
