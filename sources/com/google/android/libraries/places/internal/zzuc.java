package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import defpackage.iq9;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zzuc extends iq9 {
    private final ImageView zza;
    private final Function1 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzuc(ImageView imageView, Function1 function1) {
        super(imageView);
        imageView.getClass();
        this.zza = imageView;
        this.zzb = function1;
    }

    public static /* synthetic */ void zzb(zzuc zzucVar, Bitmap bitmap) {
        zzucVar.zza.setImageBitmap(bitmap);
    }

    @Override // defpackage.iq9, defpackage.voi
    public final void onLoadFailed(Drawable drawable) {
        Function1 function1 = this.zzb;
        if (function1 != null) {
            function1.invoke(this.zza);
        }
    }

    @Override // defpackage.iq9
    public final /* bridge */ /* synthetic */ void setResource(Object obj) {
        final Bitmap bitmap = (Bitmap) obj;
        this.zza.post(new Runnable() { // from class: com.google.android.libraries.places.internal.zzub
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzuc.zzb(zzuc.this, bitmap);
            }
        });
    }

    public final ImageView zza() {
        return this.zza;
    }
}
