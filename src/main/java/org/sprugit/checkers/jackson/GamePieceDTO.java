package org.sprugit.checkers.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.sprugit.checkers.jackson.piece.Piece;

public class GamePieceDTO {

    @JsonProperty
    Piece piece;
    @JsonProperty Boolean hasMoved;

    public Piece getPiece() {
        return piece;
    }

    public Boolean getHasMoved() {
        return hasMoved;
    }
}
