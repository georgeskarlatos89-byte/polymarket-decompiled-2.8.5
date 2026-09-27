package io.sentry.android.core.performance;

import android.os.Build;
import android.os.Looper;
import defpackage.l21;
import io.sentry.m1;
import io.sentry.t1;
import io.sentry.y4;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class a {
    public final String a;
    public y4 b = null;
    public y4 c = null;
    public m1 d = null;
    public m1 e = null;

    public a(String str) {
        this.a = str;
    }

    public static m1 a(m1 m1Var, String str, y4 y4Var) {
        long id;
        m1 d = m1Var.d(str, y4Var, t1.SENTRY);
        Thread thread = Looper.getMainLooper().getThread();
        io.sentry.android.core.internal.util.d dVar = io.sentry.android.core.internal.util.d.a;
        if (Build.VERSION.SDK_INT >= 36) {
            id = l21.c(thread);
        } else {
            id = thread.getId();
        }
        d.r(Long.valueOf(id), "thread.id");
        d.r("main", "thread.name");
        Boolean bool = Boolean.TRUE;
        d.r(bool, "ui.contributes_to_ttid");
        d.r(bool, "ui.contributes_to_ttfd");
        return d;
    }
}
