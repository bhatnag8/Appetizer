package net.bhatnag8.appetizer.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.resource.featuretoggle.FeatureSet;

import java.util.Optional;


public class StimiPackDeluxeEnchantment extends Enchantment {

    public static final String TAG = "stimi_pack_deluxe";

    private static Properties enchantmentProperties() {
        final TagKey<Item> tagKey = ItemTags.ARMOR_ENCHANTABLE;
        final int weight = 1;
        final int maxLevel = 1;
        final Cost minCost = new Cost(10, 0);
        final Cost maxCost = new Cost(30, 0);
        final int anvilCost = 30;
        final EquipmentSlot[] equipmentSlots = new EquipmentSlot[] {EquipmentSlot.LEGS};
        return new Properties(tagKey, Optional.of(tagKey), weight, maxLevel, minCost, maxCost, anvilCost, FeatureSet.empty(), equipmentSlots);
    }

    public StimiPackDeluxeEnchantment() {
        super(enchantmentProperties());
    }


    @Override
    public boolean isTreasure() {
        return true;
    }


}
