package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class psg implements wsg {
    public final rod a;

    public psg(rod rodVar) {
        this.a = rodVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof psg) || !Intrinsics.areEqual(this.a, ((psg) obj).a)) {
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
        return "Moved(transform=" + this.a + ")";
    }
}
