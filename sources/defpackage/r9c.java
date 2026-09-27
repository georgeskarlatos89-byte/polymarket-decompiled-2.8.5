package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class r9c {
    public final String a;
    public final Map b;

    public r9c(String str, Map map) {
        this.a = str;
        this.b = epn.b(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r9c) {
            r9c r9cVar = (r9c) obj;
            if (Intrinsics.areEqual(this.a, r9cVar.a) && Intrinsics.areEqual(this.b, r9cVar.b)) {
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
        return "Key(key=" + this.a + ", extras=" + this.b + ")";
    }
}
