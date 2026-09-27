package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcob extends zzcoa {
    private final AtomicIntegerFieldUpdater zza;

    public /* synthetic */ zzcob(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, byte[] bArr) {
        super(null);
        this.zza = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.libraries.places.internal.zzcoa
    public final boolean zza(zzcod zzcodVar, int i, int i2) {
        return this.zza.compareAndSet(zzcodVar, 0, -1);
    }

    @Override // com.google.android.libraries.places.internal.zzcoa
    public final void zzb(zzcod zzcodVar, int i) {
        this.zza.set(zzcodVar, 0);
    }
}
