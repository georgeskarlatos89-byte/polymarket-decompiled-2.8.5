package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class gu2 {
    public final gkf a;
    public final List b;

    public gu2(gkf gkfVar, List list) {
        gkfVar.getClass();
        list.getClass();
        this.a = gkfVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu2)) {
            return false;
        }
        gu2 gu2Var = (gu2) obj;
        if (Intrinsics.areEqual(this.a, gu2Var.a) && Intrinsics.areEqual(this.b, gu2Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CachedQueryChannels(spec=" + this.a + ", channels=" + this.b + ")";
    }
}
