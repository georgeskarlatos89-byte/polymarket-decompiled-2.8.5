package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbzf {
    private static final AtomicLong zza = new AtomicLong();
    private final String zzb;
    private final String zzc;
    private final long zzd;

    public zzbzf(String str, String str2, long j) {
        brn.m(str, "typeName");
        brn.g("empty type", !str.isEmpty());
        this.zzb = str;
        this.zzc = str2;
        this.zzd = j;
    }

    public static zzbzf zza(Class cls, String str) {
        brn.m(cls, "type");
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return zzb(simpleName, str);
    }

    public static zzbzf zzb(String str, String str2) {
        return new zzbzf(str, str2, zza.incrementAndGet());
    }

    public final String toString() {
        String str = this.zzb;
        int length = String.valueOf(str).length();
        long j = this.zzd;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(j).length() + 1);
        sb.append(str);
        sb.append("<");
        sb.append(j);
        sb.append(">");
        StringBuilder sb2 = new StringBuilder(sb.toString());
        String str2 = this.zzc;
        if (str2 != null) {
            sb2.append(": (");
            sb2.append(str2);
            sb2.append(')');
        }
        return sb2.toString();
    }

    public final long zzc() {
        return this.zzd;
    }
}
