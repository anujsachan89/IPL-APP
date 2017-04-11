package com.bridgelabz.ipl.services;

import java.util.List;

import com.bridgelabz.ipl.model.Team;

public interface TeamService {
	public void addTeam(Team team);

	public List<Team> displayAllTeam();

	public List<Team> displayTeamInfo(String teamName);
}
