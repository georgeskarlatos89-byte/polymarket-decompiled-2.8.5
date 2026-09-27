package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vok {
    public String a;
    public iok b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vok)) {
            return false;
        }
        vok vokVar = (vok) obj;
        if (Intrinsics.areEqual(this.a, vokVar.a) && this.b == vokVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
    }
}
