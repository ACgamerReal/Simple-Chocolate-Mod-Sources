package net.ac.scm.item;

import net.ac.scm.simplechocolatemod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static ItemGroup CHOCOLATE;
    public static void registerItemGroups() {
        CHOCOLATE = FabricItemGroup.builder(new Identifier(simplechocolatemod.MOD_ID, "chocolate"))
                .displayName(Text.literal("Simple Chocolate Mod"))
                .icon(() -> new ItemStack(moditems.BROWN_CHOCOLATE_BAR)).build();

    }


}
