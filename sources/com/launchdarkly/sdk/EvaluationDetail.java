package com.launchdarkly.sdk;

import com.google.gson.annotations.JsonAdapter;
import defpackage.yfa;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@JsonAdapter(EvaluationDetailTypeAdapterFactory.class)
/* loaded from: classes3.dex */
public final class EvaluationDetail<T> implements yfa {
    private static final Iterable<EvaluationDetail<?>> BOOLEAN_SINGLETONS;
    public static final int NO_VARIATION = -1;
    private final EvaluationReason reason;
    private final T value;
    private final int variationIndex;

    static {
        Object valueOf;
        int i;
        EvaluationReason b;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            for (int i3 = 0; i3 < 2; i3++) {
                for (int i4 = 0; i4 < 2; i4++) {
                    for (int i5 = 0; i5 < 2; i5++) {
                        boolean z = true;
                        if (i5 == 0) {
                            if (i4 == 1) {
                                valueOf = LDValueBool.TRUE;
                            } else {
                                valueOf = LDValueBool.FALSE;
                            }
                        } else {
                            if (i4 != 1) {
                                z = false;
                            }
                            valueOf = Boolean.valueOf(z);
                        }
                        if (i4 == 0) {
                            i = i2;
                        } else {
                            i = 1 - i2;
                        }
                        if (i == i3) {
                            b = EvaluationReason.k();
                        } else {
                            b = EvaluationReason.b();
                        }
                        arrayList.add(new EvaluationDetail(valueOf, i, b));
                    }
                }
            }
        }
        BOOLEAN_SINGLETONS = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EvaluationDetail(Object obj, int i, EvaluationReason evaluationReason) {
        this.value = obj;
        this.variationIndex = i < 0 ? -1 : i;
        this.reason = evaluationReason;
    }

    public static EvaluationDetail a(Object obj, int i, EvaluationReason evaluationReason) {
        if (obj != null && (obj.getClass() == Boolean.class || obj.getClass() == LDValueBool.class)) {
            for (EvaluationDetail<?> evaluationDetail : BOOLEAN_SINGLETONS) {
                if (((EvaluationDetail) evaluationDetail).value == obj && ((EvaluationDetail) evaluationDetail).variationIndex == i && ((EvaluationDetail) evaluationDetail).reason == evaluationReason) {
                    return evaluationDetail;
                }
            }
        }
        return new EvaluationDetail(obj, i, evaluationReason);
    }

    public final EvaluationReason b() {
        return this.reason;
    }

    public final Object c() {
        return this.value;
    }

    public final int d() {
        return this.variationIndex;
    }

    public final boolean e() {
        if (this.variationIndex < 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EvaluationDetail) {
            EvaluationDetail evaluationDetail = (EvaluationDetail) obj;
            if (Objects.equals(this.reason, evaluationDetail.reason) && this.variationIndex == evaluationDetail.variationIndex && Objects.equals(this.value, evaluationDetail.value)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.reason, Integer.valueOf(this.variationIndex), this.value);
    }

    public final String toString() {
        return "{" + this.value + "," + this.variationIndex + "," + this.reason + "}";
    }
}
