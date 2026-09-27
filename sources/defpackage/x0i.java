package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class x0i {
    public static final t a = new t(4);

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Throwable a(Throwable th) {
        th.getClass();
        Throwable th2 = th;
        while (true) {
            if (th2 instanceof CancellationException) {
                CancellationException cancellationException = (CancellationException) th2;
                if (Intrinsics.areEqual(th2, cancellationException.getCause())) {
                    break;
                }
                th2 = cancellationException.getCause();
            } else {
                if (th2 == null) {
                    break;
                }
                return th2;
            }
        }
    }
}
