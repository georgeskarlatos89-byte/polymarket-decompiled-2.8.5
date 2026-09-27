package com.google.mlkit.vision.common.internal;

import android.os.SystemClock;
import com.google.mlkit.vision.common.InputImage;
import defpackage.arn;
import defpackage.yw8;
import java.util.LinkedList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class BitmapInStreamingChecker {
    private static final yw8 zza = new yw8("StreamingFormatChecker", "");
    private final LinkedList zzb = new LinkedList();
    private long zzc = -1;

    public void check(InputImage inputImage) {
        if (inputImage.getFormat() == -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzb.add(Long.valueOf(elapsedRealtime));
            if (this.zzb.size() > 5) {
                this.zzb.removeFirst();
            }
            if (this.zzb.size() == 5) {
                Long l = (Long) this.zzb.peekFirst();
                arn.h(l);
                if (elapsedRealtime - l.longValue() < 5000) {
                    long j = this.zzc;
                    if (j == -1 || elapsedRealtime - j >= 5000) {
                        this.zzc = elapsedRealtime;
                        zza.e("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                    }
                }
            }
        }
    }
}
