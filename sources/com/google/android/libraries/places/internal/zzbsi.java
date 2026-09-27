package com.google.android.libraries.places.internal;

import defpackage.dmk;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbsi implements Map.Entry {
    private final Map.Entry zza;

    public /* synthetic */ zzbsi(Map.Entry entry, byte[] bArr) {
        this.zza = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zzbsk zzbskVar = (zzbsk) this.zza.getValue();
        if (zzbskVar == null) {
            return null;
        }
        return zzbskVar.zza();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzbsz) {
            Map.Entry entry = this.zza;
            zzbsz zzbszVar = ((zzbsk) entry.getValue()).zza;
            entry.setValue(new zzbsk((zzbsz) obj));
            return zzbszVar;
        }
        dmk.v("Lazy field only supports MessageLite values.");
        return null;
    }

    public final zzbsk zza() {
        return (zzbsk) this.zza.getValue();
    }
}
