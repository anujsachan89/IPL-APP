package com.bridgelabz.ipl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Player")
public class Player {
	@Id
	@GenericGenerator(name = "gene", strategy = "increment")
	@GeneratedValue(generator = "gene")
	@Column(name = "id")
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "display_picture")
	private String displayPicture;
	@Column(name = "role")
	private String role;
	@Column(name = "batting_style")
	private String battingStyle;
	@Column(name = "bowling_style")
	private String bowlingStyle;
	@Column(name = "nationality")
	private String nationality;
	@Column(name = "dob")
	private String dob;
	@Column(name = "teamId")
	private int teamId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayPicture() {
		return displayPicture;
	}

	public void setDisplayPicture(String displayPicture) {
		this.displayPicture = displayPicture;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getBattingStyle() {
		return battingStyle;
	}

	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}

	public String getBowlingStyle() {
		return bowlingStyle;
	}

	public void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamIdName) {
		this.teamId = teamIdName;
	}
}
