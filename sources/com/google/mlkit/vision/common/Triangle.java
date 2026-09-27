package com.google.mlkit.vision.common;

import com.google.android.gms.internal.mlkit_vision_common.zzp;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class Triangle<T> {
    private final zzp zza;

    public Triangle(T t, T t2, T t3) {
        this.zza = zzp.zzj(t, t2, t3);
    }

    public List<T> getAllPoints() {
        return this.zza;
    }
}
