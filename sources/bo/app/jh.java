package bo.app;

import defpackage.ace;
import defpackage.b69;
import defpackage.bl1;
import defpackage.om1;
import defpackage.pm1;
import defpackage.pyk;
import defpackage.yyk;
import defpackage.zv5;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jh {
    public final boolean a(pa paVar, rh rhVar, long j, long j2) {
        long j3;
        if (paVar instanceof vg) {
            b69.h(this, null, null, false, new pyk(13), 7);
            return true;
        }
        long f = zv5.f();
        long j4 = f + r14.d;
        int i = rhVar.b.g;
        if (i != -1) {
            b69.h(this, null, null, false, new om1(i, 27), 7);
            j3 = j + i;
        } else {
            j3 = j + j2;
        }
        long j5 = j3;
        if (j4 >= j5) {
            b69.h(this, pm1.I, null, false, new bl1(1, j4, j5), 6);
            return true;
        }
        b69.h(this, pm1.I, null, false, new yyk(0, j2, j5, j4), 6);
        return false;
    }

    public static final String a() {
        return "Ignoring minimum time interval between triggered actions because the trigger event is a test.";
    }

    public static final String a(int i) {
        return ace.f(i, "Using override minimum display interval: ");
    }

    public static final String a(long j, long j2) {
        StringBuilder p = ace.p(j, "Minimum time interval requirement met for matched trigger. Action display time: ", " . Next viable display time: ");
        p.append(j2);
        return p.toString();
    }

    public static final String a(long j, long j2, long j3) {
        StringBuilder p = ace.p(j, "Minimum time interval requirement and triggered action override time interval requirement of ", " not met for matched trigger. Returning null. Next viable display time: ");
        p.append(j2);
        p.append(". Action display time: ");
        p.append(j3);
        return p.toString();
    }
}
