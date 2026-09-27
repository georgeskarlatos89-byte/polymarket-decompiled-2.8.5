package com.stripe.android.paymentsheet.ui;

import android.content.Intent;
import android.os.Bundle;
import defpackage.gf0;
import defpackage.qk4;
import defpackage.r5g;
import defpackage.vl4;
import defpackage.vvg;
import defpackage.w6n;
import defpackage.xvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;", "Lgf0;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SepaMandateActivity extends gf0 {
    public static final /* synthetic */ int a = 0;

    @Override // androidx.fragment.app.t, defpackage.pk4, defpackage.ok4, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object m882constructorimpl;
        xvg xvgVar;
        super.onCreate(bundle);
        try {
            Result.Companion companion = Result.INSTANCE;
            Intent intent = getIntent();
            intent.getClass();
            xvgVar = (xvg) intent.getParcelableExtra("extra_activity_args");
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        if (xvgVar != null) {
            m882constructorimpl = Result.m882constructorimpl(xvgVar);
            String str = null;
            if (m882constructorimpl instanceof r5g) {
                m882constructorimpl = null;
            }
            xvg xvgVar2 = (xvg) m882constructorimpl;
            if (xvgVar2 != null) {
                str = xvgVar2.a;
            }
            if (str == null) {
                finish();
                return;
            } else {
                w6n.c(getWindow(), false);
                qk4.a(this, new vl4(new vvg(this, str, 0), true, 2089289300));
                return;
            }
        }
        throw new IllegalArgumentException("SepaMandateActivity was started without arguments.");
    }
}
