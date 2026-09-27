package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class fz0 implements gz0 {
    public final Map a;

    public fz0(Map map) {
        map.getClass();
        this.a = map;
    }

    @Override // defpackage.gz0
    public final Map a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fz0) && Intrinsics.areEqual(this.a, ((fz0) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnValues(values=" + this.a + ")";
    }
}
