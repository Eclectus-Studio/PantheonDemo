package com.eclectusstudio.pantheonDemo.events;

import com.eclectusstudio.pantheon.common.ResourcePackContext;
import com.eclectusstudio.pantheon.event.CopyAssetsEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.io.IOException;
import java.net.URISyntaxException;

public class CopyAssetsHandler implements Listener {
    @EventHandler
    public void onCopy(CopyAssetsEvent event) {
        try {
            ResourcePackContext.extractFolder(
                    CopyAssetsHandler.class,
                    "pantheondemo",
                    event.getPackFolder().toPath().resolve("pantheondemo")
            );
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex);
        }
    }
}
