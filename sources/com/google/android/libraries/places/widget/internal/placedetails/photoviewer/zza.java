package com.google.android.libraries.places.widget.internal.placedetails.photoviewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.dmk;
import defpackage.hf1;
import defpackage.jf1;
import java.security.MessageDigest;
import java.util.Objects;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zza extends jf1 {
    private final float zza;
    private final float zzb;
    private final Context zzc;

    public zza(Context context, float f, float f2) {
        context.getClass();
        this.zza = 25.0f;
        this.zzb = 0.125f;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.zzc = applicationContext;
        double d = 25.0f;
        if (d >= ConstantsKt.UNSET && d <= 25.0d) {
            return;
        }
        dmk.v("Blur radius must be between 0 and 25!");
        throw null;
    }

    @Override // defpackage.rma
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zza)) {
            return false;
        }
        zza zzaVar = (zza) obj;
        if (Float.valueOf(this.zza).equals(Float.valueOf(zzaVar.zza))) {
            if (Float.valueOf(this.zzb).equals(Float.valueOf(zzaVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rma
    public final int hashCode() {
        return Objects.hash("com.google.android.libraries.places.widget.internal.placedetails.photoviewer.BlurTransformation", Float.valueOf(this.zza), Float.valueOf(this.zzb));
    }

    @Override // defpackage.jf1
    public final Bitmap transform(hf1 hf1Var, Bitmap bitmap, int i, int i2) {
        hf1Var.getClass();
        bitmap.getClass();
        float width = bitmap.getWidth();
        float f = this.zzb;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(width * f), Math.round(bitmap.getHeight() * f), false);
        createScaledBitmap.getClass();
        Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
        createBitmap.getClass();
        RenderScript create = RenderScript.create(this.zzc);
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
        try {
            create2.setRadius(this.zza);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return createBitmap;
        } finally {
            createScaledBitmap.recycle();
            createFromBitmap.destroy();
            createFromBitmap2.destroy();
            create2.destroy();
            create.destroy();
        }
    }

    @Override // defpackage.rma
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.getClass();
        byte[] bytes = "blurred".getBytes(Charsets.UTF_8);
        bytes.getClass();
        messageDigest.update(bytes);
        messageDigest.update((byte) (this.zza * 10.0f));
        messageDigest.update((byte) (this.zzb * 10.0f));
    }
}
