package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;
import kotlin.coroutines.b;
import kotlin.coroutines.d;
import kotlin.coroutines.f;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class g85 extends a implements d {
    public static final f85 a = new f85(null);

    public g85() {
        super(d.d1);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        CoroutineContext.Element element;
        fVar.getClass();
        if (fVar instanceof b) {
            b bVar = (b) fVar;
            f key = getKey();
            key.getClass();
            if ((key == bVar || bVar.b == key) && (element = (CoroutineContext.Element) bVar.a.invoke(this)) != null) {
                return element;
            }
        } else if (d.d1 == fVar) {
            return this;
        }
        return null;
    }

    public abstract void m0(CoroutineContext coroutineContext, Runnable runnable);

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        fVar.getClass();
        if (fVar instanceof b) {
            b bVar = (b) fVar;
            f key = getKey();
            key.getClass();
            if (key != bVar && bVar.b != key) {
                return this;
            }
            if (((CoroutineContext.Element) bVar.a.invoke(this)) != null) {
                return g.a;
            }
            return this;
        }
        if (d.d1 == fVar) {
            return g.a;
        }
        return this;
    }

    public void p0(CoroutineContext coroutineContext, Runnable runnable) {
        sql.f(this, coroutineContext, runnable);
    }

    public boolean q0(CoroutineContext coroutineContext) {
        return !(this instanceof utj);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + pw5.f(this);
    }

    public g85 y0(int i) {
        k6n.c(i);
        return new d8b(this, i);
    }
}
