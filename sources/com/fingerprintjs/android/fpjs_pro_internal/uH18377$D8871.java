package com.fingerprintjs.android.fpjs_pro_internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class uH18377$D8871 {
    public static int c;
    public static int d;
    public final unregisterForContextMenu a;
    public final d b;

    public uH18377$D8871(unregisterForContextMenu unregisterforcontextmenu, d dVar) {
        this.a = unregisterforcontextmenu;
        this.b = dVar;
    }

    public static int component9() {
        int i = c;
        int i2 = i % 6555674;
        c = i + 1;
        if (i2 != 0) {
            return d;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        d = i3;
        return i3;
    }
}
