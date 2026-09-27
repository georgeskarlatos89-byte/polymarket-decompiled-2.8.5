package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFb1uSDK {
    public final String[] getRevenue;

    public AFb1uSDK(String... strArr) {
        if (strArr != null && strArr.length != 0) {
            Pattern compile = Pattern.compile("[\\w]{1,45}");
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (str != null && compile.matcher(str).matches()) {
                    arrayList.add(str.toLowerCase(Locale.getDefault()));
                } else {
                    AFLogger.afWarnLog("Invalid partner name: ".concat(String.valueOf(str)));
                }
            }
            if (arrayList.contains("all")) {
                this.getRevenue = new String[]{"all"};
                return;
            } else if (!arrayList.isEmpty()) {
                this.getRevenue = (String[]) arrayList.toArray(new String[0]);
                return;
            } else {
                this.getRevenue = null;
                return;
            }
        }
        this.getRevenue = null;
    }
}
