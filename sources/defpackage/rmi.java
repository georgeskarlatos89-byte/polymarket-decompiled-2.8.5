package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class rmi {
    public final il9 a;
    public final il9 b;

    public rmi(il9 il9Var, il9 il9Var2) {
        this.a = il9Var;
        this.b = il9Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rmi) {
                rmi rmiVar = (rmi) obj;
                if (!Intrinsics.areEqual(this.a, rmiVar.a) || !Intrinsics.areEqual(this.b, rmiVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TapToAddErrorMessage(title=" + this.a + ", action=" + this.b + ")";
    }
}
