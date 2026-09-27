package com.google.android.gms.internal.mlkit_vision_mediapipe;

import android.graphics.Bitmap;
import defpackage.qp7;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzhl extends zzhx {
    public zzhl(zzhp zzhpVar) {
        super(zzhpVar);
    }

    private final native long zzh(long j, Bitmap bitmap);

    public final zzhv zza(Bitmap bitmap) {
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            return zzhv.zzd(zzh(this.zza.zza(), bitmap));
        }
        qp7.p("bitmap must use ARGB_8888 config.");
        return null;
    }
}
