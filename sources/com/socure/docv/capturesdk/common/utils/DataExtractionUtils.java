package com.socure.docv.capturesdk.common.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import com.socure.docv.capturesdk.common.utils.ExtractedImageData;
import defpackage.r5g;
import defpackage.so9;
import defpackage.to9;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/DataExtractionUtils;", "", "<init>", "()V", "Lcom/socure/docv/capturesdk/common/utils/ExtractedImageData;", "extractedData", "Landroid/graphics/Bitmap;", "toBitmap", "(Lcom/socure/docv/capturesdk/common/utils/ExtractedImageData;)Landroid/graphics/Bitmap;", "Lto9;", "imageProxy", "extractImageData", "(Lto9;)Lcom/socure/docv/capturesdk/common/utils/ExtractedImageData;", "Landroid/media/Image;", "image", "Lcom/socure/docv/capturesdk/common/utils/ImageByteData;", "extractImageBytes", "(Landroid/media/Image;)Lcom/socure/docv/capturesdk/common/utils/ImageByteData;", "convertToImageByteData", "(Lcom/socure/docv/capturesdk/common/utils/ExtractedImageData;)Lcom/socure/docv/capturesdk/common/utils/ImageByteData;", "", "scaleFactor", "downscaleImage", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DataExtractionUtils {
    public static final int $stable = 0;
    public static final DataExtractionUtils INSTANCE = new DataExtractionUtils();

    private DataExtractionUtils() {
    }

    private final Bitmap toBitmap(ExtractedImageData extractedData) {
        if (extractedData.isValidYuvFormat() && extractedData.getPlanes().size() >= 3) {
            ExtractedImageData.PlaneData planeData = extractedData.getPlanes().get(0);
            ExtractedImageData.PlaneData planeData2 = extractedData.getPlanes().get(1);
            ExtractedImageData.PlaneData planeData3 = extractedData.getPlanes().get(2);
            int bufferSize = planeData.getBufferSize();
            int bufferSize2 = planeData2.getBufferSize();
            int bufferSize3 = planeData3.getBufferSize();
            byte[] bArr = new byte[bufferSize + bufferSize2 + bufferSize3];
            System.arraycopy(planeData.getBytes(), 0, bArr, 0, bufferSize);
            System.arraycopy(planeData3.getBytes(), 0, bArr, bufferSize, bufferSize3);
            System.arraycopy(planeData2.getBytes(), 0, bArr, bufferSize + bufferSize3, bufferSize2);
            YuvImage yuvImage = new YuvImage(bArr, 17, extractedData.getWidth(), extractedData.getHeight(), null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, extractedData.getWidth(), extractedData.getHeight()), 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        }
        return null;
    }

    public final ImageByteData convertToImageByteData(ExtractedImageData extractedData) {
        extractedData.getClass();
        if (extractedData.isValidYuvFormat() && extractedData.getPlanes().size() >= 3) {
            ExtractedImageData.PlaneData planeData = extractedData.getPlanes().get(0);
            ExtractedImageData.PlaneData planeData2 = extractedData.getPlanes().get(1);
            return new ImageByteData(planeData.getBytes(), planeData2.getBytes(), extractedData.getPlanes().get(2).getBytes(), extractedData.getWidth(), extractedData.getHeight(), extractedData.getFormat(), planeData2.getPixelStride(), true);
        }
        return new ImageByteData(new byte[0], new byte[0], new byte[0], extractedData.getWidth(), extractedData.getHeight(), extractedData.getFormat(), 0, false);
    }

    public final Bitmap downscaleImage(Bitmap extractedData, int scaleFactor) {
        extractedData.getClass();
        if (scaleFactor <= 1) {
            return null;
        }
        int width = extractedData.getWidth() / scaleFactor;
        int height = extractedData.getHeight() / scaleFactor;
        if (width == 0 || height == 0) {
            return null;
        }
        return Bitmap.createScaledBitmap(extractedData, width, height, true);
    }

    public final ImageByteData extractImageBytes(Image image) {
        Object m882constructorimpl;
        image.getClass();
        int width = image.getWidth();
        int height = image.getHeight();
        int format = image.getFormat();
        if (format == 35) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Image.Plane[] planes = image.getPlanes();
                Image.Plane plane = planes[0];
                Image.Plane plane2 = planes[1];
                Image.Plane plane3 = planes[2];
                int pixelStride = plane2.getPixelStride();
                int remaining = plane.getBuffer().remaining();
                byte[] bArr = new byte[remaining];
                byte[] bArr2 = new byte[plane2.getBuffer().remaining()];
                byte[] bArr3 = new byte[plane3.getBuffer().remaining()];
                plane.getBuffer().get(bArr);
                plane2.getBuffer().get(bArr2);
                plane3.getBuffer().get(bArr3);
                m882constructorimpl = Result.m882constructorimpl(new ImageByteData(bArr, bArr2, bArr3, width, height, format, pixelStride, true));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
            }
            if (m882constructorimpl instanceof r5g) {
                m882constructorimpl = null;
            }
            return (ImageByteData) m882constructorimpl;
        }
        return new ImageByteData(new byte[0], new byte[0], new byte[0], width, height, format, 0, false);
    }

    public final ExtractedImageData extractImageData(to9 imageProxy) {
        boolean z;
        boolean z2;
        imageProxy.getClass();
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int format = imageProxy.getFormat();
        int c = imageProxy.P0().c();
        if (format == 35) {
            z = true;
        } else {
            z = false;
        }
        if (format == 256) {
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList arrayList = new ArrayList();
        for (so9 so9Var : imageProxy.h0()) {
            ByteBuffer c2 = so9Var.c();
            c2.getClass();
            int remaining = c2.remaining();
            byte[] bArr = new byte[remaining];
            c2.get(bArr);
            arrayList.add(new ExtractedImageData.PlaneData(bArr, remaining, so9Var.e(), so9Var.d()));
        }
        return new ExtractedImageData(width, height, format, arrayList, z, z2, c);
    }
}
