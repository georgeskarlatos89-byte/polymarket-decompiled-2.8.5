package defpackage;

import kotlin.time.TimeMark;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class fkc implements h2j {
    public static final fkc a = new Object();
    public static final long b = System.nanoTime();

    public static long b() {
        return System.nanoTime() - b;
    }

    @Override // defpackage.h2j
    public final TimeMark a() {
        return new f2j(b());
    }

    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
