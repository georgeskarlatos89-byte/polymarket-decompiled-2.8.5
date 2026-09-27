package com.socure.docv.capturesdk.core.pipeline;

import com.socure.docv.capturesdk.core.processor.model.DetectionType;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DetectionType.values().length];
        try {
            iArr[DetectionType.CORNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DetectionType.BLUR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DetectionType.GLARE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DetectionType.BRIGHTNESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DetectionType.SELFIE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DetectionType.SELFIE_AUTO_CAPTURE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DetectionType.BARCODE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
