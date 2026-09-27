package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ju4 implements ku4 {
    public final Object a;
    public final boolean b;

    public ju4(Object obj, boolean z) {
        this.a = obj;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ju4) {
                ju4 ju4Var = (ju4) obj;
                if (!Intrinsics.areEqual(this.a, ju4Var.a) || this.b != ju4Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Launch(launcherArguments=" + this.a + ", receivesResultInProcess=" + this.b + ")";
    }
}
