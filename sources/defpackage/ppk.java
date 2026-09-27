package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class ppk implements r7b, sp8 {
    public final /* synthetic */ mr4 a;

    public ppk(mr4 mr4Var) {
        this.a = mr4Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof r7b) && (obj instanceof sp8)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((sp8) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.sp8
    public final qp8 getFunctionDelegate() {
        return new eq8(1, 0, mr4.class, this.a, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
