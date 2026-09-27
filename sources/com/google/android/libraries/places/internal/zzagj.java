package com.google.android.libraries.places.internal;

import defpackage.ix2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzagj {
    private final String zza;

    static {
        new zzagj("");
        new zzagj("<br>");
        new zzagj("<!DOCTYPE html>");
    }

    public zzagj(String str) {
        str.getClass();
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzagj)) {
            return false;
        }
        return this.zza.equals(((zzagj) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 867184553;
    }

    public final String toString() {
        String str = this.zza;
        return ix2.p(new StringBuilder(str.length() + 10), "SafeHtml{", str, "}");
    }

    public final String zza() {
        return this.zza;
    }
}
