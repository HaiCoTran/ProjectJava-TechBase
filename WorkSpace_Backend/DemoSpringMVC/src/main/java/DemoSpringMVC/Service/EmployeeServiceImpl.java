package DemoSpringMVC.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoSpringMVC.Dao.EmployeeDao;
import DemoSpringMVC.Entity.Employee;

@Service
public class EmployeeServiceImpl {
	@Autowired
	private EmployeeDao employeeDao;
	public List<Employee> GetDataEmployee() {
			return employeeDao.GetDataEmployee();
	}
	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		 employeeDao.insertEmployee(employee);
	}
}
