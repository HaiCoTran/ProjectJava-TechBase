package DemoSpringMVC.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoSpringMVC.Dao.DeparmentDao;
import DemoSpringMVC.Entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DeparmentDao departmentDao;
	public List<Department> GetDataDepartment() {
		// TODO Auto-generated method stub
		return departmentDao.GetDataDepartment();
	}
	
	public void insertDepartment(Department dep) {
		// TODO Auto-generated method stub
		departmentDao.insertDepartment(dep);
	}
	

}
