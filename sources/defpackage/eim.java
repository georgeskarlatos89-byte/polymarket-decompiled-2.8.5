package defpackage;

import android.os.SystemClock;
import io.radar.sdk.util.RadarSimpleLogBuffer;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class eim implements Closeable {
    public static final HashMap f = new HashMap();
    public int a;
    public long b;
    public long c;
    public long d = 2147483647L;
    public long e = -2147483648L;

    public eim(String str) {
    }

    public static eim o(String str) {
        nim.y();
        nim.y();
        if (!Boolean.parseBoolean("")) {
            return vhm.g;
        }
        HashMap hashMap = f;
        if (hashMap.get(str) == null) {
            hashMap.put(str, new eim(str));
        }
        return (eim) hashMap.get(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        boolean z;
        if (this.b != 0) {
            z = true;
        } else {
            z = false;
        }
        tcn.c(z, "Did you forget to call start()?");
        g(this.b);
    }

    public void e(long j) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j2 = this.c;
        if (j2 != 0 && elapsedRealtimeNanos - j2 >= 1000000) {
            this.a = 0;
            this.b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
        this.c = elapsedRealtimeNanos;
        this.a++;
        this.d = Math.min(this.d, j);
        this.e = Math.max(this.e, j);
        if (this.a % 50 == 0) {
            Locale locale = Locale.US;
            nim.y();
        }
        if (this.a % RadarSimpleLogBuffer.MAX_PERSISTED_BUFFER_SIZE == 0) {
            this.a = 0;
            this.b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
    }

    public void g(long j) {
        e((SystemClock.elapsedRealtimeNanos() / 1000) - j);
    }

    public void zzb() {
        this.b = SystemClock.elapsedRealtimeNanos() / 1000;
    }
}
