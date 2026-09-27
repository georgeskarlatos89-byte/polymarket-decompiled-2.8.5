package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class j5a {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final swi f;
    public final z0h g;
    public final kjc h;

    public j5a(long j, long j2, long j3, long j4, long j5, swi swiVar, z0h z0hVar, kjc kjcVar) {
        swiVar.getClass();
        z0hVar.getClass();
        kjcVar.getClass();
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = swiVar;
        this.g = z0hVar;
        this.h = kjcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5a)) {
            return false;
        }
        j5a j5aVar = (j5a) obj;
        long j = j5aVar.a;
        int i = ib4.n;
        if (hkj.a(this.a, j) && hkj.a(this.b, j5aVar.b) && hkj.a(this.c, j5aVar.c) && hkj.a(this.d, j5aVar.d) && hkj.a(this.e, j5aVar.e) && Intrinsics.areEqual(this.f, j5aVar.f) && Intrinsics.areEqual(this.g, j5aVar.g) && Intrinsics.areEqual(this.h, j5aVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = ib4.n;
        gkj gkjVar = hkj.b;
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + woa.d(woa.d(woa.d(woa.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31);
    }

    public final String toString() {
        String h = ib4.h(this.a);
        String h2 = ib4.h(this.b);
        String h3 = ib4.h(this.c);
        String h4 = ib4.h(this.d);
        String h5 = ib4.h(this.e);
        StringBuilder r = m51.r("InternalButtonViewStyle(containerColor=", h, ", disabledContainerColor=", h2, ", successContainerColor=");
        k84.q(r, h3, ", contentColor=", h4, ", disabledContentColor=");
        r.append(h5);
        r.append(", textStyle=");
        r.append(this.f);
        r.append(", shape=");
        r.append(this.g);
        r.append(", modifier=");
        r.append(this.h);
        r.append(")");
        return r.toString();
    }
}
