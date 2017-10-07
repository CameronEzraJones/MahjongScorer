package org.cejones.java9.mahjongscorer.model.tiles;

import org.cejones.java9.mahjongscorer.model.MahjongTile;
import org.cejones.java9.mahjongscorer.model.enums.MahjongTileFlowers;
import org.cejones.java9.mahjongscorer.model.enums.MahjongTileType;

public class MahjongFlowerTile extends MahjongTile {
    private MahjongTileFlowers flower;

    public MahjongFlowerTile(int tile) {
        switch (tile) {
            case 0x1f022:
                this.flower = MahjongTileFlowers.PLUM;
                break;
            case 0x1f023:
                this.flower = MahjongTileFlowers.ORCHID;
                break;
            case 0x1f024:
                this.flower = MahjongTileFlowers.BAMBOO;
                break;
            case 0x1f025:
                this.flower = MahjongTileFlowers.CHRYSANTHEMUM;
                break;
        }
    }

    @Override
    public MahjongTileType getTileType() {
        return MahjongTileType.WILD;
    }

    public MahjongTileFlowers getFlower() {
        return flower;
    }
}
