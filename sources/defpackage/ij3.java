package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class ij3 implements Iterable, xja {
    public static final hj3 c = new hj3(null);
    public final char a;
    public final char b;

    public ij3(char c2, char c3) {
        this.a = c2;
        this.b = (char) dsn.c(c2, c3, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new jj3(this.a, this.b);
    }
}
