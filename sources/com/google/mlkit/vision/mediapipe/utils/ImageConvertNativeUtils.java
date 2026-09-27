package com.google.mlkit.vision.mediapipe.utils;

import android.media.Image;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import defpackage.arn;
import defpackage.eim;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class ImageConvertNativeUtils {
    private ImageConvertNativeUtils() {
    }

    private static native byte[] byteArrayToRgb(byte[] bArr, int i, int i2, int i3, int i4);

    public static byte[] getRgbBuffer(InputImage inputImage) {
        byte[] bArr;
        eim o = eim.o("ImageConvertNativeUtils#getRgbBuffer");
        o.zzb();
        try {
            ByteBuffer byteBuffer = inputImage.getByteBuffer();
            if (byteBuffer == null || (inputImage.getFormat() != 17 && inputImage.getFormat() != 842094169)) {
                if (inputImage.getFormat() == 35 && inputImage.getPlanes() != null) {
                    Image.Plane[] planes = inputImage.getPlanes();
                    arn.h(planes);
                    if (planes.length == 3) {
                        Image.Plane[] planes2 = inputImage.getPlanes();
                        arn.h(planes2);
                        bArr = yuvPlanesToRgb(planes2[0].getBuffer(), planes2[1].getBuffer(), planes2[2].getBuffer(), inputImage.getWidth(), inputImage.getHeight(), planes2[0].getRowStride(), planes2[1].getRowStride(), planes2[1].getPixelStride(), inputImage.getRotationDegrees());
                        o.close();
                        return bArr;
                    }
                }
                bArr = null;
                o.close();
                return bArr;
            }
            bArr = byteArrayToRgb(ImageConvertUtils.getInstance().byteBufferToByteArray(byteBuffer), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees(), inputImage.getFormat());
            o.close();
            return bArr;
        } catch (Throwable th) {
            try {
                o.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    private static native byte[] yuvPlanesToRgb(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6);
}
