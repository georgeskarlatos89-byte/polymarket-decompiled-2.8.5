package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class n0i {
    public final Map a;
    public final int b;

    public n0i(int i, Map map) {
        map.getClass();
        this.a = map;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0i)) {
            return false;
        }
        n0i n0iVar = (n0i) obj;
        if (Intrinsics.areEqual(this.a, n0iVar.a) && this.b == n0iVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpecQueryResult(streamSpecs=");
        sb.append(this.a);
        sb.append(", maxSupportedFrameRate=");
        return sv6.o(sb, this.b, ')');
    }
}
