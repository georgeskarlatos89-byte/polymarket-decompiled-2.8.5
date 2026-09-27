package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class eg8 implements sp8 {
    public final /* synthetic */ Function1 a;

    public eg8(Function1 function1) {
        this.a = function1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eg8) {
            return Intrinsics.areEqual(this.a, ((sp8) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.sp8
    public final qp8 getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
