package com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel;

import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CaptureType.values().length];
        try {
            iArr[CaptureType.AUTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CaptureType.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
