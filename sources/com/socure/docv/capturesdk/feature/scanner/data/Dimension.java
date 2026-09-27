package com.socure.docv.capturesdk.feature.scanner.data;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;", "", "w", "", "h", "<init>", "(DD)V", "getW", "()D", "getH", "toString", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Dimension {
    public static final int $stable = 0;
    private final double h;
    private final double w;

    public Dimension(double d, double d2) {
        this.w = d;
        this.h = d2;
    }

    public static /* synthetic */ Dimension copy$default(Dimension dimension, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = dimension.w;
        }
        if ((i & 2) != 0) {
            d2 = dimension.h;
        }
        return dimension.copy(d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getW() {
        return this.w;
    }

    /* renamed from: component2, reason: from getter */
    public final double getH() {
        return this.h;
    }

    public final Dimension copy(double w, double h) {
        return new Dimension(w, h);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Dimension)) {
            return false;
        }
        Dimension dimension = (Dimension) other;
        if (Double.compare(this.w, dimension.w) == 0 && Double.compare(this.h, dimension.h) == 0) {
            return true;
        }
        return false;
    }

    public final double getH() {
        return this.h;
    }

    public final double getW() {
        return this.w;
    }

    public int hashCode() {
        return Double.hashCode(this.h) + (Double.hashCode(this.w) * 31);
    }

    public String toString() {
        return "Dimension(w=" + this.w + ", h=" + this.h + ")";
    }
}
