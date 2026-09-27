package defpackage;

import android.content.res.Resources;
import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tt6 implements oo5 {
    public final Resources.Theme a;
    public final Resources b;
    public final ut6 c;
    public final int d;
    public Object e;

    public tt6(Resources.Theme theme, Resources resources, ut6 ut6Var, int i) {
        this.a = theme;
        this.b = resources;
        this.c = ut6Var;
        this.d = i;
    }

    @Override // defpackage.oo5
    public final void a() {
        Object obj = this.e;
        if (obj != null) {
            try {
                this.c.a(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.oo5
    public final Class b() {
        return this.c.b();
    }

    @Override // defpackage.oo5
    public final void d(h6f h6fVar, no5 no5Var) {
        try {
            Object d = this.c.d(this.d, this.a, this.b);
            this.e = d;
            no5Var.q(d);
        } catch (Resources.NotFoundException e) {
            no5Var.c(e);
        }
    }

    @Override // defpackage.oo5
    public final ep5 getDataSource() {
        return ep5.LOCAL;
    }

    @Override // defpackage.oo5
    public final void cancel() {
    }
}
