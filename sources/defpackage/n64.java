package defpackage;

import java.io.Closeable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class n64 implements Closeable {
    public final fr0 a;
    public final Object b;
    public final Function1 c;
    public Function0 d;

    public n64(fr0 fr0Var, Object obj, Function1 function1) {
        fr0Var.getClass();
        obj.getClass();
        this.a = fr0Var;
        this.b = obj;
        this.c = function1;
        this.d = new kz3(5);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.invoke();
    }
}
