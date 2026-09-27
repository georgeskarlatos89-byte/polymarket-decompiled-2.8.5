package com.polymarket.data;

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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001\u0019B\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u001a"}, d2 = {"Lcom/polymarket/data/GeoPrivacySignal;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "vpn", "proxy", "tor", "relay", "hosting", "residentialProxy", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GeoPrivacySignal implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ GeoPrivacySignal[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final GeoPrivacySignal vpn = new GeoPrivacySignal("vpn", 0, "vpn", null, 2, null);
    public static final GeoPrivacySignal proxy = new GeoPrivacySignal("proxy", 1, "proxy", null, 2, null);
    public static final GeoPrivacySignal tor = new GeoPrivacySignal("tor", 2, "tor", null, 2, null);
    public static final GeoPrivacySignal relay = new GeoPrivacySignal("relay", 3, "relay", null, 2, null);
    public static final GeoPrivacySignal hosting = new GeoPrivacySignal("hosting", 4, "hosting", null, 2, null);
    public static final GeoPrivacySignal residentialProxy = new GeoPrivacySignal("residentialProxy", 5, "residentialProxy", null, 2, null);

    private static final /* synthetic */ GeoPrivacySignal[] $values() {
        return new GeoPrivacySignal[]{vpn, proxy, tor, relay, hosting, residentialProxy};
    }

    static {
        GeoPrivacySignal[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ GeoPrivacySignal(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static GeoPrivacySignal valueOf(String str) {
        return (GeoPrivacySignal) Enum.valueOf(GeoPrivacySignal.class, str);
    }

    public static GeoPrivacySignal[] values() {
        return (GeoPrivacySignal[]) $VALUES.clone();
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
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/data/GeoPrivacySignal$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/data/GeoPrivacySignal;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion implements CaseIterableCompanion<GeoPrivacySignal> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.lib.CaseIterableCompanion
        public Array<GeoPrivacySignal> getAllCases() {
            return ArrayKt.arrayOf(GeoPrivacySignal.vpn, GeoPrivacySignal.proxy, GeoPrivacySignal.tor, GeoPrivacySignal.relay, GeoPrivacySignal.hosting, GeoPrivacySignal.residentialProxy);
        }

        public final GeoPrivacySignal init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case 115031:
                    if (!rawValue.equals("tor")) {
                        return null;
                    }
                    return GeoPrivacySignal.tor;
                case 116980:
                    if (rawValue.equals("vpn")) {
                        return GeoPrivacySignal.vpn;
                    }
                    return null;
                case 106941038:
                    if (rawValue.equals("proxy")) {
                        return GeoPrivacySignal.proxy;
                    }
                    return null;
                case 108397201:
                    if (rawValue.equals("relay")) {
                        return GeoPrivacySignal.relay;
                    }
                    return null;
                case 1098703162:
                    if (rawValue.equals("hosting")) {
                        return GeoPrivacySignal.hosting;
                    }
                    return null;
                case 2056590794:
                    if (rawValue.equals("residentialProxy")) {
                        return GeoPrivacySignal.residentialProxy;
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

    private GeoPrivacySignal(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
