package bo.app;

import defpackage.dmk;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b6 {
    public final z7 a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ d6 d;

    public b6(d6 d6Var, z7 z7Var) {
        boolean[] zArr;
        this.d = d6Var;
        this.a = z7Var;
        if (z7Var.c) {
            zArr = null;
        } else {
            zArr = new boolean[d6Var.g];
        }
        this.b = zArr;
    }

    public final OutputStream a() {
        FileOutputStream fileOutputStream;
        a6 a6Var;
        d6 d6Var = this.d;
        if (d6Var.g > 0) {
            synchronized (d6Var) {
                try {
                    z7 z7Var = this.a;
                    if (z7Var.d == this) {
                        if (!z7Var.c) {
                            this.b[0] = true;
                        }
                        File b = z7Var.b(0);
                        try {
                            fileOutputStream = new FileOutputStream(b);
                        } catch (FileNotFoundException unused) {
                            this.d.a.mkdirs();
                            try {
                                fileOutputStream = new FileOutputStream(b);
                            } catch (FileNotFoundException unused2) {
                                return d6.q;
                            }
                        }
                        a6Var = new a6(this, fileOutputStream);
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return a6Var;
        }
        dmk.g(this.d.g, "Expected index 0 to be greater than 0 and less than the maximum value count of ");
        return null;
    }
}
