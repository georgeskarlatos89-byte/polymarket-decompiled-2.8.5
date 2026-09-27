package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f9h {
    public final z70 a;
    public long b;

    public f9h(z70 z70Var, long j) {
        this.a = z70Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f9h) {
                f9h f9hVar = (f9h) obj;
                if (!Intrinsics.areEqual(this.a, f9hVar.a) || !n1a.b(this.b, f9hVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + ((Object) n1a.c(this.b)) + ')';
    }
}
