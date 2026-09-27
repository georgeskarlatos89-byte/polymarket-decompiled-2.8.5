package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class vh {
    public final String a;
    public final boolean b;

    public vh(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String toString() {
        String str = this.a;
        int length = String.valueOf(str).length();
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(z).length());
        sb.append("{");
        sb.append(str);
        sb.append("}");
        sb.append(z);
        return sb.toString();
    }
}
