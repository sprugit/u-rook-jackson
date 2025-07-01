package org.sprugit.chess.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.sprugit.game.Color;
import org.sprugit.game.PlayerTurn;

public class PlayerTurnDTO implements PlayerTurn {

    @JsonProperty private Color player;
    @JsonProperty private GameMovementDTO play;
    @JsonProperty private String timestamp;

    public Color getPlayer() {
        return player;
    }

    public GameMovementDTO getPlay() {
        return play;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
