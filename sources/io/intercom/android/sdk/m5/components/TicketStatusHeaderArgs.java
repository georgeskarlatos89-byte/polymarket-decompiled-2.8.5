package io.intercom.android.sdk.m5.components;

import defpackage.qi8;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/components/TicketStatusHeaderArgs;", "", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "Lqi8;", "fontWeight", "<init>", "(Ljava/lang/String;Lqi8;)V", "component1", "()Ljava/lang/String;", "component2", "()Lqi8;", "copy", "(Ljava/lang/String;Lqi8;)Lio/intercom/android/sdk/m5/components/TicketStatusHeaderArgs;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lqi8;", "getFontWeight", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TicketStatusHeaderArgs {
    public static final int $stable = 0;
    private final qi8 fontWeight;
    private final String title;

    public TicketStatusHeaderArgs(String str, qi8 qi8Var) {
        str.getClass();
        qi8Var.getClass();
        this.title = str;
        this.fontWeight = qi8Var;
    }

    public static /* synthetic */ TicketStatusHeaderArgs copy$default(TicketStatusHeaderArgs ticketStatusHeaderArgs, String str, qi8 qi8Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ticketStatusHeaderArgs.title;
        }
        if ((i & 2) != 0) {
            qi8Var = ticketStatusHeaderArgs.fontWeight;
        }
        return ticketStatusHeaderArgs.copy(str, qi8Var);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final qi8 getFontWeight() {
        return this.fontWeight;
    }

    public final TicketStatusHeaderArgs copy(String title, qi8 fontWeight) {
        title.getClass();
        fontWeight.getClass();
        return new TicketStatusHeaderArgs(title, fontWeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketStatusHeaderArgs)) {
            return false;
        }
        TicketStatusHeaderArgs ticketStatusHeaderArgs = (TicketStatusHeaderArgs) other;
        if (Intrinsics.areEqual(this.title, ticketStatusHeaderArgs.title) && Intrinsics.areEqual(this.fontWeight, ticketStatusHeaderArgs.fontWeight)) {
            return true;
        }
        return false;
    }

    public final qi8 getFontWeight() {
        return this.fontWeight;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.fontWeight.a;
    }

    public String toString() {
        return "TicketStatusHeaderArgs(title=" + this.title + ", fontWeight=" + this.fontWeight + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TicketStatusHeaderArgs(String str, qi8 qi8Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, qi8Var);
        if ((i & 2) != 0) {
            qi8 qi8Var2 = qi8.b;
            qi8Var = qi8.g;
        }
    }
}
