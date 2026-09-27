package com.socure.docv.capturesdk.common.analytics.model;

import defpackage.m51;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxInt;", "", "min", "", "max", "<init>", "(II)V", "getMin", "()I", "setMin", "(I)V", "getMax", "setMax", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MinMaxInt {
    public static final int $stable = 8;
    private int max;
    private int min;

    public /* synthetic */ MinMaxInt(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public static /* synthetic */ MinMaxInt copy$default(MinMaxInt minMaxInt, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = minMaxInt.min;
        }
        if ((i3 & 2) != 0) {
            i2 = minMaxInt.max;
        }
        return minMaxInt.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    public final MinMaxInt copy(int min, int max) {
        return new MinMaxInt(min, max);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MinMaxInt)) {
            return false;
        }
        MinMaxInt minMaxInt = (MinMaxInt) other;
        if (this.min == minMaxInt.min && this.max == minMaxInt.max) {
            return true;
        }
        return false;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public int hashCode() {
        return Integer.hashCode(this.max) + (Integer.hashCode(this.min) * 31);
    }

    public final void setMax(int i) {
        this.max = i;
    }

    public final void setMin(int i) {
        this.min = i;
    }

    public String toString() {
        return m51.j(this.min, "MinMaxInt(min=", this.max, ", max=", ")");
    }

    public MinMaxInt(int i, int i2) {
        this.min = i;
        this.max = i2;
    }

    public MinMaxInt() {
        this(0, 0, 3, null);
    }
}
