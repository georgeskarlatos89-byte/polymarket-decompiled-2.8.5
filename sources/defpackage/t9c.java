package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class t9c {
    public final km9 a;
    public final Map b;

    public t9c(km9 km9Var, Map map) {
        this.a = km9Var;
        this.b = epn.b(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t9c) {
            t9c t9cVar = (t9c) obj;
            if (Intrinsics.areEqual(this.a, t9cVar.a) && Intrinsics.areEqual(this.b, t9cVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.a + ", extras=" + this.b + ")";
    }
}
