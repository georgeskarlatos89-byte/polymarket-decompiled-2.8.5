package com.socure.docv.capturesdk.common.utils;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/CornerConstants;", "", "<init>", "()V", "MIN_CONFIDENCE", "", "HORIZONTAL_OBJECT_CONFIDENCE", "H_CD", "", "W_CD", "PASSPORT_EXTRA_HEIGHT", "", "VERTICAL_ANGLE_TOLERANCE", "TOTAL_IN_IDD_OUTPUT", "TOTAL_IN_IDD_CORNER_PROCESSOR_OUTPUT", "CORNER_EXPANSION_LANDSCAPE_PERCENTAGE", "CORNER_EXPANSION_PORTRAIT_PERCENTAGE", "CORNER_EXPANSION_FACTOR_LANDSCAPE_PASSPORT", "CORNER_EXPANSION_FACTOR_PORTRAIT_PASSPORT", "CORNER_EXPANSION_FACTOR", "CORNER_MIN_CONFIDENCE", "CORNER_INTEGRAL_CONFIDENCE", "CLOSE_SQUARE_CROP_EXPANSION_PERCENTAGE", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CornerConstants {
    public static final int $stable = 0;
    public static final float CLOSE_SQUARE_CROP_EXPANSION_PERCENTAGE = 12.0f;
    public static final float CORNER_EXPANSION_FACTOR = 0.65f;
    public static final float CORNER_EXPANSION_FACTOR_LANDSCAPE_PASSPORT = 0.6f;
    public static final float CORNER_EXPANSION_FACTOR_PORTRAIT_PASSPORT = 1.0f;
    public static final float CORNER_EXPANSION_LANDSCAPE_PERCENTAGE = 5.0f;
    public static final float CORNER_EXPANSION_PORTRAIT_PERCENTAGE = 7.0f;
    public static final float CORNER_INTEGRAL_CONFIDENCE = 3.0f;
    public static final float CORNER_MIN_CONFIDENCE = 0.6f;
    public static final float HORIZONTAL_OBJECT_CONFIDENCE = 0.5f;
    public static final int H_CD = 256;
    public static final CornerConstants INSTANCE = new CornerConstants();
    public static final float MIN_CONFIDENCE = 0.9f;
    public static final double PASSPORT_EXTRA_HEIGHT = 0.1d;
    public static final int TOTAL_IN_IDD_CORNER_PROCESSOR_OUTPUT = 13;
    public static final int TOTAL_IN_IDD_OUTPUT = 12;
    public static final double VERTICAL_ANGLE_TOLERANCE = 20.0d;
    public static final int W_CD = 256;

    private CornerConstants() {
    }
}
