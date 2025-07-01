package org.sprugit.checkers.jackson.piece;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Type {
    UNCROWNED,
    CROWNED,
    INVALID;

    @JsonValue
    public String getValue(){
        return this.name().toUpperCase();
    }

    @JsonCreator
    public Type from(String val){
        if(val.equalsIgnoreCase("UNCROWNED"))
            return UNCROWNED;
        if(val.equalsIgnoreCase("CROWNED"))
            return CROWNED;
        return INVALID;
    }
}
