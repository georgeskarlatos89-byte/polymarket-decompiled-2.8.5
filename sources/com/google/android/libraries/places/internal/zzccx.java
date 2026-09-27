package com.google.android.libraries.places.internal;

import defpackage.qp7;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzccx implements zzcmb {
    @Override // com.google.android.libraries.places.internal.zzcmb
    public boolean zza() {
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzcmb
    public void zzc() {
        throw new UnsupportedOperationException();
    }

    public final void zzd(int i) {
        if (zzf() >= i) {
            return;
        }
        qp7.f();
    }

    @Override // com.google.android.libraries.places.internal.zzcmb, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.google.android.libraries.places.internal.zzcmb
    public void zzb() {
    }
}
