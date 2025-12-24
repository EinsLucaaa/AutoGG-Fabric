
package top.einsluca.autogg;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.Minecraft;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.einsluca.autogg.config.AutoggConfig;
import top.einsluca.autogg.server.ServerRegistry;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Autogg implements ModInitializer {

    public static Autogg instance;

    public static final String MOD_ID = "auto-gg";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private final ServerRegistry serverRegistry = new ServerRegistry();

    private boolean alreadySent = false;

    @Override
    public void onInitialize() {
        instance = this;
        AutoConfig.register(AutoggConfig.class, Toml4jConfigSerializer::new);
        LOGGER.info("Starting Auto GG Mod (common init)");
    }

    public static Autogg getInstance() {
        return instance;
    }

    public void sendGG() {
        final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        long delaySeconds = Math.round(getConfig().getDelay());
        executor.schedule(() -> {
            Minecraft.getInstance().execute(() -> {
                if (!alreadySent) {
                    if (Minecraft.getInstance().player != null) {
                        Minecraft.getInstance().player.connection.sendChat(getConfig().getMessage());
                        alreadySent = true;
                    }
                }
            });
            executor.shutdown();
        }, delaySeconds, TimeUnit.SECONDS);

        final ScheduledExecutorService resetExec = Executors.newSingleThreadScheduledExecutor();
        resetExec.schedule(() -> {
            Minecraft.getInstance().execute(() -> alreadySent = false);
            resetExec.shutdown();
        }, 15, TimeUnit.SECONDS);
    }

    public AutoggConfig getConfig() {
        return AutoConfig.getConfigHolder(AutoggConfig.class).getConfig();
    }

    public ServerRegistry getServerRegistry() {
        return serverRegistry;
    }
}