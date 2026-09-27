package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class l2j {
    public final Object a;
    public final long b;

    public l2j(Object obj, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2j)) {
            return false;
        }
        l2j l2jVar = (l2j) obj;
        if (Intrinsics.areEqual(this.a, l2jVar.a) && d47.d(this.b, l2jVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        c47 c47Var = d47.b;
        return Long.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        return "TimedValue(value=" + this.a + ", duration=" + ((Object) d47.o(this.b)) + ')';
    }
}
