package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class dj3 implements o1f {
    public int a(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (b(str.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    @Override // defpackage.o1f
    public final boolean apply(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c);
}
