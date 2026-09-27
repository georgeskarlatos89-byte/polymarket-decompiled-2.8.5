package com.google.mlkit.vision.segmentation.internal;

import com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzny;
import com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzoa;
import com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzob;
import com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzqo;
import com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzsv;
import com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zztf;
import com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zztj;
import com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zztr;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.segmentation.SegmentationMask;
import com.google.mlkit.vision.segmentation.Segmenter;
import com.google.mlkit.vision.segmentation.selfie.SelfieSegmenterOptions;
import defpackage.dmk;
import defpackage.xgc;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class SegmenterImpl extends MobileVisionBase<SegmentationMask> implements Segmenter {
    private SegmenterImpl(MlKitContext mlKitContext, final SelfieSegmenterOptions selfieSegmenterOptions) {
        super((zzg) ((zzd) mlKitContext.get(zzd.class)).get(selfieSegmenterOptions), ((ExecutorSelector) mlKitContext.get(ExecutorSelector.class)).getExecutorToUse(selfieSegmenterOptions.zzc()));
        zztr.zzb("segmentation-selfie").zzf(new zztf() { // from class: com.google.mlkit.vision.segmentation.internal.zzb
            @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zztf
            public final zzsv zza() {
                zzob zzobVar = new zzob();
                zzobVar.zze(zzny.TYPE_THICK);
                zzqo zzqoVar = new zzqo();
                zzqoVar.zzc(zzc.zza(SelfieSegmenterOptions.this));
                zzobVar.zzg(zzqoVar.zzf());
                return zztj.zzg(zzobVar, 1);
            }
        }, zzoa.ON_DEVICE_SEGMENTATION_CREATE);
    }

    public static SegmenterImpl newInstance(SelfieSegmenterOptions selfieSegmenterOptions) {
        if (selfieSegmenterOptions != null) {
            return new SegmenterImpl(MlKitContext.getInstance(), selfieSegmenterOptions);
        }
        dmk.s("SegmenterOptions can not be null.");
        return null;
    }

    @Override // com.google.mlkit.vision.interfaces.Detector
    public final int getDetectorType() {
        return 7;
    }

    @Override // com.google.mlkit.vision.segmentation.Segmenter
    public final Task<SegmentationMask> process(xgc xgcVar) {
        return super.processBase(xgcVar);
    }

    @Override // com.google.mlkit.vision.segmentation.Segmenter
    public Task<SegmentationMask> process(InputImage inputImage) {
        return super.processBase(inputImage);
    }
}
