package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.b;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class sql {
    public static final uk a = new uk("UNDEFINED", 8);
    public static final uk b = new uk("REUSABLE_CLAIMED", 8);

    public static float a(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float b(float f) {
        if (f <= 0.0031308f) {
            return f * 12.92f;
        }
        return (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int c(int i, float f, int i2) {
        if (i == i2 || f <= 0.0f) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float a2 = a(((i >> 16) & 255) / 255.0f);
        float a3 = a(((i >> 8) & 255) / 255.0f);
        float a4 = a((i & 255) / 255.0f);
        float a5 = a(((i2 >> 16) & 255) / 255.0f);
        float a6 = a(((i2 >> 8) & 255) / 255.0f);
        float a7 = a((i2 & 255) / 255.0f);
        float a8 = ix2.a(f3, f2, f, f2);
        float a9 = ix2.a(a5, a2, f, a2);
        float a10 = ix2.a(a6, a3, f, a3);
        float a11 = ix2.a(a7, a4, f, a4);
        float b2 = b(a9) * 255.0f;
        float b3 = b(a10) * 255.0f;
        return Math.round(b(a11) * 255.0f) | (Math.round(b2) << 16) | (Math.round(a8 * 255.0f) << 24) | (Math.round(b3) << 8);
    }

    public static void d(f2i f2iVar, Function2 function2) {
        for (Map.Entry entry : f2iVar.entries()) {
            function2.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static final void e(Object obj, Continuation continuation) {
        Object uj4Var;
        wtj wtjVar;
        if (continuation instanceof fv6) {
            fv6 fv6Var = (fv6) continuation;
            g85 g85Var = fv6Var.d;
            q55 q55Var = fv6Var.e;
            Throwable m883exceptionOrNullimpl = Result.m883exceptionOrNullimpl(obj);
            if (m883exceptionOrNullimpl == null) {
                uj4Var = obj;
            } else {
                uj4Var = new uj4(m883exceptionOrNullimpl, false);
            }
            if (g(g85Var, q55Var.getContext())) {
                fv6Var.f = uj4Var;
                fv6Var.c = 1;
                f(g85Var, q55Var.getContext(), fv6Var);
                return;
            }
            fzi.a.getClass();
            on7 a2 = fzi.a();
            if (a2.b >= 4294967296L) {
                fv6Var.f = uj4Var;
                fv6Var.c = 1;
                a2.C0(fv6Var);
                return;
            }
            a2.E0(true);
            try {
                jca jcaVar = (jca) q55Var.getContext().get(jca.C0);
                if (jcaVar != null && !jcaVar.isActive()) {
                    fv6Var.resumeWith(Result.m882constructorimpl(ResultKt.createFailure(jcaVar.z())));
                } else {
                    Object obj2 = fv6Var.g;
                    CoroutineContext context = q55Var.getContext();
                    Object c = b.c(context, obj2);
                    if (c != b.a) {
                        wtjVar = c85.c(q55Var, context, c);
                    } else {
                        wtjVar = null;
                    }
                    try {
                        q55Var.resumeWith(obj);
                    } finally {
                        if (wtjVar == null || wtjVar.t0()) {
                            b.a(context, c);
                        }
                    }
                }
                do {
                } while (a2.S0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        continuation.resumeWith(obj);
    }

    public static final void f(g85 g85Var, CoroutineContext coroutineContext, Runnable runnable) {
        try {
            g85Var.m0(coroutineContext, runnable);
        } catch (Throwable th) {
            throw new av6(th, g85Var, coroutineContext);
        }
    }

    public static final boolean g(g85 g85Var, CoroutineContext coroutineContext) {
        try {
            return g85Var.q0(coroutineContext);
        } catch (Throwable th) {
            throw new av6(th, g85Var, coroutineContext);
        }
    }
}
