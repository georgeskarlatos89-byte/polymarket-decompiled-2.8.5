package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class u74 {
    public final Throwable a;

    public u74(Throwable th) {
        this.a = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Throwable a(Function1 function1) {
        Throwable th = this.a;
        if (th == 0) {
            return null;
        }
        if (th instanceof y65) {
            return ((y65) th).a();
        }
        if (th instanceof CancellationException) {
            return mok.c(((CancellationException) th).getMessage(), th);
        }
        return (Throwable) function1.invoke(th);
    }
}
