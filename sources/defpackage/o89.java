package defpackage;

import android.os.SystemClock;
import com.appsflyer.internal.l;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class o89 extends fa1 {
    public int g;

    @Override // defpackage.rr7
    public final int b() {
        return this.g;
    }

    @Override // defpackage.rr7
    public final Object i() {
        return null;
    }

    @Override // defpackage.rr7
    public final void l(long j, long j2, long j3, List list, h6c[] h6cVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!a(this.g, elapsedRealtime)) {
            return;
        }
        for (int i = this.b - 1; i >= 0; i--) {
            if (!a(i, elapsedRealtime)) {
                this.g = i;
                return;
            }
        }
        l.o();
    }

    @Override // defpackage.rr7
    public final int s() {
        return 0;
    }
}
