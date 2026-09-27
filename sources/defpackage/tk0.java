package defpackage;

import android.os.SystemClock;
import java.net.URL;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tk0 {
    public int a;
    public long b;
    public Object c;

    public tk0(long j, Exception exc) {
        this.b = SystemClock.elapsedRealtime() - j;
        if (exc instanceof v13) {
            this.a = 2;
            this.c = exc;
            return;
        }
        if (exc instanceof ov9) {
            Throwable cause = exc.getCause();
            exc = cause != null ? cause : exc;
            this.c = exc;
            if (exc instanceof p13) {
                this.a = 2;
                return;
            } else if (exc instanceof IllegalArgumentException) {
                this.a = 1;
                return;
            } else {
                this.a = 0;
                return;
            }
        }
        this.a = 0;
        this.c = exc;
    }

    public tk0(int i, URL url, long j) {
        this.a = i;
        this.c = url;
        this.b = j;
    }
}
