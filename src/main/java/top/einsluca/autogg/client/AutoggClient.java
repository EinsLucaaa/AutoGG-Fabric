package top.einsluca.autogg.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents;
import net.minecraft.client.Minecraft;
import top.einsluca.autogg.Autogg;

public class AutoggClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientReceiveMessageEvents.GAME.register((message, allowed) -> {
            String newMessage = message.getString();
            Autogg.getInstance().getServerRegistry().getServers().forEach(serverConfiguration -> {
                serverConfiguration.getServerAddress().forEach(serverAddress -> {
                    Minecraft minecraft = Minecraft.getInstance();
                    if (minecraft.getCurrentServer() == null) return;
                    if (minecraft.getCurrentServer().ip.toLowerCase().contains(serverAddress.toLowerCase())) {
                        for (String s : serverConfiguration.getFilter()) {
                            if (newMessage.contains(s)) return;
                        }
                        serverConfiguration.getFormat().forEach(format -> {
                            if (newMessage.contains(format)) {
                                Autogg.getInstance().sendGG();
                            }
                        });
                    }
                });
            });
        });
    }
}