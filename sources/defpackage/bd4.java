package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bd4 {
    public final ey3 a;
    public final ey3 b;
    public final ey3 c;
    public final onb d;
    public final onb e;

    public bd4(ey3 ey3Var, ey3 ey3Var2, ey3 ey3Var3, onb onbVar, onb onbVar2) {
        ey3Var.getClass();
        ey3Var2.getClass();
        ey3Var3.getClass();
        onbVar.getClass();
        this.a = ey3Var;
        this.b = ey3Var2;
        this.c = ey3Var3;
        this.d = onbVar;
        this.e = onbVar2;
        if (onbVar.e && onbVar2 != null) {
            boolean z = onbVar2.e;
        }
        boolean z2 = onbVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bd4.class != obj.getClass()) {
            return false;
        }
        bd4 bd4Var = (bd4) obj;
        if (Intrinsics.areEqual(this.a, bd4Var.a) && Intrinsics.areEqual(this.b, bd4Var.b) && Intrinsics.areEqual(this.c, bd4Var.c) && Intrinsics.areEqual(this.d, bd4Var.d) && Intrinsics.areEqual(this.e, bd4Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        onb onbVar = this.e;
        if (onbVar != null) {
            i = onbVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ", source=" + this.d + ", mediator=" + this.e + ')';
    }
}
