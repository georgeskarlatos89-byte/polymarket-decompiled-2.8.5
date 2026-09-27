package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class o1c {
    public final String a;
    public final e0 b;
    public final j96 c;
    public final jke d;

    public o1c(String str, e0 e0Var, j96 j96Var, jke jkeVar) {
        str.getClass();
        e0Var.getClass();
        j96Var.getClass();
        jkeVar.getClass();
        this.a = str;
        this.b = e0Var;
        this.c = j96Var;
        this.d = jkeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1c)) {
            return false;
        }
        o1c o1cVar = (o1c) obj;
        if (Intrinsics.areEqual(this.a, o1cVar.a) && Intrinsics.areEqual(this.b, o1cVar.b) && Intrinsics.areEqual(this.c, o1cVar.c) && Intrinsics.areEqual(this.d, o1cVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MarkdownComponentModel(content=" + this.a + ", node=" + this.b + ", typography=" + this.c + ", extra=" + this.d + ")";
    }
}
