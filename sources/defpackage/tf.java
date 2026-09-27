package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class tf implements fp {
    public static xzb d(String str) {
        xzb xzbVar = new xzb();
        if (str.length() > 0) {
            xzbVar.put("address_country_code", str);
        }
        return xzbVar.b();
    }

    public abstract Map a();
}
