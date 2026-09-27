package com.launchdarkly.sdk;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class b {
    public final b a;
    public final HashMap b = new HashMap();

    public b(b bVar) {
        this.a = bVar;
    }

    public final HashMap a() {
        if (this.a == null) {
            return this.b;
        }
        HashMap hashMap = new HashMap();
        b(hashMap);
        return hashMap;
    }

    public final void b(HashMap hashMap) {
        b bVar = this.a;
        if (bVar != null) {
            bVar.b(hashMap);
        }
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            LDValue lDValue = (LDValue) entry.getValue();
            lDValue.getClass();
            if (lDValue instanceof LDValueNull) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, lDValue);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return a().equals(((b) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
