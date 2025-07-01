package org.sprugit.chess.jackson.piece;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Type {
    PAWN,
    ROOK,
    HORSE,
    BISHOP,
    QUEEN,
    KING,
    INVALID;

    @JsonValue
    public String getValue(){
        return this.name().toUpperCase();
    }

    @JsonCreator
    public Type from(String val){
        if(val.equalsIgnoreCase("PAWN"))
            return PAWN;
        if(val.equalsIgnoreCase("ROOK"))
            return ROOK;
        if(val.equalsIgnoreCase("HORSE"))
            return HORSE;
        if(val.equalsIgnoreCase("BISHOP"))
            return BISHOP;
        if(val.equalsIgnoreCase("QUEEN"))
            return QUEEN;
        if(val.equalsIgnoreCase("KING"))
            return KING;
        return INVALID;
    }
}
