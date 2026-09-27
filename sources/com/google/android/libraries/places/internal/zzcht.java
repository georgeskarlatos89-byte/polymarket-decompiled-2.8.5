package com.google.android.libraries.places.internal;

import defpackage.ix2;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcht {
    private final ArrayList zza = new ArrayList();

    public final String toString() {
        return this.zza.toString();
    }

    public final zzcht zza(Object obj) {
        this.zza.add(String.valueOf(obj));
        return this;
    }

    public final zzcht zzb(String str, Object obj) {
        String valueOf = String.valueOf(obj);
        this.zza.add(ix2.p(new StringBuilder(str.length() + 1 + valueOf.length()), str, "=", valueOf));
        return this;
    }
}
