package com.google.mlkit.vision.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.mlkit.common.sdkinternal.MLTaskInput;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import com.google.mlkit.vision.common.internal.ImageUtils;
import defpackage.arn;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class InputImage implements MLTaskInput {
    public static final int IMAGE_FORMAT_BITMAP = -1;
    public static final int IMAGE_FORMAT_NV21 = 17;
    public static final int IMAGE_FORMAT_YUV_420_888 = 35;
    public static final int IMAGE_FORMAT_YV12 = 842094169;
    private volatile Bitmap zza;
    private volatile ByteBuffer zzb;
    private volatile zzb zzc;
    private final int zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final Matrix zzh;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface ImageFormat {
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private InputImage(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        boolean z;
        if (i4 != 842094169) {
            if (i4 == 17) {
                i4 = 17;
            } else {
                z = false;
                arn.b(z);
                arn.h(byteBuffer);
                this.zzb = byteBuffer;
                arn.a("Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.", byteBuffer.limit() > i * i2);
                byteBuffer.rewind();
                this.zzd = i;
                this.zze = i2;
                zza(i3);
                this.zzf = i3;
                this.zzg = i4;
                this.zzh = null;
            }
        }
        z = true;
        arn.b(z);
        arn.h(byteBuffer);
        this.zzb = byteBuffer;
        arn.a("Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.", byteBuffer.limit() > i * i2);
        byteBuffer.rewind();
        this.zzd = i;
        this.zze = i2;
        zza(i3);
        this.zzf = i3;
        this.zzg = i4;
        this.zzh = null;
    }

    public static InputImage fromBitmap(Bitmap bitmap, int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(bitmap, i);
        zzc(-1, 1, elapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i);
        return inputImage;
    }

    public static InputImage fromByteArray(byte[] bArr, int i, int i2, int i3, int i4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        arn.h(bArr);
        InputImage inputImage = new InputImage(ByteBuffer.wrap(bArr), i, i2, i3, i4);
        zzc(i4, 2, elapsedRealtime, i2, i, bArr.length, i3);
        return inputImage;
    }

    public static InputImage fromByteBuffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(byteBuffer, i, i2, i3, i4);
        zzc(i4, 3, elapsedRealtime, i2, i, byteBuffer.limit(), i3);
        return inputImage;
    }

    public static InputImage fromFilePath(Context context, Uri uri) {
        arn.i(context, "Please provide a valid Context");
        arn.i(uri, "Please provide a valid imageUri");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap zza = ImageUtils.getInstance().zza(context.getContentResolver(), uri);
        InputImage inputImage = new InputImage(zza, 0);
        zzc(-1, 4, elapsedRealtime, zza.getHeight(), zza.getWidth(), zza.getAllocationByteCount(), 0);
        return inputImage;
    }

    public static InputImage fromMediaImage(Image image, int i, Matrix matrix) {
        boolean z;
        if (image.getFormat() == 35) {
            z = true;
        } else {
            z = false;
        }
        arn.a("Only YUV_420_888 is supported now", z);
        return zzb(image, i, matrix);
    }

    private static int zza(int i) {
        boolean z = true;
        if (i != 0 && i != 90 && i != 180) {
            if (i == 270) {
                i = 270;
            } else {
                z = false;
            }
        }
        arn.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z);
        return i;
    }

    private static InputImage zzb(Image image, int i, Matrix matrix) {
        Image image2;
        int i2;
        int limit;
        InputImage inputImage;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        arn.i(image, "Please provide a valid image");
        zza(i);
        boolean z = true;
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z = false;
        }
        arn.a("Only JPEG and YUV_420_888 are supported now", z);
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            limit = image.getPlanes()[0].getBuffer().limit();
            image2 = image;
            i2 = i;
            inputImage = new InputImage(ImageConvertUtils.getInstance().convertJpegToUpRightBitmap(image, i), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            image2 = image;
            i2 = i;
            InputImage inputImage2 = new InputImage(image2, image.getWidth(), image.getHeight(), i2, matrix);
            limit = (image2.getPlanes()[0].getBuffer().limit() * 3) / 2;
            inputImage = inputImage2;
        }
        zzc(image2.getFormat(), 5, elapsedRealtime, image2.getHeight(), image2.getWidth(), limit, i2);
        return inputImage;
    }

    private static void zzc(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        zzmu.zza(zzms.zzb("vision-common"), i, i2, j, i3, i4, i5, i6);
    }

    public Bitmap getBitmapInternal() {
        return this.zza;
    }

    public ByteBuffer getByteBuffer() {
        return this.zzb;
    }

    public Matrix getCoordinatesMatrix() {
        return this.zzh;
    }

    public int getFormat() {
        return this.zzg;
    }

    public int getHeight() {
        return this.zze;
    }

    public Image getMediaImage() {
        if (this.zzc == null) {
            return null;
        }
        return this.zzc.zza();
    }

    public Image.Plane[] getPlanes() {
        if (this.zzc == null) {
            return null;
        }
        return this.zzc.zzb();
    }

    public int getRotationDegrees() {
        return this.zzf;
    }

    public int getWidth() {
        return this.zzd;
    }

    public static InputImage fromMediaImage(Image image, int i) {
        return zzb(image, i, null);
    }

    private InputImage(Image image, int i, int i2, int i3, Matrix matrix) {
        arn.h(image);
        this.zzc = new zzb(image);
        this.zzd = i;
        this.zze = i2;
        zza(i3);
        this.zzf = i3;
        this.zzg = 35;
        this.zzh = matrix;
    }

    private InputImage(Bitmap bitmap, int i) {
        arn.h(bitmap);
        this.zza = bitmap;
        this.zzd = bitmap.getWidth();
        this.zze = bitmap.getHeight();
        zza(i);
        this.zzf = i;
        this.zzg = -1;
        this.zzh = null;
    }
}
