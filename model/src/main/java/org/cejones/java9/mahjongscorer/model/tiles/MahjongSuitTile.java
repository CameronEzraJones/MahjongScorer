package org.cejones.java9.mahjongscorer.model.tiles;

import org.cejones.java9.mahjongscorer.model.MahjongTile;
import org.cejones.java9.mahjongscorer.model.enums.MahjongTileSuits;
import org.cejones.java9.mahjongscorer.model.enums.MahjongTileType;

public class MahjongSuitTile extends MahjongTile {
    private MahjongTileSuits suit;
    private int value;

    public MahjongSuitTile(int tile, MahjongTileSuits suit, int value) {
        this.suit = suit;
        this.value = value;
    }


    @Override
    public boolean isGreenTile() {
        if(suit == MahjongTileSuits.BAMBOO) {
            return value == 2 ||
                    value == 3 ||
                    value == 4 ||
                    value == 6 ||
                    value == 8;
        }
        return false;
    }

    @Override
    public MahjongTileType getTileType() {
        return MahjongTileType.SUIT;
    }

    @Override
    public boolean isTerminal() {
        return value == 1 || value == 9;
    }

    public MahjongTileSuits getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }
}
