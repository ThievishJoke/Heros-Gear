package net.hero.heros_gear.property;

import net.hero.heros_gear.block.enums.VerticalSlabType;
import net.minecraft.state.property.EnumProperty;



public class ModProperties {
    /** Code by NemoNotFound
     * <a href="https://github.com/NemoNotFound/NemosVerticalSlabs">...</a>
     */
    public static final EnumProperty<VerticalSlabType> VERTICAL_SLAB_TYPE = EnumProperty.of("type", VerticalSlabType.class);
}