package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class s6d implements u6d {
    public final q6d a;

    public s6d(q6d q6dVar) {
        this.a = q6dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof s6d) || !Intrinsics.areEqual(this.a, ((s6d) obj).a)) {
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
        return "CloseWithResult(result=" + this.a + ")";
    }
}
