package com.polymarket.data;

import com.polymarket.data.EPaymentMethod;
import com.polymarket.designtokens.Icon;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 42\u00020\u0001:\u000501234B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0013\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0011\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0011\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0011\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0011\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0013\u0010#\u001a\u0004\u0018\u00010 2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u001c\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020 0'2\u0006\u0010(\u001a\u00020%J'\u0010)\u001a\u00020%2\u0006\u0010\t\u001a\u00020\n2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020 0'2\u0006\u0010(\u001a\u00020%H\u0082 J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020.H\u0016J\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020.H\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0001\u00045678¨\u00069"}, d2 = {"Lcom/polymarket/data/EPaymentSelection;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "dailyLimit", "Lcom/polymarket/data/EAmount;", "getDailyLimit", "()Lcom/polymarket/data/EAmount;", "Swift_dailyLimit", "className", "", "perTransactionLimit", "getPerTransactionLimit", "Swift_perTransactionLimit", "type", "Lcom/polymarket/data/EPaymentMethod$MethodType;", "getType", "()Lcom/polymarket/data/EPaymentMethod$MethodType;", "Swift_type", "displayTitle", "getDisplayTitle", "()Ljava/lang/String;", "Swift_displayTitle", "detailedDisplayTitle", "getDetailedDisplayTitle", "Swift_detailedDisplayTitle", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON, "Lcom/polymarket/designtokens/Icon;", "getIcon", "()Lcom/polymarket/designtokens/Icon;", "Swift_icon", "paymentMethod", "Lcom/polymarket/data/EPaymentMethod;", "getPaymentMethod", "()Lcom/polymarket/data/EPaymentMethod;", "Swift_paymentMethod", "isValid", "", "activeMethods", "", "isApplePayEligible", "Swift_isValid_0", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "StoredMethodCase", "ApplePayCase", "GooglePayCase", "WireTransferCase", "Companion", "Lcom/polymarket/data/EPaymentSelection$ApplePayCase;", "Lcom/polymarket/data/EPaymentSelection$GooglePayCase;", "Lcom/polymarket/data/EPaymentSelection$StoredMethodCase;", "Lcom/polymarket/data/EPaymentSelection$WireTransferCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class EPaymentSelection implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final EPaymentSelection applePay = new ApplePayCase();
    private static final EPaymentSelection googlePay = new GooglePayCase();
    private static final EPaymentSelection wireTransfer = new WireTransferCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/EPaymentSelection$ApplePayCase;", "Lcom/polymarket/data/EPaymentSelection;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ApplePayCase extends EPaymentSelection {
        public ApplePayCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/EPaymentSelection$GooglePayCase;", "Lcom/polymarket/data/EPaymentSelection;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class GooglePayCase extends EPaymentSelection {
        public GooglePayCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/data/EPaymentSelection$StoredMethodCase;", "Lcom/polymarket/data/EPaymentSelection;", "associated0", "Lcom/polymarket/data/EPaymentMethod;", "<init>", "(Lcom/polymarket/data/EPaymentMethod;)V", "getAssociated0", "()Lcom/polymarket/data/EPaymentMethod;", "equals", "", "other", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class StoredMethodCase extends EPaymentSelection {
        private final EPaymentMethod associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StoredMethodCase(EPaymentMethod ePaymentMethod) {
            super(null);
            ePaymentMethod.getClass();
            this.associated0 = ePaymentMethod;
        }

        public boolean equals(Object other) {
            if (!(other instanceof StoredMethodCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((StoredMethodCase) other).associated0);
        }

        public final EPaymentMethod getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/EPaymentSelection$WireTransferCase;", "Lcom/polymarket/data/EPaymentSelection;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class WireTransferCase extends EPaymentSelection {
        public WireTransferCase() {
            super(null);
        }
    }

    public /* synthetic */ EPaymentSelection(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native EAmount Swift_dailyLimit(String className);

    private final native String Swift_detailedDisplayTitle(String className);

    private final native String Swift_displayTitle(String className);

    private final native Icon Swift_icon(String className);

    private final native boolean Swift_isValid_0(String className, List<EPaymentMethod> activeMethods, boolean isApplePayEligible);

    private final native EPaymentMethod Swift_paymentMethod(String className);

    private final native EAmount Swift_perTransactionLimit(String className);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native EPaymentMethod.MethodType Swift_type(String className);

    public static final /* synthetic */ EPaymentSelection access$getApplePay$cp() {
        return applePay;
    }

    public static final /* synthetic */ EPaymentSelection access$getGooglePay$cp() {
        return googlePay;
    }

    public static final /* synthetic */ EPaymentSelection access$getWireTransfer$cp() {
        return wireTransfer;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final EAmount getDailyLimit() {
        return Swift_dailyLimit(getClass().getName());
    }

    public final String getDetailedDisplayTitle() {
        return Swift_detailedDisplayTitle(getClass().getName());
    }

    public final String getDisplayTitle() {
        return Swift_displayTitle(getClass().getName());
    }

    public final Icon getIcon() {
        return Swift_icon(getClass().getName());
    }

    public final EPaymentMethod getPaymentMethod() {
        return Swift_paymentMethod(getClass().getName());
    }

    public final EAmount getPerTransactionLimit() {
        return Swift_perTransactionLimit(getClass().getName());
    }

    public final EPaymentMethod.MethodType getType() {
        return Swift_type(getClass().getName());
    }

    public final boolean isValid(List<EPaymentMethod> activeMethods, boolean isApplePayEligible) {
        activeMethods.getClass();
        return Swift_isValid_0(getClass().getName(), activeMethods, isApplePayEligible);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/polymarket/data/EPaymentSelection$Companion;", "", "<init>", "()V", "storedMethod", "Lcom/polymarket/data/EPaymentSelection;", "associated0", "Lcom/polymarket/data/EPaymentMethod;", "applePay", "getApplePay", "()Lcom/polymarket/data/EPaymentSelection;", "googlePay", "getGooglePay", "wireTransfer", "getWireTransfer", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EPaymentSelection getApplePay() {
            return EPaymentSelection.access$getApplePay$cp();
        }

        public final EPaymentSelection getGooglePay() {
            return EPaymentSelection.access$getGooglePay$cp();
        }

        public final EPaymentSelection getWireTransfer() {
            return EPaymentSelection.access$getWireTransfer$cp();
        }

        public final EPaymentSelection storedMethod(EPaymentMethod associated0) {
            associated0.getClass();
            return new StoredMethodCase(associated0);
        }

        private Companion() {
        }
    }

    private EPaymentSelection() {
    }
}
