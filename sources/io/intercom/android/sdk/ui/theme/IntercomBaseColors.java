package io.intercom.android.sdk.ui.theme;

import defpackage.gkj;
import defpackage.hkj;
import defpackage.ib4;
import defpackage.woa;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\tJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\t¨\u0006 "}, d2 = {"Lio/intercom/android/sdk/ui/theme/IntercomBaseColors;", "", "Lib4;", "base", MetricTracker.Object.INPUT, "inputAlt", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "copy-ysEtTa8", "(JJJ)Lio/intercom/android/sdk/ui/theme/IntercomBaseColors;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getBase-0d7_KjU", "getInput-0d7_KjU", "getInputAlt-0d7_KjU", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class IntercomBaseColors {
    public static final int $stable = 0;
    private final long base;
    private final long input;
    private final long inputAlt;

    private IntercomBaseColors(long j, long j2, long j3) {
        this.base = j;
        this.input = j2;
        this.inputAlt = j3;
    }

    /* renamed from: copy-ysEtTa8$default, reason: not valid java name */
    public static /* synthetic */ IntercomBaseColors m696copyysEtTa8$default(IntercomBaseColors intercomBaseColors, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = intercomBaseColors.base;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = intercomBaseColors.input;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = intercomBaseColors.inputAlt;
        }
        return intercomBaseColors.m700copyysEtTa8(j4, j5, j3);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getBase() {
        return this.base;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getInput() {
        return this.input;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getInputAlt() {
        return this.inputAlt;
    }

    /* renamed from: copy-ysEtTa8, reason: not valid java name */
    public final IntercomBaseColors m700copyysEtTa8(long base, long input, long inputAlt) {
        return new IntercomBaseColors(base, input, inputAlt, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntercomBaseColors)) {
            return false;
        }
        IntercomBaseColors intercomBaseColors = (IntercomBaseColors) other;
        long j = this.base;
        long j2 = intercomBaseColors.base;
        int i = ib4.n;
        if (hkj.a(j, j2) && hkj.a(this.input, intercomBaseColors.input) && hkj.a(this.inputAlt, intercomBaseColors.inputAlt)) {
            return true;
        }
        return false;
    }

    /* renamed from: getBase-0d7_KjU, reason: not valid java name */
    public final long m701getBase0d7_KjU() {
        return this.base;
    }

    /* renamed from: getInput-0d7_KjU, reason: not valid java name */
    public final long m702getInput0d7_KjU() {
        return this.input;
    }

    /* renamed from: getInputAlt-0d7_KjU, reason: not valid java name */
    public final long m703getInputAlt0d7_KjU() {
        return this.inputAlt;
    }

    public int hashCode() {
        long j = this.base;
        int i = ib4.n;
        gkj gkjVar = hkj.b;
        return Long.hashCode(this.inputAlt) + woa.d(Long.hashCode(j) * 31, 31, this.input);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IntercomBaseColors(base=");
        woa.x(this.base, ", input=", sb);
        woa.x(this.input, ", inputAlt=", sb);
        sb.append((Object) ib4.h(this.inputAlt));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ IntercomBaseColors(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }
}
