package witchacademia.items;

import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import witchacademia.WitchAcademia;
import witchacademia.spells.SummonBerries;

public class Scroll extends Item {

    public Scroll() {
        super (new Item.Properties()
                .maxStackSize(1)
                .group(WitchAcademia.setup.itemGroup));
        setRegistryName("scroll");
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        new SummonBerries().doMagic(worldIn, playerIn);
        //TODO scroll should disappear when used
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
