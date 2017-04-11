package com.bridgelabz.ipl.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.ipl.dao.PlayerDao;
import com.bridgelabz.ipl.model.Player;
import com.bridgelabz.ipl.services.PlayerService;

public class PlayerServiceImpl implements PlayerService {
	@Autowired
	private PlayerDao playerDao;

	public void addPlayer(Player player) {
		playerDao.addPlayer(player);

	}

	public List<Player> displayAllPlayer(int teamId) {
		List<Player> playerList = playerDao.displayAllPlayer(teamId);
		return playerList;
	}

	public List<Player> displayPlayerInfo(String playerName) {
		List<Player> playerInfo = playerDao.displayPlayerInfo(playerName);
		return playerInfo;
	}

}
