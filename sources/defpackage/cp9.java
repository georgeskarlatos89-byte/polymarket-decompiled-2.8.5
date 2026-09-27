package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import okhttp3.Headers;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cp9 {
    public final Context a;
    public cc6 b;
    public Object c;
    public woi d;
    public fp9 e;
    public s9c f;
    public String g;
    public c1f h;
    public List i;
    public acj j;
    public final Headers.Builder k;
    public final LinkedHashMap l;
    public g85 m;
    public g85 n;
    public g85 o;
    public uud p;
    public Integer q;
    public Drawable r;
    public Integer s;
    public Drawable t;
    public p9h u;
    public phg v;
    public p6b w;
    public p9h x;
    public phg y;

    public cp9(Context context, ip9 ip9Var) {
        this.a = context;
        this.b = ip9Var.E;
        this.c = ip9Var.b;
        this.d = ip9Var.c;
        this.e = ip9Var.d;
        this.f = ip9Var.e;
        this.g = ip9Var.f;
        zi6 zi6Var = ip9Var.D;
        this.h = zi6Var.g;
        this.i = ip9Var.i;
        this.j = zi6Var.f;
        this.k = ip9Var.k.newBuilder();
        this.l = d1c.p(ip9Var.l.a);
        this.m = zi6Var.c;
        this.n = zi6Var.d;
        this.o = zi6Var.e;
        this.p = new uud(ip9Var.y);
        this.q = ip9Var.z;
        this.r = ip9Var.A;
        this.s = ip9Var.B;
        this.t = ip9Var.C;
        this.u = zi6Var.a;
        this.v = zi6Var.b;
        if (ip9Var.a == context) {
            this.w = ip9Var.v;
            this.x = ip9Var.w;
            this.y = ip9Var.x;
        } else {
            this.w = null;
            this.x = null;
            this.y = null;
        }
    }

    public final ip9 a() {
        Headers headers;
        wki wkiVar;
        p6b p6bVar;
        Object obj;
        xud xudVar;
        rqf rqfVar;
        jq9 jq9Var;
        KeyEvent.Callback callback;
        int i;
        Object obj2;
        Object obj3 = this.c;
        if (obj3 == null) {
            obj3 = ndg.m;
        }
        Object obj4 = obj3;
        woi woiVar = this.d;
        fp9 fp9Var = this.e;
        s9c s9cVar = this.f;
        String str = this.g;
        cc6 cc6Var = this.b;
        Bitmap.Config config = cc6Var.g;
        c1f c1fVar = this.h;
        if (c1fVar == null) {
            c1fVar = cc6Var.f;
        }
        c1f c1fVar2 = c1fVar;
        List list = this.i;
        acj acjVar = this.j;
        if (acjVar == null) {
            acjVar = cc6Var.e;
        }
        acj acjVar2 = acjVar;
        Headers.Builder builder = this.k;
        if (builder != null) {
            headers = builder.build();
        } else {
            headers = null;
        }
        if (headers == null) {
            headers = r.c;
        } else {
            Bitmap.Config[] configArr = r.a;
        }
        Headers headers2 = headers;
        LinkedHashMap linkedHashMap = this.l;
        if (linkedHashMap != null) {
            wkiVar = new wki(d6n.e(linkedHashMap));
        } else {
            wkiVar = null;
        }
        if (wkiVar == null) {
            wkiVar = wki.b;
        }
        wki wkiVar2 = wkiVar;
        cc6 cc6Var2 = this.b;
        boolean z = cc6Var2.h;
        boolean z2 = cc6Var2.i;
        jt2 jt2Var = cc6Var2.m;
        jt2 jt2Var2 = cc6Var2.n;
        jt2 jt2Var3 = cc6Var2.o;
        g85 g85Var = cc6Var2.a;
        g85 g85Var2 = this.m;
        if (g85Var2 == null) {
            g85Var2 = cc6Var2.b;
        }
        g85 g85Var3 = g85Var2;
        g85 g85Var4 = this.n;
        if (g85Var4 == null) {
            g85Var4 = cc6Var2.c;
        }
        g85 g85Var5 = g85Var4;
        g85 g85Var6 = this.o;
        if (g85Var6 == null) {
            g85Var6 = cc6Var2.d;
        }
        g85 g85Var7 = g85Var6;
        p6b p6bVar2 = this.w;
        Context context = this.a;
        if (p6bVar2 == null) {
            woi woiVar2 = this.d;
            if (woiVar2 instanceof jq9) {
                obj2 = ((jq9) woiVar2).b.getContext();
            } else {
                obj2 = context;
            }
            while (true) {
                if (obj2 instanceof LifecycleOwner) {
                    p6bVar2 = ((LifecycleOwner) obj2).getLifecycle();
                    break;
                }
                if (!(obj2 instanceof ContextWrapper)) {
                    p6bVar2 = null;
                    break;
                }
                obj2 = ((ContextWrapper) obj2).getBaseContext();
            }
            if (p6bVar2 == null) {
                p6bVar2 = lw8.b;
            }
        }
        p9h p9hVar = this.u;
        if (p9hVar == null && (p9hVar = this.x) == null) {
            woi woiVar3 = this.d;
            p6bVar = p6bVar2;
            if (woiVar3 instanceof jq9) {
                ImageView imageView = ((jq9) woiVar3).b;
                if (imageView != null) {
                    ImageView.ScaleType scaleType = imageView.getScaleType();
                    obj = obj4;
                    if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                        p9hVar = new jqf(b9h.c);
                    }
                } else {
                    obj = obj4;
                }
                p9hVar = new rqf(imageView);
            } else {
                obj = obj4;
                p9hVar = new vv6(context);
            }
        } else {
            p6bVar = p6bVar2;
            obj = obj4;
        }
        phg phgVar = this.v;
        if (phgVar == null && (phgVar = this.y) == null) {
            p9h p9hVar2 = this.u;
            if (p9hVar2 instanceof rqf) {
                rqfVar = (rqf) p9hVar2;
            } else {
                rqfVar = null;
            }
            if (rqfVar == null || (callback = rqfVar.a) == null) {
                woi woiVar4 = this.d;
                if (woiVar4 instanceof jq9) {
                    jq9Var = (jq9) woiVar4;
                } else {
                    jq9Var = null;
                }
                if (jq9Var != null) {
                    callback = jq9Var.b;
                } else {
                    callback = null;
                }
            }
            if (callback instanceof ImageView) {
                Bitmap.Config[] configArr2 = r.a;
                ImageView.ScaleType scaleType2 = ((ImageView) callback).getScaleType();
                if (scaleType2 == null) {
                    i = -1;
                } else {
                    i = q.a[scaleType2.ordinal()];
                }
                if (i != 1 && i != 2 && i != 3 && i != 4) {
                    phgVar = phg.FILL;
                } else {
                    phgVar = phg.FIT;
                }
            } else {
                phgVar = phg.FIT;
            }
        }
        uud uudVar = this.p;
        phg phgVar2 = phgVar;
        if (uudVar != null) {
            xudVar = new xud(d6n.e(uudVar.a));
        } else {
            xudVar = null;
        }
        if (xudVar == null) {
            xudVar = xud.b;
        }
        return new ip9(context, obj, woiVar, fp9Var, s9cVar, str, config, c1fVar2, list, acjVar2, headers2, wkiVar2, z, z2, jt2Var, jt2Var2, jt2Var3, g85Var, g85Var3, g85Var5, g85Var7, p6bVar, p9hVar, phgVar2, xudVar, this.q, this.r, this.s, this.t, new zi6(this.u, this.v, this.m, this.n, this.o, this.j, this.h), this.b);
    }

    public final void b() {
        this.j = new ff5(100);
    }

    public final void c(int i) {
        this.s = Integer.valueOf(i);
        this.t = null;
    }

    public final void d() {
        this.w = null;
        this.x = null;
        this.y = null;
    }

    public final void e(int i, int i2) {
        this.u = new jqf(new b9h(new bt6(i), new bt6(i2)));
        d();
    }

    public final void f(ImageView imageView) {
        this.d = new jq9(imageView);
        d();
    }

    public cp9(Context context) {
        this.a = context;
        this.b = o.a;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = CollectionsKt.emptyList();
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
    }
}
