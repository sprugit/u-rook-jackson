package org.sprugit.game;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Color {
    INVALID,
    WHITE,
    BLACK,
    GREEN,
    YELLOW,
    RED,
    BLUE,
    MAGENTA,
    CYAN,
    BROWN,
    PINK;

    @JsonValue
    public String getValue(){
        return this.name().toUpperCase();
    }

    @JsonCreator
    public Color from(String val){
        try {
            return Color.valueOf(val.toUpperCase());
        } catch (RuntimeException e) {
            return INVALID;
        }
    }
}
