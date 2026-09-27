package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class f4f {
    public final d3g a;
    public final boolean b;
    public final Function0 c;
    public final Function0 d;
    public final boolean e;
    public final boolean f;

    public f4f(d3g d3gVar, boolean z, Function0 function0, Function0 function02, boolean z2, boolean z3) {
        this.a = d3gVar;
        this.b = z;
        this.c = function0;
        this.d = function02;
        this.e = z2;
        this.f = z3;
    }

    public static f4f a(f4f f4fVar, boolean z) {
        return new f4f(f4fVar.a, f4fVar.b, f4fVar.c, f4fVar.d, z, f4fVar.f);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f4f) {
                f4f f4fVar = (f4f) obj;
                if (!Intrinsics.areEqual(this.a, f4fVar.a) || this.b != f4fVar.b || !Intrinsics.areEqual(this.c, f4fVar.c) || !Intrinsics.areEqual(this.d, f4fVar.d) || this.e != f4fVar.e || this.f != f4fVar.f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + hdi.g((this.d.hashCode() + ((this.c.hashCode() + hdi.g(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        return "UIState(label=" + this.a + ", canClickWhileDisabled=" + this.b + ", onClick=" + this.c + ", onDisabledClick=" + this.d + ", enabled=" + this.e + ", lockVisible=" + this.f + ")";
    }
}
