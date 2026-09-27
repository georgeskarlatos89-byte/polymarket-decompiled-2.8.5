package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class sba {
    public final c44 a;
    public final c44 b;
    public final c44 c;

    public sba(c44 c44Var, c44 c44Var2, c44 c44Var3) {
        this.a = c44Var;
        this.b = c44Var2;
        this.c = c44Var3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sba) {
                sba sbaVar = (sba) obj;
                if (!Intrinsics.areEqual(this.a, sbaVar.a) || !Intrinsics.areEqual(this.b, sbaVar.b) || !Intrinsics.areEqual(this.c, sbaVar.c)) {
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
        return "PlatformMutabilityMapping(javaClass=" + this.a + ", kotlinReadOnly=" + this.b + ", kotlinMutable=" + this.c + ')';
    }
}
