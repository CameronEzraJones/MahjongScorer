package org.cejones.java9.mahjongscorer.model.tiles;

import org.cejones.java9.mahjongscorer.model.MahjongTile;
import org.cejones.java9.mahjongscorer.model.enums.MahjongTileSeasons;
import org.cejones.java9.mahjongscorer.model.enums.MahjongTileType;

public class MahjongSeasonTile extends MahjongTile {
    private MahjongTileSeasons season;

    public MahjongSeasonTile(int tile) {
        switch(tile) {
            case 0x1f026:
                this.season = MahjongTileSeasons.SPRING;
                break;
            case 0x1f027:
                this.season = MahjongTileSeasons.SUMMER;
                break;
            case 0x1f028:
                this.season = MahjongTileSeasons.AUTUMN;
                break;
            case 0x1f029:
                this.season = MahjongTileSeasons.WINTER;
                break;
        }
    }

    @Override
    public MahjongTileType getTileType() {
        return MahjongTileType.WILD;
    }

    public MahjongTileSeasons getSeason() {
        return season;
    }
}
