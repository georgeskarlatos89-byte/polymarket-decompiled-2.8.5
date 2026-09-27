package com.socure.idplus.device.internal.input.manager;

import com.socure.idplus.device.internal.behavior.model.AndroidNavigationContextProperties;
import com.socure.idplus.device.internal.behavior.model.NavigationContext;
import com.socure.idplus.device.internal.input.producer.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e {
    public final Function0 a;
    public final h b;
    public final b c;
    public String d;

    public e(com.socure.idplus.device.internal.thread.e eVar, boolean z) {
        b bVar;
        c cVar = c.a;
        eVar.getClass();
        cVar.getClass();
        this.a = cVar;
        this.b = new h(eVar);
        if (!z) {
            bVar = new b(new d(this));
        } else {
            bVar = null;
        }
        this.c = bVar;
        this.d = NavigationContext.UNSET;
    }

    public static void a(e eVar, String str, AndroidNavigationContextProperties androidNavigationContextProperties, int i) {
        boolean z;
        if ((i & 2) != 0) {
            androidNavigationContextProperties = null;
        }
        if ((i & 4) != 0) {
            z = false;
        } else {
            z = true;
        }
        eVar.getClass();
        str.getClass();
        if (z) {
            str.getClass();
            str = StringsKt.s0(str).toString();
        }
        if (Intrinsics.areEqual(str, eVar.d)) {
            return;
        }
        eVar.d = str;
        h hVar = eVar.b;
        NavigationContext navigationContext = new NavigationContext(str, ((Number) eVar.a.invoke()).longValue(), androidNavigationContextProperties);
        hVar.getClass();
        hVar.a(navigationContext);
    }
}
