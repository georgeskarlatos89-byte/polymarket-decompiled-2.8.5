package com.google.mlkit.vision.mediapipe.pose;

import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv;
import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhy;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.mediapipe.Converter;
import defpackage.arn;
import defpackage.bvm;
import defpackage.jzl;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class PoseHolderConverter implements Converter<PoseHolder> {
    @Override // com.google.mlkit.vision.mediapipe.Converter
    public final Object zza(List list) {
        boolean z = true;
        if (list.size() != 1) {
            z = false;
        }
        arn.a("The output of Pose detection contains more than one packet, which is not expected.", z);
        try {
            return new PoseHolder(jzl.n(zzhy.zze((zzhv) list.get(0))));
        } catch (bvm e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            throw new MlKitException(message, 13);
        }
    }
}
