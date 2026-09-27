package com.google.android.libraries.places.internal;

import defpackage.hdi;
import defpackage.omf;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzaag {
    int zza;
    final int zzb;
    zzaag zzc;
    final Map zzd = new HashMap(0);

    public zzaag(int i, int i2, zzaag zzaagVar) {
        if (i <= i2) {
            this.zza = i;
            this.zzb = i2;
            this.zzc = null;
            return;
        }
        omf.a();
        throw null;
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        return hdi.l(identityHashCode, "Node", new StringBuilder(String.valueOf(identityHashCode).length() + 4));
    }
}
