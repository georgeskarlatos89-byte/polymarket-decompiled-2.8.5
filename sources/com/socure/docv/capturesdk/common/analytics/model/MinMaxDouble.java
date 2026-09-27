package com.socure.docv.capturesdk.common.analytics.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxDouble;", "", "min", "", "max", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getMin", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMax", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxDouble;", "equals", "", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MinMaxDouble {
    public static final int $stable = 0;
    private final Double max;
    private final Double min;

    public /* synthetic */ MinMaxDouble(Double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2);
    }

    public static /* synthetic */ MinMaxDouble copy$default(MinMaxDouble minMaxDouble, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = minMaxDouble.min;
        }
        if ((i & 2) != 0) {
            d2 = minMaxDouble.max;
        }
        return minMaxDouble.copy(d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getMin() {
        return this.min;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getMax() {
        return this.max;
    }

    public final MinMaxDouble copy(Double min, Double max) {
        return new MinMaxDouble(min, max);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MinMaxDouble)) {
            return false;
        }
        MinMaxDouble minMaxDouble = (MinMaxDouble) other;
        if (Intrinsics.areEqual(this.min, minMaxDouble.min) && Intrinsics.areEqual(this.max, minMaxDouble.max)) {
            return true;
        }
        return false;
    }

    public final Double getMax() {
        return this.max;
    }

    public final Double getMin() {
        return this.min;
    }

    public int hashCode() {
        int hashCode;
        Double d = this.min;
        int i = 0;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i2 = hashCode * 31;
        Double d2 = this.max;
        if (d2 != null) {
            i = d2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "MinMaxDouble(min=" + this.min + ", max=" + this.max + ")";
    }

    public MinMaxDouble(Double d, Double d2) {
        this.min = d;
        this.max = d2;
    }

    public MinMaxDouble() {
        this(null, null, 3, null);
    }
}
