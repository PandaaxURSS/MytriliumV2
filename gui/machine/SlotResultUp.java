package fr.pandaax.mytrilium.gui.machine;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotResultUp extends Slot {
    
    public SlotResultUp(IInventory inventory, int id, int x, int y) 
    {
        super(inventory, id, x, y);
    }
    
    @Override
    public boolean isItemValid(ItemStack stack) //Interdit la pose d'items dans le slot
   {
       return false;
   }
    
    public ItemStack decrStackSize(int amount)
   {
       return super.decrStackSize(amount);
   }
    
    public void onPickupFromSlot(EntityPlayer player, ItemStack stack)
   {
       super.onCrafting(stack);
       super.onPickupFromSlot(player, stack);
   }

}