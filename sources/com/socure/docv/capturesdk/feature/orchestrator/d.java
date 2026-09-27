package com.socure.docv.capturesdk.feature.orchestrator;

import defpackage.coc;
import defpackage.dmk;
import defpackage.g85;
import defpackage.k3h;
import defpackage.ozm;
import defpackage.q55;
import defpackage.u85;
import defpackage.vni;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class d {
    public final com.fingerprintjs.android.fpjs_pro.f a;
    public final g85 b;
    public final com.socure.docv.capturesdk.core.storage.a c;
    public final com.socure.docv.capturesdk.common.analytics.b d;
    public final k3h e;

    public d(com.fingerprintjs.android.fpjs_pro.f fVar, g85 g85Var, com.socure.docv.capturesdk.core.storage.a aVar, com.socure.docv.capturesdk.common.analytics.b bVar) {
        fVar.getClass();
        g85Var.getClass();
        aVar.getClass();
        bVar.getClass();
        this.a = fVar;
        this.b = g85Var;
        this.c = aVar;
        this.d = bVar;
        this.e = ozm.b(1, 1, null, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(q55 q55Var) {
        c cVar;
        int i;
        if (q55Var instanceof c) {
            cVar = (c) q55Var;
            int i2 = cVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.m = i2 - Integer.MIN_VALUE;
                Object obj = cVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = cVar.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    vni vniVar = new vni(this, null, 18);
                    cVar.m = 1;
                    obj = coc.d(this.b, vniVar, cVar);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                return ((Result) obj).a;
            }
        }
        cVar = new c(this, q55Var);
        Object obj2 = cVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = cVar.m;
        if (i == 0) {
        }
        return ((Result) obj2).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(io.sentry.config.a aVar, q55 q55Var) {
        b bVar;
        int i;
        if (q55Var instanceof b) {
            bVar = (b) q55Var;
            int i2 = bVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.m = i2 - Integer.MIN_VALUE;
                Object obj = bVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = bVar.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    com.socure.docv.capturesdk.common.analytics.e eVar = new com.socure.docv.capturesdk.common.analytics.e(this, aVar, (Continuation) null, 2);
                    bVar.m = 1;
                    obj = coc.d(this.b, eVar, bVar);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                return ((Result) obj).a;
            }
        }
        bVar = new b(this, q55Var);
        Object obj2 = bVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = bVar.m;
        if (i == 0) {
        }
        return ((Result) obj2).a;
    }
}
