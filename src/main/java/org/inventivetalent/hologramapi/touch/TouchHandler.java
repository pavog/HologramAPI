package org.inventivetalent.hologramapi.touch;

import org.inventivetalent.hologramapi.Hologram;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;

public interface TouchHandler {

	public void onTouch(@Nonnull Hologram hologram, @Nonnull Player player, @Nonnull TouchAction action);

}
