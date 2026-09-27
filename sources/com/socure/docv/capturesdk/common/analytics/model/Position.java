package com.socure.docv.capturesdk.common.analytics.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J2\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0002\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/Position;", "", "isGlare", "", "percent", "", "maxGlareBlob", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Double;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPercent", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxGlareBlob", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Double;)Lcom/socure/docv/capturesdk/common/analytics/model/Position;", "equals", "other", "hashCode", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Position {
    public static final int $stable = 0;
    private final Boolean isGlare;
    private final Double maxGlareBlob;
    private final Integer percent;

    public /* synthetic */ Position(Boolean bool, Integer num, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : d);
    }

    public static /* synthetic */ Position copy$default(Position position, Boolean bool, Integer num, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = position.isGlare;
        }
        if ((i & 2) != 0) {
            num = position.percent;
        }
        if ((i & 4) != 0) {
            d = position.maxGlareBlob;
        }
        return position.copy(bool, num, d);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsGlare() {
        return this.isGlare;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getPercent() {
        return this.percent;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getMaxGlareBlob() {
        return this.maxGlareBlob;
    }

    public final Position copy(Boolean isGlare, Integer percent, Double maxGlareBlob) {
        return new Position(isGlare, percent, maxGlareBlob);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Position)) {
            return false;
        }
        Position position = (Position) other;
        if (Intrinsics.areEqual(this.isGlare, position.isGlare) && Intrinsics.areEqual(this.percent, position.percent) && Intrinsics.areEqual(this.maxGlareBlob, position.maxGlareBlob)) {
            return true;
        }
        return false;
    }

    public final Double getMaxGlareBlob() {
        return this.maxGlareBlob;
    }

    public final Integer getPercent() {
        return this.percent;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Boolean bool = this.isGlare;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num = this.percent;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Double d = this.maxGlareBlob;
        if (d != null) {
            i = d.hashCode();
        }
        return i3 + i;
    }

    public final Boolean isGlare() {
        return this.isGlare;
    }

    public String toString() {
        return "Position(isGlare=" + this.isGlare + ", percent=" + this.percent + ", maxGlareBlob=" + this.maxGlareBlob + ")";
    }

    public Position(Boolean bool, Integer num, Double d) {
        this.isGlare = bool;
        this.percent = num;
        this.maxGlareBlob = d;
    }

    public Position() {
        this(null, null, null, 7, null);
    }
}
