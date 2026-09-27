package com.socure.docv.capturesdk.common.utils;

import android.graphics.Bitmap;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/VarianceCalculator;", "", "<init>", "()V", "calculateMSE", "", "bitmap1", "Landroid/graphics/Bitmap;", "bitmap2", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VarianceCalculator {
    public static final int $stable = 0;

    public final float calculateMSE(Bitmap bitmap1, Bitmap bitmap2) {
        bitmap1.getClass();
        bitmap2.getClass();
        float f = 0.0f;
        if (bitmap1.getWidth() != bitmap2.getWidth() || bitmap1.getHeight() != bitmap2.getHeight()) {
            return 0.0f;
        }
        int width = bitmap1.getWidth();
        int height = bitmap1.getHeight();
        int i = width * height;
        for (int i2 = 0; i2 < height; i2++) {
            for (int i3 = 0; i3 < width; i3++) {
                int pixel = bitmap1.getPixel(i3, i2);
                int pixel2 = bitmap2.getPixel(i3, i2);
                int i4 = ((pixel >> 16) & 255) - ((pixel2 >> 16) & 255);
                int i5 = ((pixel >> 8) & 255) - ((pixel2 >> 8) & 255);
                int i6 = (pixel & 255) - (pixel2 & 255);
                int i7 = i6 * i6;
                f += i7 + (i5 * i5) + (i4 * i4);
            }
        }
        return f / (i * 3.0f);
    }
}
