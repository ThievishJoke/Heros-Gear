package net.hero.heros_gear.datagen;

import net.hero.heros_gear.HerosGear;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

/** Code by NemoNotFound
 * <a href="https://github.com/NemoNotFound/NemosVerticalSlabs">...</a>
 */

public class ModModels {

    public static final Model VERTICAL_SLAB = block("parent/vertical_slab", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);
    public static final Model VERTICAL_SLAB_LEFT = block("parent/vertical_slab_left", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);
    public static final Model VERTICAL_SLAB_RIGHT = block("parent/vertical_slab_right", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);
    public static final Model VERTICAL_SLAB_BACK = block("parent/vertical_slab_back", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE);

    public static final Model NARROW_LOG = block("parent/narrow_log", TextureKey.TOP, TextureKey.SIDE);
    public static final Model NARROW_LOG_TOP = block("parent/narrow_log_top", TextureKey.TOP, TextureKey.SIDE);
    public static final Model NARROW_LOG_SIDE = block("parent/narrow_log_side", TextureKey.TOP, TextureKey.SIDE);


    private static Model block(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(HerosGear.MOD_ID, "block/" + parent)), Optional.empty(), requiredTextureKeys);
    }
}