package com.socure.docv.capturesdk.core.external.ml.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0004\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003JY\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u0006/"}, d2 = {"Lcom/socure/docv/capturesdk/core/external/ml/model/ResponsivePoints;", "", "ax1", "", "ay1", "ax2", "ay2", "bx1", "by1", "bx2", "by2", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V", "getAx1", "()Ljava/lang/Number;", "setAx1", "(Ljava/lang/Number;)V", "getAy1", "setAy1", "getAx2", "setAx2", "getAy2", "setAy2", "getBx1", "setBx1", "getBy1", "setBy1", "getBx2", "setBx2", "getBy2", "setBy2", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ResponsivePoints {
    public static final int $stable = 8;
    private Number ax1;
    private Number ax2;
    private Number ay1;
    private Number ay2;
    private Number bx1;
    private Number bx2;
    private Number by1;
    private Number by2;

    public ResponsivePoints(Number number, Number number2, Number number3, Number number4, Number number5, Number number6, Number number7, Number number8) {
        number.getClass();
        number2.getClass();
        number3.getClass();
        number4.getClass();
        number5.getClass();
        number6.getClass();
        number7.getClass();
        number8.getClass();
        this.ax1 = number;
        this.ay1 = number2;
        this.ax2 = number3;
        this.ay2 = number4;
        this.bx1 = number5;
        this.by1 = number6;
        this.bx2 = number7;
        this.by2 = number8;
    }

    public static /* synthetic */ ResponsivePoints copy$default(ResponsivePoints responsivePoints, Number number, Number number2, Number number3, Number number4, Number number5, Number number6, Number number7, Number number8, int i, Object obj) {
        if ((i & 1) != 0) {
            number = responsivePoints.ax1;
        }
        if ((i & 2) != 0) {
            number2 = responsivePoints.ay1;
        }
        if ((i & 4) != 0) {
            number3 = responsivePoints.ax2;
        }
        if ((i & 8) != 0) {
            number4 = responsivePoints.ay2;
        }
        if ((i & 16) != 0) {
            number5 = responsivePoints.bx1;
        }
        if ((i & 32) != 0) {
            number6 = responsivePoints.by1;
        }
        if ((i & 64) != 0) {
            number7 = responsivePoints.bx2;
        }
        if ((i & 128) != 0) {
            number8 = responsivePoints.by2;
        }
        Number number9 = number7;
        Number number10 = number8;
        Number number11 = number5;
        Number number12 = number6;
        return responsivePoints.copy(number, number2, number3, number4, number11, number12, number9, number10);
    }

    /* renamed from: component1, reason: from getter */
    public final Number getAx1() {
        return this.ax1;
    }

    /* renamed from: component2, reason: from getter */
    public final Number getAy1() {
        return this.ay1;
    }

    /* renamed from: component3, reason: from getter */
    public final Number getAx2() {
        return this.ax2;
    }

    /* renamed from: component4, reason: from getter */
    public final Number getAy2() {
        return this.ay2;
    }

    /* renamed from: component5, reason: from getter */
    public final Number getBx1() {
        return this.bx1;
    }

    /* renamed from: component6, reason: from getter */
    public final Number getBy1() {
        return this.by1;
    }

    /* renamed from: component7, reason: from getter */
    public final Number getBx2() {
        return this.bx2;
    }

    /* renamed from: component8, reason: from getter */
    public final Number getBy2() {
        return this.by2;
    }

    public final ResponsivePoints copy(Number ax1, Number ay1, Number ax2, Number ay2, Number bx1, Number by1, Number bx2, Number by2) {
        ax1.getClass();
        ay1.getClass();
        ax2.getClass();
        ay2.getClass();
        bx1.getClass();
        by1.getClass();
        bx2.getClass();
        by2.getClass();
        return new ResponsivePoints(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponsivePoints)) {
            return false;
        }
        ResponsivePoints responsivePoints = (ResponsivePoints) other;
        if (Intrinsics.areEqual(this.ax1, responsivePoints.ax1) && Intrinsics.areEqual(this.ay1, responsivePoints.ay1) && Intrinsics.areEqual(this.ax2, responsivePoints.ax2) && Intrinsics.areEqual(this.ay2, responsivePoints.ay2) && Intrinsics.areEqual(this.bx1, responsivePoints.bx1) && Intrinsics.areEqual(this.by1, responsivePoints.by1) && Intrinsics.areEqual(this.bx2, responsivePoints.bx2) && Intrinsics.areEqual(this.by2, responsivePoints.by2)) {
            return true;
        }
        return false;
    }

    public final Number getAx1() {
        return this.ax1;
    }

    public final Number getAx2() {
        return this.ax2;
    }

    public final Number getAy1() {
        return this.ay1;
    }

    public final Number getAy2() {
        return this.ay2;
    }

    public final Number getBx1() {
        return this.bx1;
    }

    public final Number getBx2() {
        return this.bx2;
    }

    public final Number getBy1() {
        return this.by1;
    }

    public final Number getBy2() {
        return this.by2;
    }

    public int hashCode() {
        return this.by2.hashCode() + ((this.bx2.hashCode() + ((this.by1.hashCode() + ((this.bx1.hashCode() + ((this.ay2.hashCode() + ((this.ax2.hashCode() + ((this.ay1.hashCode() + (this.ax1.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final void setAx1(Number number) {
        number.getClass();
        this.ax1 = number;
    }

    public final void setAx2(Number number) {
        number.getClass();
        this.ax2 = number;
    }

    public final void setAy1(Number number) {
        number.getClass();
        this.ay1 = number;
    }

    public final void setAy2(Number number) {
        number.getClass();
        this.ay2 = number;
    }

    public final void setBx1(Number number) {
        number.getClass();
        this.bx1 = number;
    }

    public final void setBx2(Number number) {
        number.getClass();
        this.bx2 = number;
    }

    public final void setBy1(Number number) {
        number.getClass();
        this.by1 = number;
    }

    public final void setBy2(Number number) {
        number.getClass();
        this.by2 = number;
    }

    public String toString() {
        return "ResponsivePoints(ax1=" + this.ax1 + ", ay1=" + this.ay1 + ", ax2=" + this.ax2 + ", ay2=" + this.ay2 + ", bx1=" + this.bx1 + ", by1=" + this.by1 + ", bx2=" + this.bx2 + ", by2=" + this.by2 + ")";
    }
}
