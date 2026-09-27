package io.sentry.android.core.performance;

import android.os.SystemClock;
import io.sentry.u5;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class g implements Comparable {
    public String a;
    public long b;
    public long c;
    public long d;

    public final long a() {
        if (e()) {
            return this.d - this.c;
        }
        return 0L;
    }

    public final u5 b() {
        if (d()) {
            return new u5(this.b * 1000000);
        }
        return null;
    }

    public final boolean c() {
        if (this.d == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.b, ((g) obj).b);
    }

    public final boolean d() {
        if (this.c != 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.d != 0) {
            return true;
        }
        return false;
    }

    public final void f(long j) {
        this.c = j;
        this.b = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.c);
    }
}
