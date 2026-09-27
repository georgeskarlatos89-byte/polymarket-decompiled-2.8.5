package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class zh7 {
    public final d3g a;
    public final Function0 b;

    public zh7(d3g d3gVar, Function0 function0) {
        d3gVar.getClass();
        function0.getClass();
        this.a = d3gVar;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh7)) {
            return false;
        }
        zh7 zh7Var = (zh7) obj;
        if (Intrinsics.areEqual(this.a, zh7Var.a) && Intrinsics.areEqual(this.b, zh7Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorBannerParams(message=" + this.a + ", onShown=" + this.b + ")";
    }
}
