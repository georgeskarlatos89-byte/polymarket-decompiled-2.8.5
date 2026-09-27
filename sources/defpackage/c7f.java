package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c7f {
    public final int a;
    public final ky0 b;
    public final Rect c;
    public final int d;
    public final int e;
    public final Matrix f;
    public final s2g g;
    public final String h;
    public final ujb j;
    public int k = -1;
    public final ArrayList i = new ArrayList();

    public c7f(e33 e33Var, ky0 ky0Var, s2g s2gVar, ujb ujbVar, int i) {
        this.a = i;
        this.b = ky0Var;
        this.e = ky0Var.h;
        this.d = ky0Var.g;
        this.c = ky0Var.e;
        this.f = ky0Var.f;
        this.g = s2gVar;
        this.h = String.valueOf(e33Var.hashCode());
        List<q33> list = e33Var.a;
        Objects.requireNonNull(list);
        for (q33 q33Var : list) {
            ArrayList arrayList = this.i;
            q33Var.getClass();
            arrayList.add(0);
        }
        this.j = ujbVar;
    }
}
