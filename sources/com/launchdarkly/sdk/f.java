package com.launchdarkly.sdk;

import com.launchdarkly.sdk.EvaluationReason;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[EvaluationReason.ErrorKind.values().length];
        b = iArr;
        try {
            iArr[EvaluationReason.ErrorKind.CLIENT_NOT_READY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[EvaluationReason.ErrorKind.EXCEPTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[EvaluationReason.ErrorKind.FLAG_NOT_FOUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[EvaluationReason.ErrorKind.MALFORMED_FLAG.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[EvaluationReason.ErrorKind.USER_NOT_SPECIFIED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            b[EvaluationReason.ErrorKind.WRONG_TYPE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[EvaluationReason.Kind.values().length];
        a = iArr2;
        try {
            iArr2[EvaluationReason.Kind.RULE_MATCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[EvaluationReason.Kind.PREREQUISITE_FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[EvaluationReason.Kind.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
