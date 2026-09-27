package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class m79 {
    public static final l79 d = new l79(null);
    public static final m79 e = new m79();
    public final boolean a = true;
    public final boolean b = true;
    public final boolean c;

    public m79() {
        boolean z = true;
        if (!oul.c("  ") && !oul.c("") && !oul.c("") && !oul.c("")) {
            z = false;
        }
        this.c = z;
    }

    public final void a(StringBuilder sb, String str) {
        k84.l(bd0.API_PRIORITY_OTHER, str, "bytesPerLine = ", ",", sb);
        sb.append('\n');
        sb.append(str);
        sb.append("bytesPerGroup = ");
        sb.append(bd0.API_PRIORITY_OTHER);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSeparator = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        k84.q(sb, str, "bytePrefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSuffix = \"");
        sb.append("");
        sb.append("\"");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BytesHexFormat(\n");
        a(sb, "    ");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
