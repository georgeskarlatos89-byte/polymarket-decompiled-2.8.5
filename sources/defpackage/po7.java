package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class po7 implements n73, sp8 {
    public final /* synthetic */ Function0 a;

    public po7(Function0 function0) {
        function0.getClass();
        this.a = function0;
    }

    @Override // defpackage.n73
    public final /* synthetic */ void a() {
        this.a.invoke();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof n73) && (obj instanceof sp8)) {
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
