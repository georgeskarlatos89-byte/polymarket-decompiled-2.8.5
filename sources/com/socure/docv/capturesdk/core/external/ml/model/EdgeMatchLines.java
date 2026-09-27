package com.socure.docv.capturesdk.core.external.ml.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0014\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003HÆ\u0003Ji\u0010\u0018\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R(\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR(\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR(\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/socure/docv/capturesdk/core/external/ml/model/EdgeMatchLines;", "", "leftRegion", "", "", "topRegion", "rightRegion", "bottomRegion", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getLeftRegion", "()Ljava/util/List;", "setLeftRegion", "(Ljava/util/List;)V", "getTopRegion", "setTopRegion", "getRightRegion", "setRightRegion", "getBottomRegion", "setBottomRegion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EdgeMatchLines {
    public static final int $stable = 8;
    private List<List<Double>> bottomRegion;
    private List<List<Double>> leftRegion;
    private List<List<Double>> rightRegion;
    private List<List<Double>> topRegion;

    public EdgeMatchLines(List<List<Double>> list, List<List<Double>> list2, List<List<Double>> list3, List<List<Double>> list4) {
        this.leftRegion = list;
        this.topRegion = list2;
        this.rightRegion = list3;
        this.bottomRegion = list4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EdgeMatchLines copy$default(EdgeMatchLines edgeMatchLines, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = edgeMatchLines.leftRegion;
        }
        if ((i & 2) != 0) {
            list2 = edgeMatchLines.topRegion;
        }
        if ((i & 4) != 0) {
            list3 = edgeMatchLines.rightRegion;
        }
        if ((i & 8) != 0) {
            list4 = edgeMatchLines.bottomRegion;
        }
        return edgeMatchLines.copy(list, list2, list3, list4);
    }

    public final List<List<Double>> component1() {
        return this.leftRegion;
    }

    public final List<List<Double>> component2() {
        return this.topRegion;
    }

    public final List<List<Double>> component3() {
        return this.rightRegion;
    }

    public final List<List<Double>> component4() {
        return this.bottomRegion;
    }

    public final EdgeMatchLines copy(List<List<Double>> leftRegion, List<List<Double>> topRegion, List<List<Double>> rightRegion, List<List<Double>> bottomRegion) {
        return new EdgeMatchLines(leftRegion, topRegion, rightRegion, bottomRegion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EdgeMatchLines)) {
            return false;
        }
        EdgeMatchLines edgeMatchLines = (EdgeMatchLines) other;
        if (Intrinsics.areEqual(this.leftRegion, edgeMatchLines.leftRegion) && Intrinsics.areEqual(this.topRegion, edgeMatchLines.topRegion) && Intrinsics.areEqual(this.rightRegion, edgeMatchLines.rightRegion) && Intrinsics.areEqual(this.bottomRegion, edgeMatchLines.bottomRegion)) {
            return true;
        }
        return false;
    }

    public final List<List<Double>> getBottomRegion() {
        return this.bottomRegion;
    }

    public final List<List<Double>> getLeftRegion() {
        return this.leftRegion;
    }

    public final List<List<Double>> getRightRegion() {
        return this.rightRegion;
    }

    public final List<List<Double>> getTopRegion() {
        return this.topRegion;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        List<List<Double>> list = this.leftRegion;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        List<List<Double>> list2 = this.topRegion;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<List<Double>> list3 = this.rightRegion;
        if (list3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        List<List<Double>> list4 = this.bottomRegion;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return i4 + i;
    }

    public final void setBottomRegion(List<List<Double>> list) {
        this.bottomRegion = list;
    }

    public final void setLeftRegion(List<List<Double>> list) {
        this.leftRegion = list;
    }

    public final void setRightRegion(List<List<Double>> list) {
        this.rightRegion = list;
    }

    public final void setTopRegion(List<List<Double>> list) {
        this.topRegion = list;
    }

    public String toString() {
        return "EdgeMatchLines(leftRegion=" + this.leftRegion + ", topRegion=" + this.topRegion + ", rightRegion=" + this.rightRegion + ", bottomRegion=" + this.bottomRegion + ")";
    }
}
