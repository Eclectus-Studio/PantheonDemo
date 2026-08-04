package com.eclectusstudio.pantheonDemo.events;

import com.eclectusstudio.pantheon.event.SubmitItemsEvent;
import com.eclectusstudio.pantheonDemo.PantheonDemo;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoItems;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class SubmitItemHandler implements Listener {
    @EventHandler
    public void onSubmit(SubmitItemsEvent event) {
        event.submitItems(PantheonDemoItems.items);

        PantheonDemo.logger.info("Submitted Items");
    }
}
