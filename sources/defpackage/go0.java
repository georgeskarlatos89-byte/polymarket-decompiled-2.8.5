package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class go0 {
    public static ko0 a() {
        ko0 ko0Var = ko0.access$getQueue$cp().b[1];
        if (ko0Var == null) {
            long nanoTime = System.nanoTime();
            ko0.access$getCondition$cp().await(ko0.access$getIDLE_TIMEOUT_MILLIS$cp(), TimeUnit.MILLISECONDS);
            if (ko0.access$getQueue$cp().b[1] != null || System.nanoTime() - nanoTime < ko0.access$getIDLE_TIMEOUT_NANOS$cp()) {
                return null;
            }
            return ko0.access$getIdleSentinel$cp();
        }
        long remainingNanos$okio = ko0Var.remainingNanos$okio(System.nanoTime());
        if (remainingNanos$okio > 0) {
            ko0.access$getCondition$cp().await(remainingNanos$okio, TimeUnit.NANOSECONDS);
            return null;
        }
        ko0.access$getQueue$cp().b(ko0Var);
        ko0.access$setState$p(ko0Var, 2);
        return ko0Var;
    }

    public static void b(ko0 ko0Var) {
        if (ko0.access$getIdleSentinel$cp() == null) {
            ko0.access$setIdleSentinel$cp(new ko0());
            Thread thread = new Thread("Okio Watchdog");
            thread.setDaemon(true);
            thread.start();
        }
        ko0.setTimeoutAt$okio$default(ko0Var, 0L, 1, null);
        k6f access$getQueue$cp = ko0.access$getQueue$cp();
        access$getQueue$cp.getClass();
        int i = access$getQueue$cp.a + 1;
        access$getQueue$cp.a = i;
        ko0[] ko0VarArr = access$getQueue$cp.b;
        if (i == ko0VarArr.length) {
            ko0[] ko0VarArr2 = new ko0[i * 2];
            ArraysKt.p(0, 0, 14, ko0VarArr, ko0VarArr2);
            access$getQueue$cp.b = ko0VarArr2;
        }
        access$getQueue$cp.a(ko0Var, i);
        if (ko0Var.index == 1) {
            ko0.access$getCondition$cp().signal();
        }
    }
}
