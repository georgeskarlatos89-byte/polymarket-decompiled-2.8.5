package com.polymarket.clients;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00182\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001\u0018B\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0019"}, d2 = {"Lcom/polymarket/clients/ClientExperimentKey;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "inAppWebOnboarding", "pickemPropsRail", "premadeComboCard", "expandedLineDial", "tradeSheetComboEntry", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientExperimentKey implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ClientExperimentKey[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final ClientExperimentKey inAppWebOnboarding = new ClientExperimentKey("inAppWebOnboarding", 0, "exp-in-app-web-onboarding", null, 2, null);
    public static final ClientExperimentKey pickemPropsRail = new ClientExperimentKey("pickemPropsRail", 1, "exp-pickem-props-rail", null, 2, null);
    public static final ClientExperimentKey premadeComboCard = new ClientExperimentKey("premadeComboCard", 2, "exp-premade-combo-card", null, 2, null);
    public static final ClientExperimentKey expandedLineDial = new ClientExperimentKey("expandedLineDial", 3, "exp-expanded-line-dial", null, 2, null);
    public static final ClientExperimentKey tradeSheetComboEntry = new ClientExperimentKey("tradeSheetComboEntry", 4, "exp-trade-sheet-combo-entry", null, 2, null);

    private static final /* synthetic */ ClientExperimentKey[] $values() {
        return new ClientExperimentKey[]{inAppWebOnboarding, pickemPropsRail, premadeComboCard, expandedLineDial, tradeSheetComboEntry};
    }

    static {
        ClientExperimentKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ ClientExperimentKey(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ClientExperimentKey valueOf(String str) {
        return (ClientExperimentKey) Enum.valueOf(ClientExperimentKey.class, str);
    }

    public static ClientExperimentKey[] values() {
        return (ClientExperimentKey[]) $VALUES.clone();
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
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/clients/ClientExperimentKey$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/clients/ClientExperimentKey;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion implements CaseIterableCompanion<ClientExperimentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.lib.CaseIterableCompanion
        public Array<ClientExperimentKey> getAllCases() {
            return ArrayKt.arrayOf(ClientExperimentKey.inAppWebOnboarding, ClientExperimentKey.pickemPropsRail, ClientExperimentKey.premadeComboCard, ClientExperimentKey.expandedLineDial, ClientExperimentKey.tradeSheetComboEntry);
        }

        public final ClientExperimentKey init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -1756296108:
                    if (!rawValue.equals("exp-premade-combo-card")) {
                        return null;
                    }
                    return ClientExperimentKey.premadeComboCard;
                case -1701919700:
                    if (rawValue.equals("exp-trade-sheet-combo-entry")) {
                        return ClientExperimentKey.tradeSheetComboEntry;
                    }
                    return null;
                case -1267467944:
                    if (rawValue.equals("exp-in-app-web-onboarding")) {
                        return ClientExperimentKey.inAppWebOnboarding;
                    }
                    return null;
                case 1954793955:
                    if (rawValue.equals("exp-pickem-props-rail")) {
                        return ClientExperimentKey.pickemPropsRail;
                    }
                    return null;
                case 2136194885:
                    if (rawValue.equals("exp-expanded-line-dial")) {
                        return ClientExperimentKey.expandedLineDial;
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

    private ClientExperimentKey(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
