package com.bridgelabz.ipl.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bridgelabz.ipl.dao.TeamDao;
import com.bridgelabz.ipl.model.Team;

@Repository
@Transactional
public class TeamDaoImpl implements TeamDao {
	@Autowired
	SessionFactory sessionFactory;

	public void addTeam(Team team) {
		Session sess = sessionFactory.getCurrentSession();
		sess.save(team);
	}

	public List<Team> displayAllTeam() {
		Session sess = sessionFactory.getCurrentSession();
		Query qry = sess.createQuery("from Team");
		List<Team> teamsinfo = qry.list();
		return teamsinfo;
	}

	public List<Team> displayTeamInfo(String teamName) {
		Session sess = sessionFactory.getCurrentSession();
		Query qry = sess.createQuery("from Team where name=:teamName");
		qry.setParameter("teamName", teamName);
		List<Team> teamDetails = qry.list();
		return teamDetails;
	}

}
