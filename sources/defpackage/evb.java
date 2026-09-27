package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class evb implements nwh {
    public final kvd a;
    public final kvd b;
    public final kvd c;
    public final kvd d;
    public final kvd e;
    public final kvd f;
    public final kvd g;
    public final rm6 h;
    public final kvd i;
    public final kvd j;
    public final kvd k;
    public final kvd l;
    public final rm6 m;
    public final krc n;

    public evb() {
        Boolean bool = Boolean.FALSE;
        this.a = ikl.c(bool);
        this.b = ikl.c(1);
        this.c = ikl.c(1);
        this.d = ikl.c(bool);
        this.e = ikl.c(null);
        this.f = ikl.c(Float.valueOf(1.0f));
        this.g = ikl.c(bool);
        this.h = adh.b(new cvb(this, 1));
        this.i = ikl.c(null);
        Float valueOf = Float.valueOf(0.0f);
        this.j = ikl.c(valueOf);
        this.k = ikl.c(valueOf);
        this.l = ikl.c(Long.MIN_VALUE);
        this.m = adh.b(new cvb(this, 0));
        adh.b(new cvb(this, 2));
        this.n = new krc();
    }

    public final int a() {
        return ((Number) this.b.getValue()).intValue();
    }

    public final boolean b(int i, long j) {
        long longValue;
        float f;
        float f2;
        float floatValue;
        float f3;
        mvb mvbVar = (mvb) this.i.getValue();
        if (mvbVar == null) {
            return true;
        }
        kvd kvdVar = this.l;
        if (((Number) kvdVar.getValue()).longValue() == Long.MIN_VALUE) {
            longValue = 0;
        } else {
            longValue = j - ((Number) kvdVar.getValue()).longValue();
        }
        kvdVar.setValue(Long.valueOf(j));
        kvd kvdVar2 = this.e;
        lvb lvbVar = (lvb) kvdVar2.getValue();
        if (lvbVar != null) {
            f = lvbVar.b(mvbVar);
        } else {
            f = 0.0f;
        }
        lvb lvbVar2 = (lvb) kvdVar2.getValue();
        if (lvbVar2 != null) {
            f2 = lvbVar2.a(mvbVar);
        } else {
            f2 = 1.0f;
        }
        float b = ((float) (longValue / 1000000)) / mvbVar.b();
        rm6 rm6Var = this.h;
        float floatValue2 = ((Number) rm6Var.getValue()).floatValue() * b;
        float floatValue3 = ((Number) rm6Var.getValue()).floatValue();
        kvd kvdVar3 = this.j;
        if (floatValue3 < 0.0f) {
            floatValue = f - (((Number) kvdVar3.getValue()).floatValue() + floatValue2);
        } else {
            floatValue = (((Number) kvdVar3.getValue()).floatValue() + floatValue2) - f2;
        }
        if (f == f2) {
            f(f);
            return false;
        }
        if (floatValue < 0.0f) {
            f(lnf.d(((Number) kvdVar3.getValue()).floatValue(), f, f2) + floatValue2);
            return true;
        }
        float f4 = f2 - f;
        int i2 = (int) (floatValue / f4);
        int i3 = i2 + 1;
        if (a() + i3 > i) {
            f(((Number) this.m.getValue()).floatValue());
            c(i);
            return false;
        }
        c(a() + i3);
        float f5 = floatValue - (i2 * f4);
        if (((Number) rm6Var.getValue()).floatValue() < 0.0f) {
            f3 = f2 - f5;
        } else {
            f3 = f + f5;
        }
        f(f3);
        return true;
    }

    public final void c(int i) {
        this.b.setValue(Integer.valueOf(i));
    }

    public final void d(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }

    public final void f(float f) {
        mvb mvbVar;
        this.j.setValue(Float.valueOf(f));
        if (((Boolean) this.g.getValue()).booleanValue() && (mvbVar = (mvb) this.i.getValue()) != null) {
            f -= f % (1.0f / mvbVar.n);
        }
        this.k.setValue(Float.valueOf(f));
    }

    @Override // defpackage.nwh
    public final Object getValue() {
        return Float.valueOf(((Number) this.k.getValue()).floatValue());
    }
}
