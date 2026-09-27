package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class l73 extends m73 {
    public final String c;

    public l73(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof l73) || !Intrinsics.areEqual(this.c, ((l73) obj).c)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return sv6.n("Validated(value=", this.c, ")");
    }
}
