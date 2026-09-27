package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
/* loaded from: classes.dex */
public final class z79 {
    public static final y79 Companion = new Object();
    public static final Lazy[] d = {null, LazyKt.a(w4b.PUBLICATION, new w29(6)), null};
    public final int a;
    public final c89 b;
    public final String c;

    public /* synthetic */ z79(int i, int i2, c89 c89Var, String str) {
        if (7 == (i & 7)) {
            this.a = i2;
            this.b = c89Var;
            this.c = str;
            return;
        }
        dqn.d(i, 7, x79.a.getDescriptor());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z79)) {
            return false;
        }
        z79 z79Var = (z79) obj;
        if (this.a == z79Var.a && this.b == z79Var.b && Intrinsics.areEqual(this.c, z79Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Hint(ordinal=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", value=");
        return woa.r(sb, this.c, ")");
    }
}
