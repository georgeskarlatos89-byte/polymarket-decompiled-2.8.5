package io.sentry.android.core;

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class y1 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ y1(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                io.sentry.m1 m1Var = (io.sentry.m1) obj;
                io.sentry.m1 m1Var2 = (io.sentry.m1) obj2;
                if (m1Var == m1Var2) {
                    return 0;
                }
                int a = m1Var.z().a(m1Var2.z());
                if (a == 0) {
                    return m1Var.u().b.a().compareTo(m1Var2.u().b.a());
                }
                return a;
            case 1:
                return Float.compare((((io.sentry.android.core.anr.a) obj).b + 1.0f) * r3.f * r3.a, (((io.sentry.android.core.anr.a) obj2).b + 1.0f) * r4.f * r4.a);
            default:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
        }
    }
}
