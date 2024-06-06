package net.bhatnag8.appetizer.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;


public class ModEnchantments {

    public static final Enchantment STIMI_PACK_DELUXE = new StimiPackDeluxeEnchantment();

    private ModEnchantments() {

    }

    public static void registerModEnchantments() {
        Registry.register(Registries.ENCHANTMENT, new Identifier("appetizer", StimiPackDeluxeEnchantment.TAG), STIMI_PACK_DELUXE);    }

}
