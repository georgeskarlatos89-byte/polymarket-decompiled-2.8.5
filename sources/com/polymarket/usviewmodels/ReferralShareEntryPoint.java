package com.polymarket.usviewmodels;

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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0019B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u001a"}, d2 = {"Lcom/polymarket/usviewmodels/ReferralShareEntryPoint;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "deeplink", "home", "live", "profile", "settings", "sportsTeam", "squads", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ReferralShareEntryPoint implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ReferralShareEntryPoint[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ReferralShareEntryPoint deeplink = new ReferralShareEntryPoint("deeplink", 0, "deeplink", null, 2, null);
    public static final ReferralShareEntryPoint home = new ReferralShareEntryPoint("home", 1, "home", null, 2, null);
    public static final ReferralShareEntryPoint live = new ReferralShareEntryPoint("live", 2, "live", null, 2, null);
    public static final ReferralShareEntryPoint profile = new ReferralShareEntryPoint("profile", 3, "profile", null, 2, null);
    public static final ReferralShareEntryPoint settings = new ReferralShareEntryPoint("settings", 4, "settings", null, 2, null);
    public static final ReferralShareEntryPoint sportsTeam = new ReferralShareEntryPoint("sportsTeam", 5, "sports_team", null, 2, null);
    public static final ReferralShareEntryPoint squads = new ReferralShareEntryPoint("squads", 6, "squads", null, 2, null);
    private final String rawValue;

    private static final /* synthetic */ ReferralShareEntryPoint[] $values() {
        return new ReferralShareEntryPoint[]{deeplink, home, live, profile, settings, sportsTeam, squads};
    }

    static {
        ReferralShareEntryPoint[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ ReferralShareEntryPoint(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ReferralShareEntryPoint valueOf(String str) {
        return (ReferralShareEntryPoint) Enum.valueOf(ReferralShareEntryPoint.class, str);
    }

    public static ReferralShareEntryPoint[] values() {
        return (ReferralShareEntryPoint[]) $VALUES.clone();
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
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ReferralShareEntryPoint$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/ReferralShareEntryPoint;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ReferralShareEntryPoint init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -894675079:
                    if (!rawValue.equals("squads")) {
                        return null;
                    }
                    return ReferralShareEntryPoint.squads;
                case -309425751:
                    if (rawValue.equals("profile")) {
                        return ReferralShareEntryPoint.profile;
                    }
                    return null;
                case 3208415:
                    if (rawValue.equals("home")) {
                        return ReferralShareEntryPoint.home;
                    }
                    return null;
                case 3322092:
                    if (rawValue.equals("live")) {
                        return ReferralShareEntryPoint.live;
                    }
                    return null;
                case 282135325:
                    if (rawValue.equals("sports_team")) {
                        return ReferralShareEntryPoint.sportsTeam;
                    }
                    return null;
                case 629233382:
                    if (rawValue.equals("deeplink")) {
                        return ReferralShareEntryPoint.deeplink;
                    }
                    return null;
                case 1434631203:
                    if (rawValue.equals("settings")) {
                        return ReferralShareEntryPoint.settings;
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

    private ReferralShareEntryPoint(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
