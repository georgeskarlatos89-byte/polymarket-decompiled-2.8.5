package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wki {
    public static final wki b;
    public final Map a;

    static {
        zc7 zc7Var = zc7.a;
        zc7Var.getClass();
        b = new wki(zc7Var);
    }

    public wki(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wki) {
            if (Intrinsics.areEqual(this.a, ((wki) obj).a)) {
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
        return hdi.s(new StringBuilder("Tags(tags="), this.a, ')');
    }
}
