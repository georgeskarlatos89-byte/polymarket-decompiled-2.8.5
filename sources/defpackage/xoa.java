package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xoa {
    public final Object a;
    public w57 b;

    public xoa(Object obj, w57 w57Var) {
        this.a = obj;
        this.b = w57Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xoa) {
            xoa xoaVar = (xoa) obj;
            if (Intrinsics.areEqual(xoaVar.a, this.a) && Intrinsics.areEqual(xoaVar.b, this.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + woa.b(0, this.a.hashCode() * 31, 31);
    }
}
