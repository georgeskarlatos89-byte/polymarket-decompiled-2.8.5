package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class lhd {
    public final String a;
    public final xu0 b;
    public final Map c;

    public lhd(String str, xu0 xu0Var, Map map) {
        str.getClass();
        this.a = str;
        this.b = xu0Var;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lhd) {
                lhd lhdVar = (lhd) obj;
                if (!Intrinsics.areEqual(this.a, lhdVar.a) || !Intrinsics.areEqual(this.b, lhdVar.b) || !Intrinsics.areEqual(this.c, lhdVar.c)) {
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
        StringBuilder sb = new StringBuilder("OkHttpRequest(url=");
        sb.append(this.a);
        sb.append(", method=");
        sb.append(this.b);
        sb.append(", headers=");
        return ace.n(sb, this.c, ")");
    }
}
