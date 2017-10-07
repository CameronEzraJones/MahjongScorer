package org.cejones.java9.mahjongscorer.model.tiles;

import org.cejones.java9.mahjongscorer.model.MahjongTile;
import org.cejones.java9.mahjongscorer.model.enums.MahjongTileDragons;
import org.cejones.java9.mahjongscorer.model.enums.MahjongTileType;

public class MahjongCardinalTile extends MahjongTile {
    private MahjongTileDragons dragon;

    public MahjongCardinalTile(int tile) {
        switch (tile) {
            case 0x1f004:
                this.dragon = MahjongTileDragons.RED;
                break;
            case 0x1f005:
                this.dragon = MahjongTileDragons.GREEN;
                break;
            case 0x1f006:
                this.dragon = MahjongTileDragons.WHITE;
                break;
        }
    }

    @Override
    public boolean isGreenTile() {
        return dragon == MahjongTileDragons.GREEN;
    }

    @Override
    public MahjongTileType getTileType() {
        return MahjongTileType.CARDINAL;
    }

    public MahjongTileDragons getDragon() {
        return dragon;
    }
}
