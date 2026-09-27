package com.google.android.libraries.places.api.model;

import defpackage.jr9;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzih {
    public abstract zzih zza(zzig zzigVar);

    public abstract zzih zzb(List list);

    public abstract List zzc();

    public abstract zzii zzd();

    public final zzii zze() {
        List zzc = zzc();
        if (zzc != null) {
            zzb(jr9.m(zzc));
        }
        return zzd();
    }
}
