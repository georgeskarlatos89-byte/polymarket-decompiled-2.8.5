package io.sentry.config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class b implements d {
    public final ArrayList a;

    public b(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // io.sentry.config.d
    public final Map b() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(((d) it.next()).b());
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.d
    public final String getProperty(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            String property = ((d) it.next()).getProperty(str);
            if (property != null) {
                return property;
            }
        }
        return null;
    }
}
