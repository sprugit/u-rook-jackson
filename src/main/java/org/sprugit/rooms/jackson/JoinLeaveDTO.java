package org.sprugit.rooms.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.sprugit.game.RoomOp;
import org.sprugit.game.RoomUpdateType;

public class JoinLeaveDTO implements RoomUpdateType {

    @JsonProperty private String playerId;
    @JsonProperty private RoomOp op;

    public String getPlayerId() {
        return playerId;
    }

    public RoomOp getOp() {
        return op;
    }
}
