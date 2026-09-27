package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import defpackage.brn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzmi {
    private Bitmap zza;

    public final zzmj zza() {
        boolean z;
        if (this.zza != null) {
            z = true;
        } else {
            z = false;
        }
        brn.r("Photo must be set to non-null value.", z);
        return new zzmj(this.zza, null);
    }

    public final zzmi zzb(Bitmap bitmap) {
        this.zza = bitmap;
        return this;
    }
}
