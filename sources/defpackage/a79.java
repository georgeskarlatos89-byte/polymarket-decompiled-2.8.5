package defpackage;

import com.polymarket.data.EHub;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class a79 implements d79 {
    public final EHub a;

    public a79(EHub eHub) {
        this.a = eHub;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a79) || !Intrinsics.areEqual(this.a, ((a79) obj).a)) {
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
        return "Hub(hub=" + this.a + ")";
    }
}
