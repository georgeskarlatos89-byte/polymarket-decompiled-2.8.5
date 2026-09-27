package com.socure.docv.capturesdk.common.analytics.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/SubRegionInfo;", "", "topRegion", "", "bottomRegion", "leftRegion", "rightRegion", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getTopRegion", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBottomRegion", "getLeftRegion", "getRightRegion", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/socure/docv/capturesdk/common/analytics/model/SubRegionInfo;", "equals", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SubRegionInfo {
    public static final int $stable = 0;
    private final Boolean bottomRegion;
    private final Boolean leftRegion;
    private final Boolean rightRegion;
    private final Boolean topRegion;

    public /* synthetic */ SubRegionInfo(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4);
    }

    public static /* synthetic */ SubRegionInfo copy$default(SubRegionInfo subRegionInfo, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = subRegionInfo.topRegion;
        }
        if ((i & 2) != 0) {
            bool2 = subRegionInfo.bottomRegion;
        }
        if ((i & 4) != 0) {
            bool3 = subRegionInfo.leftRegion;
        }
        if ((i & 8) != 0) {
            bool4 = subRegionInfo.rightRegion;
        }
        return subRegionInfo.copy(bool, bool2, bool3, bool4);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getTopRegion() {
        return this.topRegion;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getBottomRegion() {
        return this.bottomRegion;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getLeftRegion() {
        return this.leftRegion;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getRightRegion() {
        return this.rightRegion;
    }

    public final SubRegionInfo copy(Boolean topRegion, Boolean bottomRegion, Boolean leftRegion, Boolean rightRegion) {
        return new SubRegionInfo(topRegion, bottomRegion, leftRegion, rightRegion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubRegionInfo)) {
            return false;
        }
        SubRegionInfo subRegionInfo = (SubRegionInfo) other;
        if (Intrinsics.areEqual(this.topRegion, subRegionInfo.topRegion) && Intrinsics.areEqual(this.bottomRegion, subRegionInfo.bottomRegion) && Intrinsics.areEqual(this.leftRegion, subRegionInfo.leftRegion) && Intrinsics.areEqual(this.rightRegion, subRegionInfo.rightRegion)) {
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
        Boolean bool = this.topRegion;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = hashCode * 31;
        Boolean bool2 = this.bottomRegion;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool3 = this.leftRegion;
        if (bool3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Boolean bool4 = this.rightRegion;
        if (bool4 != null) {
            i = bool4.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        return "SubRegionInfo(topRegion=" + this.topRegion + ", bottomRegion=" + this.bottomRegion + ", leftRegion=" + this.leftRegion + ", rightRegion=" + this.rightRegion + ")";
    }

    public SubRegionInfo(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.topRegion = bool;
        this.bottomRegion = bool2;
        this.leftRegion = bool3;
        this.rightRegion = bool4;
    }

    public SubRegionInfo() {
        this(null, null, null, null, 15, null);
    }
}
