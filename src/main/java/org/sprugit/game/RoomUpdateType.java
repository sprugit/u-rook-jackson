package org.sprugit.game;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.sprugit.rooms.jackson.JoinLeaveDTO;

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({@JsonSubTypes.Type(JoinLeaveDTO.class),
@JsonSubTypes.Type(PlayerTurn.class)})
public interface RoomUpdateType {
}
