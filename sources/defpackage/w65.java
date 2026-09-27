package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class w65 {
    private volatile /* synthetic */ Object current;

    static {
        AtomicReferenceFieldUpdater.newUpdater(w65.class, Object.class, "current");
    }

    public w65() {
        zc7 zc7Var = zc7.a;
        zc7Var.getClass();
        this.current = zc7Var;
    }

    public final Object a(Object obj) {
        obj.getClass();
        return ((Map) this.current).get(obj);
    }
}
