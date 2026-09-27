package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class m2k extends l2k {
    public static final void c(int i, String str, String str2) {
        StringBuilder q = m51.q("Expected ", str2, " at index ", i, ", but was '");
        q.append(str.charAt(i));
        q.append('\'');
        throw new IllegalArgumentException(q.toString());
    }
}
