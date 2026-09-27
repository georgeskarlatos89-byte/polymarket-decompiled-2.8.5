package com.google.android.libraries.places.internal;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzche implements zzcgg {
    private final zzchl zza;

    public zzche(zzchl zzchlVar) {
        if (zzchlVar != null) {
            this.zza = zzchlVar;
        } else {
            dmk.s("Http2Error cannot be null for GOAWAY");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzche.class == obj.getClass() && this.zza == ((zzche) obj).zza) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.libraries.places.internal.zzcgg
    public final String zza() {
        return "GOAWAY ".concat(String.valueOf(this.zza.name()));
    }
}
