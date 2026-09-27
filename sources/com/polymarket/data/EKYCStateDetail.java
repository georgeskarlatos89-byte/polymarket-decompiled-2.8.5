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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0017B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0018"}, d2 = {"Lcom/polymarket/data/EKYCStateDetail;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "approvedProvisioning", "actionRequiredDocv", "deniedResubmit", "deniedTerminal", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EKYCStateDetail implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ EKYCStateDetail[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final EKYCStateDetail approvedProvisioning = new EKYCStateDetail("approvedProvisioning", 0, "KYC_STATUS_DETAIL_APPROVED_PROVISIONING", null, 2, null);
    public static final EKYCStateDetail actionRequiredDocv = new EKYCStateDetail("actionRequiredDocv", 1, "KYC_STATUS_DETAIL_ACTION_REQUIRED_DOCV", null, 2, null);
    public static final EKYCStateDetail deniedResubmit = new EKYCStateDetail("deniedResubmit", 2, "KYC_STATUS_DETAIL_DENIED_RESUBMIT", null, 2, null);
    public static final EKYCStateDetail deniedTerminal = new EKYCStateDetail("deniedTerminal", 3, "KYC_STATUS_DETAIL_DENIED_TERMINAL", null, 2, null);
    public static final EKYCStateDetail unknown = new EKYCStateDetail("unknown", 4, "KYC_STATUS_DETAIL_UNSPECIFIED", null, 2, null);

    private static final /* synthetic */ EKYCStateDetail[] $values() {
        return new EKYCStateDetail[]{approvedProvisioning, actionRequiredDocv, deniedResubmit, deniedTerminal, unknown};
    }

    static {
        EKYCStateDetail[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ EKYCStateDetail(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static EKYCStateDetail valueOf(String str) {
        return (EKYCStateDetail) Enum.valueOf(EKYCStateDetail.class, str);
    }

    public static EKYCStateDetail[] values() {
        return (EKYCStateDetail[]) $VALUES.clone();
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
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EKYCStateDetail$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EKYCStateDetail;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EKYCStateDetail init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -1633378708:
                    if (!rawValue.equals("KYC_STATUS_DETAIL_UNSPECIFIED")) {
                        return null;
                    }
                    return EKYCStateDetail.unknown;
                case -1238579062:
                    if (rawValue.equals("KYC_STATUS_DETAIL_APPROVED_PROVISIONING")) {
                        return EKYCStateDetail.approvedProvisioning;
                    }
                    return null;
                case 1054556384:
                    if (rawValue.equals("KYC_STATUS_DETAIL_ACTION_REQUIRED_DOCV")) {
                        return EKYCStateDetail.actionRequiredDocv;
                    }
                    return null;
                case 1107390325:
                    if (rawValue.equals("KYC_STATUS_DETAIL_DENIED_TERMINAL")) {
                        return EKYCStateDetail.deniedTerminal;
                    }
                    return null;
                case 1952545028:
                    if (rawValue.equals("KYC_STATUS_DETAIL_DENIED_RESUBMIT")) {
                        return EKYCStateDetail.deniedResubmit;
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

    private EKYCStateDetail(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
