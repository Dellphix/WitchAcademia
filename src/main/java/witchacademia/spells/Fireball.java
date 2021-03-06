package witchacademia.spells;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class Fireball implements Spell {

    public static final String SPELL_KEY = "fireball";
    public static final TranslationTextComponent NAME = new TranslationTextComponent("spell.witchacademia.fireball.name");

    @Override
    public void doMagic(World worldIn, PlayerEntity playerIn) {

        //From GhastEntity in tick().
        Vector3d vector3d = playerIn.getLook(1.0F);

        FireballEntity fireballentity = new FireballEntity(worldIn, playerIn, vector3d.x, vector3d.y, vector3d.z);
        fireballentity.explosionPower = 1;
        fireballentity.setPosition(playerIn.getPosX() + vector3d.x * 4.0D, playerIn.getPosYHeight(0.5D) + 0.5D, fireballentity.getPosZ() + vector3d.z * 4.0D);
        worldIn.addEntity(fireballentity);
    }
}
