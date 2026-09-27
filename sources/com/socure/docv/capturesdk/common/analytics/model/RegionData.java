package com.socure.docv.capturesdk.common.analytics.model;

import com.fingerprintjs.android.fpjs_pro.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJJ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0013\u0010\f¨\u0006!"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/RegionData;", "", "x", "", "width", "y", "angle", "", "height", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;)V", "getX", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWidth", "getY", "getAngle", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getHeight", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;)Lcom/socure/docv/capturesdk/common/analytics/model/RegionData;", "equals", "", "other", "hashCode", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RegionData {
    public static final int $stable = 0;
    private final Double angle;
    private final Integer height;
    private final Integer width;
    private final Integer x;
    private final Integer y;

    public /* synthetic */ RegionData(Integer num, Integer num2, Integer num3, Double d, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : d, (i & 16) != 0 ? null : num4);
    }

    public static /* synthetic */ RegionData copy$default(RegionData regionData, Integer num, Integer num2, Integer num3, Double d, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = regionData.x;
        }
        if ((i & 2) != 0) {
            num2 = regionData.width;
        }
        if ((i & 4) != 0) {
            num3 = regionData.y;
        }
        if ((i & 8) != 0) {
            d = regionData.angle;
        }
        if ((i & 16) != 0) {
            num4 = regionData.height;
        }
        Integer num5 = num4;
        Integer num6 = num3;
        return regionData.copy(num, num2, num6, d, num5);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getX() {
        return this.x;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getY() {
        return this.y;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getAngle() {
        return this.angle;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    public final RegionData copy(Integer x, Integer width, Integer y, Double angle, Integer height) {
        return new RegionData(x, width, y, angle, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegionData)) {
            return false;
        }
        RegionData regionData = (RegionData) other;
        if (Intrinsics.areEqual(this.x, regionData.x) && Intrinsics.areEqual(this.width, regionData.width) && Intrinsics.areEqual(this.y, regionData.y) && Intrinsics.areEqual(this.angle, regionData.angle) && Intrinsics.areEqual(this.height, regionData.height)) {
            return true;
        }
        return false;
    }

    public final Double getAngle() {
        return this.angle;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public final Integer getX() {
        return this.x;
    }

    public final Integer getY() {
        return this.y;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Integer num = this.x;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num2 = this.width;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num3 = this.y;
        if (num3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Double d = this.angle;
        if (d == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = d.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Integer num4 = this.height;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        Integer num = this.x;
        Integer num2 = this.width;
        Integer num3 = this.y;
        Double d = this.angle;
        Integer num4 = this.height;
        StringBuilder sb = new StringBuilder("RegionData(x=");
        sb.append(num);
        sb.append(", width=");
        sb.append(num2);
        sb.append(", y=");
        sb.append(num3);
        sb.append(", angle=");
        sb.append(d);
        sb.append(", height=");
        return g.p(sb, num4, ")");
    }

    public RegionData(Integer num, Integer num2, Integer num3, Double d, Integer num4) {
        this.x = num;
        this.width = num2;
        this.y = num3;
        this.angle = d;
        this.height = num4;
    }

    public RegionData() {
        this(null, null, null, null, null, 31, null);
    }
}
