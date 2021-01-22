package DemoSpringMVC.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoSpringMVC.Entity.Employee;

@Service
public interface EmployeeService {
	@Autowired
	public List<Employee> GetDataEmployee();
	public void insertEmployee(Employee employee);
}
