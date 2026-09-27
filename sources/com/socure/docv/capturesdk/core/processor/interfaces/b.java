package com.socure.docv.capturesdk.core.processor.interfaces;

import android.graphics.Bitmap;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.processor.model.ProcessOutput;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface b {
    ProcessOutput a(Bitmap bitmap, CaptureType captureType);

    void stop();
}
