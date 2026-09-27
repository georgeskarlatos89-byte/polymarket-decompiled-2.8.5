package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class gl8 {
    public static final gl8 d = new gl8("", "", false);
    public final String a;
    public final String b;
    public final boolean c;

    static {
        new gl8("\n", "  ", true);
    }

    public gl8(String str, String str2, boolean z) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.a = str;
                this.b = str2;
                this.c = z;
                return;
            }
            dmk.v("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        dmk.v("Only combinations of \\n and \\r are allowed in newline.");
        throw null;
    }
}
