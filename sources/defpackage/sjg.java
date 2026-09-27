package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class sjg implements ujg {
    public final bhb a;

    public sjg(bhb bhbVar) {
        bhbVar.getClass();
        this.a = bhbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof sjg) && Intrinsics.areEqual(this.a, ((sjg) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FullScreen(initialDestination=" + this.a + ")";
    }
}
