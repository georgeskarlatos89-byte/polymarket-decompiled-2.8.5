package bo.app;

import java.io.File;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class z7 {
    public final String a;
    public final long[] b;
    public boolean c;
    public b6 d;
    public final int e;
    public final File f;

    public z7(String str, int i, File file) {
        this.a = str;
        this.e = i;
        this.f = file;
        this.b = new long[i];
    }

    public final File a(int i) {
        return new File(this.f, this.a + "." + i);
    }

    public final File b(int i) {
        return new File(this.f, this.a + "." + i + ".tmp");
    }
}
