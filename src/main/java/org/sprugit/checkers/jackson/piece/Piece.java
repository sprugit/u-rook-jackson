package org.sprugit.checkers.jackson.piece;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.sprugit.game.Color;

public record Piece(Color color, Type type) {

    public static Piece wc = new Piece(Color.WHITE, Type.CROWNED);
    public static Piece wun = new Piece(Color.WHITE, Type.UNCROWNED);
    public static Piece bc = new Piece(Color.BLACK, Type.CROWNED);
    public static Piece bun = new Piece(Color.BLACK, Type.UNCROWNED);


    @JsonProperty
    @Override
    public Color color() {
        return color;
    }

    @JsonProperty
    @Override
    public Type type() {
        return type;
    }

    @Override
    public String toString(){
        return color.name().toUpperCase() + " " + type.name().toUpperCase();
    }
}
