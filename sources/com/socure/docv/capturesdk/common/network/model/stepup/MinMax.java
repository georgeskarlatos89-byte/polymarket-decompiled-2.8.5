package com.socure.docv.capturesdk.common.network.model.stepup;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.m51;
import defpackage.mda;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/MinMax;", "", "min", "", "max", "<init>", "(II)V", "getMin", "()I", "getMax", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class MinMax {
    public static final int $stable = 0;
    private final int max;
    private final int min;

    public MinMax(int i, int i2) {
        this.min = i;
        this.max = i2;
    }

    public static /* synthetic */ MinMax copy$default(MinMax minMax, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = minMax.min;
        }
        if ((i3 & 2) != 0) {
            i2 = minMax.max;
        }
        return minMax.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    public final MinMax copy(int min, int max) {
        return new MinMax(min, max);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MinMax)) {
            return false;
        }
        MinMax minMax = (MinMax) other;
        if (this.min == minMax.min && this.max == minMax.max) {
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

    public String toString() {
        return m51.j(this.min, "MinMax(min=", this.max, ", max=", ")");
    }
}
