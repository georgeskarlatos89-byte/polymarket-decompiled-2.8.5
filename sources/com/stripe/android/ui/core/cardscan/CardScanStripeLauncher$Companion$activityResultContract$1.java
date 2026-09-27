package com.stripe.android.ui.core.cardscan;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetParams;
import defpackage.ga;
import defpackage.w83;
import kotlin.Metadata;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0001¨\u0006\u0006"}, d2 = {"com/stripe/android/ui/core/cardscan/CardScanStripeLauncher$Companion$activityResultContract$1", "Lga;", "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetParams;", "Lkotlin/Pair;", "", "Landroid/content/Intent;", "payments-ui-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CardScanStripeLauncher$Companion$activityResultContract$1 extends ga {
    @Override // defpackage.ga
    public final Intent createIntent(Context context, Object obj) {
        Parcelable parcelable = (CardScanSheetParams) obj;
        parcelable.getClass();
        Object value = w83.h.getValue();
        value.getClass();
        Intent putExtra = new Intent(context, (Class<?>) value).putExtra("request", parcelable);
        putExtra.getClass();
        return putExtra;
    }

    @Override // defpackage.ga
    public final Object parseResult(int i, Intent intent) {
        return new Pair(Integer.valueOf(i), intent);
    }
}
