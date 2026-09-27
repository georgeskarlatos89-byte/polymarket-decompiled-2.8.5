package com.socure.docv.capturesdk.core.external.ml.model;

import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.socure.core.d;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/socure/docv/capturesdk/core/external/ml/model/LineInfo;", "", "Lorg/socure/core/d;", OpsMetricTracker.START, "end", "<init>", "(Lorg/socure/core/d;Lorg/socure/core/d;)V", "component1", "()Lorg/socure/core/d;", "component2", "copy", "(Lorg/socure/core/d;Lorg/socure/core/d;)Lcom/socure/docv/capturesdk/core/external/ml/model/LineInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lorg/socure/core/d;", "getStart", "setStart", "(Lorg/socure/core/d;)V", "getEnd", "setEnd", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LineInfo {
    public static final int $stable = 8;
    private d end;
    private d start;

    public LineInfo(d dVar, d dVar2) {
        dVar.getClass();
        dVar2.getClass();
        this.start = dVar;
        this.end = dVar2;
    }

    public static /* synthetic */ LineInfo copy$default(LineInfo lineInfo, d dVar, d dVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = lineInfo.start;
        }
        if ((i & 2) != 0) {
            dVar2 = lineInfo.end;
        }
        return lineInfo.copy(dVar, dVar2);
    }

    /* renamed from: component1, reason: from getter */
    public final d getStart() {
        return this.start;
    }

    /* renamed from: component2, reason: from getter */
    public final d getEnd() {
        return this.end;
    }

    public final LineInfo copy(d start, d end) {
        start.getClass();
        end.getClass();
        return new LineInfo(start, end);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineInfo)) {
            return false;
        }
        LineInfo lineInfo = (LineInfo) other;
        if (Intrinsics.areEqual(this.start, lineInfo.start) && Intrinsics.areEqual(this.end, lineInfo.end)) {
            return true;
        }
        return false;
    }

    public final d getEnd() {
        return this.end;
    }

    public final d getStart() {
        return this.start;
    }

    public int hashCode() {
        return this.end.hashCode() + (this.start.hashCode() * 31);
    }

    public final void setEnd(d dVar) {
        dVar.getClass();
        this.end = dVar;
    }

    public final void setStart(d dVar) {
        dVar.getClass();
        this.start = dVar;
    }

    public String toString() {
        return "LineInfo(start=" + this.start + ", end=" + this.end + ")";
    }
}
