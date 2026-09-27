package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class qzn {
    public static final ozn d = new Object();
    public final qzn a;
    public final b7h b;
    public boolean c = false;

    public /* synthetic */ qzn(qzn qznVar, b7h b7hVar) {
        if (qznVar != null) {
            brn.h(qznVar.c);
        }
        this.a = qznVar;
        this.b = b7hVar;
    }

    public final qzn a() {
        if (!this.c) {
            this.c = true;
            qzn qznVar = this.a;
            if (qznVar != null && this.b.isEmpty()) {
                return qznVar;
            }
            return this;
        }
        dmk.n("Already frozen");
        return null;
    }

    public final boolean b() {
        if (!this.b.containsKey(d)) {
            qzn qznVar = this.a;
            if (qznVar == null || !qznVar.b()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (qzn qznVar = this; qznVar != null; qznVar = qznVar.a) {
            for (int i = 0; i < qznVar.b.c; i++) {
                sb.append("[");
                sb.append(this.b.j(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
