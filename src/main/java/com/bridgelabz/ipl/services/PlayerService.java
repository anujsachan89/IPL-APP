package com.bridgelabz.ipl.services;

import java.util.List;

import com.bridgelabz.ipl.model.Player;

public interface PlayerService {
	public void addPlayer(Player player);

	public List<Player> displayAllPlayer(int teamID);

	public List<Player> displayPlayerInfo(String playerName);
}
