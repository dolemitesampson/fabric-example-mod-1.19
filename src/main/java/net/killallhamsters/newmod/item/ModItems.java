package net.killallhamsters.newmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.killallhamsters.newmod.HoneyWine;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_TIN = registerItem("raw_tin",
            new Item(new FabricItemSettings().group(ModItemGroup.TIN)));

    public static final Item TIN = registerItem("tin",
            new Item(new FabricItemSettings().group(ModItemGroup.TIN)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(HoneyWine.MOD_ID, name), item);
    }
    public static void registerModItems()  {
        HoneyWine.LOGGER.debug("Registering Mod Items for" + HoneyWine.MOD_ID);
    }
}
