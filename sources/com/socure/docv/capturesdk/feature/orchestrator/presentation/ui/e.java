package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import com.socure.docv.capturesdk.feature.scanner.data.DetectionCallback;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DetectionCallback.values().length];
        try {
            iArr[DetectionCallback.FACE_NOT_FOUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DetectionCallback.FACE_AT_LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DetectionCallback.FACE_AT_UP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DetectionCallback.FACE_AT_DOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DetectionCallback.FACE_AT_RIGHT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DetectionCallback.FACE_IS_BIG.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DetectionCallback.FACE_TOO_SMALL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[DetectionCallback.FACE_ORIENTATION_WRONG.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[DetectionCallback.FACE_NOT_ALIGNED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[DetectionCallback.FACE_NOT_PARALLEL.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        a = iArr;
    }
}
