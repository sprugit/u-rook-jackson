package org.sprugit.game;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({@JsonSubTypes.Type(org.sprugit.chess.jackson.GameDTO.class),
@JsonSubTypes.Type(org.sprugit.checkers.jackson.GameDTO.class)})
public interface Game {
}
