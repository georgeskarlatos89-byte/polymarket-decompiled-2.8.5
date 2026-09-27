package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mo4 extends View.DragShadowBuilder {
    public final kl6 a;
    public final long b;
    public final Function1 c;

    public mo4(kl6 kl6Var, long j, Function1 function1) {
        this.a = kl6Var;
        this.b = j;
        this.c = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        v23 v23Var = new v23();
        owa owaVar = owa.Ltr;
        Canvas canvas2 = ls.a;
        ks ksVar = new ks();
        ksVar.a = canvas;
        u23 u23Var = v23Var.a;
        il6 il6Var = u23Var.a;
        owa owaVar2 = u23Var.b;
        t23 t23Var = u23Var.c;
        long j = u23Var.d;
        u23Var.a = this.a;
        u23Var.b = owaVar;
        u23Var.c = ksVar;
        u23Var.d = this.b;
        ksVar.p();
        this.c.invoke(v23Var);
        ksVar.k();
        u23Var.a = il6Var;
        u23Var.b = owaVar2;
        u23Var.c = t23Var;
        u23Var.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        kl6 kl6Var = this.a;
        point.set(kl6Var.O(intBitsToFloat / kl6Var.getDensity()), kl6Var.O(Float.intBitsToFloat((int) (j & 4294967295L)) / kl6Var.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
