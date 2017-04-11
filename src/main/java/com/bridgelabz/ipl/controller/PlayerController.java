package com.bridgelabz.ipl.controller;

import java.io.FileReader;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.ipl.model.Player;
import com.bridgelabz.ipl.services.PlayerService;

@Controller
public class PlayerController {
	@Autowired
	PlayerService playerService;

	@RequestMapping(value = "/playerList", method = RequestMethod.GET)
	public ModelAndView displayAllTeam(@RequestParam("teamId") int teamId, @RequestParam("teamName") String teamName,
			Model model) {

		List<Player> playerInfo = playerService.displayAllPlayer(teamId);
		model.addAttribute("teamName", teamName);
		return new ModelAndView("playerList", "playerInfo", playerInfo);
	}

	@RequestMapping(value = "/playerDetails", method = RequestMethod.GET)
	public ModelAndView displayTeamDetails(@RequestParam("playerName") String playerName, Model model) {

		List<Player> playerDeatils = playerService.displayPlayerInfo(playerName);
		model.addAttribute("playerName", playerName);
		return new ModelAndView("playerDetails", "playerDetails", playerDeatils);

	}

	@RequestMapping(value = "/newAddPlayer", method = RequestMethod.GET)
	public String newAddPlayer() {

		Player player = new Player();
		JSONParser parser = new JSONParser();
		try {
			Object ob = parser.parse(new FileReader("/home/bridgeit/newPlayerInfo.json"));
			JSONObject object = (JSONObject) ob;

			JSONArray data = (JSONArray) object.get("Playersinfo");

			for (int i = 0; i < data.size(); i++) {
				JSONObject itemObj = (JSONObject) data.get(i);

				Object nameObj = itemObj.get("player_name");
				String playerName = (String) nameObj;
				player.setName(playerName);

				Object imgObject = itemObj.get("player_img_url");
				String playerPic = (String) imgObject;
				player.setDisplayPicture(playerPic);

				Object roleObj = itemObj.get("player_role");
				String roleName = (String) roleObj;
				player.setRole(roleName);

				Object battingStyleObj = itemObj.get("player_batting_style");
				String battingStyleName = (String) battingStyleObj;
				player.setBattingStyle(battingStyleName);

				Object bowlingObj = itemObj.get("player_bowling_style");
				String bowlingName = (String) bowlingObj;
				player.setBowlingStyle(bowlingName);

				Object nationalityObj = itemObj.get("player_nationality");
				String nationalityName = (String) nationalityObj;
				player.setNationality(nationalityName);

				Object dobObj = itemObj.get("player_dob");
				String dobName = (String) dobObj;
				player.setDob(dobName);

				Object teamIdObj = itemObj.get("team_id");
				Integer teamIdName = Integer.valueOf((String) teamIdObj);
				player.setTeamId(teamIdName);
				playerService.addPlayer(player);

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return "signin";
	}
}