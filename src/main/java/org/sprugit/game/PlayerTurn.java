package org.sprugit.game;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({@JsonSubTypes.Type(org.sprugit.chess.jackson.PlayerTurnDTO.class),
        @JsonSubTypes.Type(org.sprugit.checkers.jackson.PlayerTurnDTO.class)})
public interface PlayerTurn extends RoomUpdateType{
}
