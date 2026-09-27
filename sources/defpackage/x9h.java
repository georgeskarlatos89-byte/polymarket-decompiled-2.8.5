package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class x9h {
    public final Function1 a;
    public final h58 b;

    public x9h(h58 h58Var, Function1 function1) {
        this.a = function1;
        this.b = h58Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x9h) {
                x9h x9hVar = (x9h) obj;
                if (!Intrinsics.areEqual(this.a, x9hVar.a) || !Intrinsics.areEqual(this.b, x9hVar.b)) {
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
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
