package net.bhatnag8.appetizer.util;

import net.bhatnag8.appetizer.enchantment.ModEnchantments;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {

    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 5, factories -> {


            factories.add((entity, random) -> new TradeOffer(
                   new TradedItem(new ItemStack(Items.EMERALD).getItem(), 32),
                    EnchantedBookItem.forEnchantment( new EnchantmentLevelEntry(ModEnchantments.STIMI_PACK_DELUXE, 1)),
                    1, 12, 0.075f)
            );
        });
    }
}
