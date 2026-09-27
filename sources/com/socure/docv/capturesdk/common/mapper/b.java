package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.network.model.stepup.modules.Button;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ButtonStyle;
import defpackage.dmk;
import defpackage.q55;
import defpackage.u85;
import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class b {
    public final io.sentry.hints.j a;

    public b(io.sentry.hints.j jVar) {
        this.a = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Button button, q55 q55Var) {
        a aVar;
        Object obj;
        int i;
        ButtonStyle buttonStyle;
        ButtonStyle buttonStyle2;
        Object l;
        com.socure.docv.capturesdk.models.i iVar;
        if (q55Var instanceof a) {
            aVar = (a) q55Var;
            int i2 = aVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.o = i2 - Integer.MIN_VALUE;
                Object obj2 = aVar.m;
                obj = u85.COROUTINE_SUSPENDED;
                i = aVar.o;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            iVar = (com.socure.docv.capturesdk.models.i) aVar.k;
                            ResultKt.a(obj2);
                            return new com.socure.docv.capturesdk.models.h(iVar, (com.socure.docv.capturesdk.models.i) obj2);
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    button = aVar.l;
                    this = (b) aVar.k;
                    ResultKt.a(obj2);
                } else {
                    ResultKt.a(obj2);
                    if (button != null) {
                        buttonStyle = button.getPrimary();
                    } else {
                        buttonStyle = null;
                    }
                    aVar.k = this;
                    aVar.l = button;
                    aVar.o = 1;
                    obj2 = io.sentry.hints.j.l(buttonStyle);
                }
                com.socure.docv.capturesdk.models.i iVar2 = (com.socure.docv.capturesdk.models.i) obj2;
                io.sentry.hints.j jVar = this.a;
                if (button == null) {
                    buttonStyle2 = button.getSecondary();
                } else {
                    buttonStyle2 = null;
                }
                aVar.k = iVar2;
                aVar.l = null;
                aVar.o = 2;
                l = io.sentry.hints.j.l(buttonStyle2);
                if (l != obj) {
                    obj2 = l;
                    iVar = iVar2;
                    return new com.socure.docv.capturesdk.models.h(iVar, (com.socure.docv.capturesdk.models.i) obj2);
                }
                return obj;
            }
        }
        aVar = new a(this, q55Var);
        Object obj22 = aVar.m;
        obj = u85.COROUTINE_SUSPENDED;
        i = aVar.o;
        if (i == 0) {
        }
        com.socure.docv.capturesdk.models.i iVar22 = (com.socure.docv.capturesdk.models.i) obj22;
        io.sentry.hints.j jVar2 = this.a;
        if (button == null) {
        }
        aVar.k = iVar22;
        aVar.l = null;
        aVar.o = 2;
        l = io.sentry.hints.j.l(buttonStyle2);
        if (l != obj) {
        }
        return obj;
    }
}
