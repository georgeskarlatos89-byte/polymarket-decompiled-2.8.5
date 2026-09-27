package com.launchdarkly.sdk;

import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class j {
    public volatile HashMap a = new HashMap();
    public volatile boolean b = false;

    public final LDValue a() {
        this.b = true;
        return LDValueObject.t(this.a);
    }

    public final void b(long j, String str) {
        d(str, LDValueNumber.t(j));
    }

    public final void c(String str, int i) {
        d(str, LDValueNumber.t(i));
    }

    public final void d(String str, LDValue lDValue) {
        if (this.b) {
            this.a = new HashMap(this.a);
            this.b = false;
        }
        HashMap hashMap = this.a;
        if (lDValue == null) {
            lDValue = LDValueNull.INSTANCE;
        }
        hashMap.put(str, lDValue);
    }

    public final void e(String str, String str2) {
        d(str, LDValue.n(str2));
    }

    public final void f(String str, boolean z) {
        LDValueBool lDValueBool;
        if (z) {
            lDValueBool = LDValueBool.TRUE;
        } else {
            lDValueBool = LDValueBool.FALSE;
        }
        d(str, lDValueBool);
    }
}
