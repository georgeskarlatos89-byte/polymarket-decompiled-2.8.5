package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class j2h {
    public final w75 a;
    public final w75 b;
    public final w75 c;

    public j2h(w75 w75Var, w75 w75Var2, w75 w75Var3) {
        this.a = w75Var;
        this.b = w75Var2;
        this.c = w75Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2h)) {
            return false;
        }
        j2h j2hVar = (j2h) obj;
        if (Intrinsics.areEqual(this.a, j2hVar.a) && Intrinsics.areEqual(this.b, j2hVar.b) && Intrinsics.areEqual(this.c, j2hVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ')';
    }
}
