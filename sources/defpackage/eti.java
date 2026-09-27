package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class eti implements k88, sp8 {
    public final /* synthetic */ nya a;

    public eti(nya nyaVar) {
        this.a = nyaVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof k88) && (obj instanceof sp8)) {
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

    @Override // defpackage.k88
    public final /* synthetic */ float invoke() {
        return ((Number) this.a.invoke()).floatValue();
    }
}
