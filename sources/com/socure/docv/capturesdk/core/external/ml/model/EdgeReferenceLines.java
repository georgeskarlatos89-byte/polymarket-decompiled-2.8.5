package com.socure.docv.capturesdk.core.external.ml.model;

import com.socure.docv.capturesdk.common.analytics.model.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00030\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00030\u0003\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00030\u0003\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00030\u0003¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00030\u0003HÆ\u0003J\u001b\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00030\u0003HÆ\u0003J\u001b\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00030\u0003HÆ\u0003J\u001b\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00030\u0003HÆ\u0003Jy\u0010\u0018\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00030\u00032\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00030\u00032\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00030\u00032\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00030\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R,\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00030\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR,\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00030\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR,\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00030\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR,\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00030\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/socure/docv/capturesdk/core/external/ml/model/EdgeReferenceLines;", "", "leftRegion", "", "", "topRegion", "rightRegion", "bottomRegion", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getLeftRegion", "()Ljava/util/List;", "setLeftRegion", "(Ljava/util/List;)V", "getTopRegion", "setTopRegion", "getRightRegion", "setRightRegion", "getBottomRegion", "setBottomRegion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EdgeReferenceLines {
    public static final int $stable = 8;
    private List<List<List<Double>>> bottomRegion;
    private List<List<List<Double>>> leftRegion;
    private List<List<List<Double>>> rightRegion;
    private List<List<List<Double>>> topRegion;

    public EdgeReferenceLines(List<List<List<Double>>> list, List<List<List<Double>>> list2, List<List<List<Double>>> list3, List<List<List<Double>>> list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.leftRegion = list;
        this.topRegion = list2;
        this.rightRegion = list3;
        this.bottomRegion = list4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EdgeReferenceLines copy$default(EdgeReferenceLines edgeReferenceLines, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = edgeReferenceLines.leftRegion;
        }
        if ((i & 2) != 0) {
            list2 = edgeReferenceLines.topRegion;
        }
        if ((i & 4) != 0) {
            list3 = edgeReferenceLines.rightRegion;
        }
        if ((i & 8) != 0) {
            list4 = edgeReferenceLines.bottomRegion;
        }
        return edgeReferenceLines.copy(list, list2, list3, list4);
    }

    public final List<List<List<Double>>> component1() {
        return this.leftRegion;
    }

    public final List<List<List<Double>>> component2() {
        return this.topRegion;
    }

    public final List<List<List<Double>>> component3() {
        return this.rightRegion;
    }

    public final List<List<List<Double>>> component4() {
        return this.bottomRegion;
    }

    public final EdgeReferenceLines copy(List<List<List<Double>>> leftRegion, List<List<List<Double>>> topRegion, List<List<List<Double>>> rightRegion, List<List<List<Double>>> bottomRegion) {
        leftRegion.getClass();
        topRegion.getClass();
        rightRegion.getClass();
        bottomRegion.getClass();
        return new EdgeReferenceLines(leftRegion, topRegion, rightRegion, bottomRegion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EdgeReferenceLines)) {
            return false;
        }
        EdgeReferenceLines edgeReferenceLines = (EdgeReferenceLines) other;
        if (Intrinsics.areEqual(this.leftRegion, edgeReferenceLines.leftRegion) && Intrinsics.areEqual(this.topRegion, edgeReferenceLines.topRegion) && Intrinsics.areEqual(this.rightRegion, edgeReferenceLines.rightRegion) && Intrinsics.areEqual(this.bottomRegion, edgeReferenceLines.bottomRegion)) {
            return true;
        }
        return false;
    }

    public final List<List<List<Double>>> getBottomRegion() {
        return this.bottomRegion;
    }

    public final List<List<List<Double>>> getLeftRegion() {
        return this.leftRegion;
    }

    public final List<List<List<Double>>> getRightRegion() {
        return this.rightRegion;
    }

    public final List<List<List<Double>>> getTopRegion() {
        return this.topRegion;
    }

    public int hashCode() {
        return this.bottomRegion.hashCode() + a.a(this.rightRegion, a.a(this.topRegion, this.leftRegion.hashCode() * 31, 31), 31);
    }

    public final void setBottomRegion(List<List<List<Double>>> list) {
        list.getClass();
        this.bottomRegion = list;
    }

    public final void setLeftRegion(List<List<List<Double>>> list) {
        list.getClass();
        this.leftRegion = list;
    }

    public final void setRightRegion(List<List<List<Double>>> list) {
        list.getClass();
        this.rightRegion = list;
    }

    public final void setTopRegion(List<List<List<Double>>> list) {
        list.getClass();
        this.topRegion = list;
    }

    public String toString() {
        return "EdgeReferenceLines(leftRegion=" + this.leftRegion + ", topRegion=" + this.topRegion + ", rightRegion=" + this.rightRegion + ", bottomRegion=" + this.bottomRegion + ")";
    }
}
