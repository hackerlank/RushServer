package com.star.light.action.team;

import com.star.light.execaction.Action;
import com.star.light.player.GamePlayer;
import com.star.light.room.RoomMgr;
import com.star.light.team.TeamMgr;

public class TeamLeaveAction extends Action {
	private GamePlayer player;
	
	public TeamLeaveAction(GamePlayer player) {
		super(RoomMgr.executor.getDefaultQueue());
		this.player = player;
	}
	
	@Override
	public void execute() {
		TeamMgr.getInstance().leaveTeam(player);
	}
}