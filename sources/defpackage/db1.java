package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class db1 implements f9d {
    public final jy7 a;

    public db1(jy7 jy7Var) {
        this.a = jy7Var;
    }

    @Override // defpackage.fl8
    public final fs4 a() {
        return this.a.a();
    }

    @Override // defpackage.fl8
    public final gwd b() {
        return this.a.b();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof db1) {
            if (Intrinsics.areEqual(this.a, ((db1) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BasicFormatStructure(" + this.a + ')';
    }
}
