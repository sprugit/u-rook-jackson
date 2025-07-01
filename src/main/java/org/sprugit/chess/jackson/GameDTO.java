package org.sprugit.chess.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.sprugit.game.Color;
import org.sprugit.game.Game;

import java.util.ArrayList;
import java.util.List;

public class GameDTO implements Game {

    @JsonProperty private BoardInventoryDTO board;
    @JsonProperty private final List<GamePieceDTO> captured = new ArrayList<>();
    @JsonProperty private String state;
    @JsonProperty private Color currentPlayer;
    @JsonProperty private GameFlagsDTO flags;
    @JsonProperty private String start;
    @JsonProperty private List<PlayerTurnDTO> turns = new ArrayList<>();

    public BoardInventoryDTO getBoard() {
        return board;
    }

    public List<GamePieceDTO> getCaptured() {
        return captured;
    }

    public String getState() {
        return state;
    }

    public Color getCurrentPlayer() {
        return currentPlayer;
    }

    public GameFlagsDTO getFlags() {
        return flags;
    }

    public String getStart() {
        return start;
    }

    public List<PlayerTurnDTO> getTurns() {
        return turns;
    }
}
