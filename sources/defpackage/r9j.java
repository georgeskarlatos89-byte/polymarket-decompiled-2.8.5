package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class r9j {
    public final List a;
    public final String b;
    public final Function1 c;

    public r9j(List list, String str, Function1 function1) {
        list.getClass();
        str.getClass();
        function1.getClass();
        this.a = list;
        this.b = str;
        this.c = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9j)) {
            return false;
        }
        r9j r9jVar = (r9j) obj;
        if (Intrinsics.areEqual(this.a, r9jVar.a) && Intrinsics.areEqual(this.b, r9jVar.b) && Intrinsics.areEqual(this.c, r9jVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + hdi.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "TradingModePickerConfig(items=" + this.a + ", selectedItemId=" + this.b + ", onItemSelected=" + this.c + ")";
    }
}
