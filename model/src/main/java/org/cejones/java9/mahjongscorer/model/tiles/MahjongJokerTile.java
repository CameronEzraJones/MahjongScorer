package org.cejones.java9.mahjongscorer.model.tiles;

import org.cejones.java9.mahjongscorer.model.MahjongTile;
import org.cejones.java9.mahjongscorer.model.enums.MahjongTileType;

public class MahjongJokerTile extends MahjongTile {
    @Override
    public MahjongTileType getTileType() {
        return MahjongTileType.JOKER;
    }
}
