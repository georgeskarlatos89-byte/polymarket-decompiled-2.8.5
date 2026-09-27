package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class z2a {
    public final String a;
    public final Set b;
    public final c8i c;

    public z2a(String str, Set set, c8i c8iVar) {
        str.getClass();
        set.getClass();
        c8iVar.getClass();
        this.a = str;
        this.b = set;
        this.c = c8iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2a)) {
            return false;
        }
        z2a z2aVar = (z2a) obj;
        if (Intrinsics.areEqual(this.a, z2aVar.a) && Intrinsics.areEqual(this.b, z2aVar.b) && Intrinsics.areEqual(this.c, z2aVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + sv6.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Args(publishableKey=" + this.a + ", productUsage=" + this.b + ", intent=" + this.c + ")";
    }
}
