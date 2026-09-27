package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class q79 {
    public static final n79 d = new n79(null);
    public static final q79 e;
    public final boolean a;
    public final m79 b;
    public final p79 c;

    static {
        l79 l79Var = m79.d;
        l79Var.getClass();
        m79 m79Var = m79.e;
        o79 o79Var = p79.a;
        o79Var.getClass();
        p79 p79Var = p79.b;
        e = new q79(false, m79Var, p79Var);
        l79Var.getClass();
        o79Var.getClass();
        new q79(true, m79Var, p79Var);
    }

    public q79(boolean z, m79 m79Var, p79 p79Var) {
        m79Var.getClass();
        p79Var.getClass();
        this.a = z;
        this.b = m79Var;
        this.c = p79Var;
    }

    public final String toString() {
        StringBuilder s = sv6.s("HexFormat(\n    upperCase = ");
        s.append(this.a);
        s.append(",\n    bytes = BytesHexFormat(\n");
        this.b.a(s, "        ");
        s.append('\n');
        s.append("    ),");
        s.append('\n');
        s.append("    number = NumberHexFormat(");
        s.append('\n');
        this.c.a(s, "        ");
        s.append('\n');
        s.append("    )");
        s.append('\n');
        s.append(")");
        return s.toString();
    }
}
