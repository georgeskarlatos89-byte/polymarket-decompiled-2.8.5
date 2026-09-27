package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class p79 {
    public static final o79 a = new o79(null);
    public static final p79 b;

    /* JADX WARN: Type inference failed for: r0v1, types: [p79, java.lang.Object] */
    static {
        ?? obj = new Object();
        if (!oul.c("")) {
            oul.c("");
        }
        b = obj;
    }

    public final void a(StringBuilder sb, String str) {
        k84.q(sb, str, "prefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        a(sb, "    ");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
