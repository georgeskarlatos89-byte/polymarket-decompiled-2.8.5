package com.polymarket.clients;

import com.socure.docv.capturesdk.api.Keys;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001&B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0011\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0002H\u0082 J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$H\u0016J\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006'"}, d2 = {"Lcom/polymarket/clients/ClientSupportSource;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "errorAlert", "integrityCheck", "kycStatus", "profileSettings", "taxDocuments", "transactionDetail", "smsReverify", "userProfile", "wireDeposit", "wireWithdraw", "whaleDeposit", "home", "search", "live", "squads", "deepLink", "toAnalyticsInput", "Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_toAnalyticsInput_0", Keys.KEY_NAME, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientSupportSource implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ClientSupportSource[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final ClientSupportSource errorAlert = new ClientSupportSource("errorAlert", 0, "errorAlert", null, 2, null);
    public static final ClientSupportSource integrityCheck = new ClientSupportSource("integrityCheck", 1, "integrityCheck", null, 2, null);
    public static final ClientSupportSource kycStatus = new ClientSupportSource("kycStatus", 2, "kycStatus", null, 2, null);
    public static final ClientSupportSource profileSettings = new ClientSupportSource("profileSettings", 3, "profileSettings", null, 2, null);
    public static final ClientSupportSource taxDocuments = new ClientSupportSource("taxDocuments", 4, "taxDocuments", null, 2, null);
    public static final ClientSupportSource transactionDetail = new ClientSupportSource("transactionDetail", 5, "transactionDetail", null, 2, null);
    public static final ClientSupportSource smsReverify = new ClientSupportSource("smsReverify", 6, "smsReverify", null, 2, null);
    public static final ClientSupportSource userProfile = new ClientSupportSource("userProfile", 7, "userProfile", null, 2, null);
    public static final ClientSupportSource wireDeposit = new ClientSupportSource("wireDeposit", 8, "wireDeposit", null, 2, null);
    public static final ClientSupportSource wireWithdraw = new ClientSupportSource("wireWithdraw", 9, "wireWithdraw", null, 2, null);
    public static final ClientSupportSource whaleDeposit = new ClientSupportSource("whaleDeposit", 10, "whaleDeposit", null, 2, null);
    public static final ClientSupportSource home = new ClientSupportSource("home", 11, "home", null, 2, null);
    public static final ClientSupportSource search = new ClientSupportSource("search", 12, "search", null, 2, null);
    public static final ClientSupportSource live = new ClientSupportSource("live", 13, "live", null, 2, null);
    public static final ClientSupportSource squads = new ClientSupportSource("squads", 14, "squads", null, 2, null);
    public static final ClientSupportSource deepLink = new ClientSupportSource("deepLink", 15, "deepLink", null, 2, null);

    private static final /* synthetic */ ClientSupportSource[] $values() {
        return new ClientSupportSource[]{errorAlert, integrityCheck, kycStatus, profileSettings, taxDocuments, transactionDetail, smsReverify, userProfile, wireDeposit, wireWithdraw, whaleDeposit, home, search, live, squads, deepLink};
    }

    static {
        ClientSupportSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ ClientSupportSource(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native ClientAnalyticsInput Swift_toAnalyticsInput_0(String name);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ClientSupportSource valueOf(String str) {
        return (ClientSupportSource) Enum.valueOf(ClientSupportSource.class, str);
    }

    public static ClientSupportSource[] values() {
        return (ClientSupportSource[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    public final ClientAnalyticsInput toAnalyticsInput() {
        return Swift_toAnalyticsInput_0(name());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientSupportSource$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/clients/ClientSupportSource;", "rawValue", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ClientSupportSource init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -1192965457:
                    if (!rawValue.equals("wireWithdraw")) {
                        return null;
                    }
                    return ClientSupportSource.wireWithdraw;
                case -906336856:
                    if (rawValue.equals("search")) {
                        return ClientSupportSource.search;
                    }
                    return null;
                case -894675079:
                    if (rawValue.equals("squads")) {
                        return ClientSupportSource.squads;
                    }
                    return null;
                case -611292322:
                    if (rawValue.equals("userProfile")) {
                        return ClientSupportSource.userProfile;
                    }
                    return null;
                case -387608267:
                    if (rawValue.equals("whaleDeposit")) {
                        return ClientSupportSource.whaleDeposit;
                    }
                    return null;
                case 3208415:
                    if (rawValue.equals("home")) {
                        return ClientSupportSource.home;
                    }
                    return null;
                case 3322092:
                    if (rawValue.equals("live")) {
                        return ClientSupportSource.live;
                    }
                    return null;
                case 286096827:
                    if (rawValue.equals("integrityCheck")) {
                        return ClientSupportSource.integrityCheck;
                    }
                    return null;
                case 423830349:
                    if (rawValue.equals("taxDocuments")) {
                        return ClientSupportSource.taxDocuments;
                    }
                    return null;
                case 457457927:
                    if (rawValue.equals("kycStatus")) {
                        return ClientSupportSource.kycStatus;
                    }
                    return null;
                case 628280070:
                    if (rawValue.equals("deepLink")) {
                        return ClientSupportSource.deepLink;
                    }
                    return null;
                case 715017817:
                    if (rawValue.equals("wireDeposit")) {
                        return ClientSupportSource.wireDeposit;
                    }
                    return null;
                case 1501556972:
                    if (rawValue.equals("profileSettings")) {
                        return ClientSupportSource.profileSettings;
                    }
                    return null;
                case 1608240180:
                    if (rawValue.equals("errorAlert")) {
                        return ClientSupportSource.errorAlert;
                    }
                    return null;
                case 1960156389:
                    if (rawValue.equals("smsReverify")) {
                        return ClientSupportSource.smsReverify;
                    }
                    return null;
                case 2108799183:
                    if (rawValue.equals("transactionDetail")) {
                        return ClientSupportSource.transactionDetail;
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

    private ClientSupportSource(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
