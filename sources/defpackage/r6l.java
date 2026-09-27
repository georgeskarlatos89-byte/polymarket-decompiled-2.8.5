package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class r6l implements Closeable {
    public static final aj b = new aj(18);
    public int a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        if (i > 0) {
            this.a = i - 1;
        } else {
            dmk.i("Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }
}
