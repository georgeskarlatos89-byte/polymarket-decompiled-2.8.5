package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class ufd implements xof {
    public Object a;

    public ufd(Object obj) {
        this.a = obj;
    }

    public void a(vka vkaVar, Object obj, Object obj2) {
        vkaVar.getClass();
    }

    public void b(vka vkaVar) {
        vkaVar.getClass();
    }

    @Override // defpackage.tof
    public final Object getValue(Object obj, vka vkaVar) {
        vkaVar.getClass();
        return this.a;
    }

    @Override // defpackage.xof
    public final void setValue(Object obj, vka vkaVar, Object obj2) {
        vkaVar.getClass();
        Object obj3 = this.a;
        b(vkaVar);
        this.a = obj2;
        a(vkaVar, obj3, obj2);
    }

    public final String toString() {
        return woa.q(new StringBuilder("ObservableProperty(value="), this.a, ')');
    }
}
