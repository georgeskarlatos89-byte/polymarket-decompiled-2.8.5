package com.google.android.libraries.places.internal;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzabp {
    private final Map zza = new HashMap();

    private zzabp() {
    }

    public final zzabp zza(char c, String str) {
        str.getClass();
        this.zza.put(Character.valueOf(c), str);
        return this;
    }

    public final zzabm zzb() {
        return new zzabo(this, this.zza, (char) 0, (char) 65535);
    }

    public /* synthetic */ zzabp(byte[] bArr) {
    }
}
