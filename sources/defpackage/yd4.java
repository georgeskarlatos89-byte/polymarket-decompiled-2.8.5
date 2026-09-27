package defpackage;

import com.polymarket.data.EUserPosition;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class yd4 implements zd4 {
    public final EUserPosition a;

    public yd4(EUserPosition eUserPosition) {
        this.a = eUserPosition;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof yd4) || !Intrinsics.areEqual(this.a, ((yd4) obj).a)) {
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
        return "Detail(position=" + this.a + ")";
    }
}
