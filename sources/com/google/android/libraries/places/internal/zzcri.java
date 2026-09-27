package com.google.android.libraries.places.internal;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum zzcri {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    private final String zze;

    zzcri(String str) {
        this.zze = str;
    }

    public static zzcri zza(String str) {
        zzcri zzcriVar = HTTP_1_0;
        if (str.equals(zzcriVar.zze)) {
            return zzcriVar;
        }
        zzcri zzcriVar2 = HTTP_1_1;
        if (str.equals(zzcriVar2.zze)) {
            return zzcriVar2;
        }
        zzcri zzcriVar3 = HTTP_2;
        if (str.equals(zzcriVar3.zze)) {
            return zzcriVar3;
        }
        zzcri zzcriVar4 = SPDY_3;
        if (str.equals(zzcriVar4.zze)) {
            return zzcriVar4;
        }
        dmk.x("Unexpected protocol: ".concat(str));
        return null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
