package org.sprugit.rooms.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.sprugit.game.RoomUpdateType;

public class RoomUpdateDTO implements RoomUpdateType {

    @JsonProperty private String id;
    @JsonProperty private RoomUpdateType change;

}
