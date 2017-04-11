package com.bridgelabz.ipl.dao;

import java.util.List;

import com.bridgelabz.ipl.model.Team;

public interface TeamDao {
	void addTeam(Team team);

	List<Team> displayAllTeam();

	List<Team> displayTeamInfo(String teamName);
}
