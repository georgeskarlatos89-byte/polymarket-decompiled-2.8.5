package com.socure.docv.capturesdk.feature.scanner.data;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/data/DetectionCallback;", "", "<init>", "(Ljava/lang/String;I)V", "LOW_BRIGHTNESS", "NOT_PROCESSING", "GLARE_DETECTED", "BLUR_DETECTED", "CORNER_DETECTION_FAILED", "CAPTURING", "FACE_NOT_FOUND", "FACE_TOO_SMALL", "FACE_ORIENTATION_WRONG", "READY_FOR_SELFIE_CAPTURE", "FACE_AT_LEFT", "FACE_AT_RIGHT", "FACE_AT_UP", "FACE_AT_DOWN", "FACE_IS_BIG", "FACE_NOT_ALIGNED", "FACE_NOT_PARALLEL", "DOCUMENT_TOO_CLOSE", "BARCODE_NOT_FOUND", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DetectionCallback {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ DetectionCallback[] $VALUES;
    public static final DetectionCallback LOW_BRIGHTNESS = new DetectionCallback("LOW_BRIGHTNESS", 0);
    public static final DetectionCallback NOT_PROCESSING = new DetectionCallback("NOT_PROCESSING", 1);
    public static final DetectionCallback GLARE_DETECTED = new DetectionCallback("GLARE_DETECTED", 2);
    public static final DetectionCallback BLUR_DETECTED = new DetectionCallback("BLUR_DETECTED", 3);
    public static final DetectionCallback CORNER_DETECTION_FAILED = new DetectionCallback("CORNER_DETECTION_FAILED", 4);
    public static final DetectionCallback CAPTURING = new DetectionCallback("CAPTURING", 5);
    public static final DetectionCallback FACE_NOT_FOUND = new DetectionCallback("FACE_NOT_FOUND", 6);
    public static final DetectionCallback FACE_TOO_SMALL = new DetectionCallback("FACE_TOO_SMALL", 7);
    public static final DetectionCallback FACE_ORIENTATION_WRONG = new DetectionCallback("FACE_ORIENTATION_WRONG", 8);
    public static final DetectionCallback READY_FOR_SELFIE_CAPTURE = new DetectionCallback("READY_FOR_SELFIE_CAPTURE", 9);
    public static final DetectionCallback FACE_AT_LEFT = new DetectionCallback("FACE_AT_LEFT", 10);
    public static final DetectionCallback FACE_AT_RIGHT = new DetectionCallback("FACE_AT_RIGHT", 11);
    public static final DetectionCallback FACE_AT_UP = new DetectionCallback("FACE_AT_UP", 12);
    public static final DetectionCallback FACE_AT_DOWN = new DetectionCallback("FACE_AT_DOWN", 13);
    public static final DetectionCallback FACE_IS_BIG = new DetectionCallback("FACE_IS_BIG", 14);
    public static final DetectionCallback FACE_NOT_ALIGNED = new DetectionCallback("FACE_NOT_ALIGNED", 15);
    public static final DetectionCallback FACE_NOT_PARALLEL = new DetectionCallback("FACE_NOT_PARALLEL", 16);
    public static final DetectionCallback DOCUMENT_TOO_CLOSE = new DetectionCallback("DOCUMENT_TOO_CLOSE", 17);
    public static final DetectionCallback BARCODE_NOT_FOUND = new DetectionCallback("BARCODE_NOT_FOUND", 18);

    private static final /* synthetic */ DetectionCallback[] $values() {
        return new DetectionCallback[]{LOW_BRIGHTNESS, NOT_PROCESSING, GLARE_DETECTED, BLUR_DETECTED, CORNER_DETECTION_FAILED, CAPTURING, FACE_NOT_FOUND, FACE_TOO_SMALL, FACE_ORIENTATION_WRONG, READY_FOR_SELFIE_CAPTURE, FACE_AT_LEFT, FACE_AT_RIGHT, FACE_AT_UP, FACE_AT_DOWN, FACE_IS_BIG, FACE_NOT_ALIGNED, FACE_NOT_PARALLEL, DOCUMENT_TOO_CLOSE, BARCODE_NOT_FOUND};
    }

    static {
        DetectionCallback[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private DetectionCallback(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static DetectionCallback valueOf(String str) {
        return (DetectionCallback) Enum.valueOf(DetectionCallback.class, str);
    }

    public static DetectionCallback[] values() {
        return (DetectionCallback[]) $VALUES.clone();
    }
}
