package com.polymarket.clients;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u001bB\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u0019\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0082 J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u001c"}, d2 = {"Lcom/polymarket/clients/ClientStripeCardFunding;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "debit", "credit", "prepaid", "unknown", "isAcceptedForDeposits", "", "creditCardsEnabled", "Swift_isAcceptedForDeposits_1", Keys.KEY_NAME, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ClientStripeCardFunding implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ClientStripeCardFunding[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final ClientStripeCardFunding debit = new ClientStripeCardFunding("debit", 0, "debit", null, 2, null);
    public static final ClientStripeCardFunding credit = new ClientStripeCardFunding("credit", 1, "credit", null, 2, null);
    public static final ClientStripeCardFunding prepaid = new ClientStripeCardFunding("prepaid", 2, "prepaid", null, 2, null);
    public static final ClientStripeCardFunding unknown = new ClientStripeCardFunding("unknown", 3, "unknown", null, 2, null);

    private static final /* synthetic */ ClientStripeCardFunding[] $values() {
        return new ClientStripeCardFunding[]{debit, credit, prepaid, unknown};
    }

    static {
        ClientStripeCardFunding[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ ClientStripeCardFunding(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native boolean Swift_isAcceptedForDeposits_1(String name, boolean creditCardsEnabled);

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ClientStripeCardFunding valueOf(String str) {
        return (ClientStripeCardFunding) Enum.valueOf(ClientStripeCardFunding.class, str);
    }

    public static ClientStripeCardFunding[] values() {
        return (ClientStripeCardFunding[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    public final boolean isAcceptedForDeposits(boolean creditCardsEnabled) {
        return Swift_isAcceptedForDeposits_1(name(), creditCardsEnabled);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0013\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0082 J \u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nJ#\u0010\u000e\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0082 J \u0010\u000f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nJ#\u0010\u0010\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0082 J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0007¨\u0006\u0013"}, d2 = {"Lcom/polymarket/clients/ClientStripeCardFunding$Companion;", "", "<init>", "()V", TicketDetailDestinationKt.LAUNCHED_FROM, "Lcom/polymarket/clients/ClientStripeCardFunding;", "stripeValue", "", "Swift_Companion_from_0", "isDepositable", "", "cardFunding", "isCard", "creditCardsEnabled", "Swift_Companion_isDepositable_2", "depositRejectionMessage", "Swift_Companion_depositRejectionMessage_3", "init", "rawValue", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native String Swift_Companion_depositRejectionMessage_3(String cardFunding, boolean isCard, boolean creditCardsEnabled);

        private final native ClientStripeCardFunding Swift_Companion_from_0(String stripeValue);

        private final native boolean Swift_Companion_isDepositable_2(String cardFunding, boolean isCard, boolean creditCardsEnabled);

        public final String depositRejectionMessage(String cardFunding, boolean isCard, boolean creditCardsEnabled) {
            return Swift_Companion_depositRejectionMessage_3(cardFunding, isCard, creditCardsEnabled);
        }

        public final ClientStripeCardFunding from(String stripeValue) {
            return Swift_Companion_from_0(stripeValue);
        }

        public final ClientStripeCardFunding init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -1352291591:
                    if (!rawValue.equals("credit")) {
                        return null;
                    }
                    return ClientStripeCardFunding.credit;
                case -318370833:
                    if (rawValue.equals("prepaid")) {
                        return ClientStripeCardFunding.prepaid;
                    }
                    return null;
                case -284840886:
                    if (rawValue.equals("unknown")) {
                        return ClientStripeCardFunding.unknown;
                    }
                    return null;
                case 95458540:
                    if (rawValue.equals("debit")) {
                        return ClientStripeCardFunding.debit;
                    }
                    return null;
                default:
                    return null;
            }
        }

        public final boolean isDepositable(String cardFunding, boolean isCard, boolean creditCardsEnabled) {
            return Swift_Companion_isDepositable_2(cardFunding, isCard, creditCardsEnabled);
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public String getRawValue() {
        return this.rawValue;
    }

    private ClientStripeCardFunding(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
