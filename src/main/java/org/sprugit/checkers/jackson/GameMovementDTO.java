package org.sprugit.checkers.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GameMovementDTO {

    @JsonProperty private String from;
    @JsonProperty private String to;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}
