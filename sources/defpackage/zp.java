package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zp implements yac {
    public final fd1 a;
    public final fd1 b;
    public final int c;

    public zp(fd1 fd1Var, fd1 fd1Var2, int i) {
        this.a = fd1Var;
        this.b = fd1Var2;
        this.c = i;
    }

    @Override // defpackage.yac
    public final int a(i1a i1aVar, long j, int i, owa owaVar) {
        int a = this.b.a(0, i1aVar.d(), owaVar);
        int i2 = -this.a.a(0, i, owaVar);
        owa owaVar2 = owa.Ltr;
        int i3 = this.c;
        if (owaVar != owaVar2) {
            i3 = -i3;
        }
        return i1aVar.a + a + i2 + i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zp) {
                zp zpVar = (zp) obj;
                if (!Intrinsics.areEqual(this.a, zpVar.a) || !Intrinsics.areEqual(this.b, zpVar.b) || this.c != zpVar.c) {
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
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return sv6.o(sb, this.c, ')');
    }
}
