package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import defpackage.d1c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFi1kSDK implements AFi1lSDK {
    private PluginInfo getMonetizationNetwork = new PluginInfo(Plugin.NATIVE, "6.18.0", null, 4, null);

    @Override // com.appsflyer.internal.AFi1lSDK
    public final Map<String, Object> getRevenue() {
        LinkedHashMap h = d1c.h(new Pair("platform", this.getMonetizationNetwork.getPlugin().getPluginName()), new Pair("version", this.getMonetizationNetwork.getVersion()));
        if (!this.getMonetizationNetwork.getAdditionalParams().isEmpty()) {
            h.put("extras", this.getMonetizationNetwork.getAdditionalParams());
        }
        return h;
    }

    @Override // com.appsflyer.internal.AFi1lSDK
    public final void getRevenue(PluginInfo pluginInfo) {
        pluginInfo.getClass();
        this.getMonetizationNetwork = pluginInfo;
    }
}
