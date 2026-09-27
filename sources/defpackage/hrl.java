package defpackage;

import java.util.Arrays;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class hrl implements xic {
    public static final hw6 a = new Object();

    public static final void a(Object obj, Object obj2, Function1 function1, pq4 pq4Var) {
        sr8 sr8Var = (sr8) pq4Var;
        boolean h = sr8Var.h(obj) | sr8Var.h(obj2);
        Object Q = sr8Var.Q();
        if (h || Q == oq4.a) {
            Q = new fw6(function1);
            sr8Var.o0(Q);
        }
    }

    public static final void b(Object obj, Function1 function1, pq4 pq4Var) {
        sr8 sr8Var = (sr8) pq4Var;
        boolean h = sr8Var.h(obj);
        Object Q = sr8Var.Q();
        if (h || Q == oq4.a) {
            Q = new fw6(function1);
            sr8Var.o0(Q);
        }
    }

    public static final void c(Object[] objArr, Function1 function1, pq4 pq4Var) {
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= ((sr8) pq4Var).h(obj);
        }
        sr8 sr8Var = (sr8) pq4Var;
        Object Q = sr8Var.Q();
        if (!z && Q != oq4.a) {
            return;
        }
        sr8Var.o0(new fw6(function1));
    }

    public static final void d(pq4 pq4Var, Object obj, Function2 function2) {
        CoroutineContext coroutineContext = ((sr8) pq4Var).R;
        sr8 sr8Var = (sr8) pq4Var;
        boolean h = sr8Var.h(obj);
        Object Q = sr8Var.Q();
        if (h || Q == oq4.a) {
            Q = new bwa(coroutineContext, function2);
            sr8Var.o0(Q);
        }
    }

    public static final void e(Object obj, Object obj2, Object obj3, Function2 function2, pq4 pq4Var) {
        CoroutineContext coroutineContext = ((sr8) pq4Var).R;
        sr8 sr8Var = (sr8) pq4Var;
        boolean h = sr8Var.h(obj) | sr8Var.h(obj2) | sr8Var.h(obj3);
        Object Q = sr8Var.Q();
        if (h || Q == oq4.a) {
            Q = new bwa(coroutineContext, function2);
            sr8Var.o0(Q);
        }
    }

    public static final void f(Object obj, Object obj2, Function2 function2, pq4 pq4Var) {
        CoroutineContext coroutineContext = ((sr8) pq4Var).R;
        sr8 sr8Var = (sr8) pq4Var;
        boolean h = sr8Var.h(obj) | sr8Var.h(obj2);
        Object Q = sr8Var.Q();
        if (h || Q == oq4.a) {
            Q = new bwa(coroutineContext, function2);
            sr8Var.o0(Q);
        }
    }

    public static final void g(Object[] objArr, Function2 function2, pq4 pq4Var) {
        CoroutineContext coroutineContext = ((sr8) pq4Var).R;
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= ((sr8) pq4Var).h(obj);
        }
        sr8 sr8Var = (sr8) pq4Var;
        Object Q = sr8Var.Q();
        if (!z && Q != oq4.a) {
            return;
        }
        sr8Var.o0(new bwa(coroutineContext, function2));
    }

    public static final void h(Function0 function0, pq4 pq4Var) {
        xkd xkdVar = ((sr8) pq4Var).M.b.a;
        xkdVar.g(jkd.d);
        zkn.b(xkdVar, 0, function0);
    }

    public static final t85 i(g gVar, pq4 pq4Var) {
        ica icaVar = jca.C0;
        gVar.getClass();
        icaVar.getClass();
        return new dyf(((sr8) pq4Var).R, gVar);
    }

    public static int j(CharSequence charSequence, int i) {
        while (i < charSequence.length() && (charSequence.charAt(i) == ' ' || charSequence.charAt(i) == '\t')) {
            i++;
        }
        return i;
    }
}
