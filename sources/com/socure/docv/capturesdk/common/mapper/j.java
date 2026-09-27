package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleDataResponse;
import com.socure.docv.capturesdk.models.c0;
import com.socure.docv.capturesdk.models.w0;
import com.socure.docv.capturesdk.models.x;
import defpackage.dmk;
import defpackage.q55;
import defpackage.u85;
import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class j {
    public final io.sentry.hints.j a;
    public final g b;

    public j(io.sentry.hints.j jVar, g gVar) {
        this.a = jVar;
        this.b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ModuleDataResponse moduleDataResponse, q55 q55Var) {
        i iVar;
        Object obj;
        u85 u85Var;
        int i;
        Object n;
        ModuleDataResponse moduleDataResponse2;
        String str;
        c0 c0Var;
        if (q55Var instanceof i) {
            iVar = (i) q55Var;
            int i2 = iVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.p = i2 - Integer.MIN_VALUE;
                obj = iVar.n;
                u85Var = u85.COROUTINE_SUSPENDED;
                i = iVar.p;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            c0Var = (c0) iVar.l;
                            str = (String) iVar.k;
                            ResultKt.a(obj);
                            return new w0(str, c0Var, (x) obj);
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str2 = iVar.m;
                    ModuleDataResponse moduleDataResponse3 = (ModuleDataResponse) iVar.l;
                    j jVar = (j) iVar.k;
                    ResultKt.a(obj);
                    str = str2;
                    this = jVar;
                    n = obj;
                    moduleDataResponse2 = moduleDataResponse3;
                } else {
                    ResultKt.a(obj);
                    String sessionToken = moduleDataResponse.getSessionToken();
                    if (sessionToken == null) {
                        sessionToken = "";
                    }
                    iVar.k = this;
                    iVar.l = moduleDataResponse;
                    iVar.m = sessionToken;
                    iVar.p = 1;
                    n = this.a.n(moduleDataResponse);
                    if (n != u85Var) {
                        String str3 = sessionToken;
                        moduleDataResponse2 = moduleDataResponse;
                        str = str3;
                    }
                    return u85Var;
                }
                c0 c0Var2 = (c0) n;
                g gVar = this.b;
                e eVar = new e(moduleDataResponse2.getGlobalConfig(), moduleDataResponse2.getEventId());
                iVar.k = str;
                iVar.l = c0Var2;
                iVar.m = null;
                iVar.p = 2;
                obj = gVar.a(eVar, iVar);
                if (obj != u85Var) {
                    c0Var = c0Var2;
                    return new w0(str, c0Var, (x) obj);
                }
                return u85Var;
            }
        }
        iVar = new i(this, q55Var);
        obj = iVar.n;
        u85Var = u85.COROUTINE_SUSPENDED;
        i = iVar.p;
        if (i == 0) {
        }
        c0 c0Var22 = (c0) n;
        g gVar2 = this.b;
        e eVar2 = new e(moduleDataResponse2.getGlobalConfig(), moduleDataResponse2.getEventId());
        iVar.k = str;
        iVar.l = c0Var22;
        iVar.m = null;
        iVar.p = 2;
        obj = gVar2.a(eVar2, iVar);
        if (obj != u85Var) {
        }
        return u85Var;
    }
}
