package com.google.mlkit.vision.segmentation.selfie;

import com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzf;
import com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzg;
import defpackage.arn;
import defpackage.dkn;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class SelfieSegmenterOptions {
    public static final SelfieSegmenterOptions DEFAULT_OPTIONS = new Builder().build();
    public static final int SINGLE_IMAGE_MODE = 2;
    public static final int STREAM_MODE = 1;
    private final int zza;
    private final float zzb;
    private final boolean zzc;
    private final Executor zzd;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static class Builder {
        private int zza = 1;
        private float zzb = 0.7f;
        private boolean zzc;
        private Executor zzd;

        public static /* bridge */ /* synthetic */ float zza(Builder builder) {
            return builder.zzb;
        }

        public static /* bridge */ /* synthetic */ int zzb(Builder builder) {
            return builder.zza;
        }

        public static /* bridge */ /* synthetic */ Executor zzc(Builder builder) {
            return builder.zzd;
        }

        public static /* bridge */ /* synthetic */ boolean zzd(Builder builder) {
            return builder.zzc;
        }

        public SelfieSegmenterOptions build() {
            return new SelfieSegmenterOptions(this, null);
        }

        public Builder enableRawSizeMask() {
            this.zzc = true;
            return this;
        }

        public Builder setDetectorMode(int i) {
            this.zza = i;
            return this;
        }

        public Builder setExecutor(Executor executor) {
            this.zzd = executor;
            return this;
        }

        public Builder setStreamModeSmoothingRatio(float f) {
            boolean z = false;
            if (Float.compare(f, 0.0f) >= 0 && Float.compare(f, 1.0f) <= 0) {
                z = true;
            }
            arn.a("Stream mode smoothing ratio should be in range [0.0f, 1.0f].", z);
            this.zzb = f;
            return this;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface DetectorMode {
    }

    public /* synthetic */ SelfieSegmenterOptions(Builder builder, zza zzaVar) {
        this.zza = Builder.zzb(builder);
        this.zzb = Builder.zza(builder);
        this.zzc = Builder.zzd(builder);
        this.zzd = Builder.zzc(builder);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelfieSegmenterOptions)) {
            return false;
        }
        SelfieSegmenterOptions selfieSegmenterOptions = (SelfieSegmenterOptions) obj;
        if (this.zza == selfieSegmenterOptions.zza && Float.compare(this.zzb, selfieSegmenterOptions.zzb) == 0 && this.zzc == selfieSegmenterOptions.zzc && dkn.b(this.zzd, selfieSegmenterOptions.zzd)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Float.valueOf(this.zzb), Boolean.valueOf(this.zzc), this.zzd});
    }

    public String toString() {
        zzf zza = zzg.zza("SelfieSegmenterOptions");
        zza.zzb("DetectorMode", this.zza);
        zza.zza("StreamModeSmoothingRatio", this.zzb);
        zza.zzd("isRawSizeMaskEnabled", this.zzc);
        zza.zzc("executor", this.zzd);
        return zza.toString();
    }

    public final float zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final Executor zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
