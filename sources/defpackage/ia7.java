package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ia7 extends o1k {
    public final sa7 f;

    public ia7(sa7 sa7Var) {
        this.f = sa7Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ia7) || !Intrinsics.areEqual(this.f, ((ia7) obj).f)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "GoToScreen(screen=" + this.f + ")";
    }
}
