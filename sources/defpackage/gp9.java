package defpackage;

import android.content.Context;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gp9 {
    public final Context a;
    public final Object b;
    public final uoi c;
    public final Map d;
    public final s08 e;
    public final rx5 f;
    public final CoroutineContext g;
    public final CoroutineContext h;
    public final CoroutineContext i;
    public final it2 j;
    public final it2 k;
    public final it2 l;
    public final Function1 m;
    public final Function1 n;
    public final Function1 o;
    public final o9h p;
    public final qhg q;
    public final b1f r;
    public final xu7 s;
    public final ep9 t;
    public final dp9 u;

    public gp9(Context context, Object obj, uoi uoiVar, Map map, s08 s08Var, rx5 rx5Var, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, it2 it2Var, it2 it2Var2, it2 it2Var3, Function1 function1, Function1 function12, Function1 function13, o9h o9hVar, qhg qhgVar, b1f b1fVar, xu7 xu7Var, ep9 ep9Var, dp9 dp9Var) {
        this.a = context;
        this.b = obj;
        this.c = uoiVar;
        this.d = map;
        this.e = s08Var;
        this.f = rx5Var;
        this.g = coroutineContext;
        this.h = coroutineContext2;
        this.i = coroutineContext3;
        this.j = it2Var;
        this.k = it2Var2;
        this.l = it2Var3;
        this.m = function1;
        this.n = function12;
        this.o = function13;
        this.p = o9hVar;
        this.q = qhgVar;
        this.r = b1fVar;
        this.s = xu7Var;
        this.t = ep9Var;
        this.u = dp9Var;
    }

    public static bp9 a(gp9 gp9Var) {
        Context context = gp9Var.a;
        gp9Var.getClass();
        return new bp9(gp9Var, context);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gp9) {
                gp9 gp9Var = (gp9) obj;
                if (!Intrinsics.areEqual(this.a, gp9Var.a) || !Intrinsics.areEqual(this.b, gp9Var.b) || !Intrinsics.areEqual(this.c, gp9Var.c) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.d, gp9Var.d) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.e, gp9Var.e) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.f, gp9Var.f) || !Intrinsics.areEqual(this.g, gp9Var.g) || !Intrinsics.areEqual(this.h, gp9Var.h) || !Intrinsics.areEqual(this.i, gp9Var.i) || this.j != gp9Var.j || this.k != gp9Var.k || this.l != gp9Var.l || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.m, gp9Var.m) || !Intrinsics.areEqual(this.n, gp9Var.n) || !Intrinsics.areEqual(this.o, gp9Var.o) || !Intrinsics.areEqual(this.p, gp9Var.p) || this.q != gp9Var.q || this.r != gp9Var.r || !Intrinsics.areEqual(this.s, gp9Var.s) || !Intrinsics.areEqual(this.t, gp9Var.t) || !Intrinsics.areEqual(this.u, gp9Var.u)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = 0;
        uoi uoiVar = this.c;
        if (uoiVar == null) {
            hashCode = 0;
        } else {
            hashCode = uoiVar.hashCode();
        }
        int hashCode3 = (this.e.hashCode() + sv6.c(this.d, (hashCode2 + hashCode) * 29791, 961)) * 961;
        rx5 rx5Var = this.f;
        if (rx5Var != null) {
            i = rx5Var.hashCode();
        }
        return this.u.hashCode() + ((this.t.hashCode() + sv6.c(this.s.a, (this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((hashCode3 + i) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.a + ", data=" + this.b + ", target=" + this.c + ", listener=null, memoryCacheKey=null, memoryCacheKeyExtras=" + this.d + ", diskCacheKey=null, fileSystem=" + this.e + ", fetcherFactory=null, decoderFactory=" + this.f + ", interceptorCoroutineContext=" + this.g + ", fetcherCoroutineContext=" + this.h + ", decoderCoroutineContext=" + this.i + ", memoryCachePolicy=" + this.j + ", diskCachePolicy=" + this.k + ", networkCachePolicy=" + this.l + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.m + ", errorFactory=" + this.n + ", fallbackFactory=" + this.o + ", sizeResolver=" + this.p + ", scale=" + this.q + ", precision=" + this.r + ", extras=" + this.s + ", defined=" + this.t + ", defaults=" + this.u + ")";
    }
}
