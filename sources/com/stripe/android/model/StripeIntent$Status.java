package com.stripe.android.model;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.a8i;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"com/stripe/android/model/StripeIntent$Status", "", "Lcom/stripe/android/model/StripeIntent$Status;", "", ApiConstant.KEY_CODE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getCode", "Companion", "a8i", "Canceled", "Processing", "RequiresAction", "RequiresConfirmation", "RequiresPaymentMethod", "Succeeded", "RequiresCapture", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StripeIntent$Status {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ StripeIntent$Status[] $VALUES;
    public static final a8i Companion;
    private final String code;
    public static final StripeIntent$Status Canceled = new StripeIntent$Status("Canceled", 0, "canceled");
    public static final StripeIntent$Status Processing = new StripeIntent$Status("Processing", 1, "processing");
    public static final StripeIntent$Status RequiresAction = new StripeIntent$Status("RequiresAction", 2, "requires_action");
    public static final StripeIntent$Status RequiresConfirmation = new StripeIntent$Status("RequiresConfirmation", 3, "requires_confirmation");
    public static final StripeIntent$Status RequiresPaymentMethod = new StripeIntent$Status("RequiresPaymentMethod", 4, "requires_payment_method");
    public static final StripeIntent$Status Succeeded = new StripeIntent$Status("Succeeded", 5, "succeeded");
    public static final StripeIntent$Status RequiresCapture = new StripeIntent$Status("RequiresCapture", 6, "requires_capture");

    private static final /* synthetic */ StripeIntent$Status[] $values() {
        return new StripeIntent$Status[]{Canceled, Processing, RequiresAction, RequiresConfirmation, RequiresPaymentMethod, Succeeded, RequiresCapture};
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [a8i, java.lang.Object] */
    static {
        StripeIntent$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        Companion = new Object();
    }

    private StripeIntent$Status(String str, int i, String str2) {
        this.code = str2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static StripeIntent$Status valueOf(String str) {
        return (StripeIntent$Status) Enum.valueOf(StripeIntent$Status.class, str);
    }

    public static StripeIntent$Status[] values() {
        return (StripeIntent$Status[]) $VALUES.clone();
    }

    public final String getCode() {
        return this.code;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.code;
    }
}
