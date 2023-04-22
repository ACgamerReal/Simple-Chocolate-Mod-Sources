package net.ac.scm;

import net.ac.scm.item.ModItemGroup;
import net.ac.scm.item.moditems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class simplechocolatemod implements ModInitializer {
    public static final String MOD_ID = "simple-chocolate-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger("simple-chocolate-mod");

    @Override
    public void onInitialize() {

        ModItemGroup.registerItemGroups();
        moditems.registerModItems();


    }
}