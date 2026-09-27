package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class byh implements p3k {
    public final Object a;

    public byh(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.p3k
    public final Object a(sje sjeVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof byh) && Intrinsics.areEqual(this.a, ((byh) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return woa.q(new StringBuilder("StaticValueHolder(value="), this.a, ')');
    }
}
