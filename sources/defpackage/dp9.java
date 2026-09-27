package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dp9 {
    public static final dp9 o;
    public final s08 a;
    public final CoroutineContext b;
    public final CoroutineContext c;
    public final CoroutineContext d;
    public final it2 e;
    public final it2 f;
    public final it2 g;
    public final Function1 h;
    public final Function1 i;
    public final Function1 j;
    public final o9h k;
    public final qhg l;
    public final b1f m;
    public final xu7 n;

    static {
        v6h v6hVar = v6h.B;
        s08 s08Var = s08.SYSTEM;
        g gVar = g.a;
        mv6 mv6Var = mv6.a;
        a66 a66Var = a66.c;
        it2 it2Var = it2.ENABLED;
        o = new dp9(s08Var, gVar, a66Var, a66Var, it2Var, it2Var, it2Var, v6hVar, v6hVar, v6hVar, o9h.G0, qhg.FIT, b1f.EXACT, xu7.b);
    }

    public dp9(s08 s08Var, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, it2 it2Var, it2 it2Var2, it2 it2Var3, Function1 function1, Function1 function12, Function1 function13, o9h o9hVar, qhg qhgVar, b1f b1fVar, xu7 xu7Var) {
        this.a = s08Var;
        this.b = coroutineContext;
        this.c = coroutineContext2;
        this.d = coroutineContext3;
        this.e = it2Var;
        this.f = it2Var2;
        this.g = it2Var3;
        this.h = function1;
        this.i = function12;
        this.j = function13;
        this.k = o9hVar;
        this.l = qhgVar;
        this.m = b1fVar;
        this.n = xu7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp9)) {
            return false;
        }
        dp9 dp9Var = (dp9) obj;
        if (Intrinsics.areEqual(this.a, dp9Var.a) && Intrinsics.areEqual(this.b, dp9Var.b) && Intrinsics.areEqual(this.c, dp9Var.c) && Intrinsics.areEqual(this.d, dp9Var.d) && this.e == dp9Var.e && this.f == dp9Var.f && this.g == dp9Var.g && Intrinsics.areEqual(this.h, dp9Var.h) && Intrinsics.areEqual(this.i, dp9Var.i) && Intrinsics.areEqual(this.j, dp9Var.j) && Intrinsics.areEqual(this.k, dp9Var.k) && this.l == dp9Var.l && this.m == dp9Var.m && Intrinsics.areEqual(this.n, dp9Var.n)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.n.a.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + this.m + ", extras=" + this.n + ")";
    }
}
