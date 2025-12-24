package top.einsluca.autogg.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "autogg")
public class AutoggConfig implements ConfigData {

    boolean enabled = true;

    String message = "gg";

    Double delay = 1.0;

    public String getMessage() {
        return message;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public Double getDelay() {
        return delay;
    }
}
