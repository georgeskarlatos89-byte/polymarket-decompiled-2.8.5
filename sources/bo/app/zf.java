package bo.app;

import defpackage.dmk;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zf {
    public final wb a;

    public zf(wb wbVar) {
        this.a = wbVar;
        if (!wbVar.d) {
            return;
        }
        dmk.v("Session created events cannot be created with already sealed sessions.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zf) && Intrinsics.areEqual(this.a, ((zf) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SessionCreatedEvent(session=" + this.a + ')';
    }
}
