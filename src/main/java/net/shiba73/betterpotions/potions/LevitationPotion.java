package net.shiba73.betterpotions.potions;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shiba73.betterpotions.BetterPotions;

public class LevitationPotion {
    public static Potion registerLevitationPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(BetterPotions.MOD_ID, name),
                new Potion(new StatusEffectInstance(StatusEffects.LEVITATION, 6000, 1)));
    }
}