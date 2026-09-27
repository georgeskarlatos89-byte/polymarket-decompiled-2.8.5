package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class xpd implements n34 {
    public final Class a;

    public xpd(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xpd) {
            if (Intrinsics.areEqual(this.a, ((xpd) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.n34
    public final Class getJClass() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
