package com.socure.docv.capturesdk.core.external.ml.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/socure/docv/capturesdk/core/external/ml/model/IntersectionEdge;", "", "topLeft", "", "", "topRight", "bottomLeft", "bottomRight", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getTopLeft", "()Ljava/util/List;", "setTopLeft", "(Ljava/util/List;)V", "getTopRight", "setTopRight", "getBottomLeft", "setBottomLeft", "getBottomRight", "setBottomRight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class IntersectionEdge {
    public static final int $stable = 8;
    private List<Double> bottomLeft;
    private List<Double> bottomRight;
    private List<Double> topLeft;
    private List<Double> topRight;

    public IntersectionEdge(List<Double> list, List<Double> list2, List<Double> list3, List<Double> list4) {
        this.topLeft = list;
        this.topRight = list2;
        this.bottomLeft = list3;
        this.bottomRight = list4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntersectionEdge copy$default(IntersectionEdge intersectionEdge, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = intersectionEdge.topLeft;
        }
        if ((i & 2) != 0) {
            list2 = intersectionEdge.topRight;
        }
        if ((i & 4) != 0) {
            list3 = intersectionEdge.bottomLeft;
        }
        if ((i & 8) != 0) {
            list4 = intersectionEdge.bottomRight;
        }
        return intersectionEdge.copy(list, list2, list3, list4);
    }

    public final List<Double> component1() {
        return this.topLeft;
    }

    public final List<Double> component2() {
        return this.topRight;
    }

    public final List<Double> component3() {
        return this.bottomLeft;
    }

    public final List<Double> component4() {
        return this.bottomRight;
    }

    public final IntersectionEdge copy(List<Double> topLeft, List<Double> topRight, List<Double> bottomLeft, List<Double> bottomRight) {
        return new IntersectionEdge(topLeft, topRight, bottomLeft, bottomRight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntersectionEdge)) {
            return false;
        }
        IntersectionEdge intersectionEdge = (IntersectionEdge) other;
        if (Intrinsics.areEqual(this.topLeft, intersectionEdge.topLeft) && Intrinsics.areEqual(this.topRight, intersectionEdge.topRight) && Intrinsics.areEqual(this.bottomLeft, intersectionEdge.bottomLeft) && Intrinsics.areEqual(this.bottomRight, intersectionEdge.bottomRight)) {
            return true;
        }
        return false;
    }

    public final List<Double> getBottomLeft() {
        return this.bottomLeft;
    }

    public final List<Double> getBottomRight() {
        return this.bottomRight;
    }

    public final List<Double> getTopLeft() {
        return this.topLeft;
    }

    public final List<Double> getTopRight() {
        return this.topRight;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        List<Double> list = this.topLeft;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        List<Double> list2 = this.topRight;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<Double> list3 = this.bottomLeft;
        if (list3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        List<Double> list4 = this.bottomRight;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return i4 + i;
    }

    public final void setBottomLeft(List<Double> list) {
        this.bottomLeft = list;
    }

    public final void setBottomRight(List<Double> list) {
        this.bottomRight = list;
    }

    public final void setTopLeft(List<Double> list) {
        this.topLeft = list;
    }

    public final void setTopRight(List<Double> list) {
        this.topRight = list;
    }

    public String toString() {
        return "IntersectionEdge(topLeft=" + this.topLeft + ", topRight=" + this.topRight + ", bottomLeft=" + this.bottomLeft + ", bottomRight=" + this.bottomRight + ")";
    }
}
