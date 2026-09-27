package io.intercom.android.sdk.ui.theme;

import defpackage.gkj;
import defpackage.hkj;
import defpackage.ib4;
import defpackage.woa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, d2 = {"Lio/intercom/android/sdk/ui/theme/IntercomBorderColors;", "", "Lib4;", "neutral", "emphasis", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "copy--OWjLjI", "(JJ)Lio/intercom/android/sdk/ui/theme/IntercomBorderColors;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getNeutral-0d7_KjU", "getEmphasis-0d7_KjU", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class IntercomBorderColors {
    public static final int $stable = 0;
    private final long emphasis;
    private final long neutral;

    private IntercomBorderColors(long j, long j2) {
        this.neutral = j;
        this.emphasis = j2;
    }

    /* renamed from: copy--OWjLjI$default, reason: not valid java name */
    public static /* synthetic */ IntercomBorderColors m704copyOWjLjI$default(IntercomBorderColors intercomBorderColors, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = intercomBorderColors.neutral;
        }
        if ((i & 2) != 0) {
            j2 = intercomBorderColors.emphasis;
        }
        return intercomBorderColors.m707copyOWjLjI(j, j2);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getNeutral() {
        return this.neutral;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getEmphasis() {
        return this.emphasis;
    }

    /* renamed from: copy--OWjLjI, reason: not valid java name */
    public final IntercomBorderColors m707copyOWjLjI(long neutral, long emphasis) {
        return new IntercomBorderColors(neutral, emphasis, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntercomBorderColors)) {
            return false;
        }
        IntercomBorderColors intercomBorderColors = (IntercomBorderColors) other;
        long j = this.neutral;
        long j2 = intercomBorderColors.neutral;
        int i = ib4.n;
        if (hkj.a(j, j2) && hkj.a(this.emphasis, intercomBorderColors.emphasis)) {
            return true;
        }
        return false;
    }

    /* renamed from: getEmphasis-0d7_KjU, reason: not valid java name */
    public final long m708getEmphasis0d7_KjU() {
        return this.emphasis;
    }

    /* renamed from: getNeutral-0d7_KjU, reason: not valid java name */
    public final long m709getNeutral0d7_KjU() {
        return this.neutral;
    }

    public int hashCode() {
        long j = this.neutral;
        int i = ib4.n;
        gkj gkjVar = hkj.b;
        return Long.hashCode(this.emphasis) + (Long.hashCode(j) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IntercomBorderColors(neutral=");
        woa.x(this.neutral, ", emphasis=", sb);
        sb.append((Object) ib4.h(this.emphasis));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ IntercomBorderColors(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }
}
