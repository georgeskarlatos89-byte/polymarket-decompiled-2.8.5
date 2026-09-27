package defpackage;

import android.content.Context;
import android.content.Intent;
import com.socure.docv.capturesdk.api.Keys;
import com.stripe.android.stripecardscan.cardscan.CardScanConfiguration;
import com.stripe.android.stripecardscan.cardscan.CardScanSheet;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetParams;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import com.stripe.android.stripecardscan.cardscan.exception.UnknownScanException;
import com.stripe.android.ui.core.cardscan.CardScanStripeLauncher$Companion$activityResultContract$1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class w83 implements q83 {
    public static final Lazy h = LazyKt.lazy(new l83(3));
    public static final CardScanStripeLauncher$Companion$activityResultContract$1 i = new Object();
    public final k83 a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final qqc e;
    public final epf f;
    public bzb g;

    public w83(Context context, k83 k83Var, boolean z, String str, boolean z2, qqc qqcVar) {
        context.getClass();
        qqcVar.getClass();
        this.a = k83Var;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.e = qqcVar;
        this.f = tkl.b(n0n.a(Boolean.valueOf(CardScanSheet.Companion.isSupported(context))));
    }

    @Override // defpackage.q83
    public final void a(Context context) {
        context.getClass();
        qqc qqcVar = this.e;
        if (((Boolean) qqcVar.getValue()).booleanValue()) {
            return;
        }
        qqcVar.setValue(Boolean.TRUE);
        this.a.a("stripe_card_scan");
        bzb bzbVar = this.g;
        if (bzbVar != null) {
            bzbVar.a(new CardScanSheetParams(new CardScanConfiguration(this.c, this.b, this.d)), null);
            return;
        }
        Intrinsics.i("activityLauncher");
        throw null;
    }

    @Override // defpackage.q83
    public final epf b() {
        return this.f;
    }

    public final v83 c(Intent intent) {
        CardScanSheetResult failed;
        v83 u83Var;
        if (intent == null || (failed = (CardScanSheetResult) ksm.a(intent, Keys.KEY_SOCURE_RESULT, CardScanSheetResult.class)) == null) {
            failed = new CardScanSheetResult.Failed(new UnknownScanException("No data in the result intent"));
        }
        if (failed instanceof CardScanSheetResult.Completed) {
            CardScanSheetResult.Completed completed = (CardScanSheetResult.Completed) failed;
            u83Var = new t83(new xhg(completed.getScannedCard().getPan(), completed.getScannedCard().getExpiryMonth(), completed.getScannedCard().getExpiryYear()));
        } else if (failed instanceof CardScanSheetResult.Canceled) {
            u83Var = s83.a;
        } else if (failed instanceof CardScanSheetResult.Failed) {
            u83Var = new u83(((CardScanSheetResult.Failed) failed).getError());
        } else {
            dmk.a();
            return null;
        }
        boolean z = u83Var instanceof t83;
        k83 k83Var = this.a;
        if (z) {
            k83Var.d("stripe_card_scan");
            return u83Var;
        }
        if (u83Var instanceof s83) {
            k83Var.c("stripe_card_scan");
            return u83Var;
        }
        if (u83Var instanceof u83) {
            k83Var.g("stripe_card_scan", ((u83) u83Var).a);
            return u83Var;
        }
        dmk.a();
        return null;
    }
}
