package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ddg implements Lazy, Serializable {
    public static final cdg c = new cdg(null);
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(ddg.class, Object.class, "b");
    public static final /* synthetic */ long e = oo4.a.objectFieldOffset(ddg.class.getDeclaredField("b"));
    public volatile Function0 a;
    public volatile Object b;

    @Override // kotlin.Lazy
    public final boolean b() {
        if (this.b != nkj.a) {
            return true;
        }
        return false;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        ddg ddgVar;
        Object obj = this.b;
        nkj nkjVar = nkj.a;
        if (obj != nkjVar) {
            return obj;
        }
        Function0 function0 = this.a;
        if (function0 != null) {
            Object invoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                ddgVar = this;
                if (oo4.a.compareAndSwapObject(ddgVar, e, nkjVar, invoke)) {
                    ddgVar.a = null;
                    return invoke;
                }
                if (oo4.a.getObjectVolatile(ddgVar, e) != nkjVar) {
                    break;
                }
                this = ddgVar;
            }
        } else {
            ddgVar = this;
        }
        return ddgVar.b;
    }

    public final String toString() {
        if (b()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
