package com.google.android.libraries.places.internal;

import java.util.Comparator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcbx implements Comparator {
    final /* synthetic */ zzcby zza;

    public zzcbx(zzcby zzcbyVar) {
        this.zza = zzcbyVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzcby zzcbyVar = this.zza;
        zzcbyVar.zza(obj);
        zzcbyVar.zza(obj2);
        return obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
