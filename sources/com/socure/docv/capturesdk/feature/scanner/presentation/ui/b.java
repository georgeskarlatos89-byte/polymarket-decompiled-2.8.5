package com.socure.docv.capturesdk.feature.scanner.presentation.ui;

import com.socure.docv.capturesdk.core.pipeline.model.ScanType;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScanType.values().length];
        try {
            iArr[ScanType.LICENSE_FRONT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScanType.LICENSE_BACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScanType.PASSPORT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScanType.SELFIE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ScanType.SELFIE_AUTO_CAPTURE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
