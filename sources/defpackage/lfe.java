package defpackage;

import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;
import java.util.Locale;
import kotlin.text.Regex;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class lfe extends cge {
    public final /* synthetic */ int b;
    public final String c;

    public lfe(EventReporter$Mode eventReporter$Mode, int i) {
        this.b = i;
        eventReporter$Mode.getClass();
        switch (i) {
            case 2:
                this.c = "mc_" + eventReporter$Mode + "_sheet_savedpm_show";
                return;
            case 3:
                this.c = "mc_" + eventReporter$Mode + "_manage_savedpm_show";
                return;
            case 4:
                this.c = "mc_" + eventReporter$Mode + "_sheet_newpm_show";
                return;
            default:
                this.c = "mc_" + eventReporter$Mode + "_cannot_return_from_link_and_lpms";
                return;
        }
    }

    @Override // defpackage.fp
    public final String c() {
        int i = this.b;
        return this.c;
    }

    public lfe(String str) {
        this.b = 0;
        String lowerCase = new Regex("(?<=.)(?=\\p{Upper})").replace(str, "_").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.c = "autofill_".concat(lowerCase);
    }
}
