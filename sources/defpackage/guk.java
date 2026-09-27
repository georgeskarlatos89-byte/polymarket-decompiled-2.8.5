package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class guk extends n8n {
    public final Object a;

    public guk(Unit unit) {
        this.a = unit;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof guk) || !Intrinsics.areEqual(this.a, ((guk) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return ix2.o(new StringBuilder("Success(body="), this.a, ")");
    }
}
