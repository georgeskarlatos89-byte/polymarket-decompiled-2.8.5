package defpackage;

import com.stripe.android.view.PaymentRelayActivity;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class fbe implements yt0 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public fbe(ka kaVar) {
        kaVar.getClass();
        this.b = kaVar;
    }

    @Override // defpackage.yt0
    public final void h(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ebe ebeVar = (ebe) obj;
                ((n9) obj2).a(PaymentRelayActivity.class, ebeVar.g().e(), ebeVar.e());
                return;
            default:
                ((ka) obj2).a((ebe) obj, null);
                return;
        }
    }

    public fbe(n9 n9Var) {
        this.b = n9Var;
    }
}
