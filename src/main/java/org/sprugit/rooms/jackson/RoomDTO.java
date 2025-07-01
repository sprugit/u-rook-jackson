package org.sprugit.rooms.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.sprugit.game.Color;
import org.sprugit.game.Game;

import java.util.Map;

public class RoomDTO {

    @JsonProperty private String id;
    @JsonProperty private Map<String, Color> players;
    @JsonProperty Game game;


}
