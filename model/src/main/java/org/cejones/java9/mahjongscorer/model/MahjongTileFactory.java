package org.cejones.java9.mahjongscorer.model;

import org.cejones.java9.mahjongscorer.model.enums.MahjongTileSuits;
import org.cejones.java9.mahjongscorer.model.tiles.MahjongCardinalTile;
import org.cejones.java9.mahjongscorer.model.tiles.MahjongSuitTile;

import java.text.Collator;

public class MahjongTileFactory {
    private static MahjongTileFactory instance = new MahjongTileFactory();

    public static MahjongTileFactory getInstance() {
        return instance;
    }

    private MahjongTileFactory() {

    }

    public MahjongTile createMahjongTile(int tile) {
        if (tile >= 0x1f000 && tile <= 0x1f003){
            return null;
        } else if(tile >= 0x1f004 && tile <= 0x1f006) {
            return new MahjongCardinalTile(tile);
        } else if(tile >= 0x1f007 && tile <= 0x1f00f) {
            //Characters
            int value = tile - 0x1f007 + 1;
            return new MahjongSuitTile(tile, MahjongTileSuits.CHARACTER, value);
        } else if(tile >= 0x1f010 && tile <= 0x1f019) {
            //Bamboo
            int value = tile - 0x1f010 + 1;
            return new MahjongSuitTile(tile, MahjongTileSuits.BAMBOO, value);
        } else if(tile >= 0x1f01a && tile <= 0x1f021) {
            //Dot
            int value = tile - 0x1f01a + 1;
            return new MahjongSuitTile(tile, MahjongTileSuits.DOT, value);
        } else {
            return null;
        }
    }
}
