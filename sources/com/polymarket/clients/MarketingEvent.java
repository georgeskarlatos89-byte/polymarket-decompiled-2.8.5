package com.polymarket.clients;

import com.polymarket.data.EAmount;
import com.polymarket.data.EPaymentSelection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 72\u00020\u0001:\u0017!\"#$%&'()*+,-./01234567B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0082 J\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\u0005H\u0082 J\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0082 J\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\u0005H\u0082 J\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0082 J\u001d\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\u0005H\u0082 J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007R\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000e\u0082\u0001\u001689:;<=>?@ABCDEFGHIJKLM¨\u0006N"}, d2 = {"Lcom/polymarket/clients/MarketingEvent;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "appsFlyerEventName", "", "getAppsFlyerEventName", "()Ljava/lang/String;", "Swift_appsFlyerEventName", "className", "appsFlyerParameters", "", "", "getAppsFlyerParameters", "()Ljava/util/Map;", "Swift_appsFlyerParameters", "brazeEventName", "getBrazeEventName", "Swift_brazeEventName", "brazeProperties", "getBrazeProperties", "Swift_brazeProperties", "firebaseEventName", "getFirebaseEventName", "Swift_firebaseEventName", "firebaseParameters", "getFirebaseParameters", "Swift_firebaseParameters", "Swift_projection", "Lkotlin/Function0;", "options", "", "Swift_projectionImpl", "LoginCase", "CompleteWaitlistCase", "CompleteRegistrationCase", "CodeRedeemedCase", "KycStartedCase", "PhoneVerifiedCase", "KycCompletedCase", "KycFailedCase", "SessionStartedCase", "MarketSearchedCase", "MarketFilteredCase", "BankLinkedCase", "CardLinkedCase", "DepositInitiatedCase", "DepositFailedCase", "FirstTimeDepositCase", "WithdrawalInitiatedCase", "TradeStartedCase", "EventDetailViewCase", "FirstTimeTradeCase", "TradeCase", "TradeSettledCase", "Companion", "Lcom/polymarket/clients/MarketingEvent$BankLinkedCase;", "Lcom/polymarket/clients/MarketingEvent$CardLinkedCase;", "Lcom/polymarket/clients/MarketingEvent$CodeRedeemedCase;", "Lcom/polymarket/clients/MarketingEvent$CompleteRegistrationCase;", "Lcom/polymarket/clients/MarketingEvent$CompleteWaitlistCase;", "Lcom/polymarket/clients/MarketingEvent$DepositFailedCase;", "Lcom/polymarket/clients/MarketingEvent$DepositInitiatedCase;", "Lcom/polymarket/clients/MarketingEvent$EventDetailViewCase;", "Lcom/polymarket/clients/MarketingEvent$FirstTimeDepositCase;", "Lcom/polymarket/clients/MarketingEvent$FirstTimeTradeCase;", "Lcom/polymarket/clients/MarketingEvent$KycCompletedCase;", "Lcom/polymarket/clients/MarketingEvent$KycFailedCase;", "Lcom/polymarket/clients/MarketingEvent$KycStartedCase;", "Lcom/polymarket/clients/MarketingEvent$LoginCase;", "Lcom/polymarket/clients/MarketingEvent$MarketFilteredCase;", "Lcom/polymarket/clients/MarketingEvent$MarketSearchedCase;", "Lcom/polymarket/clients/MarketingEvent$PhoneVerifiedCase;", "Lcom/polymarket/clients/MarketingEvent$SessionStartedCase;", "Lcom/polymarket/clients/MarketingEvent$TradeCase;", "Lcom/polymarket/clients/MarketingEvent$TradeSettledCase;", "Lcom/polymarket/clients/MarketingEvent$TradeStartedCase;", "Lcom/polymarket/clients/MarketingEvent$WithdrawalInitiatedCase;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class MarketingEvent implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final MarketingEvent login = new LoginCase();
    private static final MarketingEvent completeWaitlist = new CompleteWaitlistCase();
    private static final MarketingEvent completeRegistration = new CompleteRegistrationCase();
    private static final MarketingEvent codeRedeemed = new CodeRedeemedCase();
    private static final MarketingEvent kycStarted = new KycStartedCase();
    private static final MarketingEvent phoneVerified = new PhoneVerifiedCase();
    private static final MarketingEvent kycCompleted = new KycCompletedCase();
    private static final MarketingEvent kycFailed = new KycFailedCase();
    private static final MarketingEvent sessionStarted = new SessionStartedCase();
    private static final MarketingEvent bankLinked = new BankLinkedCase();
    private static final MarketingEvent cardLinked = new CardLinkedCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$BankLinkedCase;", "Lcom/polymarket/clients/MarketingEvent;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class BankLinkedCase extends MarketingEvent {
        public BankLinkedCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$CardLinkedCase;", "Lcom/polymarket/clients/MarketingEvent;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CardLinkedCase extends MarketingEvent {
        public CardLinkedCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$CodeRedeemedCase;", "Lcom/polymarket/clients/MarketingEvent;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CodeRedeemedCase extends MarketingEvent {
        public CodeRedeemedCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$CompleteRegistrationCase;", "Lcom/polymarket/clients/MarketingEvent;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CompleteRegistrationCase extends MarketingEvent {
        public CompleteRegistrationCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$CompleteWaitlistCase;", "Lcom/polymarket/clients/MarketingEvent;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CompleteWaitlistCase extends MarketingEvent {
        public CompleteWaitlistCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$DepositFailedCase;", "Lcom/polymarket/clients/MarketingEvent;", "associated0", "Lcom/polymarket/data/EAmount;", "<init>", "(Lcom/polymarket/data/EAmount;)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "amount", "getAmount", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DepositFailedCase extends MarketingEvent {
        private final EAmount amount;
        private final EAmount associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DepositFailedCase(EAmount eAmount) {
            super(null);
            eAmount.getClass();
            this.associated0 = eAmount;
            this.amount = eAmount;
        }

        public final EAmount getAmount() {
            return this.amount;
        }

        public final EAmount getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$DepositInitiatedCase;", "Lcom/polymarket/clients/MarketingEvent;", "associated0", "Lcom/polymarket/data/EAmount;", "associated1", "Lcom/polymarket/data/EPaymentSelection;", "<init>", "(Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EPaymentSelection;)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "getAssociated1", "()Lcom/polymarket/data/EPaymentSelection;", "amount", "getAmount", "paymentSelection", "getPaymentSelection", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DepositInitiatedCase extends MarketingEvent {
        private final EAmount amount;
        private final EAmount associated0;
        private final EPaymentSelection associated1;
        private final EPaymentSelection paymentSelection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DepositInitiatedCase(EAmount eAmount, EPaymentSelection ePaymentSelection) {
            super(null);
            eAmount.getClass();
            ePaymentSelection.getClass();
            this.associated0 = eAmount;
            this.associated1 = ePaymentSelection;
            this.amount = eAmount;
            this.paymentSelection = ePaymentSelection;
        }

        public final EAmount getAmount() {
            return this.amount;
        }

        public final EAmount getAssociated0() {
            return this.associated0;
        }

        public final EPaymentSelection getAssociated1() {
            return this.associated1;
        }

        public final EPaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$EventDetailViewCase;", "Lcom/polymarket/clients/MarketingEvent;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "marketSlug", "getMarketSlug", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class EventDetailViewCase extends MarketingEvent {
        private final String associated0;
        private final String marketSlug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EventDetailViewCase(String str) {
            super(null);
            str.getClass();
            this.associated0 = str;
            this.marketSlug = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final String getMarketSlug() {
            return this.marketSlug;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$FirstTimeDepositCase;", "Lcom/polymarket/clients/MarketingEvent;", "associated0", "Lcom/polymarket/data/EAmount;", "<init>", "(Lcom/polymarket/data/EAmount;)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "amount", "getAmount", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class FirstTimeDepositCase extends MarketingEvent {
        private final EAmount amount;
        private final EAmount associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FirstTimeDepositCase(EAmount eAmount) {
            super(null);
            eAmount.getClass();
            this.associated0 = eAmount;
            this.amount = eAmount;
        }

        public final EAmount getAmount() {
            return this.amount;
        }

        public final EAmount getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0019\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000eR\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0013\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0010¨\u0006\""}, d2 = {"Lcom/polymarket/clients/MarketingEvent$FirstTimeTradeCase;", "Lcom/polymarket/clients/MarketingEvent;", "associated0", "Lcom/polymarket/data/EAmount;", "associated1", "", "associated2", "associated3", "associated4", "", "associated5", "<init>", "(Lcom/polymarket/data/EAmount;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/EAmount;Ljava/util/List;Ljava/lang/String;)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "getAssociated1", "()Ljava/lang/String;", "getAssociated2", "getAssociated3", "getAssociated4", "()Ljava/util/List;", "getAssociated5", "amount", "getAmount", "category", "getCategory", "marketSlug", "getMarketSlug", "fees", "getFees", "eventTagSlugs", "getEventTagSlugs", "contentId", "getContentId", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class FirstTimeTradeCase extends MarketingEvent {
        private final EAmount amount;
        private final EAmount associated0;
        private final String associated1;
        private final String associated2;
        private final EAmount associated3;
        private final List<String> associated4;
        private final String associated5;
        private final String category;
        private final String contentId;
        private final List<String> eventTagSlugs;
        private final EAmount fees;
        private final String marketSlug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FirstTimeTradeCase(EAmount eAmount, String str, String str2, EAmount eAmount2, List<String> list, String str3) {
            super(null);
            eAmount.getClass();
            str2.getClass();
            eAmount2.getClass();
            this.associated0 = eAmount;
            this.associated1 = str;
            this.associated2 = str2;
            this.associated3 = eAmount2;
            this.associated4 = list;
            this.associated5 = str3;
            this.amount = eAmount;
            this.category = str;
            this.marketSlug = str2;
            this.fees = eAmount2;
            this.eventTagSlugs = list;
            this.contentId = str3;
        }

        public final EAmount getAmount() {
            return this.amount;
        }

        public final EAmount getAssociated0() {
            return this.associated0;
        }

        public final String getAssociated1() {
            return this.associated1;
        }

        public final String getAssociated2() {
            return this.associated2;
        }

        public final EAmount getAssociated3() {
            return this.associated3;
        }

        public final List<String> getAssociated4() {
            return this.associated4;
        }

        public final String getAssociated5() {
            return this.associated5;
        }

        public final String getCategory() {
            return this.category;
        }

        public final String getContentId() {
            return this.contentId;
        }

        public final List<String> getEventTagSlugs() {
            return this.eventTagSlugs;
        }

        public final EAmount getFees() {
            return this.fees;
        }

        public final String getMarketSlug() {
            return this.marketSlug;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$KycCompletedCase;", "Lcom/polymarket/clients/MarketingEvent;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class KycCompletedCase extends MarketingEvent {
        public KycCompletedCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$KycFailedCase;", "Lcom/polymarket/clients/MarketingEvent;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class KycFailedCase extends MarketingEvent {
        public KycFailedCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$KycStartedCase;", "Lcom/polymarket/clients/MarketingEvent;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class KycStartedCase extends MarketingEvent {
        public KycStartedCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$LoginCase;", "Lcom/polymarket/clients/MarketingEvent;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class LoginCase extends MarketingEvent {
        public LoginCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$MarketFilteredCase;", "Lcom/polymarket/clients/MarketingEvent;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "categorySelected", "getCategorySelected", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MarketFilteredCase extends MarketingEvent {
        private final String associated0;
        private final String categorySelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarketFilteredCase(String str) {
            super(null);
            str.getClass();
            this.associated0 = str;
            this.categorySelected = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final String getCategorySelected() {
            return this.categorySelected;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$MarketSearchedCase;", "Lcom/polymarket/clients/MarketingEvent;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "queryText", "getQueryText", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MarketSearchedCase extends MarketingEvent {
        private final String associated0;
        private final String queryText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarketSearchedCase(String str) {
            super(null);
            str.getClass();
            this.associated0 = str;
            this.queryText = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final String getQueryText() {
            return this.queryText;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$PhoneVerifiedCase;", "Lcom/polymarket/clients/MarketingEvent;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PhoneVerifiedCase extends MarketingEvent {
        public PhoneVerifiedCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$SessionStartedCase;", "Lcom/polymarket/clients/MarketingEvent;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SessionStartedCase extends MarketingEvent {
        public SessionStartedCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u001f\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010 \u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u0011\u0010\"\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0013R\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0011R\u0011\u0010&\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0019\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0013\u0010)\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0013¨\u0006+"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$TradeCase;", "Lcom/polymarket/clients/MarketingEvent;", "associated0", "Lcom/polymarket/data/EAmount;", "associated1", "", "associated2", "associated3", "associated4", "associated5", "", "associated6", "", "associated7", "<init>", "(Lcom/polymarket/data/EAmount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/EAmount;ZLjava/util/List;Ljava/lang/String;)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "getAssociated1", "()Ljava/lang/String;", "getAssociated2", "getAssociated3", "getAssociated4", "getAssociated5", "()Z", "getAssociated6", "()Ljava/util/List;", "getAssociated7", "amount", "getAmount", "category", "getCategory", "marketSlug", "getMarketSlug", "side", "getSide", "fees", "getFees", "isPartialFill", "eventTagSlugs", "getEventTagSlugs", "contentId", "getContentId", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class TradeCase extends MarketingEvent {
        private final EAmount amount;
        private final EAmount associated0;
        private final String associated1;
        private final String associated2;
        private final String associated3;
        private final EAmount associated4;
        private final boolean associated5;
        private final List<String> associated6;
        private final String associated7;
        private final String category;
        private final String contentId;
        private final List<String> eventTagSlugs;
        private final EAmount fees;
        private final boolean isPartialFill;
        private final String marketSlug;
        private final String side;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TradeCase(EAmount eAmount, String str, String str2, String str3, EAmount eAmount2, boolean z, List<String> list, String str4) {
            super(null);
            eAmount.getClass();
            str2.getClass();
            str3.getClass();
            eAmount2.getClass();
            this.associated0 = eAmount;
            this.associated1 = str;
            this.associated2 = str2;
            this.associated3 = str3;
            this.associated4 = eAmount2;
            this.associated5 = z;
            this.associated6 = list;
            this.associated7 = str4;
            this.amount = eAmount;
            this.category = str;
            this.marketSlug = str2;
            this.side = str3;
            this.fees = eAmount2;
            this.isPartialFill = z;
            this.eventTagSlugs = list;
            this.contentId = str4;
        }

        public final EAmount getAmount() {
            return this.amount;
        }

        public final EAmount getAssociated0() {
            return this.associated0;
        }

        public final String getAssociated1() {
            return this.associated1;
        }

        public final String getAssociated2() {
            return this.associated2;
        }

        public final String getAssociated3() {
            return this.associated3;
        }

        public final EAmount getAssociated4() {
            return this.associated4;
        }

        public final boolean getAssociated5() {
            return this.associated5;
        }

        public final List<String> getAssociated6() {
            return this.associated6;
        }

        public final String getAssociated7() {
            return this.associated7;
        }

        public final String getCategory() {
            return this.category;
        }

        public final String getContentId() {
            return this.contentId;
        }

        public final List<String> getEventTagSlugs() {
            return this.eventTagSlugs;
        }

        public final EAmount getFees() {
            return this.fees;
        }

        public final String getMarketSlug() {
            return this.marketSlug;
        }

        public final String getSide() {
            return this.side;
        }

        /* renamed from: isPartialFill, reason: from getter */
        public final boolean getIsPartialFill() {
            return this.isPartialFill;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u001a\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$TradeSettledCase;", "Lcom/polymarket/clients/MarketingEvent;", "associated0", "", "associated1", "Lcom/polymarket/data/EAmount;", "associated2", "", "associated3", "associated4", "<init>", "(ZLcom/polymarket/data/EAmount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAssociated0", "()Z", "getAssociated1", "()Lcom/polymarket/data/EAmount;", "getAssociated2", "()Ljava/lang/String;", "getAssociated3", "getAssociated4", "won", "getWon", "amount", "getAmount", "category", "getCategory", "marketSlug", "getMarketSlug", "contentId", "getContentId", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class TradeSettledCase extends MarketingEvent {
        private final EAmount amount;
        private final boolean associated0;
        private final EAmount associated1;
        private final String associated2;
        private final String associated3;
        private final String associated4;
        private final String category;
        private final String contentId;
        private final String marketSlug;
        private final boolean won;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TradeSettledCase(boolean z, EAmount eAmount, String str, String str2, String str3) {
            super(null);
            eAmount.getClass();
            str2.getClass();
            this.associated0 = z;
            this.associated1 = eAmount;
            this.associated2 = str;
            this.associated3 = str2;
            this.associated4 = str3;
            this.won = z;
            this.amount = eAmount;
            this.category = str;
            this.marketSlug = str2;
            this.contentId = str3;
        }

        public final EAmount getAmount() {
            return this.amount;
        }

        public final boolean getAssociated0() {
            return this.associated0;
        }

        public final EAmount getAssociated1() {
            return this.associated1;
        }

        public final String getAssociated2() {
            return this.associated2;
        }

        public final String getAssociated3() {
            return this.associated3;
        }

        public final String getAssociated4() {
            return this.associated4;
        }

        public final String getCategory() {
            return this.category;
        }

        public final String getContentId() {
            return this.contentId;
        }

        public final String getMarketSlug() {
            return this.marketSlug;
        }

        public final boolean getWon() {
            return this.won;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$TradeStartedCase;", "Lcom/polymarket/clients/MarketingEvent;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "marketSlug", "getMarketSlug", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class TradeStartedCase extends MarketingEvent {
        private final String associated0;
        private final String marketSlug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TradeStartedCase(String str) {
            super(null);
            str.getClass();
            this.associated0 = str;
            this.marketSlug = str;
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public final String getMarketSlug() {
            return this.marketSlug;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$WithdrawalInitiatedCase;", "Lcom/polymarket/clients/MarketingEvent;", "associated0", "Lcom/polymarket/data/EAmount;", "associated1", "Lcom/polymarket/data/EPaymentSelection;", "<init>", "(Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EPaymentSelection;)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "getAssociated1", "()Lcom/polymarket/data/EPaymentSelection;", "amount", "getAmount", "paymentSelection", "getPaymentSelection", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class WithdrawalInitiatedCase extends MarketingEvent {
        private final EAmount amount;
        private final EAmount associated0;
        private final EPaymentSelection associated1;
        private final EPaymentSelection paymentSelection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithdrawalInitiatedCase(EAmount eAmount, EPaymentSelection ePaymentSelection) {
            super(null);
            eAmount.getClass();
            ePaymentSelection.getClass();
            this.associated0 = eAmount;
            this.associated1 = ePaymentSelection;
            this.amount = eAmount;
            this.paymentSelection = ePaymentSelection;
        }

        public final EAmount getAmount() {
            return this.amount;
        }

        public final EAmount getAssociated0() {
            return this.associated0;
        }

        public final EPaymentSelection getAssociated1() {
            return this.associated1;
        }

        public final EPaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }
    }

    public /* synthetic */ MarketingEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native String Swift_appsFlyerEventName(String className);

    private final native Map<String, Object> Swift_appsFlyerParameters(String className);

    private final native String Swift_brazeEventName(String className);

    private final native Map<String, Object> Swift_brazeProperties(String className);

    private final native String Swift_firebaseEventName(String className);

    private final native Map<String, Object> Swift_firebaseParameters(String className);

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ MarketingEvent access$getBankLinked$cp() {
        return bankLinked;
    }

    public static final /* synthetic */ MarketingEvent access$getCardLinked$cp() {
        return cardLinked;
    }

    public static final /* synthetic */ MarketingEvent access$getCodeRedeemed$cp() {
        return codeRedeemed;
    }

    public static final /* synthetic */ MarketingEvent access$getCompleteRegistration$cp() {
        return completeRegistration;
    }

    public static final /* synthetic */ MarketingEvent access$getCompleteWaitlist$cp() {
        return completeWaitlist;
    }

    public static final /* synthetic */ MarketingEvent access$getKycCompleted$cp() {
        return kycCompleted;
    }

    public static final /* synthetic */ MarketingEvent access$getKycFailed$cp() {
        return kycFailed;
    }

    public static final /* synthetic */ MarketingEvent access$getKycStarted$cp() {
        return kycStarted;
    }

    public static final /* synthetic */ MarketingEvent access$getLogin$cp() {
        return login;
    }

    public static final /* synthetic */ MarketingEvent access$getPhoneVerified$cp() {
        return phoneVerified;
    }

    public static final /* synthetic */ MarketingEvent access$getSessionStarted$cp() {
        return sessionStarted;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getAppsFlyerEventName() {
        return Swift_appsFlyerEventName(getClass().getName());
    }

    public final Map<String, Object> getAppsFlyerParameters() {
        return Swift_appsFlyerParameters(getClass().getName());
    }

    public final String getBrazeEventName() {
        return Swift_brazeEventName(getClass().getName());
    }

    public final Map<String, Object> getBrazeProperties() {
        return Swift_brazeProperties(getClass().getName());
    }

    public final String getFirebaseEventName() {
        return Swift_firebaseEventName(getClass().getName());
    }

    public final Map<String, Object> getFirebaseParameters() {
        return Swift_firebaseParameters(getClass().getName());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001aJ\u0016\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#J\u000e\u0010'\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#J\u0016\u0010(\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u000e\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u001aJ\u000e\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u001aJB\u0010,\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#2\b\u0010-\u001a\u0004\u0018\u00010\u001a2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020#2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001002\b\u00101\u001a\u0004\u0018\u00010\u001aJR\u00102\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#2\b\u0010-\u001a\u0004\u0018\u00010\u001a2\u0006\u0010*\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020#2\u0006\u00104\u001a\u0002052\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001002\b\u00101\u001a\u0004\u0018\u00010\u001aJ2\u00106\u001a\u00020\u00052\u0006\u00107\u001a\u0002052\u0006\u0010\"\u001a\u00020#2\b\u0010-\u001a\u0004\u0018\u00010\u001a2\u0006\u0010*\u001a\u00020\u001a2\b\u00101\u001a\u0004\u0018\u00010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0007¨\u00068"}, d2 = {"Lcom/polymarket/clients/MarketingEvent$Companion;", "", "<init>", "()V", "login", "Lcom/polymarket/clients/MarketingEvent;", "getLogin", "()Lcom/polymarket/clients/MarketingEvent;", "completeWaitlist", "getCompleteWaitlist", "completeRegistration", "getCompleteRegistration", "codeRedeemed", "getCodeRedeemed", "kycStarted", "getKycStarted", "phoneVerified", "getPhoneVerified", "kycCompleted", "getKycCompleted", "kycFailed", "getKycFailed", "sessionStarted", "getSessionStarted", "marketSearched", "queryText", "", "marketFiltered", "categorySelected", "bankLinked", "getBankLinked", "cardLinked", "getCardLinked", "depositInitiated", "amount", "Lcom/polymarket/data/EAmount;", "paymentSelection", "Lcom/polymarket/data/EPaymentSelection;", "depositFailed", "firstTimeDeposit", "withdrawalInitiated", "tradeStarted", "marketSlug", "eventDetailView", "firstTimeTrade", "category", "fees", "eventTagSlugs", "", "contentId", "trade", "side", "isPartialFill", "", "tradeSettled", "won", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MarketingEvent depositFailed(EAmount amount) {
            amount.getClass();
            return new DepositFailedCase(amount);
        }

        public final MarketingEvent depositInitiated(EAmount amount, EPaymentSelection paymentSelection) {
            amount.getClass();
            paymentSelection.getClass();
            return new DepositInitiatedCase(amount, paymentSelection);
        }

        public final MarketingEvent eventDetailView(String marketSlug) {
            marketSlug.getClass();
            return new EventDetailViewCase(marketSlug);
        }

        public final MarketingEvent firstTimeDeposit(EAmount amount) {
            amount.getClass();
            return new FirstTimeDepositCase(amount);
        }

        public final MarketingEvent firstTimeTrade(EAmount amount, String category, String marketSlug, EAmount fees, List<String> eventTagSlugs, String contentId) {
            amount.getClass();
            marketSlug.getClass();
            fees.getClass();
            return new FirstTimeTradeCase(amount, category, marketSlug, fees, eventTagSlugs, contentId);
        }

        public final MarketingEvent getBankLinked() {
            return MarketingEvent.access$getBankLinked$cp();
        }

        public final MarketingEvent getCardLinked() {
            return MarketingEvent.access$getCardLinked$cp();
        }

        public final MarketingEvent getCodeRedeemed() {
            return MarketingEvent.access$getCodeRedeemed$cp();
        }

        public final MarketingEvent getCompleteRegistration() {
            return MarketingEvent.access$getCompleteRegistration$cp();
        }

        public final MarketingEvent getCompleteWaitlist() {
            return MarketingEvent.access$getCompleteWaitlist$cp();
        }

        public final MarketingEvent getKycCompleted() {
            return MarketingEvent.access$getKycCompleted$cp();
        }

        public final MarketingEvent getKycFailed() {
            return MarketingEvent.access$getKycFailed$cp();
        }

        public final MarketingEvent getKycStarted() {
            return MarketingEvent.access$getKycStarted$cp();
        }

        public final MarketingEvent getLogin() {
            return MarketingEvent.access$getLogin$cp();
        }

        public final MarketingEvent getPhoneVerified() {
            return MarketingEvent.access$getPhoneVerified$cp();
        }

        public final MarketingEvent getSessionStarted() {
            return MarketingEvent.access$getSessionStarted$cp();
        }

        public final MarketingEvent marketFiltered(String categorySelected) {
            categorySelected.getClass();
            return new MarketFilteredCase(categorySelected);
        }

        public final MarketingEvent marketSearched(String queryText) {
            queryText.getClass();
            return new MarketSearchedCase(queryText);
        }

        public final MarketingEvent trade(EAmount amount, String category, String marketSlug, String side, EAmount fees, boolean isPartialFill, List<String> eventTagSlugs, String contentId) {
            amount.getClass();
            marketSlug.getClass();
            side.getClass();
            fees.getClass();
            return new TradeCase(amount, category, marketSlug, side, fees, isPartialFill, eventTagSlugs, contentId);
        }

        public final MarketingEvent tradeSettled(boolean won, EAmount amount, String category, String marketSlug, String contentId) {
            amount.getClass();
            marketSlug.getClass();
            return new TradeSettledCase(won, amount, category, marketSlug, contentId);
        }

        public final MarketingEvent tradeStarted(String marketSlug) {
            marketSlug.getClass();
            return new TradeStartedCase(marketSlug);
        }

        public final MarketingEvent withdrawalInitiated(EAmount amount, EPaymentSelection paymentSelection) {
            amount.getClass();
            paymentSelection.getClass();
            return new WithdrawalInitiatedCase(amount, paymentSelection);
        }

        private Companion() {
        }
    }

    private MarketingEvent() {
    }
}
