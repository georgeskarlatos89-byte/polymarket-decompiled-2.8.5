package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zql extends RuntimeException {
    /* JADX WARN: Type inference failed for: r1v0, types: [zql, java.lang.RuntimeException] */
    public static zql a(int i, String str, String str2) {
        return new RuntimeException(c(str, str2, i, i + 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zql, java.lang.RuntimeException] */
    public static zql b(int i, int i2, String str, String str2) {
        return new RuntimeException(c(str, str2, i, i2));
    }

    public static String c(String str, String str2, int i, int i2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder t = sv6.t(str, ": ");
        if (i > 8) {
            t.append("...");
            t.append((CharSequence) str2, i - 5, i);
        } else {
            t.append((CharSequence) str2, 0, i);
        }
        t.append('[');
        t.append(str2.substring(i, i2));
        t.append(']');
        if (str2.length() - i2 > 8) {
            t.append((CharSequence) str2, i2, i2 + 5);
            t.append("...");
        } else {
            t.append((CharSequence) str2, i2, str2.length());
        }
        return t.toString();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
