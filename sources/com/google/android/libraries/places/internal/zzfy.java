package com.google.android.libraries.places.internal;

import defpackage.pql;
import defpackage.ujb;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzfy implements zzbeb {
    private static final zzcao zzc = zzcao.zzc("Cookie", zzcas.zza);
    private final zzfw zza;
    private ujb zzb;

    public zzfy(zzfw zzfwVar) {
        zzfwVar.getClass();
        this.zza = zzfwVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbeb
    public final zzbfh zza(zzbdz zzbdzVar) {
        zzbdzVar.getClass();
        ujb zza = this.zza.zza();
        this.zzb = zza;
        zzbfh zzb = zzbfh.zzb(zza);
        zzb.getClass();
        return zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbeb
    public final zzbfh zzb(zzbdz zzbdzVar) {
        zzbdzVar.getClass();
        ujb ujbVar = this.zzb;
        if (ujbVar != null) {
            try {
                Object c = pql.c(ujbVar);
                c.getClass();
                String str = (String) c;
                if (!Intrinsics.areEqual(str, "")) {
                    zzcas zzb = zzbdzVar.zzb();
                    zzcao zzcaoVar = zzc;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
                    sb.append("NID=");
                    sb.append(str);
                    zzb.zzc(zzcaoVar, sb.toString());
                }
            } catch (Exception unused) {
            }
            zzbfh zza = zzbfh.zza();
            zza.getClass();
            return zza;
        }
        zzbfh zza2 = zzbfh.zza();
        zza2.getClass();
        return zza2;
    }
}
