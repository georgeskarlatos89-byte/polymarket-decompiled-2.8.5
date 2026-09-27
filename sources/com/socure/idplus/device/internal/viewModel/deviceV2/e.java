package com.socure.idplus.device.internal.viewModel.deviceV2;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.accessibility.CaptioningManager;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e extends Lambda implements Function2 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, a aVar) {
        super(2);
        this.a = context;
        this.b = aVar;
    }

    public final void a(String str, com.socure.idplus.device.internal.utils.a aVar) {
        aVar.getClass();
        Object systemService = this.a.getSystemService("captioning");
        systemService.getClass();
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        d dVar = new d(calendar, this.a, (CaptioningManager) systemService, aVar, str, System.currentTimeMillis() - SystemClock.elapsedRealtime(), Build.VERSION.SECURITY_PATCH);
        Handler handler = com.socure.idplus.device.internal.thread.b.a;
        com.socure.idplus.device.internal.thread.b.a(new f(0), new b(this.b, dVar), new c(this.b, dVar));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((String) obj, (com.socure.idplus.device.internal.utils.a) obj2);
        return Unit.INSTANCE;
    }

    public static final String a() {
        return com.socure.idplus.device.internal.utils.f.a();
    }
}
