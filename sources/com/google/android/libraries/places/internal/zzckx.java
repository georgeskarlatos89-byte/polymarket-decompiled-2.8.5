package com.google.android.libraries.places.internal;

import java.io.OutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzckx extends OutputStream {
    final /* synthetic */ zzckz zza;

    public /* synthetic */ zzckx(zzckz zzckzVar, byte[] bArr) {
        Objects.requireNonNull(zzckzVar);
        this.zza = zzckzVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.zza.zzg(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.zza.zzg(bArr, i, i2);
    }
}
