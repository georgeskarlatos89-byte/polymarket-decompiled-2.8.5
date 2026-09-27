package com.google.mlkit.vision.common.internal;

import defpackage.xgc;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzd implements Callable {
    public final /* synthetic */ MobileVisionBase zza;
    public final /* synthetic */ xgc zzb;

    public /* synthetic */ zzd(MobileVisionBase mobileVisionBase, xgc xgcVar) {
        this.zza = mobileVisionBase;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.zza.zzb(null);
    }
}
