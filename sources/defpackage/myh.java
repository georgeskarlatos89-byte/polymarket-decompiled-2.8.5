package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class myh implements gp5 {
    public final gp5 a;
    public long b;
    public Uri c;

    public myh(gp5 gp5Var) {
        gp5Var.getClass();
        this.a = gp5Var;
        this.c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // defpackage.gp5
    public final long a(jp5 jp5Var) {
        gp5 gp5Var = this.a;
        this.c = jp5Var.a;
        Map map = Collections.EMPTY_MAP;
        try {
            return gp5Var.a(jp5Var);
        } finally {
            Uri uri = gp5Var.getUri();
            if (uri != null) {
                this.c = uri;
            }
            gp5Var.c();
        }
    }

    @Override // defpackage.gp5
    public final Map c() {
        return this.a.c();
    }

    @Override // defpackage.gp5
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.gp5
    public final void e(qz5 qz5Var) {
        qz5Var.getClass();
        this.a.e(qz5Var);
    }

    @Override // defpackage.gp5
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.vo5
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
}
