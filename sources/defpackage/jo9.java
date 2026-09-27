package defpackage;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class jo9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Bitmap.CompressFormat.values().length];
        try {
            iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Bitmap.CompressFormat.PNG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
