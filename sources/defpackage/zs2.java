package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zs2 implements il6 {
    public pq1 a = mc7.a;
    public x07 b;

    public final x07 a(Function1 function1) {
        return b(new ys2(function1, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x07] */
    public final x07 b(Function1 function1) {
        ?? obj = new Object();
        obj.a = function1;
        this.b = obj;
        return obj;
    }

    @Override // defpackage.il6
    public final float getDensity() {
        return this.a.getDensity().getDensity();
    }

    @Override // defpackage.il6
    public final float q0() {
        return this.a.getDensity().q0();
    }
}
