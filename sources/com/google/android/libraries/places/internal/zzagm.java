package com.google.android.libraries.places.internal;

import defpackage.ix2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzagm {
    public static final zzagm zza = new zzagm("about:invalid#zGuavaz");
    private final String zzb;

    public zzagm(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzagm)) {
            return false;
        }
        return this.zzb.equals(((zzagm) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ 18288376;
    }

    public final String toString() {
        String str = this.zzb;
        return ix2.p(new StringBuilder(str.length() + 9), "SafeUrl{", str, "}");
    }

    public final String zza() {
        return this.zzb;
    }
}
