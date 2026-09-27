package com.socure.docv.capturesdk.core.external.ml.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\f¨\u0006 "}, d2 = {"Lcom/socure/docv/capturesdk/core/external/ml/model/EdgeSubRegionInfo;", "", "leftRegion", "", "topRegion", "rightRegion", "bottomRegion", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getLeftRegion", "()Ljava/lang/Boolean;", "setLeftRegion", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTopRegion", "setTopRegion", "getRightRegion", "setRightRegion", "getBottomRegion", "setBottomRegion", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/socure/docv/capturesdk/core/external/ml/model/EdgeSubRegionInfo;", "equals", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EdgeSubRegionInfo {
    public static final int $stable = 8;
    private Boolean bottomRegion;
    private Boolean leftRegion;
    private Boolean rightRegion;
    private Boolean topRegion;

    public EdgeSubRegionInfo(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.leftRegion = bool;
        this.topRegion = bool2;
        this.rightRegion = bool3;
        this.bottomRegion = bool4;
    }

    public static /* synthetic */ EdgeSubRegionInfo copy$default(EdgeSubRegionInfo edgeSubRegionInfo, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = edgeSubRegionInfo.leftRegion;
        }
        if ((i & 2) != 0) {
            bool2 = edgeSubRegionInfo.topRegion;
        }
        if ((i & 4) != 0) {
            bool3 = edgeSubRegionInfo.rightRegion;
        }
        if ((i & 8) != 0) {
            bool4 = edgeSubRegionInfo.bottomRegion;
        }
        return edgeSubRegionInfo.copy(bool, bool2, bool3, bool4);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getLeftRegion() {
        return this.leftRegion;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getTopRegion() {
        return this.topRegion;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getRightRegion() {
        return this.rightRegion;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getBottomRegion() {
        return this.bottomRegion;
    }

    public final EdgeSubRegionInfo copy(Boolean leftRegion, Boolean topRegion, Boolean rightRegion, Boolean bottomRegion) {
        return new EdgeSubRegionInfo(leftRegion, topRegion, rightRegion, bottomRegion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EdgeSubRegionInfo)) {
            return false;
        }
        EdgeSubRegionInfo edgeSubRegionInfo = (EdgeSubRegionInfo) other;
        if (Intrinsics.areEqual(this.leftRegion, edgeSubRegionInfo.leftRegion) && Intrinsics.areEqual(this.topRegion, edgeSubRegionInfo.topRegion) && Intrinsics.areEqual(this.rightRegion, edgeSubRegionInfo.rightRegion) && Intrinsics.areEqual(this.bottomRegion, edgeSubRegionInfo.bottomRegion)) {
            return true;
        }
        return false;
    }

    public final Boolean getBottomRegion() {
        return this.bottomRegion;
    }

    public final Boolean getLeftRegion() {
        return this.leftRegion;
    }

    public final Boolean getRightRegion() {
        return this.rightRegion;
    }

    public final Boolean getTopRegion() {
        return this.topRegion;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Boolean bool = this.leftRegion;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = hashCode * 31;
        Boolean bool2 = this.topRegion;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool3 = this.rightRegion;
        if (bool3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Boolean bool4 = this.bottomRegion;
        if (bool4 != null) {
            i = bool4.hashCode();
        }
        return i4 + i;
    }

    public final void setBottomRegion(Boolean bool) {
        this.bottomRegion = bool;
    }

    public final void setLeftRegion(Boolean bool) {
        this.leftRegion = bool;
    }

    public final void setRightRegion(Boolean bool) {
        this.rightRegion = bool;
    }

    public final void setTopRegion(Boolean bool) {
        this.topRegion = bool;
    }

    public String toString() {
        return "EdgeSubRegionInfo(leftRegion=" + this.leftRegion + ", topRegion=" + this.topRegion + ", rightRegion=" + this.rightRegion + ", bottomRegion=" + this.bottomRegion + ")";
    }
}
