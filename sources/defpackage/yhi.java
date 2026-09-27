package defpackage;

import io.sentry.android.replay.p;
import io.sentry.android.replay.q;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class yhi {
    public volatile Object a;

    public boolean a(q qVar) {
        qVar.getClass();
        switch (p.a[((q) this.a).ordinal()]) {
            case 1:
                if (qVar == q.STARTED || qVar == q.CLOSED) {
                    return true;
                }
                return false;
            case 2:
                if (qVar == q.PAUSED || qVar == q.STOPPED || qVar == q.CLOSED) {
                    return true;
                }
                return false;
            case 3:
                if (qVar == q.PAUSED || qVar == q.STOPPED || qVar == q.CLOSED) {
                    return true;
                }
                return false;
            case 4:
                if (qVar == q.RESUMED || qVar == q.STOPPED || qVar == q.CLOSED) {
                    return true;
                }
                return false;
            case 5:
                if (qVar == q.STARTED || qVar == q.CLOSED) {
                    return true;
                }
                return false;
            case 6:
                return false;
            default:
                dmk.a();
                return false;
        }
    }
}
