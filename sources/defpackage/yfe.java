package defpackage;

import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class yfe extends wfe {
    public final /* synthetic */ int b = 0;
    public final String c;
    public final Map d;

    public yfe(EventReporter$Mode eventReporter$Mode, boolean z) {
        eventReporter$Mode.getClass();
        this.c = "mc_" + eventReporter$Mode + "_tap_to_add_confirm";
        this.d = c1c.b(new Pair("recollected_cvc", Boolean.valueOf(z)));
    }

    @Override // defpackage.fp
    public final String c() {
        int i = this.b;
        return this.c;
    }

    @Override // defpackage.cge
    public final Map getParams() {
        int i = this.b;
        return this.d;
    }

    public yfe(EventReporter$Mode eventReporter$Mode, Boolean bool) {
        eventReporter$Mode.getClass();
        this.c = "mc_" + eventReporter$Mode + "_tap_to_add_continue_after_card_added";
        this.d = c1c.b(new Pair("completed_link_signup_input", bool));
    }

    public yfe(EventReporter$Mode eventReporter$Mode, d47 d47Var) {
        eventReporter$Mode.getClass();
        this.c = "mc_" + eventReporter$Mode + "_tap_to_add_attempt_with_unsupported_device";
        this.d = lyn.c(d47Var);
    }
}
