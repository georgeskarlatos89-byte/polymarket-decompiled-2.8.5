package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import defpackage.hp9;
import defpackage.w4g;
import defpackage.x4g;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzng extends hp9 {
    final /* synthetic */ Map zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzng(zznk zznkVar, String str, x4g x4gVar, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, w4g w4gVar, Map map) {
        super(str, x4gVar, scaleType, config, w4gVar);
        this.zza = map;
        Objects.requireNonNull(zznkVar);
    }

    @Override // defpackage.m1g
    public final Map getHeaders() {
        return this.zza;
    }
}
