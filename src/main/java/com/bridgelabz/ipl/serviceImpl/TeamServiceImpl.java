package com.bridgelabz.ipl.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.ipl.dao.TeamDao;
import com.bridgelabz.ipl.model.Team;
import com.bridgelabz.ipl.services.TeamService;

public class TeamServiceImpl implements TeamService {
	@Autowired
	private TeamDao teamDao;

	public void addTeam(Team team) {
		teamDao.addTeam(team);

	}

	public List<Team> displayAllTeam() {
		List<Team> teamInfo = teamDao.displayAllTeam();

		return teamInfo;

	}

	public List<Team> displayTeamInfo(String teamName) {
		List<Team> teamDetails = teamDao.displayTeamInfo(teamName);
		return teamDetails;
	}

}
