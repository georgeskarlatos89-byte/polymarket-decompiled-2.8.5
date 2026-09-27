package com.google.android.libraries.places.internal;

import defpackage.k84;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzadf implements zzaco {
    private final zzaco zza;
    private final Object zzb;

    private zzadf(zzaco zzacoVar, Object obj) {
        zzagc.zza(zzacoVar, "log site key");
        this.zza = zzacoVar;
        zzagc.zza(obj, "log site qualifier");
        this.zzb = obj;
    }

    public static zzaco zza(zzaco zzacoVar, Object obj) {
        return new zzadf(zzacoVar, obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzadf)) {
            return false;
        }
        zzadf zzadfVar = (zzadf) obj;
        if (!this.zza.equals(zzadfVar.zza) || !this.zzb.equals(zzadfVar.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ this.zzb.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String obj2 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(length + 47 + obj2.length() + 3);
        k84.q(sb, "SpecializedLogSiteKey{ delegate='", obj, "', qualifier='", obj2);
        sb.append("' }");
        return sb.toString();
    }
}
