package defpackage;

import android.os.WorkSource;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zf5 {
    public long a = 10000;
    public int b = 102;
    public long c = Long.MAX_VALUE;

    public final ag5 a() {
        return new ag5(this.a, 0, this.b, this.c, false, 0, new WorkSource(null), null);
    }

    public final void b(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        arn.a("durationMillis must be greater than 0", z);
        this.c = j;
    }
}
