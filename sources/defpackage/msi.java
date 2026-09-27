package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class msi implements tb4, sp8 {
    public final /* synthetic */ nya a;

    public msi(nya nyaVar) {
        this.a = nyaVar;
    }

    @Override // defpackage.tb4
    public final /* synthetic */ long a() {
        return ((ib4) this.a.invoke()).a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof tb4) && (obj instanceof sp8)) {
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
