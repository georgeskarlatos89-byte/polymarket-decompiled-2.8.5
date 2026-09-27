package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e5d extends h5d {
    public final m3e a;

    public e5d(m3e m3eVar) {
        this.a = m3eVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof e5d) || !Intrinsics.areEqual(this.a, ((e5d) obj).a)) {
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
        return "Complete(result=" + this.a + ")";
    }
}
