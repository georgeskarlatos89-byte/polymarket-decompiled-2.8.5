package com.socure.docv.capturesdk.common.analytics.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\u000bR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\r¨\u0006#"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/Blur;", "", "variance", "", "avgLowVariance", "avgHighVariance", "avgVariance", "highestAvgVariance", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getVariance", "()Ljava/lang/Double;", "setVariance", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getAvgLowVariance", "getAvgHighVariance", "getAvgVariance", "setAvgVariance", "getHighestAvgVariance", "setHighestAvgVariance", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/socure/docv/capturesdk/common/analytics/model/Blur;", "equals", "", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Blur {
    public static final int $stable = 8;
    private final Double avgHighVariance;
    private final Double avgLowVariance;
    private Double avgVariance;
    private Double highestAvgVariance;
    private Double variance;

    public /* synthetic */ Blur(Double d, Double d2, Double d3, Double d4, Double d5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : d4, (i & 16) != 0 ? null : d5);
    }

    public static /* synthetic */ Blur copy$default(Blur blur, Double d, Double d2, Double d3, Double d4, Double d5, int i, Object obj) {
        if ((i & 1) != 0) {
            d = blur.variance;
        }
        if ((i & 2) != 0) {
            d2 = blur.avgLowVariance;
        }
        if ((i & 4) != 0) {
            d3 = blur.avgHighVariance;
        }
        if ((i & 8) != 0) {
            d4 = blur.avgVariance;
        }
        if ((i & 16) != 0) {
            d5 = blur.highestAvgVariance;
        }
        Double d6 = d5;
        Double d7 = d3;
        return blur.copy(d, d2, d7, d4, d6);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getVariance() {
        return this.variance;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getAvgLowVariance() {
        return this.avgLowVariance;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getAvgHighVariance() {
        return this.avgHighVariance;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getAvgVariance() {
        return this.avgVariance;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getHighestAvgVariance() {
        return this.highestAvgVariance;
    }

    public final Blur copy(Double variance, Double avgLowVariance, Double avgHighVariance, Double avgVariance, Double highestAvgVariance) {
        return new Blur(variance, avgLowVariance, avgHighVariance, avgVariance, highestAvgVariance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Blur)) {
            return false;
        }
        Blur blur = (Blur) other;
        if (Intrinsics.areEqual(this.variance, blur.variance) && Intrinsics.areEqual(this.avgLowVariance, blur.avgLowVariance) && Intrinsics.areEqual(this.avgHighVariance, blur.avgHighVariance) && Intrinsics.areEqual(this.avgVariance, blur.avgVariance) && Intrinsics.areEqual(this.highestAvgVariance, blur.highestAvgVariance)) {
            return true;
        }
        return false;
    }

    public final Double getAvgHighVariance() {
        return this.avgHighVariance;
    }

    public final Double getAvgLowVariance() {
        return this.avgLowVariance;
    }

    public final Double getAvgVariance() {
        return this.avgVariance;
    }

    public final Double getHighestAvgVariance() {
        return this.highestAvgVariance;
    }

    public final Double getVariance() {
        return this.variance;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Double d = this.variance;
        int i = 0;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i2 = hashCode * 31;
        Double d2 = this.avgLowVariance;
        if (d2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Double d3 = this.avgHighVariance;
        if (d3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Double d4 = this.avgVariance;
        if (d4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = d4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Double d5 = this.highestAvgVariance;
        if (d5 != null) {
            i = d5.hashCode();
        }
        return i5 + i;
    }

    public final void setAvgVariance(Double d) {
        this.avgVariance = d;
    }

    public final void setHighestAvgVariance(Double d) {
        this.highestAvgVariance = d;
    }

    public final void setVariance(Double d) {
        this.variance = d;
    }

    public String toString() {
        return "Blur(variance=" + this.variance + ", avgLowVariance=" + this.avgLowVariance + ", avgHighVariance=" + this.avgHighVariance + ", avgVariance=" + this.avgVariance + ", highestAvgVariance=" + this.highestAvgVariance + ")";
    }

    public Blur(Double d, Double d2, Double d3, Double d4, Double d5) {
        this.variance = d;
        this.avgLowVariance = d2;
        this.avgHighVariance = d3;
        this.avgVariance = d4;
        this.highestAvgVariance = d5;
    }

    public Blur() {
        this(null, null, null, null, null, 31, null);
    }
}
