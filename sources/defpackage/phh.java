package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class phh extends g91 {
    public final PointF i;
    public final PointF j;
    public final j88 k;
    public final j88 l;
    public x4 m;
    public x4 n;

    public phh(j88 j88Var, j88 j88Var2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.j = new PointF();
        this.k = j88Var;
        this.l = j88Var2;
        j(this.d);
    }

    @Override // defpackage.g91
    public final Object f() {
        return m();
    }

    @Override // defpackage.g91
    public final /* bridge */ /* synthetic */ Object g(soa soaVar, float f) {
        return m();
    }

    @Override // defpackage.g91
    public final void j(float f) {
        j88 j88Var = this.k;
        j88Var.j(f);
        j88 j88Var2 = this.l;
        j88Var2.j(f);
        this.i.set(((Float) j88Var.f()).floatValue(), ((Float) j88Var2.f()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                ((c91) arrayList.get(i)).a();
                i++;
            } else {
                return;
            }
        }
    }

    public final PointF m() {
        Float f;
        j88 j88Var;
        soa b;
        float floatValue;
        j88 j88Var2;
        soa b2;
        float floatValue2;
        Float f2 = null;
        if (this.m != null && (b2 = (j88Var2 = this.k).b()) != null) {
            Float f3 = b2.h;
            x4 x4Var = this.m;
            float f4 = b2.g;
            if (f3 == null) {
                floatValue2 = f4;
            } else {
                floatValue2 = f3.floatValue();
            }
            f = (Float) x4Var.P0(f4, floatValue2, (Float) b2.b, (Float) b2.c, j88Var2.d(), j88Var2.e(), j88Var2.d);
        } else {
            f = null;
        }
        if (this.n != null && (b = (j88Var = this.l).b()) != null) {
            Float f5 = b.h;
            x4 x4Var2 = this.n;
            float f6 = b.g;
            if (f5 == null) {
                floatValue = f6;
            } else {
                floatValue = f5.floatValue();
            }
            f2 = (Float) x4Var2.P0(f6, floatValue, (Float) b.b, (Float) b.c, j88Var.d(), j88Var.e(), j88Var.d);
        }
        PointF pointF = this.i;
        PointF pointF2 = this.j;
        if (f == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f.floatValue(), 0.0f);
        }
        if (f2 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, f2.floatValue());
        return pointF2;
    }
}
