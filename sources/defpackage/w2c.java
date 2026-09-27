package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class w2c {
    public static final w2c d;
    public static final w2c e;
    public static final w2c f;
    public final u2c a;
    public final u2c b;
    public final v2c c;

    static {
        u2c u2cVar = u2c.NOTHING;
        v2c v2cVar = v2c.PROPAGATE;
        d = new w2c(u2cVar, u2cVar, v2cVar);
        e = new w2c(u2cVar, u2cVar, v2c.CANCEL);
        f = new w2c(u2c.DEFAULT, u2c.DONE, v2cVar);
    }

    public w2c(u2c u2cVar, u2c u2cVar2, v2c v2cVar) {
        u2cVar.getClass();
        u2cVar2.getClass();
        v2cVar.getClass();
        this.a = u2cVar;
        this.b = u2cVar2;
        this.c = v2cVar;
    }
}
