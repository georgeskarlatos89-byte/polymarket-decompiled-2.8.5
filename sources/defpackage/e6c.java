package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class e6c {
    public final MeasurementManager a;

    public e6c(MeasurementManager measurementManager) {
        measurementManager.getClass();
        this.a = measurementManager;
    }

    public static Object b(e6c e6cVar, zk6 zk6Var, Continuation<? super Unit> continuation) {
        new m23(1, m7a.b(continuation)).t();
        MeasurementManager measurementManager = e6cVar.a;
        throw null;
    }

    public static Object d(e6c e6cVar, Continuation<? super Integer> continuation) {
        m23 m23Var = new m23(1, m7a.b(continuation));
        m23Var.t();
        z39.t(e6cVar.a, new bk0(1), new s55(m23Var));
        Object r = m23Var.r();
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        return r;
    }

    public static Object g(e6c e6cVar, lfh lfhVar, Continuation<? super Unit> continuation) {
        Object f = qsn.f(new mx7(e6cVar, null, 10), continuation);
        if (f == u85.COROUTINE_SUSPENDED) {
            return f;
        }
        return Unit.INSTANCE;
    }

    public static Object h(e6c e6cVar, Uri uri, InputEvent inputEvent, Continuation<? super Unit> continuation) {
        m23 m23Var = new m23(1, m7a.b(continuation));
        m23Var.t();
        z39.v(e6cVar.a, uri, inputEvent, new bk0(1), new s55(m23Var));
        Object r = m23Var.r();
        if (r == u85.COROUTINE_SUSPENDED) {
            return r;
        }
        return Unit.INSTANCE;
    }

    public static Object j(e6c e6cVar, Uri uri, Continuation<? super Unit> continuation) {
        m23 m23Var = new m23(1, m7a.b(continuation));
        m23Var.t();
        z39.u(e6cVar.a, uri, new bk0(1), new s55(m23Var));
        Object r = m23Var.r();
        if (r == u85.COROUTINE_SUSPENDED) {
            return r;
        }
        return Unit.INSTANCE;
    }

    public static Object l(e6c e6cVar, dik dikVar, Continuation<? super Unit> continuation) {
        new m23(1, m7a.b(continuation)).t();
        MeasurementManager measurementManager = e6cVar.a;
        throw null;
    }

    public static Object n(e6c e6cVar, eik eikVar, Continuation<? super Unit> continuation) {
        new m23(1, m7a.b(continuation)).t();
        MeasurementManager measurementManager = e6cVar.a;
        throw null;
    }

    public Object a(zk6 zk6Var, Continuation<? super Unit> continuation) {
        return b(this, zk6Var, continuation);
    }

    public Object c(Continuation<? super Integer> continuation) {
        return d(this, continuation);
    }

    public Object e(lfh lfhVar, Continuation<? super Unit> continuation) {
        return g(this, lfhVar, continuation);
    }

    public Object f(Uri uri, InputEvent inputEvent, Continuation<? super Unit> continuation) {
        return h(this, uri, inputEvent, continuation);
    }

    public Object i(Uri uri, Continuation<? super Unit> continuation) {
        return j(this, uri, continuation);
    }

    public Object k(dik dikVar, Continuation<? super Unit> continuation) {
        return l(this, dikVar, continuation);
    }

    public Object m(eik eikVar, Continuation<? super Unit> continuation) {
        return n(this, eikVar, continuation);
    }
}
