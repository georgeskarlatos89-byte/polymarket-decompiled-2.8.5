package com.launchdarkly.sdk;

import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class a {
    public ArrayList a;
    public volatile boolean b;

    public final void a(LDValue lDValue) {
        if (this.b) {
            this.a = new ArrayList(this.a);
            this.b = false;
        }
        ArrayList arrayList = this.a;
        if (lDValue == null) {
            lDValue = LDValueNull.INSTANCE;
        }
        arrayList.add(lDValue);
    }

    public final LDValue b() {
        this.b = true;
        return LDValueArray.t(this.a);
    }
}
