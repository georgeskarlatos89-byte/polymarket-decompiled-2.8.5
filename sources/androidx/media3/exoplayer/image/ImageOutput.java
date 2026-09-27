package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import defpackage.mo9;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface ImageOutput {
    public static final mo9 a = new Object();

    void a();

    void onImageAvailable(long j, Bitmap bitmap);
}
