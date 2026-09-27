package defpackage;

import com.stripe.android.model.StripeIntent$Status;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lege;", "", "a", "c", com.socure.idplus.device.internal.mediaDevice.manager.d.d, "e", "b", "f", "Lege$a;", "Lege$b;", "Lege$c;", "Lege$d;", "Lege$e;", "Lege$f;", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ege extends Throwable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lege$a;", "Lege;", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class a extends ege {
        public final f4e a;
        public final String b;

        public a(f4e f4eVar) {
            f4eVar.getClass();
            this.a = f4eVar;
            this.b = kotlin.text.c.c("\n            PaymentIntent with confirmation_method='automatic' is required.\n            The current PaymentIntent has confirmation_method '" + f4eVar + "'.\n            See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-confirmation_method.\n        ");
        }

        @Override // defpackage.ege
        public final String a() {
            return "invalidConfirmationMethod";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.a == ((a) obj).a) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.b;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "InvalidConfirmationMethod(confirmationMethod=" + this.a + ")";
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lege$b;", "Lege;", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class b extends ege {
        public static final b a = new Throwable();
        public static final String b = "missingAmountOrCurrency";
        public static final String c = "PaymentIntent must contain amount and currency.";

        @Override // defpackage.ege
        public final String a() {
            return b;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return c;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lege$c;", "Lege;", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class c extends ege {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        @Override // defpackage.ege
        public final String a() {
            return "noPaymentMethodTypesAvailable";
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof c) || !Intrinsics.areEqual(this.a, ((c) obj).a)) {
                    return false;
                }
                return true;
            }
            return true;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return sv6.n("None of the requested payment methods (", this.a, ") are supported.");
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return sv6.n("NoPaymentMethodTypesAvailable(requested=", this.a, ")");
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lege$d;", "Lege;", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class d extends ege {
        public final StripeIntent$Status a;

        public d(StripeIntent$Status stripeIntent$Status) {
            this.a = stripeIntent$Status;
        }

        @Override // defpackage.ege
        public final String a() {
            return "paymentIntentInTerminalState";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && this.a == ((d) obj).a) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return kotlin.text.c.c("\n                PaymentSheet cannot set up a PaymentIntent in status '" + this.a + "'.\n                See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-status.\n            ");
        }

        public final int hashCode() {
            StripeIntent$Status stripeIntent$Status = this.a;
            if (stripeIntent$Status == null) {
                return 0;
            }
            return stripeIntent$Status.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "PaymentIntentInTerminalState(status=" + this.a + ")";
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lege$e;", "Lege;", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class e extends ege {
        public final StripeIntent$Status a;

        public e(StripeIntent$Status stripeIntent$Status) {
            this.a = stripeIntent$Status;
        }

        @Override // defpackage.ege
        public final String a() {
            return "setupIntentInTerminalState";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && this.a == ((e) obj).a) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return kotlin.text.c.c("\n                PaymentSheet cannot set up a SetupIntent in status '" + this.a + "'.\n                See https://stripe.com/docs/api/setup_intents/object#setup_intent_object-status.\n            ");
        }

        public final int hashCode() {
            StripeIntent$Status stripeIntent$Status = this.a;
            if (stripeIntent$Status == null) {
                return 0;
            }
            return stripeIntent$Status.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "SetupIntentInTerminalState(status=" + this.a + ")";
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lege$f;", "Lege;", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class f extends ege {
        public final Throwable a;
        public final String b;

        public f(Throwable th) {
            th.getClass();
            this.a = th;
            this.b = th.getMessage();
        }

        @Override // defpackage.ege
        public final String a() {
            int i = s6i.e;
            return ksl.a(this.a).a();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f) && Intrinsics.areEqual(this.a, ((f) obj).a)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.a;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.b;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return woa.p("Unknown(cause=", ")", this.a);
        }
    }

    public abstract String a();
}
