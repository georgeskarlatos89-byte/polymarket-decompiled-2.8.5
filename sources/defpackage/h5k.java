package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class h5k {
    public final sa0 a;
    public final w57 b;

    public h5k(sa0 sa0Var, w57 w57Var) {
        this.a = sa0Var;
        this.b = w57Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h5k) {
            h5k h5kVar = (h5k) obj;
            if (Intrinsics.areEqual(this.a, h5kVar.a) && Intrinsics.areEqual(this.b, h5kVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
