package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class s69 {
    public final long a;
    public final List b;

    public s69(long j, List list) {
        list.getClass();
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s69)) {
            return false;
        }
        s69 s69Var = (s69) obj;
        long j = s69Var.a;
        int i = ib4.n;
        if (hkj.a(this.a, j) && Intrinsics.areEqual(this.b, s69Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = ib4.n;
        gkj gkjVar = hkj.b;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "HeroBackgroundColors(baseColor=" + ib4.h(this.a) + ", highlights=" + this.b + ")";
    }
}
