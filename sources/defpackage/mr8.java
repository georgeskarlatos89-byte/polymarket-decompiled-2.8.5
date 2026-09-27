package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
/* loaded from: classes6.dex */
public final class mr8 implements Comparable<mr8> {
    public static final lr8 Companion = new Object();
    public static final Lazy[] j;
    public final int a;
    public final int b;
    public final int c;
    public final ejk d;
    public final int e;
    public final int f;
    public final kkc g;
    public final int h;
    public final long i;

    /* JADX WARN: Type inference failed for: r0v0, types: [lr8, java.lang.Object] */
    static {
        w4b w4bVar = w4b.PUBLICATION;
        j = new Lazy[]{null, null, null, LazyKt.a(w4bVar, new tw7(22)), null, null, LazyKt.a(w4bVar, new tw7(23)), null, null};
        pt5.a(0L);
    }

    public /* synthetic */ mr8(int i, int i2, int i3, int i4, ejk ejkVar, int i5, int i6, kkc kkcVar, int i7, long j2) {
        if (511 == (i & 511)) {
            this.a = i2;
            this.b = i3;
            this.c = i4;
            this.d = ejkVar;
            this.e = i5;
            this.f = i6;
            this.g = kkcVar;
            this.h = i7;
            this.i = j2;
            return;
        }
        dqn.d(i, 511, kr8.a.getDescriptor());
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(mr8 mr8Var) {
        mr8 mr8Var2 = mr8Var;
        mr8Var2.getClass();
        return Intrinsics.e(this.i, mr8Var2.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr8)) {
            return false;
        }
        mr8 mr8Var = (mr8) obj;
        if (this.a == mr8Var.a && this.b == mr8Var.b && this.c == mr8Var.c && this.d == mr8Var.d && this.e == mr8Var.e && this.f == mr8Var.f && this.g == mr8Var.g && this.h == mr8Var.h && this.i == mr8Var.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + woa.b(this.h, (this.g.hashCode() + woa.b(this.f, woa.b(this.e, (this.d.hashCode() + woa.b(this.c, woa.b(this.b, Integer.hashCode(this.a) * 31, 31), 31)) * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GMTDate(seconds=");
        sb.append(this.a);
        sb.append(", minutes=");
        sb.append(this.b);
        sb.append(", hours=");
        sb.append(this.c);
        sb.append(", dayOfWeek=");
        sb.append(this.d);
        sb.append(", dayOfMonth=");
        sb.append(this.e);
        sb.append(", dayOfYear=");
        sb.append(this.f);
        sb.append(", month=");
        sb.append(this.g);
        sb.append(", year=");
        sb.append(this.h);
        sb.append(", timestamp=");
        return ix2.n(sb, this.i, ')');
    }

    public mr8(int i, int i2, int i3, ejk ejkVar, int i4, int i5, kkc kkcVar, int i6, long j2) {
        ejkVar.getClass();
        kkcVar.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = ejkVar;
        this.e = i4;
        this.f = i5;
        this.g = kkcVar;
        this.h = i6;
        this.i = j2;
    }
}
