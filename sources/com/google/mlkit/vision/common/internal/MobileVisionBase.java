package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import com.google.android.gms.internal.mlkit_vision_common.zzlx;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.vision.common.InputImage;
import defpackage.arn;
import defpackage.iid;
import defpackage.l7b;
import defpackage.lid;
import defpackage.m6b;
import defpackage.q23;
import defpackage.xgc;
import defpackage.yw8;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, l7b {
    public static final /* synthetic */ int zza = 0;
    private static final yw8 zzb = new yw8("MobileVisionBase", "");
    private final AtomicBoolean zzc = new AtomicBoolean(false);
    private final MLTask zzd;
    private final q23 zze;
    private final Executor zzf;
    private final Task zzg;

    public MobileVisionBase(MLTask<DetectionResultT, InputImage> mLTask, Executor executor) {
        this.zzd = mLTask;
        q23 q23Var = new q23();
        this.zze = q23Var;
        this.zzf = executor;
        mLTask.pin();
        this.zzg = mLTask.callAfterLoad(executor, new Callable() { // from class: com.google.mlkit.vision.common.internal.zzb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = MobileVisionBase.zza;
                return null;
            }
        }, q23Var.a).d(new iid() { // from class: com.google.mlkit.vision.common.internal.zzc
            @Override // defpackage.iid
            public final void onFailure(Exception exc) {
                MobileVisionBase.zzc(exc);
            }
        });
    }

    public static /* synthetic */ void zzc(Exception exc) {
        zzb.c("MobileVisionBase", "Error preloading model resource", exc);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.google.mlkit.vision.barcode.BarcodeScanner
    @lid(m6b.ON_DESTROY)
    public synchronized void close() {
        if (!this.zzc.getAndSet(true)) {
            this.zze.a();
            this.zzd.unpin(this.zzf);
        }
    }

    public synchronized Task<Void> closeWithTask() {
        if (!this.zzc.getAndSet(true)) {
            this.zze.a();
            return this.zzd.unpinWithTask(this.zzf);
        }
        return Tasks.d(null);
    }

    public synchronized Task<Void> getInitTaskBase() {
        return this.zzg;
    }

    public Task<DetectionResultT> process(Bitmap bitmap, int i) {
        return processBase(InputImage.fromBitmap(bitmap, i));
    }

    public synchronized Task<DetectionResultT> processBase(final InputImage inputImage) {
        arn.i(inputImage, "InputImage can not be null");
        if (this.zzc.get()) {
            return Tasks.c(new MlKitException("This detector is already closed!", 14));
        }
        if (inputImage.getWidth() >= 32 && inputImage.getHeight() >= 32) {
            return this.zzd.callAfterLoad(this.zzf, new Callable() { // from class: com.google.mlkit.vision.common.internal.zza
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return MobileVisionBase.this.zza(inputImage);
                }
            }, this.zze.a);
        }
        return Tasks.c(new MlKitException("InputImage width and height should be at least 32!", 3));
    }

    public final /* synthetic */ Object zza(InputImage inputImage) {
        zzlx zze = zzlx.zze("detectorTaskWithResource#run");
        zze.zzb();
        try {
            Object run = this.zzd.run(inputImage);
            zze.close();
            return run;
        } catch (Throwable th) {
            try {
                zze.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    public final /* synthetic */ Object zzb(xgc xgcVar) {
        InputImage convertMlImagetoInputImage = CommonConvertUtils.convertMlImagetoInputImage(xgcVar);
        if (convertMlImagetoInputImage != null) {
            return this.zzd.run(convertMlImagetoInputImage);
        }
        throw new MlKitException("Current type of MlImage is not supported.", 13);
    }

    public Task<DetectionResultT> process(Image image, int i) {
        return processBase(InputImage.fromMediaImage(image, i));
    }

    public Task<DetectionResultT> process(Image image, int i, Matrix matrix) {
        return processBase(InputImage.fromMediaImage(image, i, matrix));
    }

    public Task<DetectionResultT> process(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        return processBase(InputImage.fromByteBuffer(byteBuffer, i, i2, i3, i4));
    }

    public synchronized Task<DetectionResultT> processBase(xgc xgcVar) {
        arn.i(xgcVar, "MlImage can not be null");
        throw null;
    }
}
