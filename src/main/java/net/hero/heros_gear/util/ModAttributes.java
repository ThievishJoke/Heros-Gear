package net.hero.heros_gear.util;

import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;


public class ModAttributes {

    public static final RegistryEntry<EntityAttribute> PLAYER_ENTITY_INTERACTION_RANGE = register(
            new ClampedEntityAttribute("attribute.name.player.entity_interaction_range",
                    2.0,
                    0.0,
                    64.0)
                    .setTracked(true)
    );

    public static final Identifier PLAYER_ENTITY_INTERACTION_RANGE_ID = Identifier.of("hanas_blocks", "player.entity_interaction_range");

    public static void registerAttributes() {
        Registry.register(Registries.ATTRIBUTE, PLAYER_ENTITY_INTERACTION_RANGE_ID, PLAYER_ENTITY_INTERACTION_RANGE.value());
    }

    private static RegistryEntry<EntityAttribute> register(EntityAttribute attribute) {
        return RegistryEntry.of(Registry.register(Registries.ATTRIBUTE, Identifier.of("hanas_blocks", "player.entity_interaction_range"), attribute));
    }
}