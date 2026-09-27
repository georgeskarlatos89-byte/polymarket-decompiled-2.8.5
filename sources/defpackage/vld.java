package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class vld implements zld {
    public final h6b a;

    public vld(h6b h6bVar) {
        h6bVar.getClass();
        this.a = h6bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof vld) && Intrinsics.areEqual(this.a, ((vld) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Level(config=" + this.a + ")";
    }
}
