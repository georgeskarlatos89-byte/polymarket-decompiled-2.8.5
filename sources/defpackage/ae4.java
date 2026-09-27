package defpackage;

import com.polymarket.data.EUserPosition;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ae4 {
    public final EUserPosition a;
    public final Function1 b;

    public ae4(EUserPosition eUserPosition, Function1 function1) {
        function1.getClass();
        this.a = eUserPosition;
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ae4) {
                ae4 ae4Var = (ae4) obj;
                if (!Intrinsics.areEqual(this.a, ae4Var.a) || !Intrinsics.areEqual(this.b, ae4Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ComboPositionSheetRequest(position=" + this.a + ", onEventSelected=" + this.b + ")";
    }
}
