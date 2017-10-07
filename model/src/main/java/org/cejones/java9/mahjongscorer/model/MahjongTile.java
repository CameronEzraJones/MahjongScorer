package org.cejones.java9.mahjongscorer.model;

import org.cejones.java9.mahjongscorer.model.enums.MahjongTileType;

public abstract class MahjongTile {

    public boolean isGreenTile() {
        return false;
    }

    public abstract MahjongTileType getTileType();

    public boolean isTerminal() {
        return false;
    };
}
