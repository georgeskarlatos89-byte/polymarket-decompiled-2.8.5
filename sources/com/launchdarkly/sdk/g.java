package com.launchdarkly.sdk;

import com.launchdarkly.sdk.EvaluationReason;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EvaluationReason.Kind.values().length];
        a = iArr;
        try {
            iArr[EvaluationReason.Kind.OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[EvaluationReason.Kind.FALLTHROUGH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[EvaluationReason.Kind.TARGET_MATCH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[EvaluationReason.Kind.RULE_MATCH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[EvaluationReason.Kind.PREREQUISITE_FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[EvaluationReason.Kind.ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
