package com.socure.docv.capturesdk.core.processor.model;

import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/socure/docv/capturesdk/core/processor/model/Line;", "", OpsMetricTracker.START, "Lcom/socure/docv/capturesdk/core/processor/model/Point;", "end", "<init>", "(Lcom/socure/docv/capturesdk/core/processor/model/Point;Lcom/socure/docv/capturesdk/core/processor/model/Point;)V", "getStart", "()Lcom/socure/docv/capturesdk/core/processor/model/Point;", "getEnd", "toString", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Line {
    public static final int $stable = 8;
    private final Point end;
    private final Point start;

    public Line(Point point, Point point2) {
        point.getClass();
        point2.getClass();
        this.start = point;
        this.end = point2;
    }

    public static /* synthetic */ Line copy$default(Line line, Point point, Point point2, int i, Object obj) {
        if ((i & 1) != 0) {
            point = line.start;
        }
        if ((i & 2) != 0) {
            point2 = line.end;
        }
        return line.copy(point, point2);
    }

    /* renamed from: component1, reason: from getter */
    public final Point getStart() {
        return this.start;
    }

    /* renamed from: component2, reason: from getter */
    public final Point getEnd() {
        return this.end;
    }

    public final Line copy(Point start, Point end) {
        start.getClass();
        end.getClass();
        return new Line(start, end);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Line)) {
            return false;
        }
        Line line = (Line) other;
        if (Intrinsics.areEqual(this.start, line.start) && Intrinsics.areEqual(this.end, line.end)) {
            return true;
        }
        return false;
    }

    public final Point getEnd() {
        return this.end;
    }

    public final Point getStart() {
        return this.start;
    }

    public int hashCode() {
        return this.end.hashCode() + (this.start.hashCode() * 31);
    }

    public String toString() {
        return "Line(start=" + this.start + ", end=" + this.end + ")";
    }
}
