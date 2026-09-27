package defpackage;

import java.io.Closeable;
import kotlin.text.Regex;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class su6 implements Closeable {
    public final qu6 a;
    public boolean b;
    public final /* synthetic */ yu6 c;

    public su6(yu6 yu6Var, qu6 qu6Var) {
        this.c = yu6Var;
        this.a = qu6Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.b) {
            this.b = true;
            yu6 yu6Var = this.c;
            synchronized (yu6Var) {
                qu6 qu6Var = this.a;
                int i = qu6Var.h - 1;
                qu6Var.h = i;
                if (i == 0 && qu6Var.f) {
                    Regex regex = yu6.q;
                    yu6Var.G(qu6Var);
                }
            }
        }
    }
}
