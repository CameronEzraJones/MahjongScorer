package org.cejones.java9.mahjongscorer.model.tiles;

import org.cejones.java9.mahjongscorer.model.MahjongTile;
import org.cejones.java9.mahjongscorer.model.enums.MahjongTileType;
import org.cejones.java9.mahjongscorer.model.enums.MahjongTileWinds;

public class MahjongDirectionalTile extends MahjongTile {
    private MahjongTileWinds wind;

    public MahjongDirectionalTile(int tile) {
        switch (tile) {
            case 0x1f000:
                this.wind = MahjongTileWinds.EAST;
                break;
            case 0x1f001:
                this.wind = MahjongTileWinds.SOUTH;
                break;
            case 0x1f002:
                this.wind = MahjongTileWinds.WEST;
                break;
            case 0x1f003:
                this.wind = MahjongTileWinds.NORTH;
                break;
        }
    }

    @Override
    public MahjongTileType getTileType() {
        return MahjongTileType.DIRECTIONAL;
    }

    public MahjongTileWinds getWind() {
        return wind;
    }
}
