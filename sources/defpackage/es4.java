package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class es4 implements p3k {
    public final Function1 a;

    public es4(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.p3k
    public final Object a(sje sjeVar) {
        return this.a.invoke(sjeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof es4) && Intrinsics.areEqual(this.a, ((es4) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
