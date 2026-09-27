package defpackage;

import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class zfe extends wfe {
    public final /* synthetic */ int b;
    public final String c;

    public zfe(EventReporter$Mode eventReporter$Mode, int i) {
        this.b = i;
        eventReporter$Mode.getClass();
        switch (i) {
            case 1:
                this.c = "mc_" + eventReporter$Mode + "_tap_to_add_started";
                return;
            default:
                this.c = "mc_" + eventReporter$Mode + "_tap_to_add_button_shown";
                return;
        }
    }

    @Override // defpackage.fp
    public final String c() {
        int i = this.b;
        return this.c;
    }
}
