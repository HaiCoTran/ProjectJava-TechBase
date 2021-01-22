package DemoSpringMVC.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoSpringMVC.Dao.TeamDao;
import DemoSpringMVC.Entity.Team;

@Service
public class TeamServiceImpl implements TeamService{
	@Autowired
	private TeamDao teamDao;
	public List<Team> GetDataTeam() {
			return teamDao.GetDataTeam();
	}
	public void insertTeam(Team team) {
		// TODO Auto-generated method stub
		teamDao.insertTeam(team);
	}

}
