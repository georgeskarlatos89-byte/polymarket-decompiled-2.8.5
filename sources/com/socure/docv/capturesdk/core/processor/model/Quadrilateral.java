package com.socure.docv.capturesdk.core.processor.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000fJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/socure/docv/capturesdk/core/processor/model/Quadrilateral;", "", "topLeft", "Lcom/socure/docv/capturesdk/core/processor/model/Point;", "topRight", "bottomRight", "bottomLeft", "<init>", "(Lcom/socure/docv/capturesdk/core/processor/model/Point;Lcom/socure/docv/capturesdk/core/processor/model/Point;Lcom/socure/docv/capturesdk/core/processor/model/Point;Lcom/socure/docv/capturesdk/core/processor/model/Point;)V", "getTopLeft", "()Lcom/socure/docv/capturesdk/core/processor/model/Point;", "getTopRight", "getBottomRight", "getBottomLeft", "topEdge", "Lcom/socure/docv/capturesdk/core/processor/model/Line;", "leftEdge", "rightEdge", "bottomEdge", "toString", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Quadrilateral {
    public static final int $stable = 8;
    private final Point bottomLeft;
    private final Point bottomRight;
    private final Point topLeft;
    private final Point topRight;

    public Quadrilateral(Point point, Point point2, Point point3, Point point4) {
        point.getClass();
        point2.getClass();
        point3.getClass();
        point4.getClass();
        this.topLeft = point;
        this.topRight = point2;
        this.bottomRight = point3;
        this.bottomLeft = point4;
    }

    public static /* synthetic */ Quadrilateral copy$default(Quadrilateral quadrilateral, Point point, Point point2, Point point3, Point point4, int i, Object obj) {
        if ((i & 1) != 0) {
            point = quadrilateral.topLeft;
        }
        if ((i & 2) != 0) {
            point2 = quadrilateral.topRight;
        }
        if ((i & 4) != 0) {
            point3 = quadrilateral.bottomRight;
        }
        if ((i & 8) != 0) {
            point4 = quadrilateral.bottomLeft;
        }
        return quadrilateral.copy(point, point2, point3, point4);
    }

    public final Line bottomEdge() {
        return new Line(this.bottomLeft, this.bottomRight);
    }

    /* renamed from: component1, reason: from getter */
    public final Point getTopLeft() {
        return this.topLeft;
    }

    /* renamed from: component2, reason: from getter */
    public final Point getTopRight() {
        return this.topRight;
    }

    /* renamed from: component3, reason: from getter */
    public final Point getBottomRight() {
        return this.bottomRight;
    }

    /* renamed from: component4, reason: from getter */
    public final Point getBottomLeft() {
        return this.bottomLeft;
    }

    public final Quadrilateral copy(Point topLeft, Point topRight, Point bottomRight, Point bottomLeft) {
        topLeft.getClass();
        topRight.getClass();
        bottomRight.getClass();
        bottomLeft.getClass();
        return new Quadrilateral(topLeft, topRight, bottomRight, bottomLeft);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Quadrilateral)) {
            return false;
        }
        Quadrilateral quadrilateral = (Quadrilateral) other;
        if (Intrinsics.areEqual(this.topLeft, quadrilateral.topLeft) && Intrinsics.areEqual(this.topRight, quadrilateral.topRight) && Intrinsics.areEqual(this.bottomRight, quadrilateral.bottomRight) && Intrinsics.areEqual(this.bottomLeft, quadrilateral.bottomLeft)) {
            return true;
        }
        return false;
    }

    public final Point getBottomLeft() {
        return this.bottomLeft;
    }

    public final Point getBottomRight() {
        return this.bottomRight;
    }

    public final Point getTopLeft() {
        return this.topLeft;
    }

    public final Point getTopRight() {
        return this.topRight;
    }

    public int hashCode() {
        return this.bottomLeft.hashCode() + ((this.bottomRight.hashCode() + ((this.topRight.hashCode() + (this.topLeft.hashCode() * 31)) * 31)) * 31);
    }

    public final Line leftEdge() {
        return new Line(this.topLeft, this.bottomLeft);
    }

    public final Line rightEdge() {
        return new Line(this.topRight, this.bottomRight);
    }

    public String toString() {
        return "Quadrilateral(topLeft=" + this.topLeft + ", topRight=" + this.topRight + ", bottomRight=" + this.bottomRight + ", bottomLeft=" + this.bottomLeft + ")";
    }

    public final Line topEdge() {
        return new Line(this.topLeft, this.topRight);
    }
}
