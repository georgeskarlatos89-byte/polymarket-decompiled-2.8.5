package com.socure.docv.capturesdk.feature.orchestrator;

import android.content.Context;
import android.widget.Toast;
import com.socure.docv.capturesdk.models.w0;
import com.socure.docv.capturesdk.models.x;
import defpackage.ka;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a {
    public final Context a;
    public final Function0 b;
    public final ka c;
    public final w0 d;

    public a(Context context, Function0 function0, ka kaVar, w0 w0Var) {
        context.getClass();
        kaVar.getClass();
        this.a = context;
        this.b = function0;
        this.c = kaVar;
        this.d = w0Var;
    }

    public final void a(boolean z) {
        String str;
        x xVar;
        com.socure.docv.capturesdk.models.o oVar;
        if (z) {
            this.b.invoke();
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Context context = this.a;
            w0 w0Var = this.d;
            if (w0Var != null && (xVar = w0Var.c) != null && (oVar = xVar.c) != null) {
                str = oVar.d;
            } else {
                str = null;
            }
            Toast.makeText(context, str, 1).show();
            Result.m882constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m882constructorimpl(ResultKt.createFailure(th));
        }
    }
}
