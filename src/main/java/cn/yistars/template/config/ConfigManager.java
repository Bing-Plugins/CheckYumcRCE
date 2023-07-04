package cn.yistars.template.config;

import cn.yistars.template.CheckYumcRCE;

public class ConfigManager {
    public static void loadConfig() {
        CheckYumcRCE.instance.saveDefaultConfig();
        CheckYumcRCE.instance.reloadConfig();
        CheckYumcRCE.instance.Lang.saveDefaultConfig();
        CheckYumcRCE.instance.Lang.reloadConfig();
    }
}
