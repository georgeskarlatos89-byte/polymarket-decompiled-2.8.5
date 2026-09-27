package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class gf3 {
    public final String a;
    public final Date b;
    public final Date c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final int r;
    public final String s;
    public final String t;
    public final String u;
    public final boolean v;
    public final boolean w;
    public final String x;

    public gf3(String str, Date date, Date date2, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str3, int i, String str4, String str5, String str6, boolean z13, boolean z14, String str7) {
        k84.p(str, str2, str3, str4, str5);
        str6.getClass();
        this.a = str;
        this.b = date;
        this.c = date2;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = z9;
        this.n = z10;
        this.o = z11;
        this.p = z12;
        this.q = str3;
        this.r = i;
        this.s = str4;
        this.t = str5;
        this.u = str6;
        this.v = z13;
        this.w = z14;
        this.x = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf3)) {
            return false;
        }
        gf3 gf3Var = (gf3) obj;
        if (Intrinsics.areEqual(this.a, gf3Var.a) && Intrinsics.areEqual(this.b, gf3Var.b) && Intrinsics.areEqual(this.c, gf3Var.c) && Intrinsics.areEqual(this.d, gf3Var.d) && this.e == gf3Var.e && this.f == gf3Var.f && this.g == gf3Var.g && this.h == gf3Var.h && this.i == gf3Var.i && this.j == gf3Var.j && this.k == gf3Var.k && this.l == gf3Var.l && this.m == gf3Var.m && this.n == gf3Var.n && this.o == gf3Var.o && this.p == gf3Var.p && Intrinsics.areEqual(this.q, gf3Var.q) && this.r == gf3Var.r && Intrinsics.areEqual(this.s, gf3Var.s) && Intrinsics.areEqual(this.t, gf3Var.t) && Intrinsics.areEqual(this.u, gf3Var.u) && this.v == gf3Var.v && this.w == gf3Var.w && Intrinsics.areEqual(this.x, gf3Var.x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        int i = 0;
        Date date = this.b;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Date date2 = this.c;
        if (date2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = date2.hashCode();
        }
        int g = hdi.g(hdi.g(hdi.e(hdi.e(hdi.e(woa.b(this.r, hdi.e(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.e((i2 + hashCode2) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w);
        String str = this.x;
        if (str != null) {
            i = str.hashCode();
        }
        return g + i;
    }

    public final String toString() {
        StringBuilder u = sv6.u("ChannelConfigInnerEntity(channelType=", this.a, ", createdAt=", ", updatedAt=", this.b);
        u.append(this.c);
        u.append(", name=");
        u.append(this.d);
        u.append(", isTypingEvents=");
        hdi.B(u, this.e, ", isReadEvents=", this.f, ", deliveryEventsEnabled=");
        hdi.B(u, this.g, ", isConnectEvents=", this.h, ", isSearch=");
        hdi.B(u, this.i, ", isReactionsEnabled=", this.j, ", isThreadEnabled=");
        hdi.B(u, this.k, ", isMutes=", this.l, ", uploadsEnabled=");
        hdi.B(u, this.m, ", urlEnrichmentEnabled=", this.n, ", customEventsEnabled=");
        hdi.B(u, this.o, ", pushNotificationsEnabled=", this.p, ", messageRetention=");
        k84.l(this.r, this.q, ", maxMessageLength=", ", automod=", u);
        k84.q(u, this.s, ", automodBehavior=", this.t, ", blocklistBehavior=");
        ace.A(this.u, ", messageRemindersEnabled=", ", markMessagesPending=", u, this.v);
        u.append(this.w);
        u.append(", pushLevel=");
        u.append(this.x);
        u.append(")");
        return u.toString();
    }
}
