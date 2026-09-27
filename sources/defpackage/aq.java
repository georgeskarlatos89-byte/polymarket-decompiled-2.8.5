package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class aq implements zac {
    public final gd1 a;
    public final gd1 b;
    public final int c;

    public aq(gd1 gd1Var, gd1 gd1Var2, int i) {
        this.a = gd1Var;
        this.b = gd1Var2;
        this.c = i;
    }

    @Override // defpackage.zac
    public final int a(i1a i1aVar, long j, int i) {
        int a = this.b.a(0, i1aVar.b());
        return i1aVar.b + a + (-this.a.a(0, i)) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aq) {
                aq aqVar = (aq) obj;
                if (!Intrinsics.areEqual(this.a, aqVar.a) || !Intrinsics.areEqual(this.b, aqVar.b) || this.c != aqVar.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + sv6.a(Float.hashCode(this.a.a) * 31, this.b.a, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return sv6.o(sb, this.c, ')');
    }
}
