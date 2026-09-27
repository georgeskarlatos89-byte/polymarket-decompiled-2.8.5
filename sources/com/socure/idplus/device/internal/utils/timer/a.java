package com.socure.idplus.device.internal.utils.timer;

import android.os.Handler;
import android.os.Looper;
import com.socure.idplus.device.internal.common.utils.b;
import com.socure.idplus.device.internal.m;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a {
    public final Handler a;

    public a() {
        Looper mainLooper = Looper.getMainLooper();
        mainLooper.getClass();
        mainLooper.getClass();
        Handler createAsync = Handler.createAsync(mainLooper);
        createAsync.getClass();
        this.a = createAsync;
    }

    public final Runnable a(m mVar) {
        mVar.getClass();
        b bVar = new b(mVar, 1);
        this.a.postDelayed(bVar, 800L);
        return bVar;
    }

    public static final void a(Function0 function0) {
        function0.invoke();
    }
}
