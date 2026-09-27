package com.socure.docv.capturesdk.core.pipeline;

import com.socure.docv.capturesdk.core.pipeline.model.ScanType;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScanType.values().length];
        try {
            iArr[ScanType.SELFIE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScanType.SELFIE_AUTO_CAPTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScanType.LICENSE_BACK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
