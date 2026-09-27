package com.launchdarkly.sdk;

import com.google.gson.annotations.JsonAdapter;
import defpackage.woa;
import defpackage.yfa;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@JsonAdapter(EvaluationReasonTypeAdapter.class)
/* loaded from: classes3.dex */
public final class EvaluationReason implements yfa {
    private static final EvaluationReason ERROR_CLIENT_NOT_READY;
    private static final EvaluationReason ERROR_EXCEPTION;
    private static final EvaluationReason ERROR_FLAG_NOT_FOUND;
    private static final EvaluationReason ERROR_MALFORMED_FLAG;
    private static final EvaluationReason ERROR_USER_NOT_SPECIFIED;
    private static final EvaluationReason ERROR_WRONG_TYPE;
    private static final EvaluationReason FALLTHROUGH_INSTANCE;
    private static final EvaluationReason FALLTHROUGH_INSTANCE_IN_EXPERIMENT;
    private static boolean IN_EXPERIMENT = true;
    private static boolean NOT_IN_EXPERIMENT = false;
    private static final EvaluationReason OFF_INSTANCE = new EvaluationReason(Kind.OFF);
    private static final EvaluationReason TARGET_MATCH_INSTANCE;
    private final BigSegmentsStatus bigSegmentsStatus;
    private final ErrorKind errorKind;
    private final Exception exception;
    private final boolean inExperiment;
    private final Kind kind;
    private final String prerequisiteKey;
    private final String ruleId;
    private final int ruleIndex;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public enum BigSegmentsStatus {
        HEALTHY,
        STALE,
        NOT_CONFIGURED,
        STORE_ERROR
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public enum ErrorKind {
        CLIENT_NOT_READY,
        FLAG_NOT_FOUND,
        MALFORMED_FLAG,
        USER_NOT_SPECIFIED,
        WRONG_TYPE,
        EXCEPTION
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public enum Kind {
        OFF,
        FALLTHROUGH,
        TARGET_MATCH,
        RULE_MATCH,
        PREREQUISITE_FAILED,
        ERROR
    }

    static {
        Kind kind = Kind.FALLTHROUGH;
        FALLTHROUGH_INSTANCE = new EvaluationReason(kind);
        FALLTHROUGH_INSTANCE_IN_EXPERIMENT = new EvaluationReason(kind, -1, null, null, IN_EXPERIMENT, null, null, null);
        TARGET_MATCH_INSTANCE = new EvaluationReason(Kind.TARGET_MATCH);
        ERROR_CLIENT_NOT_READY = new EvaluationReason(ErrorKind.CLIENT_NOT_READY);
        ERROR_FLAG_NOT_FOUND = new EvaluationReason(ErrorKind.FLAG_NOT_FOUND);
        ERROR_MALFORMED_FLAG = new EvaluationReason(ErrorKind.MALFORMED_FLAG);
        ERROR_USER_NOT_SPECIFIED = new EvaluationReason(ErrorKind.USER_NOT_SPECIFIED);
        ERROR_WRONG_TYPE = new EvaluationReason(ErrorKind.WRONG_TYPE);
        ERROR_EXCEPTION = new EvaluationReason(ErrorKind.EXCEPTION);
    }

    public EvaluationReason(Kind kind, int i, String str, String str2, boolean z, ErrorKind errorKind, Exception exc, BigSegmentsStatus bigSegmentsStatus) {
        this.kind = kind;
        this.ruleIndex = i;
        this.ruleId = str;
        this.prerequisiteKey = str2;
        this.inExperiment = z;
        this.errorKind = errorKind;
        this.exception = exc;
        this.bigSegmentsStatus = bigSegmentsStatus;
    }

    public static EvaluationReason a(ErrorKind errorKind) {
        switch (f.b[errorKind.ordinal()]) {
            case 1:
                return ERROR_CLIENT_NOT_READY;
            case 2:
                return ERROR_EXCEPTION;
            case 3:
                return ERROR_FLAG_NOT_FOUND;
            case 4:
                return ERROR_MALFORMED_FLAG;
            case 5:
                return ERROR_USER_NOT_SPECIFIED;
            case 6:
                return ERROR_WRONG_TYPE;
            default:
                return new EvaluationReason(errorKind);
        }
    }

    public static EvaluationReason b() {
        return FALLTHROUGH_INSTANCE;
    }

    public static EvaluationReason c(boolean z) {
        if (z) {
            return FALLTHROUGH_INSTANCE_IN_EXPERIMENT;
        }
        return FALLTHROUGH_INSTANCE;
    }

    public static EvaluationReason k() {
        return OFF_INSTANCE;
    }

    public static EvaluationReason l(String str) {
        return new EvaluationReason(Kind.PREREQUISITE_FAILED, -1, null, str, NOT_IN_EXPERIMENT, null, null, null);
    }

    public static EvaluationReason m() {
        return TARGET_MATCH_INSTANCE;
    }

    public final BigSegmentsStatus d() {
        return this.bigSegmentsStatus;
    }

    public final ErrorKind e() {
        return this.errorKind;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EvaluationReason) {
            EvaluationReason evaluationReason = (EvaluationReason) obj;
            if (this.kind == evaluationReason.kind && this.ruleIndex == evaluationReason.ruleIndex && Objects.equals(this.ruleId, evaluationReason.ruleId) && Objects.equals(this.prerequisiteKey, evaluationReason.prerequisiteKey) && this.inExperiment == evaluationReason.inExperiment && Objects.equals(this.errorKind, evaluationReason.errorKind) && Objects.equals(this.exception, evaluationReason.exception) && Objects.equals(this.bigSegmentsStatus, evaluationReason.bigSegmentsStatus)) {
                return true;
            }
        }
        return false;
    }

    public final Kind f() {
        return this.kind;
    }

    public final String g() {
        return this.prerequisiteKey;
    }

    public final String h() {
        return this.ruleId;
    }

    public final int hashCode() {
        return Objects.hash(this.kind, Integer.valueOf(this.ruleIndex), this.ruleId, this.prerequisiteKey, Boolean.valueOf(this.inExperiment), this.errorKind, this.exception, this.bigSegmentsStatus);
    }

    public final int i() {
        return this.ruleIndex;
    }

    public final boolean j() {
        return this.inExperiment;
    }

    public final EvaluationReason n(BigSegmentsStatus bigSegmentsStatus) {
        return new EvaluationReason(this.kind, this.ruleIndex, this.ruleId, this.prerequisiteKey, this.inExperiment, this.errorKind, this.exception, bigSegmentsStatus);
    }

    public final String toString() {
        int i = f.a[this.kind.ordinal()];
        String str = "";
        if (i != 1) {
            if (i != 2) {
                Kind kind = this.kind;
                if (i != 3) {
                    return kind.name();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(kind);
                sb.append("(");
                sb.append(this.errorKind);
                if (this.exception != null) {
                    str = "," + this.exception;
                }
                return woa.r(sb, str, ")");
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.kind);
            sb2.append("(");
            return woa.r(sb2, this.prerequisiteKey, ")");
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.kind);
        sb3.append("(");
        sb3.append(this.ruleIndex);
        if (this.ruleId != null) {
            str = "," + this.ruleId;
        }
        return woa.r(sb3, str, ")");
    }

    public EvaluationReason(Kind kind) {
        this(kind, -1, null, null, NOT_IN_EXPERIMENT, null, null, null);
    }

    public EvaluationReason(ErrorKind errorKind) {
        this(Kind.ERROR, -1, null, null, NOT_IN_EXPERIMENT, errorKind, null, null);
    }
}
