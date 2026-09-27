package com.stripe.android.customersheet;

import android.content.Intent;
import android.os.Bundle;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ein;
import defpackage.gf0;
import defpackage.hak;
import defpackage.li5;
import defpackage.lvf;
import defpackage.mdn;
import defpackage.mi5;
import defpackage.ni5;
import defpackage.nk5;
import defpackage.qk4;
import defpackage.ti5;
import defpackage.vl4;
import defpackage.w5a;
import defpackage.w6n;
import defpackage.x5a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetActivity;", "Lgf0;", "<init>", "()V", "Lx5a;", Keys.KEY_SOCURE_RESULT, "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerSheetActivity extends gf0 {
    public static final /* synthetic */ int d = 0;
    public final Lazy a = LazyKt.lazy(new mi5(this, 0));
    public final mi5 b = new mi5(this, 1);
    public final hak c = new hak(lvf.a.getOrCreateKotlinClass(nk5.class), new ni5(this, 0), new mi5(this, 2), new ni5(this, 1));

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        mdn.b(this);
    }

    public final void h(x5a x5aVar) {
        Intent intent = new Intent();
        x5aVar.getClass();
        setResult(-1, intent.putExtras(ein.a(new Pair("extra_activity_result", x5aVar))));
        finish();
    }

    public final nk5 i() {
        return (nk5) this.c.getValue();
    }

    @Override // androidx.fragment.app.t, defpackage.pk4, defpackage.ok4, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w6n.c(getWindow(), false);
        if (((ti5) this.a.getValue()) == null) {
            h(new w5a(new IllegalStateException("No CustomerSheetContract.Args provided")));
        } else {
            i().q.f(this, this);
            qk4.a(this, new vl4(new li5(this, 0), true, 602239828));
        }
    }
}
