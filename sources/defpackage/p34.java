package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class p34 {
    public final fsc a;
    public final ndf b;
    public final le1 c;
    public final peh d;

    public p34(fsc fscVar, ndf ndfVar, le1 le1Var, peh pehVar) {
        fscVar.getClass();
        ndfVar.getClass();
        pehVar.getClass();
        this.a = fscVar;
        this.b = ndfVar;
        this.c = le1Var;
        this.d = pehVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p34) {
                p34 p34Var = (p34) obj;
                if (!Intrinsics.areEqual(this.a, p34Var.a) || !Intrinsics.areEqual(this.b, p34Var.b) || !Intrinsics.areEqual(this.c, p34Var.c) || !Intrinsics.areEqual(this.d, p34Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.a + ", classProto=" + this.b + ", metadataVersion=" + this.c + ", sourceElement=" + this.d + ')';
    }
}
