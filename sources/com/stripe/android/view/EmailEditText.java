package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Patterns;
import com.polymarket.android.R;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/view/EmailEditText;", "Lcom/stripe/android/view/StripeEditText;", "", "getEmail", "()Ljava/lang/String;", "email", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EmailEditText extends StripeEditText {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        context.getClass();
        context.getClass();
    }

    public final String getEmail() {
        String str;
        if (StringsKt.T(getFieldText$payments_core_release())) {
            str = getResources().getString(R.string.stripe_becs_widget_email_required);
        } else if (!Patterns.EMAIL_ADDRESS.matcher(getFieldText$payments_core_release()).matches()) {
            str = getResources().getString(R.string.stripe_becs_widget_email_invalid);
        } else {
            str = null;
        }
        setErrorMessage$payments_core_release(str);
        String fieldText$payments_core_release = getFieldText$payments_core_release();
        if (getErrorMessage() != null) {
            return null;
        }
        return fieldText$payments_core_release;
    }
}
