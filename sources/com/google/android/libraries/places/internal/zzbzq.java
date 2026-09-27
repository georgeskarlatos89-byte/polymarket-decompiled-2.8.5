package com.google.android.libraries.places.internal;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.brn;
import defpackage.ix2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbzq extends zzbzy {
    private final zzbzt zza;

    public zzbzq(zzbzt zzbztVar) {
        brn.m(zzbztVar, Keys.KEY_SOCURE_RESULT);
        this.zza = zzbztVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbzq)) {
            return false;
        }
        return this.zza.equals(((zzbzq) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        return ix2.p(new StringBuilder(valueOf.length() + 19), "FixedResultPicker(", valueOf, ")");
    }

    @Override // com.google.android.libraries.places.internal.zzbzy
    public final zzbzt zza(zzbzu zzbzuVar) {
        return this.zza;
    }
}
