package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class q55 extends l81 {
    private final CoroutineContext _context;
    private transient Continuation<Object> intercepted;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q55(Continuation continuation) {
        this(continuation, r0);
        CoroutineContext coroutineContext;
        if (continuation != null) {
            coroutineContext = continuation.getContext();
        } else {
            coroutineContext = null;
        }
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        coroutineContext.getClass();
        return coroutineContext;
    }

    public final Continuation<Object> intercepted() {
        Continuation<Object> continuation;
        Continuation<Object> continuation2 = this.intercepted;
        if (continuation2 == null) {
            d dVar = (d) getContext().get(d.d1);
            if (dVar != null) {
                continuation = new fv6((g85) dVar, this);
            } else {
                continuation = this;
            }
            this.intercepted = continuation;
            return continuation;
        }
        return continuation2;
    }

    @Override // defpackage.l81
    public void releaseIntercepted() {
        Unsafe unsafe;
        long j;
        m23 m23Var;
        Continuation<Object> continuation = this.intercepted;
        if (continuation != null && continuation != this) {
            CoroutineContext.Element element = getContext().get(d.d1);
            element.getClass();
            ((g85) ((d) element)).getClass();
            fv6 fv6Var = (fv6) continuation;
            do {
                unsafe = oo4.a;
                j = fv6.h;
            } while (unsafe.getObjectVolatile(fv6Var, j) == sql.b);
            Object objectVolatile = unsafe.getObjectVolatile(fv6Var, j);
            if (objectVolatile instanceof m23) {
                m23Var = (m23) objectVolatile;
            } else {
                m23Var = null;
            }
            if (m23Var != null) {
                m23Var.n();
            }
        }
        this.intercepted = tj4.a;
    }

    public q55(Continuation continuation, CoroutineContext coroutineContext) {
        super(continuation);
        this._context = coroutineContext;
    }
}
