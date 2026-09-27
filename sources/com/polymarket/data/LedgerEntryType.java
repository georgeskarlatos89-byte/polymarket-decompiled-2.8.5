package com.polymarket.data;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001)B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020'H\u0016J\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020'H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006*"}, d2 = {"Lcom/polymarket/data/LedgerEntryType;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "deposit", "withdrawal", "orderExecution", "correction", "netting", "resolution", "manualAdjustment", "positionBalanceAdjustment", "positionMarkToMarket", "accountPropertyAdjustment", "commission", "contractExpiration", "pendingCreditAdjustment", "beginningOfDay", "positionWithdrawal", "withdrawalRejection", "manualTransfer", "averagePriceTransfer", "giveUp", "synchronization", "interest", "pendingWithdrawalCreation", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LedgerEntryType implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ LedgerEntryType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final LedgerEntryType deposit = new LedgerEntryType("deposit", 0, "LEDGER_ENTRY_TYPE_DEPOSIT", null, 2, null);
    public static final LedgerEntryType withdrawal = new LedgerEntryType("withdrawal", 1, "LEDGER_ENTRY_TYPE_WITHDRAWAL", null, 2, null);
    public static final LedgerEntryType orderExecution = new LedgerEntryType("orderExecution", 2, "LEDGER_ENTRY_TYPE_ORDER_EXECUTION", null, 2, null);
    public static final LedgerEntryType correction = new LedgerEntryType("correction", 3, "LEDGER_ENTRY_TYPE_CORRECTION", null, 2, null);
    public static final LedgerEntryType netting = new LedgerEntryType("netting", 4, "LEDGER_ENTRY_TYPE_NETTING", null, 2, null);
    public static final LedgerEntryType resolution = new LedgerEntryType("resolution", 5, "LEDGER_ENTRY_TYPE_RESOLUTION", null, 2, null);
    public static final LedgerEntryType manualAdjustment = new LedgerEntryType("manualAdjustment", 6, "LEDGER_ENTRY_TYPE_MANUAL_ADJUSTMENT", null, 2, null);
    public static final LedgerEntryType positionBalanceAdjustment = new LedgerEntryType("positionBalanceAdjustment", 7, "LEDGER_ENTRY_TYPE_POSITION_BALANCE_ADJUSTMENT", null, 2, null);
    public static final LedgerEntryType positionMarkToMarket = new LedgerEntryType("positionMarkToMarket", 8, "LEDGER_ENTRY_TYPE_POSITION_MARK_TO_MARKET", null, 2, null);
    public static final LedgerEntryType accountPropertyAdjustment = new LedgerEntryType("accountPropertyAdjustment", 9, "LEDGER_ENTRY_TYPE_ACCOUNT_PROPERTY_ADJUSTMENT", null, 2, null);
    public static final LedgerEntryType commission = new LedgerEntryType("commission", 10, "LEDGER_ENTRY_TYPE_COMMISSION", null, 2, null);
    public static final LedgerEntryType contractExpiration = new LedgerEntryType("contractExpiration", 11, "LEDGER_ENTRY_TYPE_CONTRACT_EXPIRATION", null, 2, null);
    public static final LedgerEntryType pendingCreditAdjustment = new LedgerEntryType("pendingCreditAdjustment", 12, "LEDGER_ENTRY_TYPE_PENDING_CREDIT_ADJUSTMENT", null, 2, null);
    public static final LedgerEntryType beginningOfDay = new LedgerEntryType("beginningOfDay", 13, "LEDGER_ENTRY_TYPE_BEGINNING_OF_DAY", null, 2, null);
    public static final LedgerEntryType positionWithdrawal = new LedgerEntryType("positionWithdrawal", 14, "LEDGER_ENTRY_TYPE_POSITION_WITHDRAWAL", null, 2, null);
    public static final LedgerEntryType withdrawalRejection = new LedgerEntryType("withdrawalRejection", 15, "LEDGER_ENTRY_TYPE_WITHDRAWAL_REJECTION", null, 2, null);
    public static final LedgerEntryType manualTransfer = new LedgerEntryType("manualTransfer", 16, "LEDGER_ENTRY_TYPE_MANUAL_TRANSFER", null, 2, null);
    public static final LedgerEntryType averagePriceTransfer = new LedgerEntryType("averagePriceTransfer", 17, "LEDGER_ENTRY_TYPE_AVERAGE_PRICE_TRANSFER", null, 2, null);
    public static final LedgerEntryType giveUp = new LedgerEntryType("giveUp", 18, "LEDGER_ENTRY_TYPE_GIVE_UP", null, 2, null);
    public static final LedgerEntryType synchronization = new LedgerEntryType("synchronization", 19, "LEDGER_ENTRY_TYPE_SYNCHRONIZATION", null, 2, null);
    public static final LedgerEntryType interest = new LedgerEntryType("interest", 20, "LEDGER_ENTRY_TYPE_INTEREST", null, 2, null);
    public static final LedgerEntryType pendingWithdrawalCreation = new LedgerEntryType("pendingWithdrawalCreation", 21, "LEDGER_ENTRY_TYPE_PENDING_WITHDRAWAL_CREATION", null, 2, null);
    public static final LedgerEntryType unknown = new LedgerEntryType("unknown", 22, "UNKNOWN", null, 2, null);

    private static final /* synthetic */ LedgerEntryType[] $values() {
        return new LedgerEntryType[]{deposit, withdrawal, orderExecution, correction, netting, resolution, manualAdjustment, positionBalanceAdjustment, positionMarkToMarket, accountPropertyAdjustment, commission, contractExpiration, pendingCreditAdjustment, beginningOfDay, positionWithdrawal, withdrawalRejection, manualTransfer, averagePriceTransfer, giveUp, synchronization, interest, pendingWithdrawalCreation, unknown};
    }

    static {
        LedgerEntryType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ LedgerEntryType(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static LedgerEntryType valueOf(String str) {
        return (LedgerEntryType) Enum.valueOf(LedgerEntryType.class, str);
    }

    public static LedgerEntryType[] values() {
        return (LedgerEntryType[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/LedgerEntryType$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/LedgerEntryType;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LedgerEntryType init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -1507591547:
                    if (!rawValue.equals("LEDGER_ENTRY_TYPE_ORDER_EXECUTION")) {
                        return null;
                    }
                    return LedgerEntryType.orderExecution;
                case -1336137239:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_POSITION_WITHDRAWAL")) {
                        return LedgerEntryType.positionWithdrawal;
                    }
                    return null;
                case -1320743540:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_INTEREST")) {
                        return LedgerEntryType.interest;
                    }
                    return null;
                case -1224608924:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_MANUAL_ADJUSTMENT")) {
                        return LedgerEntryType.manualAdjustment;
                    }
                    return null;
                case -971583677:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_ACCOUNT_PROPERTY_ADJUSTMENT")) {
                        return LedgerEntryType.accountPropertyAdjustment;
                    }
                    return null;
                case -918576038:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_CONTRACT_EXPIRATION")) {
                        return LedgerEntryType.contractExpiration;
                    }
                    return null;
                case -850519065:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_GIVE_UP")) {
                        return LedgerEntryType.giveUp;
                    }
                    return null;
                case -711273566:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_MANUAL_TRANSFER")) {
                        return LedgerEntryType.manualTransfer;
                    }
                    return null;
                case -480095167:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_WITHDRAWAL_REJECTION")) {
                        return LedgerEntryType.withdrawalRejection;
                    }
                    return null;
                case -112032354:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_SYNCHRONIZATION")) {
                        return LedgerEntryType.synchronization;
                    }
                    return null;
                case -24398967:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_PENDING_CREDIT_ADJUSTMENT")) {
                        return LedgerEntryType.pendingCreditAdjustment;
                    }
                    return null;
                case 200239928:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_BEGINNING_OF_DAY")) {
                        return LedgerEntryType.beginningOfDay;
                    }
                    return null;
                case 397987533:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_COMMISSION")) {
                        return LedgerEntryType.commission;
                    }
                    return null;
                case 433141802:
                    if (rawValue.equals("UNKNOWN")) {
                        return LedgerEntryType.unknown;
                    }
                    return null;
                case 535392576:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_CORRECTION")) {
                        return LedgerEntryType.correction;
                    }
                    return null;
                case 579944127:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_PENDING_WITHDRAWAL_CREATION")) {
                        return LedgerEntryType.pendingWithdrawalCreation;
                    }
                    return null;
                case 662165468:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_DEPOSIT")) {
                        return LedgerEntryType.deposit;
                    }
                    return null;
                case 793472706:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_POSITION_MARK_TO_MARKET")) {
                        return LedgerEntryType.positionMarkToMarket;
                    }
                    return null;
                case 951101257:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_NETTING")) {
                        return LedgerEntryType.netting;
                    }
                    return null;
                case 1480600485:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_AVERAGE_PRICE_TRANSFER")) {
                        return LedgerEntryType.averagePriceTransfer;
                    }
                    return null;
                case 2045103767:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_WITHDRAWAL")) {
                        return LedgerEntryType.withdrawal;
                    }
                    return null;
                case 2074659470:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_RESOLUTION")) {
                        return LedgerEntryType.resolution;
                    }
                    return null;
                case 2085270532:
                    if (rawValue.equals("LEDGER_ENTRY_TYPE_POSITION_BALANCE_ADJUSTMENT")) {
                        return LedgerEntryType.positionBalanceAdjustment;
                    }
                    return null;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public String getRawValue() {
        return this.rawValue;
    }

    private LedgerEntryType(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
