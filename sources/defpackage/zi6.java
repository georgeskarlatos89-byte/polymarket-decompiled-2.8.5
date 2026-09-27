package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zi6 {
    public final p9h a;
    public final phg b;
    public final g85 c;
    public final g85 d;
    public final g85 e;
    public final acj f;
    public final c1f g;

    public zi6(p9h p9hVar, phg phgVar, g85 g85Var, g85 g85Var2, g85 g85Var3, acj acjVar, c1f c1fVar) {
        this.a = p9hVar;
        this.b = phgVar;
        this.c = g85Var;
        this.d = g85Var2;
        this.e = g85Var3;
        this.f = acjVar;
        this.g = c1fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zi6) {
            zi6 zi6Var = (zi6) obj;
            if (Intrinsics.areEqual(null, null) && Intrinsics.areEqual(this.a, zi6Var.a) && this.b == zi6Var.b && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(this.c, zi6Var.c) && Intrinsics.areEqual(this.d, zi6Var.d) && Intrinsics.areEqual(this.e, zi6Var.e) && Intrinsics.areEqual(this.f, zi6Var.f) && this.g == zi6Var.g && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        p9h p9hVar = this.a;
        if (p9hVar != null) {
            i = p9hVar.hashCode();
        } else {
            i = 0;
        }
        int i8 = i * 31;
        phg phgVar = this.b;
        if (phgVar != null) {
            i2 = phgVar.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 961;
        g85 g85Var = this.c;
        if (g85Var != null) {
            i3 = g85Var.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 31;
        g85 g85Var2 = this.d;
        if (g85Var2 != null) {
            i4 = g85Var2.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 31;
        g85 g85Var3 = this.e;
        if (g85Var3 != null) {
            i5 = g85Var3.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        acj acjVar = this.f;
        if (acjVar != null) {
            i6 = acjVar.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 31;
        c1f c1fVar = this.g;
        if (c1fVar != null) {
            i7 = c1fVar.hashCode();
        }
        return (i13 + i7) * 887503681;
    }
}
