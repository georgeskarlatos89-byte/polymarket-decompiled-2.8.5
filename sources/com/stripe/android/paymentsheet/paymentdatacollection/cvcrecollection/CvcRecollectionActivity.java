package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import android.content.Intent;
import android.os.Bundle;
import defpackage.cm5;
import defpackage.din;
import defpackage.gf0;
import defpackage.hak;
import defpackage.lvf;
import defpackage.mdn;
import defpackage.pm5;
import defpackage.qk4;
import defpackage.vl4;
import defpackage.xl5;
import defpackage.yl5;
import defpackage.zl5;
import defpackage.znn;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionActivity;", "Lgf0;", "<init>", "()V", "Lqm5;", "state", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CvcRecollectionActivity extends gf0 {
    public static final /* synthetic */ int c = 0;
    public final Lazy a = LazyKt.lazy(new xl5(this, 0));
    public final hak b = new hak(lvf.a.getOrCreateKotlinClass(pm5.class), new zl5(this, 0), new xl5(this, 1), new zl5(this, 1));

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        mdn.b(this);
    }

    @Override // androidx.fragment.app.t, defpackage.pk4, defpackage.ok4, android.app.Activity
    public final void onCreate(Bundle bundle) {
        cm5 cm5Var;
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.getClass();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            cm5Var = (cm5) din.b(extras, "extra_activity_args", cm5.class);
        } else {
            cm5Var = null;
        }
        if (cm5Var != null) {
            znn.d(((cm5) this.a.getValue()).c);
            qk4.a(this, new vl4(new yl5(this, 0), true, 1759306475));
        } else {
            finish();
        }
    }
}
