package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ze {
    public final ue a;

    public ze(ue ueVar) {
        ueVar.getClass();
        this.a = ueVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ze) && Intrinsics.areEqual(this.a, ((ze) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SdkDebuggerConfigUpdateEvent(debugConfig=" + this.a + ')';
    }
}
