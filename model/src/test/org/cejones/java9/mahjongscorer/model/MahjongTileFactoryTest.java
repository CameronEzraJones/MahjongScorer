package org.cejones.java9.mahjongscorer.model;

import org.cejones.java9.mahjongscorer.model.enums.MahjongTileSuits;
import org.cejones.java9.mahjongscorer.model.enums.MahjongTileType;
import org.cejones.java9.mahjongscorer.model.tiles.MahjongSuitTile;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MahjongTileFactoryTest {
    private MahjongTileFactory factory;

    @BeforeEach
    void setUp() {
        factory = MahjongTileFactory.getInstance();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getInstance() {
        MahjongTileFactory factory1 = MahjongTileFactory.getInstance();
        assertEquals(factory1, factory);
    }

    @Test
    void getMahjongSuitTile() {
        //1f007 - One Character
        MahjongTile tile = factory.createMahjongTile(0x1f007);
        assertTrue(tile instanceof MahjongSuitTile);
        assertTrue(tile instanceof MahjongTile);
        assertFalse(tile.isGreenTile());
        assertTrue(tile.isTerminal());
        assertTrue(tile.getTileType() == MahjongTileType.SUIT);
        tile = (MahjongSuitTile) tile;
        assertTrue(((MahjongSuitTile) tile).getSuit() == MahjongTileSuits.CHARACTER);
        assertTrue(((MahjongSuitTile) tile).getValue() == 1);
    }

}