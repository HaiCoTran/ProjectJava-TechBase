package DemoSpringMVC.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoSpringMVC.Entity.Team;

@Service
public interface TeamService {
	@Autowired
	public List<Team> GetDataTeam();
	public void insertTeam(Team team);
}
