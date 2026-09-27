package com.google.mlkit.vision.mediapipe.segmentation;

import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv;
import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhy;
import com.google.mlkit.vision.mediapipe.Converter;
import defpackage.arn;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class SegmentationMaskConverter implements Converter<SegmentationMaskHolder> {
    @Override // com.google.mlkit.vision.mediapipe.Converter
    public final /* bridge */ /* synthetic */ Object zza(List list) {
        boolean z = true;
        if (list.size() != 1) {
            z = false;
        }
        arn.a("The output of Segmentation contains more than one packet, which is not expected.", z);
        zzhv zzhvVar = (zzhv) list.get(0);
        int zzb = zzhy.zzb(zzhvVar);
        int zza = zzhy.zza(zzhvVar);
        ByteBuffer order = ByteBuffer.allocateDirect(zzb * zza * 4).order(ByteOrder.nativeOrder());
        zzhy.zzd(zzhvVar, order);
        return new SegmentationMaskHolder(order, zzb, zza);
    }
}
