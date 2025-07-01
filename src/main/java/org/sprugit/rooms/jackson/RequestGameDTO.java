package org.sprugit.rooms.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.sprugit.game.GameType;

public class RequestGameDTO {

    @JsonProperty String owner;
    @JsonProperty GameType type;

    public String getOwner() {
        return owner;
    }

    public GameType getType() {
        return type;
    }
}
