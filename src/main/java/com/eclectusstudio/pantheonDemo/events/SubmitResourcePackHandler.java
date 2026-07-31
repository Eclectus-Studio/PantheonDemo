package com.eclectusstudio.pantheonDemo.events;

import com.eclectusstudio.pantheon.common.PackMCMeta;
import com.eclectusstudio.pantheon.common.ResourceLocation;
import com.eclectusstudio.pantheon.common.ResourcePack;
import com.eclectusstudio.pantheon.common.resource.equipment.Equipment;
import com.eclectusstudio.pantheon.event.BuildResourcePackEvent;
import com.eclectusstudio.pantheonDemo.statics.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class SubmitResourcePackHandler implements Listener {
    @EventHandler
    public void onSubmit(BuildResourcePackEvent event) {
        PackMCMeta packMCMeta = PackMCMeta.builder()
                .packFormat(88)
                .supports(88,100)
                .description("PantheonDemo Resource Pack")
                .build();

        ResourcePack pack = new ResourcePack(packMCMeta);

        int run = PantheonDemoItemModels.itemModels.size();

        for (int i = 0; i < run; i++) {
            pack.addItem(PantheonDemoItemLocations.resourceLocations.get(i), PantheonDemoItemModels.itemModels.get(i));
            pack.addModel(PantheonDemoItemLocations.resourceLocations.get(i), PantheonDemoItemModelDefinitions.itemModelDefinitions.get(i));
        }

        for (Equipment equipment : PantheonDemoEquipment.equipment) {
            pack.addEquipment(equipment);
        }

        pack.addFont(new ResourceLocation("minecraft","default"), PantheonDemoFont.font);

        event.buildResourcePack(pack);
    }
}
