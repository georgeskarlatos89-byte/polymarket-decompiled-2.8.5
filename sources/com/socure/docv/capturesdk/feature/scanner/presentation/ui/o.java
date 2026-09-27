package com.socure.docv.capturesdk.feature.scanner.presentation.ui;

import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.feature.scanner.data.DetectionCallback;
import com.socure.docv.capturesdk.feature.scanner.data.ImageMode;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class o {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[DetectionCallback.values().length];
        try {
            iArr[DetectionCallback.LOW_BRIGHTNESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DetectionCallback.GLARE_DETECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DetectionCallback.BLUR_DETECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DetectionCallback.CORNER_DETECTION_FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DetectionCallback.BARCODE_NOT_FOUND.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DetectionCallback.FACE_NOT_ALIGNED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DetectionCallback.FACE_NOT_PARALLEL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[DetectionCallback.FACE_NOT_FOUND.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[DetectionCallback.FACE_TOO_SMALL.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[DetectionCallback.FACE_ORIENTATION_WRONG.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[DetectionCallback.READY_FOR_SELFIE_CAPTURE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[DetectionCallback.FACE_AT_LEFT.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[DetectionCallback.FACE_AT_RIGHT.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[DetectionCallback.FACE_AT_UP.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[DetectionCallback.FACE_AT_DOWN.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[DetectionCallback.FACE_IS_BIG.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[DetectionCallback.CAPTURING.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[DetectionCallback.DOCUMENT_TOO_CLOSE.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[DetectionCallback.NOT_PROCESSING.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        a = iArr;
        int[] iArr2 = new int[ScanType.values().length];
        try {
            iArr2[ScanType.LICENSE_FRONT.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[ScanType.LICENSE_BACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[ScanType.SELFIE_AUTO_CAPTURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[ScanType.PASSPORT.ordinal()] = 4;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[ScanType.SELFIE.ordinal()] = 5;
        } catch (NoSuchFieldError unused24) {
        }
        b = iArr2;
        int[] iArr3 = new int[ImageMode.values().length];
        try {
            iArr3[ImageMode.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused25) {
        }
        c = iArr3;
    }
}
