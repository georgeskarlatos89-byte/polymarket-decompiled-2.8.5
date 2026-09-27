package com.google.android.libraries.places.api.net;

import defpackage.jr9;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzai {
    public abstract zzai zzb(String str);

    public abstract zzai zzc(List list);

    public abstract List zzd();

    public abstract zzak zze();

    public abstract zzai zzf(int i);

    public final zzak zzg() {
        List zzd = zzd();
        if (zzd != null) {
            zzc(jr9.m(zzd));
        }
        return zze();
    }
}
