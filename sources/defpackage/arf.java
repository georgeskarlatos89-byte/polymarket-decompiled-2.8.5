package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class arf {
    public final vr a;
    public final t85 b;
    public final gvd c;
    public boolean d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public xqf j;
    public muh k;

    public arf(vr vrVar, t85 t85Var) {
        vrVar.getClass();
        t85Var.getClass();
        this.a = vrVar;
        this.b = t85Var;
        this.c = new gvd(0.0f);
        this.j = xqf.FromCompact;
    }

    public static float g(arf arfVar, float f) {
        float f2 = arfVar.g;
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        return (1.0f - (1.0f / (((f * 0.25f) / f2) + 1.0f))) * f2;
    }

    public final void a(vqf vqfVar, float f) {
        vqfVar.getClass();
        muh muhVar = this.k;
        if (muhVar != null) {
            ica icaVar = jca.C0;
            muhVar.e(null);
        }
        this.k = coc.c(this.b, null, null, new zqf(this, vqfVar, f, (Continuation) null), 3);
    }

    public final void b() {
        xqf xqfVar;
        muh muhVar = this.k;
        Object obj = null;
        if (muhVar != null) {
            ica icaVar = jca.C0;
            muhVar.e(null);
        }
        this.d = true;
        this.i = 0.0f;
        float c = this.g - c();
        this.h = c;
        Iterator it = CollectionsKt.listOf(new Pair(xqf.FromCompact, Float.valueOf(this.e)), new Pair(xqf.FromExpanded, Float.valueOf(this.f)), new Pair(xqf.FromFullScreen, Float.valueOf(this.g))).iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(((Number) ((Pair) obj).getSecond()).floatValue() - c);
                do {
                    Object next = it.next();
                    float abs2 = Math.abs(((Number) ((Pair) next).getSecond()).floatValue() - c);
                    if (Float.compare(abs, abs2) > 0) {
                        obj = next;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        }
        Pair pair = (Pair) obj;
        if (pair == null || (xqfVar = (xqf) pair.getFirst()) == null) {
            xqfVar = xqf.FromCompact;
        }
        this.j = xqfVar;
    }

    public final float c() {
        vr vrVar = this.a;
        if (Float.isNaN(vrVar.f.y())) {
            return ((h26) vrVar.b()).c(vqf.Compact);
        }
        return vrVar.f.y();
    }

    public final void d(float f) {
        y74 y74Var;
        if (!this.d) {
            b();
        }
        this.i += f;
        int i = yqf.b[this.j.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    y74Var = new y74(this.f, this.g);
                } else {
                    dmk.a();
                    return;
                }
            } else {
                y74Var = new y74(this.e, this.g);
            }
        } else {
            y74Var = new y74(this.e, this.f);
        }
        float f2 = y74Var.b;
        float f3 = y74Var.a;
        if (f2 <= f3) {
            return;
        }
        float f4 = this.h - this.i;
        if (f4 > f2) {
            h(g(this, f4 - f2));
        } else {
            float f5 = 0.0f;
            if (f4 < f3) {
                if (f3 > this.e) {
                    f5 = -g(this, f3 - f4);
                }
                h(f5);
                f2 = f3;
            } else {
                h(0.0f);
                f2 = f4;
            }
        }
        float c = (this.g - f2) - c();
        vr vrVar = this.a;
        float c2 = vrVar.c(c);
        vrVar.d();
        qr.b(vrVar.j, c2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void e(float f) {
        List listOf;
        vqf vqfVar;
        if (!this.d) {
            return;
        }
        this.d = false;
        float c = ((-f) * 0.2f) + (this.g - c());
        int i = yqf.b[this.j.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    listOf = CollectionsKt.listOf(vqf.Expanded, vqf.FullScreen);
                } else {
                    dmk.a();
                    return;
                }
            } else {
                listOf = CollectionsKt.listOf(vqf.Compact, vqf.Expanded, vqf.FullScreen);
            }
        } else {
            listOf = CollectionsKt.listOf(vqf.Compact, vqf.Expanded);
        }
        Iterator it = listOf.iterator();
        if (!it.hasNext()) {
            vqfVar = null;
        } else {
            ?? next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f((vqf) next) - c);
                do {
                    Object next2 = it.next();
                    float abs2 = Math.abs(f((vqf) next2) - c);
                    next = next;
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
            vqfVar = next;
        }
        vqf vqfVar2 = vqfVar;
        if (vqfVar2 == null) {
            vqfVar2 = (vqf) this.a.c.getValue();
        }
        a(vqfVar2, f);
    }

    public final float f(vqf vqfVar) {
        int i = yqf.a[vqfVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return this.g;
                }
                dmk.a();
                return 0.0f;
            }
            return this.f;
        }
        return this.e;
    }

    public final void h(float f) {
        this.c.z(f);
    }
}
