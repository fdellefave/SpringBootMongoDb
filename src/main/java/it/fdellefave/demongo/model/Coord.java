package it.fdellefave.demongo.model;

import lombok.Data;

@Data
public class Coord {

    private Double coord;

    public Coord(Double coord) {
        this.coord = coord;
    }
}
