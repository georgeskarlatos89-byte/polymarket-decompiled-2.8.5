package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class w75 implements z0h {
    public final y75 a;
    public final y75 b;
    public final y75 c;
    public final y75 d;

    public w75(y75 y75Var, y75 y75Var2, y75 y75Var3, y75 y75Var4) {
        this.a = y75Var;
        this.b = y75Var2;
        this.c = y75Var3;
        this.d = y75Var4;
    }

    public static /* synthetic */ w75 b(w75 w75Var, y75 y75Var, y75 y75Var2, y75 y75Var3, y75 y75Var4, int i) {
        if ((i & 1) != 0) {
            y75Var = w75Var.a;
        }
        if ((i & 2) != 0) {
            y75Var2 = w75Var.b;
        }
        if ((i & 4) != 0) {
            y75Var3 = w75Var.c;
        }
        if ((i & 8) != 0) {
            y75Var4 = w75Var.d;
        }
        return w75Var.a(y75Var, y75Var2, y75Var3, y75Var4);
    }

    public abstract w75 a(y75 y75Var, y75 y75Var2, y75 y75Var3, y75 y75Var4);

    public abstract knd c(long j, float f, float f2, float f3, float f4, owa owaVar);

    @Override // defpackage.z0h
    /* renamed from: createOutline-Pq9zytI */
    public final knd mo11createOutlinePq9zytI(long j, owa owaVar, il6 il6Var) {
        float a = this.a.a(j, il6Var);
        float a2 = this.b.a(j, il6Var);
        float a3 = this.c.a(j, il6Var);
        float a4 = this.d.a(j, il6Var);
        float d = d9h.d(j);
        float f = a + a4;
        if (f > d) {
            float f2 = d / f;
            a *= f2;
            a4 *= f2;
        }
        float f3 = a2 + a3;
        if (f3 > d) {
            float f4 = d / f3;
            a2 *= f4;
            a3 *= f4;
        }
        if (a < 0.0f || a2 < 0.0f || a3 < 0.0f || a4 < 0.0f) {
            StringBuilder u = hdi.u(a, a2, "Corner size in Px can't be negative(topStart = ", ", topEnd = ", ", bottomEnd = ");
            u.append(a3);
            u.append(", bottomStart = ");
            u.append(a4);
            u.append(")!");
            nw9.a(u.toString());
        }
        return c(j, a, a2, a3, a4, owaVar);
    }
}
