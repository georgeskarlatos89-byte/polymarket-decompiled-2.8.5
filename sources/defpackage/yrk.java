package defpackage;

import android.media.ImageWriter;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class yrk implements ImageWriter.OnImageReleasedListener {
    public final /* synthetic */ to9 a;

    public /* synthetic */ yrk(to9 to9Var) {
        this.a = to9Var;
    }

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public final void onImageReleased(ImageWriter imageWriter) {
        this.a.close();
    }
}
