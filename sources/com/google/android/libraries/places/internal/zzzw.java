package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzzw extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        zzaaj zzaajVar = new zzaaj(zzzk.zza(Thread.currentThread()));
        Thread currentThread = Thread.currentThread();
        synchronized (zzzx.zzf()) {
            zzzx.zzf().put(currentThread, zzaajVar);
        }
        return zzaajVar;
    }
}
