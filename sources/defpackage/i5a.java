package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class i5a {
    public final kvd a;
    public final owi b;

    public i5a(kvd kvdVar, owi owiVar) {
        owiVar.getClass();
        this.a = kvdVar;
        this.b = owiVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i5a) {
                i5a i5aVar = (i5a) obj;
                if (!Intrinsics.areEqual(this.a, i5aVar.a) || !Intrinsics.areEqual(this.b, i5aVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InternalButtonState(isEnabled=" + this.a + ", textState=" + this.b + ")";
    }
}
