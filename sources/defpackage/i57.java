package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class i57 implements p3k {
    public final kvd a;

    public i57(kvd kvdVar) {
        this.a = kvdVar;
    }

    @Override // defpackage.p3k
    public final Object a(sje sjeVar) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof i57) || !Intrinsics.areEqual(this.a, ((i57) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
