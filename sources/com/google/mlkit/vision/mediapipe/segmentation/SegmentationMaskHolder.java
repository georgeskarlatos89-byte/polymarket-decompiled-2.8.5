package com.google.mlkit.vision.mediapipe.segmentation;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class SegmentationMaskHolder {
    private final ByteBuffer zza;
    private final int zzb;
    private final int zzc;

    public SegmentationMaskHolder(ByteBuffer byteBuffer, int i, int i2) {
        this.zza = byteBuffer;
        this.zzb = i;
        this.zzc = i2;
    }

    public ByteBuffer getBuffer() {
        return this.zza;
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getWidth() {
        return this.zzb;
    }
}
