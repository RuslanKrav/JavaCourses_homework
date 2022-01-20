package com.company.lection8.homework;

import java.util.ArrayList;
import java.util.List;

public class Department {

    List<Position> positions = new ArrayList<Position>(){{
        for (int i = 0; i <5 ; i++) {
            add(new Position("Position" + i, "ABC" + i));
        }
        for (int i = 4; i <8 ; i++) {
            add(new Position("Position" + i, "DEF" + i));
        }
        for (int i = 6; i <17 ; i++) {
            add(new Position("Position" + i, "GHI" + i));
        }
    }};

    public static class Position{
        String name;
        String id;
        boolean hold;
        StringBuilder history;

        public Position(String name, String id) {
            this.name = name;
            this.id = id;
            hold = false;
            history = new StringBuilder();
        }
    }

    @Override
    public String toString() {
        StringBuilder positionLog = new StringBuilder();
        for (Position position : positions){
            positionLog.append(position.name);
            positionLog.append("\r\n");
            positionLog.append(position.history);
        }

        return positionLog.toString();
    }
}