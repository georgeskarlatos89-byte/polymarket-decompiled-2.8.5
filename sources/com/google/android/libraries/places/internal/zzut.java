package com.google.android.libraries.places.internal;

import defpackage.ix2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzut extends zzuv {
    private final String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzut(String str) {
        super(null);
        str.getClass();
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zzut) && Intrinsics.areEqual(this.zza, ((zzut) obj).zza)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        return ix2.p(new StringBuilder(String.valueOf(str).length() + 14), "Feature(name=", str, ")");
    }

    public final String zza() {
        return this.zza;
    }
}
