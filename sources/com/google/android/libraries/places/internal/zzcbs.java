package com.google.android.libraries.places.internal;

import defpackage.af9;
import defpackage.nhn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzcbs extends zzbxe {
    public final String toString() {
        af9 b = nhn.b(this);
        b.f(zze(), "delegate");
        return b.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbxe
    public final void zzd() {
        zze().zzd();
    }

    public abstract zzbxe zze();
}
