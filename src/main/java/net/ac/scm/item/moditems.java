package net.ac.scm.item;

import net.ac.scm.simplechocolatemod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.MinecraftItemGroups;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class moditems  {
public static final Item BROWN_CHOCOLATE_BAR = registerItem("brown_chocolate_bar",
    new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
public static final Item WHITE_CHOCOLATE_BAR = registerItem("white_chocolate_bar",
    new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(5f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 0), 1f).build())));
    public static final Item DARK_CHOCOLATE_BAR = registerItem("dark_chocolate_bar",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1f).build())));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(simplechocolatemod.MOD_ID,name), item);
    }

    public static void addItemsToItemGroup(){


        addToItemGroup(ModItemGroup.CHOCOLATE, BROWN_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE, WHITE_CHOCOLATE_BAR);
        addToItemGroup(ModItemGroup.CHOCOLATE, DARK_CHOCOLATE_BAR);



    }
    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));

    }
    public static void registerModItems(){
        simplechocolatemod.LOGGER.debug("Registering Mod Items of" + simplechocolatemod.MOD_ID);
addItemsToItemGroup();
    }
}
