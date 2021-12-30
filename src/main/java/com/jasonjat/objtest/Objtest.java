package com.jasonjat.objtest;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Objtest implements ModInitializer, ClientModInitializer {
    public static final Block CRYSTAL_ORE = new CrystalBlock(FabricBlockSettings.of(Material.STONE));
    public static final Block MUTANT_BLOCK = new MutantBlock(FabricBlockSettings.of(Material.WOOD));

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("ot", "crystal_ore"), CRYSTAL_ORE);
        Registry.register(Registry.ITEM, new Identifier("ot", "crystal_ore"), new BlockItem(CRYSTAL_ORE, new Item.Settings()));

        Registry.register(Registry.BLOCK, new Identifier("ot", "mutant"), MUTANT_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ot", "mutant"), new BlockItem(MUTANT_BLOCK, new Item.Settings()));

    }

    @Override
    public void onInitializeClient() {
    }
}
