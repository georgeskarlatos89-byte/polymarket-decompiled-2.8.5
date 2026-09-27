package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class q9a extends hoe {
    @Override // defpackage.hoe
    public final void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        Integer num = p9a.b;
        if (num != null && num.intValue() < 19) {
            super.a(th, th2);
        } else {
            th.addSuppressed(th2);
        }
    }

    @Override // defpackage.hoe
    public final List b(Throwable th) {
        th.getClass();
        Integer num = p9a.b;
        if (num != null && num.intValue() < 19) {
            return super.b(th);
        }
        Throwable[] suppressed = th.getSuppressed();
        suppressed.getClass();
        List asList = Arrays.asList(suppressed);
        asList.getClass();
        return asList;
    }
}
