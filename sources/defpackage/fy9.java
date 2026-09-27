package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fy9 {
    public final oy9 a;
    public final swi b;
    public final kjc c;

    public fy9(oy9 oy9Var, swi swiVar, kjc kjcVar) {
        kjcVar.getClass();
        this.a = oy9Var;
        this.b = swiVar;
        this.c = kjcVar;
    }

    public static fy9 a(fy9 fy9Var, oy9 oy9Var) {
        swi swiVar = fy9Var.b;
        kjc kjcVar = fy9Var.c;
        fy9Var.getClass();
        kjcVar.getClass();
        return new fy9(oy9Var, swiVar, kjcVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fy9) {
                fy9 fy9Var = (fy9) obj;
                if (!Intrinsics.areEqual(this.a, fy9Var.a) || !Intrinsics.areEqual(this.b, fy9Var.b) || !Intrinsics.areEqual(this.c, fy9Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InputComponentViewStyle(inputFieldStyle=" + this.a + ", errorMessageStyle=" + this.b + ", containerModifier=" + this.c + ")";
    }
}
