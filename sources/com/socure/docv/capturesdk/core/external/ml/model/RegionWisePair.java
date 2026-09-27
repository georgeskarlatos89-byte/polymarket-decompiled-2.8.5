package com.socure.docv.capturesdk.core.external.ml.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0010\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R.\u0010\u0002\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/socure/docv/capturesdk/core/external/ml/model/RegionWisePair;", "", "lines", "", "", "optimalPoint", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getLines", "()Ljava/util/List;", "setLines", "(Ljava/util/List;)V", "getOptimalPoint", "setOptimalPoint", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RegionWisePair {
    public static final int $stable = 8;
    private List<List<List<Double>>> lines;
    private List<Double> optimalPoint;

    public RegionWisePair(List<List<List<Double>>> list, List<Double> list2) {
        this.lines = list;
        this.optimalPoint = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RegionWisePair copy$default(RegionWisePair regionWisePair, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = regionWisePair.lines;
        }
        if ((i & 2) != 0) {
            list2 = regionWisePair.optimalPoint;
        }
        return regionWisePair.copy(list, list2);
    }

    public final List<List<List<Double>>> component1() {
        return this.lines;
    }

    public final List<Double> component2() {
        return this.optimalPoint;
    }

    public final RegionWisePair copy(List<List<List<Double>>> lines, List<Double> optimalPoint) {
        return new RegionWisePair(lines, optimalPoint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegionWisePair)) {
            return false;
        }
        RegionWisePair regionWisePair = (RegionWisePair) other;
        if (Intrinsics.areEqual(this.lines, regionWisePair.lines) && Intrinsics.areEqual(this.optimalPoint, regionWisePair.optimalPoint)) {
            return true;
        }
        return false;
    }

    public final List<List<List<Double>>> getLines() {
        return this.lines;
    }

    public final List<Double> getOptimalPoint() {
        return this.optimalPoint;
    }

    public int hashCode() {
        int hashCode;
        List<List<List<Double>>> list = this.lines;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        List<Double> list2 = this.optimalPoint;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return i2 + i;
    }

    public final void setLines(List<List<List<Double>>> list) {
        this.lines = list;
    }

    public final void setOptimalPoint(List<Double> list) {
        this.optimalPoint = list;
    }

    public String toString() {
        return "RegionWisePair(lines=" + this.lines + ", optimalPoint=" + this.optimalPoint + ")";
    }
}
