package com.google.android.libraries.places.internal;

import defpackage.af9;
import defpackage.nhn;
import defpackage.u2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcsq extends u2 {
    private final zzbxf zza;

    public zzcsq(zzbxf zzbxfVar) {
        this.zza = zzbxfVar;
    }

    @Override // defpackage.u2
    public final void interruptTask() {
        this.zza.zze("GrpcFuture was cancelled", null);
    }

    @Override // defpackage.u2
    public final String pendingToString() {
        af9 b = nhn.b(this);
        b.f(this.zza, "clientCall");
        return b.toString();
    }

    @Override // defpackage.u2
    public final boolean set(Object obj) {
        return super.set(obj);
    }

    @Override // defpackage.u2
    public final boolean setException(Throwable th) {
        return super.setException(th);
    }

    public final /* synthetic */ zzbxf zza() {
        return this.zza;
    }
}
