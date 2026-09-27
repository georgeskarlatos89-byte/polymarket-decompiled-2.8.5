package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class v9d {
    public final c44 a;
    public final List b;

    public v9d(c44 c44Var, List list) {
        c44Var.getClass();
        list.getClass();
        this.a = c44Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9d)) {
            return false;
        }
        v9d v9dVar = (v9d) obj;
        if (Intrinsics.areEqual(this.a, v9dVar.a) && Intrinsics.areEqual(this.b, v9dVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassRequest(classId=");
        sb.append(this.a);
        sb.append(", typeParametersCount=");
        return sv6.r(sb, this.b, ')');
    }
}
