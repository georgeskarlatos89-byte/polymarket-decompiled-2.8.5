package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcoc extends zzcoa {
    public /* synthetic */ zzcoc(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.libraries.places.internal.zzcoa
    public final boolean zza(zzcod zzcodVar, int i, int i2) {
        synchronized (zzcodVar) {
            try {
                if (zzcodVar.zza() == 0) {
                    zzcodVar.zzb(-1);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcoa
    public final void zzb(zzcod zzcodVar, int i) {
        synchronized (zzcodVar) {
            zzcodVar.zzb(0);
        }
    }

    private zzcoc() {
        throw null;
    }
}
