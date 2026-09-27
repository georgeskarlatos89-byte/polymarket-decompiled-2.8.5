package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ma0 implements nwh {
    public final tfj a;
    public final kvd b;
    public sa0 c;
    public long d;
    public long e;
    public boolean f;

    public ma0(tfj tfjVar, Object obj, sa0 sa0Var, long j, long j2, boolean z) {
        sa0 sa0Var2;
        this.a = tfjVar;
        this.b = ikl.c(obj);
        if (sa0Var != null) {
            sa0Var2 = udn.a(sa0Var);
        } else {
            sa0Var2 = (sa0) tfjVar.a.invoke(obj);
            sa0Var2.d();
        }
        this.c = sa0Var2;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    public final Object a() {
        return this.a.b.invoke(this.c);
    }

    @Override // defpackage.nwh
    public final Object getValue() {
        return this.b.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationState(value=");
        sb.append(this.b.getValue());
        sb.append(", velocity=");
        sb.append(a());
        sb.append(", isRunning=");
        sb.append(this.f);
        sb.append(", lastFrameTimeNanos=");
        sb.append(this.d);
        sb.append(", finishedTimeNanos=");
        return ix2.n(sb, this.e, ')');
    }

    public /* synthetic */ ma0(tfj tfjVar, Object obj, sa0 sa0Var, int i) {
        this(tfjVar, obj, (i & 4) != 0 ? null : sa0Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
