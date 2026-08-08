package com.eclectusstudio.pantheonDemo;

import com.eclectusstudio.pantheon.bootstrap.DatapackSubmission;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoDatapack;
import io.papermc.paper.plugin.bootstrap.BootstrapContext;
import io.papermc.paper.plugin.bootstrap.PluginBootstrap;

public class PantheonDemoBootstrap implements PluginBootstrap {

    @Override
    public void bootstrap(final BootstrapContext context) {
        // Plugin bootstrap logic
        DatapackSubmission.submit(PantheonDemoDatapack.PANTHEON_DATAPACK);
    }
}
