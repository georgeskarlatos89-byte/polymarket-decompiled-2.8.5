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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u001aB\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u001b"}, d2 = {"Lcom/polymarket/data/EComboConflictType;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "mutuallyExclusive", "redundant", "sameMarket", "legNotTradable", "legAlreadyResolved", "maxLegsExceeded", "legNotEligible", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EComboConflictType implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ EComboConflictType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final EComboConflictType mutuallyExclusive = new EComboConflictType("mutuallyExclusive", 0, "COMBO_CONFLICT_TYPE_MUTUALLY_EXCLUSIVE", null, 2, null);
    public static final EComboConflictType redundant = new EComboConflictType("redundant", 1, "COMBO_CONFLICT_TYPE_REDUNDANT", null, 2, null);
    public static final EComboConflictType sameMarket = new EComboConflictType("sameMarket", 2, "COMBO_CONFLICT_TYPE_SAME_MARKET", null, 2, null);
    public static final EComboConflictType legNotTradable = new EComboConflictType("legNotTradable", 3, "COMBO_CONFLICT_TYPE_LEG_NOT_TRADABLE", null, 2, null);
    public static final EComboConflictType legAlreadyResolved = new EComboConflictType("legAlreadyResolved", 4, "COMBO_CONFLICT_TYPE_LEG_ALREADY_RESOLVED", null, 2, null);
    public static final EComboConflictType maxLegsExceeded = new EComboConflictType("maxLegsExceeded", 5, "COMBO_CONFLICT_TYPE_MAX_LEGS_EXCEEDED", null, 2, null);
    public static final EComboConflictType legNotEligible = new EComboConflictType("legNotEligible", 6, "COMBO_CONFLICT_TYPE_LEG_NOT_ELIGIBLE", null, 2, null);
    public static final EComboConflictType unknown = new EComboConflictType("unknown", 7, "COMBO_CONFLICT_TYPE_UNSPECIFIED", null, 2, null);

    private static final /* synthetic */ EComboConflictType[] $values() {
        return new EComboConflictType[]{mutuallyExclusive, redundant, sameMarket, legNotTradable, legAlreadyResolved, maxLegsExceeded, legNotEligible, unknown};
    }

    static {
        EComboConflictType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ EComboConflictType(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static EComboConflictType valueOf(String str) {
        return (EComboConflictType) Enum.valueOf(EComboConflictType.class, str);
    }

    public static EComboConflictType[] values() {
        return (EComboConflictType[]) $VALUES.clone();
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
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EComboConflictType$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EComboConflictType;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EComboConflictType init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -1523209095:
                    if (!rawValue.equals("COMBO_CONFLICT_TYPE_LEG_ALREADY_RESOLVED")) {
                        return null;
                    }
                    return EComboConflictType.legAlreadyResolved;
                case -649125687:
                    if (rawValue.equals("COMBO_CONFLICT_TYPE_MUTUALLY_EXCLUSIVE")) {
                        return EComboConflictType.mutuallyExclusive;
                    }
                    return null;
                case 313069373:
                    if (rawValue.equals("COMBO_CONFLICT_TYPE_LEG_NOT_ELIGIBLE")) {
                        return EComboConflictType.legNotEligible;
                    }
                    return null;
                case 564554985:
                    if (rawValue.equals("COMBO_CONFLICT_TYPE_MAX_LEGS_EXCEEDED")) {
                        return EComboConflictType.maxLegsExceeded;
                    }
                    return null;
                case 810478148:
                    if (rawValue.equals("COMBO_CONFLICT_TYPE_REDUNDANT")) {
                        return EComboConflictType.redundant;
                    }
                    return null;
                case 1483433313:
                    if (rawValue.equals("COMBO_CONFLICT_TYPE_LEG_NOT_TRADABLE")) {
                        return EComboConflictType.legNotTradable;
                    }
                    return null;
                case 1727575532:
                    if (rawValue.equals("COMBO_CONFLICT_TYPE_SAME_MARKET")) {
                        return EComboConflictType.sameMarket;
                    }
                    return null;
                case 2025662158:
                    if (rawValue.equals("COMBO_CONFLICT_TYPE_UNSPECIFIED")) {
                        return EComboConflictType.unknown;
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

    private EComboConflictType(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
