package apd;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPortalEvent;

public class PortalEvent implements Listener {
    @EventHandler
    public void portalEventShit(EntityPortalEvent event) {
        if (event.getPortalTravelAgent() != null) {
            //check entity type
            if (event.getEntityType() == EntityType.LLAMA
                    || event.getEntityType() == EntityType.DONKEY
                    || event.getEntityType() == EntityType.MULE) {
                //cancel that shit
                event.setCancelled(true);
            }
        }
    }
}
