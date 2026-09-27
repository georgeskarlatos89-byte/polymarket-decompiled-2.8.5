package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ici implements gci {
    public static final sb6 d = new sb6(3);
    public final Object a = new Object();
    public volatile gci b;
    public Object c;

    public ici(gci gciVar) {
        gciVar.getClass();
        this.b = gciVar;
    }

    @Override // defpackage.gci
    public final Object get() {
        gci gciVar = this.b;
        sb6 sb6Var = d;
        if (gciVar != sb6Var) {
            synchronized (this.a) {
                try {
                    if (this.b != sb6Var) {
                        Object obj = this.b.get();
                        this.c = obj;
                        this.b = sb6Var;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = ix2.o(new StringBuilder("<supplier that returned "), this.c, ">");
        }
        return ix2.o(sb, obj, ")");
    }
}
