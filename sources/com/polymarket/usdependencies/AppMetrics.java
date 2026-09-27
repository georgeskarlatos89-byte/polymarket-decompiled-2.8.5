package com.polymarket.usdependencies;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/polymarket/usdependencies/AppMetrics;", "", "<init>", "(Ljava/lang/String;I)V", "Launch", "HomeFeed", "Chat", "Realtime", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppMetrics {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ AppMetrics[] $VALUES;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/usdependencies/AppMetrics$Chat;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Chat {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Chat[] $VALUES;

        private static final /* synthetic */ Chat[] $values() {
            return new Chat[0];
        }

        static {
            Chat[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Chat(String str, int i) {
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Chat valueOf(String str) {
            return (Chat) Enum.valueOf(Chat.class, str);
        }

        public static Chat[] values() {
            return (Chat[]) $VALUES.clone();
        }
    }

    private static final /* synthetic */ AppMetrics[] $values() {
        return new AppMetrics[0];
    }

    static {
        AppMetrics[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private AppMetrics(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static AppMetrics valueOf(String str) {
        return (AppMetrics) Enum.valueOf(AppMetrics.class, str);
    }

    public static AppMetrics[] values() {
        return (AppMetrics[]) $VALUES.clone();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/polymarket/usdependencies/AppMetrics$Launch;", "", "<init>", "(Ljava/lang/String;I)V", "DivertedReason", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Launch {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Launch[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        private static final /* synthetic */ Launch[] $values() {
            return new Launch[0];
        }

        static {
            Launch[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Launch(String str, int i) {
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Launch valueOf(String str) {
            return (Launch) Enum.valueOf(Launch.class, str);
        }

        public static Launch[] values() {
            return (Launch[]) $VALUES.clone();
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0018B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0019"}, d2 = {"Lcom/polymarket/usdependencies/AppMetrics$Launch$DivertedReason;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "jailbreak", "expired", "integrityDenied", "geoBlocked", "geoUnavailable", "waitlist", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class DivertedReason implements RawRepresentable<String>, SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ DivertedReason[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String rawValue;
            public static final DivertedReason jailbreak = new DivertedReason("jailbreak", 0, "jailbreak", null, 2, null);
            public static final DivertedReason expired = new DivertedReason("expired", 1, "expired", null, 2, null);
            public static final DivertedReason integrityDenied = new DivertedReason("integrityDenied", 2, "integrity_denied", null, 2, null);
            public static final DivertedReason geoBlocked = new DivertedReason("geoBlocked", 3, "geo_blocked", null, 2, null);
            public static final DivertedReason geoUnavailable = new DivertedReason("geoUnavailable", 4, "geo_unavailable", null, 2, null);
            public static final DivertedReason waitlist = new DivertedReason("waitlist", 5, "waitlist", null, 2, null);

            private static final /* synthetic */ DivertedReason[] $values() {
                return new DivertedReason[]{jailbreak, expired, integrityDenied, geoBlocked, geoUnavailable, waitlist};
            }

            static {
                DivertedReason[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            public /* synthetic */ DivertedReason(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, str2, (i2 & 2) != 0 ? null : r4);
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static DivertedReason valueOf(String str) {
                return (DivertedReason) Enum.valueOf(DivertedReason.class, str);
            }

            public static DivertedReason[] values() {
                return (DivertedReason[]) $VALUES.clone();
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
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usdependencies/AppMetrics$Launch$DivertedReason$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usdependencies/AppMetrics$Launch$DivertedReason;", "rawValue", "", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final DivertedReason init(String rawValue) {
                    rawValue.getClass();
                    switch (rawValue.hashCode()) {
                        case -1309235419:
                            if (!rawValue.equals("expired")) {
                                return null;
                            }
                            return DivertedReason.expired;
                        case -972744499:
                            if (rawValue.equals("integrity_denied")) {
                                return DivertedReason.integrityDenied;
                            }
                            return null;
                        case 246054803:
                            if (rawValue.equals("waitlist")) {
                                return DivertedReason.waitlist;
                            }
                            return null;
                        case 502413054:
                            if (rawValue.equals("geo_blocked")) {
                                return DivertedReason.geoBlocked;
                            }
                            return null;
                        case 821821605:
                            if (rawValue.equals("jailbreak")) {
                                return DivertedReason.jailbreak;
                            }
                            return null;
                        case 1641698402:
                            if (rawValue.equals("geo_unavailable")) {
                                return DivertedReason.geoUnavailable;
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

            private DivertedReason(String str, int i, String str2, Void r4) {
                this.rawValue = str2;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\t\u0010\u0006\u001a\u00020\u0005H\u0082 J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u0011\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0082 J\u0006\u0010\u000b\u001a\u00020\u0005J\t\u0010\f\u001a\u00020\u0005H\u0082 J\u0010\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usdependencies/AppMetrics$Launch$Companion;", "", "<init>", "()V", "attempt", "", "Swift_Companion_attempt_0", "diverted", "reason", "Lcom/polymarket/usdependencies/AppMetrics$Launch$DivertedReason;", "Swift_Companion_diverted_1", "wallShown", "Swift_Companion_wallShown_2", "DivertedReason", "rawValue", "", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final native void Swift_Companion_attempt_0();

            private final native void Swift_Companion_diverted_1(DivertedReason reason);

            private final native void Swift_Companion_wallShown_2();

            public final DivertedReason DivertedReason(String rawValue) {
                rawValue.getClass();
                return DivertedReason.INSTANCE.init(rawValue);
            }

            public final void attempt() {
                Swift_Companion_attempt_0();
            }

            public final void diverted(DivertedReason reason) {
                reason.getClass();
                Swift_Companion_diverted_1(reason);
            }

            public final void wallShown() {
                Swift_Companion_wallShown_2();
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/usdependencies/AppMetrics$HomeFeed;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class HomeFeed {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ HomeFeed[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        private static final /* synthetic */ HomeFeed[] $values() {
            return new HomeFeed[0];
        }

        static {
            HomeFeed[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private HomeFeed(String str, int i) {
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static HomeFeed valueOf(String str) {
            return (HomeFeed) Enum.valueOf(HomeFeed.class, str);
        }

        public static HomeFeed[] values() {
            return (HomeFeed[]) $VALUES.clone();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0019\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0082 J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\tJ\u0011\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\tH\u0082 ¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usdependencies/AppMetrics$HomeFeed$Companion;", "", "<init>", "()V", MetricTracker.Action.LOADED, "", "failed", "", "timeToFreshDataMs", "", "Swift_Companion_loaded_0", "shown", "timeToHomeMs", "Swift_Companion_shown_1", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final native void Swift_Companion_loaded_0(boolean failed, int timeToFreshDataMs);

            private final native void Swift_Companion_shown_1(int timeToHomeMs);

            public final void loaded(boolean failed, int timeToFreshDataMs) {
                Swift_Companion_loaded_0(failed, timeToFreshDataMs);
            }

            public final void shown(int timeToHomeMs) {
                Swift_Companion_shown_1(timeToHomeMs);
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/usdependencies/AppMetrics$Realtime;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Realtime {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Realtime[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        private static final /* synthetic */ Realtime[] $values() {
            return new Realtime[0];
        }

        static {
            Realtime[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Realtime(String str, int i) {
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Realtime valueOf(String str) {
            return (Realtime) Enum.valueOf(Realtime.class, str);
        }

        public static Realtime[] values() {
            return (Realtime[]) $VALUES.clone();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0019\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0082 J\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eJ!\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0082 J\u0006\u0010\u0010\u001a\u00020\u0005J\t\u0010\u0011\u001a\u00020\u0005H\u0082 J\u0006\u0010\u0012\u001a\u00020\u0005J\t\u0010\u0013\u001a\u00020\u0005H\u0082 J\u0006\u0010\u0014\u001a\u00020\u0005J\t\u0010\u0015\u001a\u00020\u0005H\u0082 J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u000eJ\u0011\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u000eH\u0082 J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0007J\u0011\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0007H\u0082 J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0007J\u0011\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0007H\u0082 J\u0016\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u0019\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 J\u000e\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\tJ\u0011\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\tH\u0082 J\u000e\u0010$\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\tJ\u0011\u0010%\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\tH\u0082 J\u0006\u0010&\u001a\u00020\u0005J\t\u0010'\u001a\u00020\u0005H\u0082 ¨\u0006("}, d2 = {"Lcom/polymarket/usdependencies/AppMetrics$Realtime$Companion;", "", "<init>", "()V", "dialed", "", "authed", "", "reason", "", "Swift_Companion_dialed_0", "ready", "isReconnect", "afterMs", "", "Swift_Companion_ready_1", "resyncRequired", "Swift_Companion_resyncRequired_2", "channelRejected", "Swift_Companion_channelRejected_3", "channelCapLatched", "Swift_Companion_channelCapLatched_4", "channelsParked", "count", "Swift_Companion_channelsParked_5", "editFailedRound", "subscribe", "Swift_Companion_editFailedRound_6", "editAcknowledged", "Swift_Companion_editAcknowledged_7", "streamClosed", ApiConstant.KEY_CODE, "Swift_Companion_streamClosed_8", "userFrame", "type", "Swift_Companion_userFrame_9", "frameDecodeFailed", "Swift_Companion_frameDecodeFailed_10", "seedFailed", "Swift_Companion_seedFailed_11", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final native void Swift_Companion_channelCapLatched_4();

            private final native void Swift_Companion_channelRejected_3();

            private final native void Swift_Companion_channelsParked_5(int count);

            private final native void Swift_Companion_dialed_0(boolean authed, String reason);

            private final native void Swift_Companion_editAcknowledged_7(boolean subscribe);

            private final native void Swift_Companion_editFailedRound_6(boolean subscribe);

            private final native void Swift_Companion_frameDecodeFailed_10(String type);

            private final native void Swift_Companion_ready_1(boolean authed, boolean isReconnect, int afterMs);

            private final native void Swift_Companion_resyncRequired_2();

            private final native void Swift_Companion_seedFailed_11();

            private final native void Swift_Companion_streamClosed_8(String code, boolean authed);

            private final native void Swift_Companion_userFrame_9(String type);

            public final void channelCapLatched() {
                Swift_Companion_channelCapLatched_4();
            }

            public final void channelRejected() {
                Swift_Companion_channelRejected_3();
            }

            public final void channelsParked(int count) {
                Swift_Companion_channelsParked_5(count);
            }

            public final void dialed(boolean authed, String reason) {
                reason.getClass();
                Swift_Companion_dialed_0(authed, reason);
            }

            public final void editAcknowledged(boolean subscribe) {
                Swift_Companion_editAcknowledged_7(subscribe);
            }

            public final void editFailedRound(boolean subscribe) {
                Swift_Companion_editFailedRound_6(subscribe);
            }

            public final void frameDecodeFailed(String type) {
                type.getClass();
                Swift_Companion_frameDecodeFailed_10(type);
            }

            public final void ready(boolean authed, boolean isReconnect, int afterMs) {
                Swift_Companion_ready_1(authed, isReconnect, afterMs);
            }

            public final void resyncRequired() {
                Swift_Companion_resyncRequired_2();
            }

            public final void seedFailed() {
                Swift_Companion_seedFailed_11();
            }

            public final void streamClosed(String code, boolean authed) {
                code.getClass();
                Swift_Companion_streamClosed_8(code, authed);
            }

            public final void userFrame(String type) {
                type.getClass();
                Swift_Companion_userFrame_9(type);
            }

            private Companion() {
            }
        }
    }
}
