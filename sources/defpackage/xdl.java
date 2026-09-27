package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class xdl {
    public static final tdl a;

    static {
        tdl tdlVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            tdlVar = new tdl(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            tdlVar = new tdl(1);
        }
        a = tdlVar;
    }
}
