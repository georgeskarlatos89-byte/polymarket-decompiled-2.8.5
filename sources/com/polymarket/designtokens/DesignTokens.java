package com.polymarket.designtokens;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.getstream.chat.android.models.MessageType;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.Hasher;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\r"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens;", "", "<init>", "(Ljava/lang/String;I)V", "Haptic", "Padding", "PaletteColor", "Radius", "SemanticColor", "Size", "FontFamily", "Typography", "Companion", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DesignTokens {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ DesignTokens[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    private static final /* synthetic */ DesignTokens[] $values() {
        return new DesignTokens[0];
    }

    static {
        DesignTokens[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private DesignTokens(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static DesignTokens valueOf(String str) {
        return (DesignTokens) Enum.valueOf(DesignTokens.class, str);
    }

    public static DesignTokens[] values() {
        return (DesignTokens[]) $VALUES.clone();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$FontFamily;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", MessageType.SYSTEM, "rounded", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class FontFamily implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ FontFamily[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final FontFamily system = new FontFamily(MessageType.SYSTEM, 0, MessageType.SYSTEM, null, 2, null);
        public static final FontFamily rounded = new FontFamily("rounded", 1, "rounded", null, 2, null);

        private static final /* synthetic */ FontFamily[] $values() {
            return new FontFamily[]{system, rounded};
        }

        static {
            FontFamily[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ FontFamily(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static FontFamily valueOf(String str) {
            return (FontFamily) Enum.valueOf(FontFamily.class, str);
        }

        public static FontFamily[] values() {
            return (FontFamily[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$FontFamily$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/designtokens/DesignTokens$FontFamily;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion implements CaseIterableCompanion<FontFamily> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<FontFamily> getAllCases() {
                return ArrayKt.arrayOf(FontFamily.system, FontFamily.rounded);
            }

            public final FontFamily init(String rawValue) {
                rawValue.getClass();
                if (Intrinsics.areEqual(rawValue, MessageType.SYSTEM)) {
                    return FontFamily.system;
                }
                if (Intrinsics.areEqual(rawValue, "rounded")) {
                    return FontFamily.rounded;
                }
                return null;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private FontFamily(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00162\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0017"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$Haptic;", "Lskip/lib/CaseIterable;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "success", "error", "warning", "light", "soft", RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR, "heavy", "selection", "doubleTap", "none", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Haptic implements CaseIterable, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Haptic[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Haptic success = new Haptic("success", 0);
        public static final Haptic error = new Haptic("error", 1);
        public static final Haptic warning = new Haptic("warning", 2);
        public static final Haptic light = new Haptic("light", 3);
        public static final Haptic soft = new Haptic("soft", 4);
        public static final Haptic medium = new Haptic(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR, 5);
        public static final Haptic heavy = new Haptic("heavy", 6);
        public static final Haptic selection = new Haptic("selection", 7);
        public static final Haptic doubleTap = new Haptic("doubleTap", 8);
        public static final Haptic none = new Haptic("none", 9);

        private static final /* synthetic */ Haptic[] $values() {
            return new Haptic[]{success, error, warning, light, soft, medium, heavy, selection, doubleTap, none};
        }

        static {
            Haptic[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Haptic(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Haptic valueOf(String str) {
            return (Haptic) Enum.valueOf(Haptic.class, str);
        }

        public static Haptic[] values() {
            return (Haptic[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0006H\u0082 J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0082 R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$Haptic$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/designtokens/DesignTokens$Haptic;", "<init>", "()V", "newValue", "", "isEnabled", "()Z", "setEnabled", "(Z)V", "Swift_Companion_isEnabled", "Swift_Companion_isEnabled_set", "", "value", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion implements CaseIterableCompanion<Haptic> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final native boolean Swift_Companion_isEnabled();

            private final native void Swift_Companion_isEnabled_set(boolean value);

            @Override // skip.lib.CaseIterableCompanion
            public Array<Haptic> getAllCases() {
                return ArrayKt.arrayOf(Haptic.success, Haptic.error, Haptic.warning, Haptic.light, Haptic.soft, Haptic.medium, Haptic.heavy, Haptic.selection, Haptic.doubleTap, Haptic.none);
            }

            public final boolean isEnabled() {
                return Swift_Companion_isEnabled();
            }

            public final void setEnabled(boolean z) {
                Swift_Companion_isEnabled_set(z);
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001e2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0082 j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u001f"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$Padding;", "Lskip/lib/CaseIterable;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "none", "fiveXS", "fourXS", "threeXS", "twoXS", "xs", "small", RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR, "large", "xl", "twoXL", "threeXL", "fourXL", "fiveXL", "sixXL", "sevenXL", "eightXL", "nineXL", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Padding implements CaseIterable, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Padding[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Padding none = new Padding("none", 0);
        public static final Padding fiveXS = new Padding("fiveXS", 1);
        public static final Padding fourXS = new Padding("fourXS", 2);
        public static final Padding threeXS = new Padding("threeXS", 3);
        public static final Padding twoXS = new Padding("twoXS", 4);
        public static final Padding xs = new Padding("xs", 5);
        public static final Padding small = new Padding("small", 6);
        public static final Padding medium = new Padding(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR, 7);
        public static final Padding large = new Padding("large", 8);
        public static final Padding xl = new Padding("xl", 9);
        public static final Padding twoXL = new Padding("twoXL", 10);
        public static final Padding threeXL = new Padding("threeXL", 11);
        public static final Padding fourXL = new Padding("fourXL", 12);
        public static final Padding fiveXL = new Padding("fiveXL", 13);
        public static final Padding sixXL = new Padding("sixXL", 14);
        public static final Padding sevenXL = new Padding("sevenXL", 15);
        public static final Padding eightXL = new Padding("eightXL", 16);
        public static final Padding nineXL = new Padding("nineXL", 17);

        private static final /* synthetic */ Padding[] $values() {
            return new Padding[]{none, fiveXS, fourXS, threeXS, twoXS, xs, small, medium, large, xl, twoXL, threeXL, fourXL, fiveXL, sixXL, sevenXL, eightXL, nineXL};
        }

        static {
            Padding[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Padding(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Padding valueOf(String str) {
            return (Padding) Enum.valueOf(Padding.class, str);
        }

        public static Padding[] values() {
            return (Padding[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$Padding$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/designtokens/DesignTokens$Padding;", "<init>", "()V", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion implements CaseIterableCompanion<Padding> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<Padding> getAllCases() {
                return ArrayKt.arrayOf(Padding.none, Padding.fiveXS, Padding.fourXS, Padding.threeXS, Padding.twoXS, Padding.xs, Padding.small, Padding.medium, Padding.large, Padding.xl, Padding.twoXL, Padding.threeXL, Padding.fourXL, Padding.fiveXL, Padding.sixXL, Padding.sevenXL, Padding.eightXL, Padding.nineXL);
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000¤\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\ba\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 r2\u00020\u0001:`\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0082 J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007\u0082\u0001±\u0001stuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001·\u0001¸\u0001¹\u0001º\u0001»\u0001¼\u0001½\u0001¾\u0001¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001Ä\u0001Å\u0001Æ\u0001Ç\u0001È\u0001É\u0001Ê\u0001Ë\u0001Ì\u0001Í\u0001Î\u0001Ï\u0001Ð\u0001Ñ\u0001¨\u0006Ò\u0001"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "lightHexValue", "", "getLightHexValue", "()Ljava/lang/String;", "Swift_lightHexValue", "className", "darkHexValue", "getDarkHexValue", "Swift_darkHexValue", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "WhiteCase", "BlackCase", "Gray50Case", "Gray100Case", "Gray200Case", "Gray300Case", "Gray400Case", "Gray500Case", "Gray600Case", "Gray700Case", "Gray800Case", "Gray900Case", "Gray950Case", "Brand50Case", "Brand100Case", "Brand200Case", "Brand300Case", "Brand400Case", "Brand500Case", "Brand600Case", "Brand700Case", "Brand800Case", "Brand900Case", "Brand950Case", "Blue600Case", "SkyBlue500Case", "Gold500Case", "Orange500Case", "Green50Case", "Green100Case", "Green200Case", "Green300Case", "Green400Case", "Green500Case", "Green600Case", "Green700Case", "Green800Case", "Green900Case", "Green950Case", "Red50Case", "Red100Case", "Red200Case", "Red300Case", "Red400Case", "Red500Case", "Red600Case", "Red700Case", "Red800Case", "Red900Case", "Red950Case", "Yellow50Case", "Yellow100Case", "Yellow200Case", "Yellow300Case", "Yellow400Case", "Yellow500Case", "Yellow600Case", "Yellow700Case", "Yellow800Case", "Yellow900Case", "Yellow950Case", "Teal50Case", "Teal100Case", "Teal200Case", "Teal300Case", "Teal400Case", "Teal500Case", "Teal600Case", "Teal700Case", "Teal800Case", "Teal900Case", "Teal950Case", "Magenta50Case", "Magenta100Case", "Magenta200Case", "Magenta300Case", "Magenta400Case", "Magenta500Case", "Magenta600Case", "Magenta700Case", "Magenta800Case", "Magenta900Case", "Magenta950Case", "Purple50Case", "Purple100Case", "Purple200Case", "Purple300Case", "Purple400Case", "Purple500Case", "Purple600Case", "Purple700Case", "Purple800Case", "Purple900Case", "Purple950Case", "CustomCase", "Companion", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$BlackCase;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Blue600Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand100Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand200Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand300Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand400Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand50Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand600Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand700Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand800Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand900Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand950Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$CustomCase;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gold500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray100Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray200Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray300Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray400Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray50Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray600Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray700Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray800Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray900Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray950Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green100Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green200Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green300Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green400Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green50Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green600Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green700Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green800Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green900Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green950Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta100Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta200Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta300Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta400Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta50Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta600Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta700Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta800Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta900Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta950Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Orange500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple100Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple200Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple300Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple400Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple50Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple600Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple700Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple800Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple900Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple950Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red100Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red200Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red300Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red400Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red50Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red600Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red700Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red800Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red900Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red950Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$SkyBlue500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal100Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal200Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal300Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal400Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal50Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal600Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal700Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal800Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal900Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal950Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$WhiteCase;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow100Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow200Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow300Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow400Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow50Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow600Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow700Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow800Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow900Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow950Case;", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class PaletteColor implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final PaletteColor white = new WhiteCase();
        private static final PaletteColor black = new BlackCase();
        private static final PaletteColor gray50 = new Gray50Case();
        private static final PaletteColor gray100 = new Gray100Case();
        private static final PaletteColor gray200 = new Gray200Case();
        private static final PaletteColor gray300 = new Gray300Case();
        private static final PaletteColor gray400 = new Gray400Case();
        private static final PaletteColor gray500 = new Gray500Case();
        private static final PaletteColor gray600 = new Gray600Case();
        private static final PaletteColor gray700 = new Gray700Case();
        private static final PaletteColor gray800 = new Gray800Case();
        private static final PaletteColor gray900 = new Gray900Case();
        private static final PaletteColor gray950 = new Gray950Case();
        private static final PaletteColor brand50 = new Brand50Case();
        private static final PaletteColor brand100 = new Brand100Case();
        private static final PaletteColor brand200 = new Brand200Case();
        private static final PaletteColor brand300 = new Brand300Case();
        private static final PaletteColor brand400 = new Brand400Case();
        private static final PaletteColor brand500 = new Brand500Case();
        private static final PaletteColor brand600 = new Brand600Case();
        private static final PaletteColor brand700 = new Brand700Case();
        private static final PaletteColor brand800 = new Brand800Case();
        private static final PaletteColor brand900 = new Brand900Case();
        private static final PaletteColor brand950 = new Brand950Case();
        private static final PaletteColor blue600 = new Blue600Case();
        private static final PaletteColor skyBlue500 = new SkyBlue500Case();
        private static final PaletteColor gold500 = new Gold500Case();
        private static final PaletteColor orange500 = new Orange500Case();
        private static final PaletteColor green50 = new Green50Case();
        private static final PaletteColor green100 = new Green100Case();
        private static final PaletteColor green200 = new Green200Case();
        private static final PaletteColor green300 = new Green300Case();
        private static final PaletteColor green400 = new Green400Case();
        private static final PaletteColor green500 = new Green500Case();
        private static final PaletteColor green600 = new Green600Case();
        private static final PaletteColor green700 = new Green700Case();
        private static final PaletteColor green800 = new Green800Case();
        private static final PaletteColor green900 = new Green900Case();
        private static final PaletteColor green950 = new Green950Case();
        private static final PaletteColor red50 = new Red50Case();
        private static final PaletteColor red100 = new Red100Case();
        private static final PaletteColor red200 = new Red200Case();
        private static final PaletteColor red300 = new Red300Case();
        private static final PaletteColor red400 = new Red400Case();
        private static final PaletteColor red500 = new Red500Case();
        private static final PaletteColor red600 = new Red600Case();
        private static final PaletteColor red700 = new Red700Case();
        private static final PaletteColor red800 = new Red800Case();
        private static final PaletteColor red900 = new Red900Case();
        private static final PaletteColor red950 = new Red950Case();
        private static final PaletteColor yellow50 = new Yellow50Case();
        private static final PaletteColor yellow100 = new Yellow100Case();
        private static final PaletteColor yellow200 = new Yellow200Case();
        private static final PaletteColor yellow300 = new Yellow300Case();
        private static final PaletteColor yellow400 = new Yellow400Case();
        private static final PaletteColor yellow500 = new Yellow500Case();
        private static final PaletteColor yellow600 = new Yellow600Case();
        private static final PaletteColor yellow700 = new Yellow700Case();
        private static final PaletteColor yellow800 = new Yellow800Case();
        private static final PaletteColor yellow900 = new Yellow900Case();
        private static final PaletteColor yellow950 = new Yellow950Case();
        private static final PaletteColor teal50 = new Teal50Case();
        private static final PaletteColor teal100 = new Teal100Case();
        private static final PaletteColor teal200 = new Teal200Case();
        private static final PaletteColor teal300 = new Teal300Case();
        private static final PaletteColor teal400 = new Teal400Case();
        private static final PaletteColor teal500 = new Teal500Case();
        private static final PaletteColor teal600 = new Teal600Case();
        private static final PaletteColor teal700 = new Teal700Case();
        private static final PaletteColor teal800 = new Teal800Case();
        private static final PaletteColor teal900 = new Teal900Case();
        private static final PaletteColor teal950 = new Teal950Case();
        private static final PaletteColor magenta50 = new Magenta50Case();
        private static final PaletteColor magenta100 = new Magenta100Case();
        private static final PaletteColor magenta200 = new Magenta200Case();
        private static final PaletteColor magenta300 = new Magenta300Case();
        private static final PaletteColor magenta400 = new Magenta400Case();
        private static final PaletteColor magenta500 = new Magenta500Case();
        private static final PaletteColor magenta600 = new Magenta600Case();
        private static final PaletteColor magenta700 = new Magenta700Case();
        private static final PaletteColor magenta800 = new Magenta800Case();
        private static final PaletteColor magenta900 = new Magenta900Case();
        private static final PaletteColor magenta950 = new Magenta950Case();
        private static final PaletteColor purple50 = new Purple50Case();
        private static final PaletteColor purple100 = new Purple100Case();
        private static final PaletteColor purple200 = new Purple200Case();
        private static final PaletteColor purple300 = new Purple300Case();
        private static final PaletteColor purple400 = new Purple400Case();
        private static final PaletteColor purple500 = new Purple500Case();
        private static final PaletteColor purple600 = new Purple600Case();
        private static final PaletteColor purple700 = new Purple700Case();
        private static final PaletteColor purple800 = new Purple800Case();
        private static final PaletteColor purple900 = new Purple900Case();
        private static final PaletteColor purple950 = new Purple950Case();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$BlackCase;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BlackCase extends PaletteColor {
            public BlackCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Blue600Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Blue600Case extends PaletteColor {
            public Blue600Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand100Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Brand100Case extends PaletteColor {
            public Brand100Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand200Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Brand200Case extends PaletteColor {
            public Brand200Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand300Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Brand300Case extends PaletteColor {
            public Brand300Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand400Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Brand400Case extends PaletteColor {
            public Brand400Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Brand500Case extends PaletteColor {
            public Brand500Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand50Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Brand50Case extends PaletteColor {
            public Brand50Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand600Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Brand600Case extends PaletteColor {
            public Brand600Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand700Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Brand700Case extends PaletteColor {
            public Brand700Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand800Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Brand800Case extends PaletteColor {
            public Brand800Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand900Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Brand900Case extends PaletteColor {
            public Brand900Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Brand950Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Brand950Case extends PaletteColor {
            public Brand950Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$CustomCase;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "associated0", "", "associated1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "lightHex", "getLightHex", "darkHex", "getDarkHex", "equals", "", "other", "", "hashCode", "", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class CustomCase extends PaletteColor {
            private final String associated0;
            private final String associated1;
            private final String darkHex;
            private final String lightHex;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CustomCase(String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.associated0 = str;
                this.associated1 = str2;
                this.lightHex = str;
                this.darkHex = str2;
            }

            public boolean equals(Object other) {
                if (!(other instanceof CustomCase)) {
                    return false;
                }
                CustomCase customCase = (CustomCase) other;
                if (!Intrinsics.areEqual(this.associated0, customCase.associated0) || !Intrinsics.areEqual(this.associated1, customCase.associated1)) {
                    return false;
                }
                return true;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final String getAssociated1() {
                return this.associated1;
            }

            public final String getDarkHex() {
                return this.darkHex;
            }

            public final String getLightHex() {
                return this.lightHex;
            }

            public int hashCode() {
                Hasher.Companion companion = Hasher.INSTANCE;
                return companion.combine(companion.combine(1, this.associated0), this.associated1);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gold500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Gold500Case extends PaletteColor {
            public Gold500Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray100Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Gray100Case extends PaletteColor {
            public Gray100Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray200Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Gray200Case extends PaletteColor {
            public Gray200Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray300Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Gray300Case extends PaletteColor {
            public Gray300Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray400Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Gray400Case extends PaletteColor {
            public Gray400Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Gray500Case extends PaletteColor {
            public Gray500Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray50Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Gray50Case extends PaletteColor {
            public Gray50Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray600Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Gray600Case extends PaletteColor {
            public Gray600Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray700Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Gray700Case extends PaletteColor {
            public Gray700Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray800Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Gray800Case extends PaletteColor {
            public Gray800Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray900Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Gray900Case extends PaletteColor {
            public Gray900Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Gray950Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Gray950Case extends PaletteColor {
            public Gray950Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green100Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Green100Case extends PaletteColor {
            public Green100Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green200Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Green200Case extends PaletteColor {
            public Green200Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green300Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Green300Case extends PaletteColor {
            public Green300Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green400Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Green400Case extends PaletteColor {
            public Green400Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Green500Case extends PaletteColor {
            public Green500Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green50Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Green50Case extends PaletteColor {
            public Green50Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green600Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Green600Case extends PaletteColor {
            public Green600Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green700Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Green700Case extends PaletteColor {
            public Green700Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green800Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Green800Case extends PaletteColor {
            public Green800Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green900Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Green900Case extends PaletteColor {
            public Green900Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Green950Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Green950Case extends PaletteColor {
            public Green950Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta100Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Magenta100Case extends PaletteColor {
            public Magenta100Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta200Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Magenta200Case extends PaletteColor {
            public Magenta200Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta300Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Magenta300Case extends PaletteColor {
            public Magenta300Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta400Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Magenta400Case extends PaletteColor {
            public Magenta400Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Magenta500Case extends PaletteColor {
            public Magenta500Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta50Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Magenta50Case extends PaletteColor {
            public Magenta50Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta600Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Magenta600Case extends PaletteColor {
            public Magenta600Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta700Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Magenta700Case extends PaletteColor {
            public Magenta700Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta800Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Magenta800Case extends PaletteColor {
            public Magenta800Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta900Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Magenta900Case extends PaletteColor {
            public Magenta900Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Magenta950Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Magenta950Case extends PaletteColor {
            public Magenta950Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Orange500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Orange500Case extends PaletteColor {
            public Orange500Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple100Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Purple100Case extends PaletteColor {
            public Purple100Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple200Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Purple200Case extends PaletteColor {
            public Purple200Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple300Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Purple300Case extends PaletteColor {
            public Purple300Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple400Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Purple400Case extends PaletteColor {
            public Purple400Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Purple500Case extends PaletteColor {
            public Purple500Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple50Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Purple50Case extends PaletteColor {
            public Purple50Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple600Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Purple600Case extends PaletteColor {
            public Purple600Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple700Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Purple700Case extends PaletteColor {
            public Purple700Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple800Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Purple800Case extends PaletteColor {
            public Purple800Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple900Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Purple900Case extends PaletteColor {
            public Purple900Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Purple950Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Purple950Case extends PaletteColor {
            public Purple950Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red100Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Red100Case extends PaletteColor {
            public Red100Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red200Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Red200Case extends PaletteColor {
            public Red200Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red300Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Red300Case extends PaletteColor {
            public Red300Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red400Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Red400Case extends PaletteColor {
            public Red400Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Red500Case extends PaletteColor {
            public Red500Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red50Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Red50Case extends PaletteColor {
            public Red50Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red600Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Red600Case extends PaletteColor {
            public Red600Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red700Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Red700Case extends PaletteColor {
            public Red700Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red800Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Red800Case extends PaletteColor {
            public Red800Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red900Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Red900Case extends PaletteColor {
            public Red900Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Red950Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Red950Case extends PaletteColor {
            public Red950Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$SkyBlue500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SkyBlue500Case extends PaletteColor {
            public SkyBlue500Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal100Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Teal100Case extends PaletteColor {
            public Teal100Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal200Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Teal200Case extends PaletteColor {
            public Teal200Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal300Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Teal300Case extends PaletteColor {
            public Teal300Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal400Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Teal400Case extends PaletteColor {
            public Teal400Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Teal500Case extends PaletteColor {
            public Teal500Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal50Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Teal50Case extends PaletteColor {
            public Teal50Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal600Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Teal600Case extends PaletteColor {
            public Teal600Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal700Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Teal700Case extends PaletteColor {
            public Teal700Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal800Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Teal800Case extends PaletteColor {
            public Teal800Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal900Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Teal900Case extends PaletteColor {
            public Teal900Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Teal950Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Teal950Case extends PaletteColor {
            public Teal950Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$WhiteCase;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class WhiteCase extends PaletteColor {
            public WhiteCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow100Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Yellow100Case extends PaletteColor {
            public Yellow100Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow200Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Yellow200Case extends PaletteColor {
            public Yellow200Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow300Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Yellow300Case extends PaletteColor {
            public Yellow300Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow400Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Yellow400Case extends PaletteColor {
            public Yellow400Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow500Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Yellow500Case extends PaletteColor {
            public Yellow500Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow50Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Yellow50Case extends PaletteColor {
            public Yellow50Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow600Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Yellow600Case extends PaletteColor {
            public Yellow600Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow700Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Yellow700Case extends PaletteColor {
            public Yellow700Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow800Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Yellow800Case extends PaletteColor {
            public Yellow800Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow900Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Yellow900Case extends PaletteColor {
            public Yellow900Case() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Yellow950Case;", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Yellow950Case extends PaletteColor {
            public Yellow950Case() {
                super(null);
            }
        }

        public /* synthetic */ PaletteColor(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native String Swift_darkHexValue(String className);

        private final native String Swift_lightHexValue(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ PaletteColor access$getBlack$cp() {
            return black;
        }

        public static final /* synthetic */ PaletteColor access$getBlue600$cp() {
            return blue600;
        }

        public static final /* synthetic */ PaletteColor access$getBrand100$cp() {
            return brand100;
        }

        public static final /* synthetic */ PaletteColor access$getBrand200$cp() {
            return brand200;
        }

        public static final /* synthetic */ PaletteColor access$getBrand300$cp() {
            return brand300;
        }

        public static final /* synthetic */ PaletteColor access$getBrand400$cp() {
            return brand400;
        }

        public static final /* synthetic */ PaletteColor access$getBrand50$cp() {
            return brand50;
        }

        public static final /* synthetic */ PaletteColor access$getBrand500$cp() {
            return brand500;
        }

        public static final /* synthetic */ PaletteColor access$getBrand600$cp() {
            return brand600;
        }

        public static final /* synthetic */ PaletteColor access$getBrand700$cp() {
            return brand700;
        }

        public static final /* synthetic */ PaletteColor access$getBrand800$cp() {
            return brand800;
        }

        public static final /* synthetic */ PaletteColor access$getBrand900$cp() {
            return brand900;
        }

        public static final /* synthetic */ PaletteColor access$getBrand950$cp() {
            return brand950;
        }

        public static final /* synthetic */ PaletteColor access$getGold500$cp() {
            return gold500;
        }

        public static final /* synthetic */ PaletteColor access$getGray100$cp() {
            return gray100;
        }

        public static final /* synthetic */ PaletteColor access$getGray200$cp() {
            return gray200;
        }

        public static final /* synthetic */ PaletteColor access$getGray300$cp() {
            return gray300;
        }

        public static final /* synthetic */ PaletteColor access$getGray400$cp() {
            return gray400;
        }

        public static final /* synthetic */ PaletteColor access$getGray50$cp() {
            return gray50;
        }

        public static final /* synthetic */ PaletteColor access$getGray500$cp() {
            return gray500;
        }

        public static final /* synthetic */ PaletteColor access$getGray600$cp() {
            return gray600;
        }

        public static final /* synthetic */ PaletteColor access$getGray700$cp() {
            return gray700;
        }

        public static final /* synthetic */ PaletteColor access$getGray800$cp() {
            return gray800;
        }

        public static final /* synthetic */ PaletteColor access$getGray900$cp() {
            return gray900;
        }

        public static final /* synthetic */ PaletteColor access$getGray950$cp() {
            return gray950;
        }

        public static final /* synthetic */ PaletteColor access$getGreen100$cp() {
            return green100;
        }

        public static final /* synthetic */ PaletteColor access$getGreen200$cp() {
            return green200;
        }

        public static final /* synthetic */ PaletteColor access$getGreen300$cp() {
            return green300;
        }

        public static final /* synthetic */ PaletteColor access$getGreen400$cp() {
            return green400;
        }

        public static final /* synthetic */ PaletteColor access$getGreen50$cp() {
            return green50;
        }

        public static final /* synthetic */ PaletteColor access$getGreen500$cp() {
            return green500;
        }

        public static final /* synthetic */ PaletteColor access$getGreen600$cp() {
            return green600;
        }

        public static final /* synthetic */ PaletteColor access$getGreen700$cp() {
            return green700;
        }

        public static final /* synthetic */ PaletteColor access$getGreen800$cp() {
            return green800;
        }

        public static final /* synthetic */ PaletteColor access$getGreen900$cp() {
            return green900;
        }

        public static final /* synthetic */ PaletteColor access$getGreen950$cp() {
            return green950;
        }

        public static final /* synthetic */ PaletteColor access$getMagenta100$cp() {
            return magenta100;
        }

        public static final /* synthetic */ PaletteColor access$getMagenta200$cp() {
            return magenta200;
        }

        public static final /* synthetic */ PaletteColor access$getMagenta300$cp() {
            return magenta300;
        }

        public static final /* synthetic */ PaletteColor access$getMagenta400$cp() {
            return magenta400;
        }

        public static final /* synthetic */ PaletteColor access$getMagenta50$cp() {
            return magenta50;
        }

        public static final /* synthetic */ PaletteColor access$getMagenta500$cp() {
            return magenta500;
        }

        public static final /* synthetic */ PaletteColor access$getMagenta600$cp() {
            return magenta600;
        }

        public static final /* synthetic */ PaletteColor access$getMagenta700$cp() {
            return magenta700;
        }

        public static final /* synthetic */ PaletteColor access$getMagenta800$cp() {
            return magenta800;
        }

        public static final /* synthetic */ PaletteColor access$getMagenta900$cp() {
            return magenta900;
        }

        public static final /* synthetic */ PaletteColor access$getMagenta950$cp() {
            return magenta950;
        }

        public static final /* synthetic */ PaletteColor access$getOrange500$cp() {
            return orange500;
        }

        public static final /* synthetic */ PaletteColor access$getPurple100$cp() {
            return purple100;
        }

        public static final /* synthetic */ PaletteColor access$getPurple200$cp() {
            return purple200;
        }

        public static final /* synthetic */ PaletteColor access$getPurple300$cp() {
            return purple300;
        }

        public static final /* synthetic */ PaletteColor access$getPurple400$cp() {
            return purple400;
        }

        public static final /* synthetic */ PaletteColor access$getPurple50$cp() {
            return purple50;
        }

        public static final /* synthetic */ PaletteColor access$getPurple500$cp() {
            return purple500;
        }

        public static final /* synthetic */ PaletteColor access$getPurple600$cp() {
            return purple600;
        }

        public static final /* synthetic */ PaletteColor access$getPurple700$cp() {
            return purple700;
        }

        public static final /* synthetic */ PaletteColor access$getPurple800$cp() {
            return purple800;
        }

        public static final /* synthetic */ PaletteColor access$getPurple900$cp() {
            return purple900;
        }

        public static final /* synthetic */ PaletteColor access$getPurple950$cp() {
            return purple950;
        }

        public static final /* synthetic */ PaletteColor access$getRed100$cp() {
            return red100;
        }

        public static final /* synthetic */ PaletteColor access$getRed200$cp() {
            return red200;
        }

        public static final /* synthetic */ PaletteColor access$getRed300$cp() {
            return red300;
        }

        public static final /* synthetic */ PaletteColor access$getRed400$cp() {
            return red400;
        }

        public static final /* synthetic */ PaletteColor access$getRed50$cp() {
            return red50;
        }

        public static final /* synthetic */ PaletteColor access$getRed500$cp() {
            return red500;
        }

        public static final /* synthetic */ PaletteColor access$getRed600$cp() {
            return red600;
        }

        public static final /* synthetic */ PaletteColor access$getRed700$cp() {
            return red700;
        }

        public static final /* synthetic */ PaletteColor access$getRed800$cp() {
            return red800;
        }

        public static final /* synthetic */ PaletteColor access$getRed900$cp() {
            return red900;
        }

        public static final /* synthetic */ PaletteColor access$getRed950$cp() {
            return red950;
        }

        public static final /* synthetic */ PaletteColor access$getSkyBlue500$cp() {
            return skyBlue500;
        }

        public static final /* synthetic */ PaletteColor access$getTeal100$cp() {
            return teal100;
        }

        public static final /* synthetic */ PaletteColor access$getTeal200$cp() {
            return teal200;
        }

        public static final /* synthetic */ PaletteColor access$getTeal300$cp() {
            return teal300;
        }

        public static final /* synthetic */ PaletteColor access$getTeal400$cp() {
            return teal400;
        }

        public static final /* synthetic */ PaletteColor access$getTeal50$cp() {
            return teal50;
        }

        public static final /* synthetic */ PaletteColor access$getTeal500$cp() {
            return teal500;
        }

        public static final /* synthetic */ PaletteColor access$getTeal600$cp() {
            return teal600;
        }

        public static final /* synthetic */ PaletteColor access$getTeal700$cp() {
            return teal700;
        }

        public static final /* synthetic */ PaletteColor access$getTeal800$cp() {
            return teal800;
        }

        public static final /* synthetic */ PaletteColor access$getTeal900$cp() {
            return teal900;
        }

        public static final /* synthetic */ PaletteColor access$getTeal950$cp() {
            return teal950;
        }

        public static final /* synthetic */ PaletteColor access$getWhite$cp() {
            return white;
        }

        public static final /* synthetic */ PaletteColor access$getYellow100$cp() {
            return yellow100;
        }

        public static final /* synthetic */ PaletteColor access$getYellow200$cp() {
            return yellow200;
        }

        public static final /* synthetic */ PaletteColor access$getYellow300$cp() {
            return yellow300;
        }

        public static final /* synthetic */ PaletteColor access$getYellow400$cp() {
            return yellow400;
        }

        public static final /* synthetic */ PaletteColor access$getYellow50$cp() {
            return yellow50;
        }

        public static final /* synthetic */ PaletteColor access$getYellow500$cp() {
            return yellow500;
        }

        public static final /* synthetic */ PaletteColor access$getYellow600$cp() {
            return yellow600;
        }

        public static final /* synthetic */ PaletteColor access$getYellow700$cp() {
            return yellow700;
        }

        public static final /* synthetic */ PaletteColor access$getYellow800$cp() {
            return yellow800;
        }

        public static final /* synthetic */ PaletteColor access$getYellow900$cp() {
            return yellow900;
        }

        public static final /* synthetic */ PaletteColor access$getYellow950$cp() {
            return yellow950;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final String getDarkHexValue() {
            return Swift_darkHexValue(getClass().getName());
        }

        public final String getLightHexValue() {
            return Swift_lightHexValue(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0003\b¾\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010Â\u0001\u001a\u00020\u00052\b\u0010Ã\u0001\u001a\u00030Ä\u00012\b\u0010Å\u0001\u001a\u00030Ä\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0011\u0010 \u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0011\u0010\"\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007R\u0011\u0010$\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0011\u0010&\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0007R\u0011\u0010(\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0007R\u0011\u0010*\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0007R\u0011\u0010,\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0007R\u0011\u0010.\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0007R\u0011\u00100\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0007R\u0011\u00102\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0007R\u0011\u00104\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0007R\u0011\u00106\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0007R\u0011\u00108\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0007R\u0011\u0010:\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0007R\u0011\u0010<\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0007R\u0011\u0010>\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0007R\u0011\u0010@\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0007R\u0011\u0010B\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0007R\u0011\u0010D\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\u0007R\u0011\u0010F\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bG\u0010\u0007R\u0011\u0010H\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u0010\u0007R\u0011\u0010J\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u0010\u0007R\u0011\u0010L\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bM\u0010\u0007R\u0011\u0010N\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\u0007R\u0011\u0010P\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010\u0007R\u0011\u0010R\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bS\u0010\u0007R\u0011\u0010T\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bU\u0010\u0007R\u0011\u0010V\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bW\u0010\u0007R\u0011\u0010X\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bY\u0010\u0007R\u0011\u0010Z\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\u0007R\u0011\u0010\\\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b]\u0010\u0007R\u0011\u0010^\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b_\u0010\u0007R\u0011\u0010`\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\ba\u0010\u0007R\u0011\u0010b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bc\u0010\u0007R\u0011\u0010d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\be\u0010\u0007R\u0011\u0010f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bg\u0010\u0007R\u0011\u0010h\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bi\u0010\u0007R\u0011\u0010j\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bk\u0010\u0007R\u0011\u0010l\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bm\u0010\u0007R\u0011\u0010n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bo\u0010\u0007R\u0011\u0010p\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bq\u0010\u0007R\u0011\u0010r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bs\u0010\u0007R\u0011\u0010t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bu\u0010\u0007R\u0011\u0010v\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bw\u0010\u0007R\u0011\u0010x\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\by\u0010\u0007R\u0011\u0010z\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b{\u0010\u0007R\u0011\u0010|\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b}\u0010\u0007R\u0011\u0010~\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010\u0007R\u0013\u0010\u0080\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010\u0007R\u0013\u0010\u0082\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010\u0007R\u0013\u0010\u0084\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010\u0007R\u0013\u0010\u0086\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010\u0007R\u0013\u0010\u0088\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010\u0007R\u0013\u0010\u008a\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010\u0007R\u0013\u0010\u008c\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010\u0007R\u0013\u0010\u008e\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010\u0007R\u0013\u0010\u0090\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010\u0007R\u0013\u0010\u0092\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010\u0007R\u0013\u0010\u0094\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010\u0007R\u0013\u0010\u0096\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010\u0007R\u0013\u0010\u0098\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010\u0007R\u0013\u0010\u009a\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010\u0007R\u0013\u0010\u009c\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010\u0007R\u0013\u0010\u009e\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u009f\u0001\u0010\u0007R\u0013\u0010 \u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b¡\u0001\u0010\u0007R\u0013\u0010¢\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b£\u0001\u0010\u0007R\u0013\u0010¤\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b¥\u0001\u0010\u0007R\u0013\u0010¦\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b§\u0001\u0010\u0007R\u0013\u0010¨\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b©\u0001\u0010\u0007R\u0013\u0010ª\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b«\u0001\u0010\u0007R\u0013\u0010¬\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u00ad\u0001\u0010\u0007R\u0013\u0010®\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b¯\u0001\u0010\u0007R\u0013\u0010°\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b±\u0001\u0010\u0007R\u0013\u0010²\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b³\u0001\u0010\u0007R\u0013\u0010´\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\bµ\u0001\u0010\u0007R\u0013\u0010¶\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b·\u0001\u0010\u0007R\u0013\u0010¸\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b¹\u0001\u0010\u0007R\u0013\u0010º\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b»\u0001\u0010\u0007R\u0013\u0010¼\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b½\u0001\u0010\u0007R\u0013\u0010¾\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b¿\u0001\u0010\u0007R\u0013\u0010À\u0001\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\bÁ\u0001\u0010\u0007¨\u0006Æ\u0001"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$PaletteColor$Companion;", "", "<init>", "()V", "white", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "getWhite", "()Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "black", "getBlack", "gray50", "getGray50", "gray100", "getGray100", "gray200", "getGray200", "gray300", "getGray300", "gray400", "getGray400", "gray500", "getGray500", "gray600", "getGray600", "gray700", "getGray700", "gray800", "getGray800", "gray900", "getGray900", "gray950", "getGray950", "brand50", "getBrand50", "brand100", "getBrand100", "brand200", "getBrand200", "brand300", "getBrand300", "brand400", "getBrand400", "brand500", "getBrand500", "brand600", "getBrand600", "brand700", "getBrand700", "brand800", "getBrand800", "brand900", "getBrand900", "brand950", "getBrand950", "blue600", "getBlue600", "skyBlue500", "getSkyBlue500", "gold500", "getGold500", "orange500", "getOrange500", "green50", "getGreen50", "green100", "getGreen100", "green200", "getGreen200", "green300", "getGreen300", "green400", "getGreen400", "green500", "getGreen500", "green600", "getGreen600", "green700", "getGreen700", "green800", "getGreen800", "green900", "getGreen900", "green950", "getGreen950", "red50", "getRed50", "red100", "getRed100", "red200", "getRed200", "red300", "getRed300", "red400", "getRed400", "red500", "getRed500", "red600", "getRed600", "red700", "getRed700", "red800", "getRed800", "red900", "getRed900", "red950", "getRed950", "yellow50", "getYellow50", "yellow100", "getYellow100", "yellow200", "getYellow200", "yellow300", "getYellow300", "yellow400", "getYellow400", "yellow500", "getYellow500", "yellow600", "getYellow600", "yellow700", "getYellow700", "yellow800", "getYellow800", "yellow900", "getYellow900", "yellow950", "getYellow950", "teal50", "getTeal50", "teal100", "getTeal100", "teal200", "getTeal200", "teal300", "getTeal300", "teal400", "getTeal400", "teal500", "getTeal500", "teal600", "getTeal600", "teal700", "getTeal700", "teal800", "getTeal800", "teal900", "getTeal900", "teal950", "getTeal950", "magenta50", "getMagenta50", "magenta100", "getMagenta100", "magenta200", "getMagenta200", "magenta300", "getMagenta300", "magenta400", "getMagenta400", "magenta500", "getMagenta500", "magenta600", "getMagenta600", "magenta700", "getMagenta700", "magenta800", "getMagenta800", "magenta900", "getMagenta900", "magenta950", "getMagenta950", "purple50", "getPurple50", "purple100", "getPurple100", "purple200", "getPurple200", "purple300", "getPurple300", "purple400", "getPurple400", "purple500", "getPurple500", "purple600", "getPurple600", "purple700", "getPurple700", "purple800", "getPurple800", "purple900", "getPurple900", "purple950", "getPurple950", "custom", "lightHex", "", "darkHex", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PaletteColor custom(String lightHex, String darkHex) {
                lightHex.getClass();
                darkHex.getClass();
                return new CustomCase(lightHex, darkHex);
            }

            public final PaletteColor getBlack() {
                return PaletteColor.access$getBlack$cp();
            }

            public final PaletteColor getBlue600() {
                return PaletteColor.access$getBlue600$cp();
            }

            public final PaletteColor getBrand100() {
                return PaletteColor.access$getBrand100$cp();
            }

            public final PaletteColor getBrand200() {
                return PaletteColor.access$getBrand200$cp();
            }

            public final PaletteColor getBrand300() {
                return PaletteColor.access$getBrand300$cp();
            }

            public final PaletteColor getBrand400() {
                return PaletteColor.access$getBrand400$cp();
            }

            public final PaletteColor getBrand50() {
                return PaletteColor.access$getBrand50$cp();
            }

            public final PaletteColor getBrand500() {
                return PaletteColor.access$getBrand500$cp();
            }

            public final PaletteColor getBrand600() {
                return PaletteColor.access$getBrand600$cp();
            }

            public final PaletteColor getBrand700() {
                return PaletteColor.access$getBrand700$cp();
            }

            public final PaletteColor getBrand800() {
                return PaletteColor.access$getBrand800$cp();
            }

            public final PaletteColor getBrand900() {
                return PaletteColor.access$getBrand900$cp();
            }

            public final PaletteColor getBrand950() {
                return PaletteColor.access$getBrand950$cp();
            }

            public final PaletteColor getGold500() {
                return PaletteColor.access$getGold500$cp();
            }

            public final PaletteColor getGray100() {
                return PaletteColor.access$getGray100$cp();
            }

            public final PaletteColor getGray200() {
                return PaletteColor.access$getGray200$cp();
            }

            public final PaletteColor getGray300() {
                return PaletteColor.access$getGray300$cp();
            }

            public final PaletteColor getGray400() {
                return PaletteColor.access$getGray400$cp();
            }

            public final PaletteColor getGray50() {
                return PaletteColor.access$getGray50$cp();
            }

            public final PaletteColor getGray500() {
                return PaletteColor.access$getGray500$cp();
            }

            public final PaletteColor getGray600() {
                return PaletteColor.access$getGray600$cp();
            }

            public final PaletteColor getGray700() {
                return PaletteColor.access$getGray700$cp();
            }

            public final PaletteColor getGray800() {
                return PaletteColor.access$getGray800$cp();
            }

            public final PaletteColor getGray900() {
                return PaletteColor.access$getGray900$cp();
            }

            public final PaletteColor getGray950() {
                return PaletteColor.access$getGray950$cp();
            }

            public final PaletteColor getGreen100() {
                return PaletteColor.access$getGreen100$cp();
            }

            public final PaletteColor getGreen200() {
                return PaletteColor.access$getGreen200$cp();
            }

            public final PaletteColor getGreen300() {
                return PaletteColor.access$getGreen300$cp();
            }

            public final PaletteColor getGreen400() {
                return PaletteColor.access$getGreen400$cp();
            }

            public final PaletteColor getGreen50() {
                return PaletteColor.access$getGreen50$cp();
            }

            public final PaletteColor getGreen500() {
                return PaletteColor.access$getGreen500$cp();
            }

            public final PaletteColor getGreen600() {
                return PaletteColor.access$getGreen600$cp();
            }

            public final PaletteColor getGreen700() {
                return PaletteColor.access$getGreen700$cp();
            }

            public final PaletteColor getGreen800() {
                return PaletteColor.access$getGreen800$cp();
            }

            public final PaletteColor getGreen900() {
                return PaletteColor.access$getGreen900$cp();
            }

            public final PaletteColor getGreen950() {
                return PaletteColor.access$getGreen950$cp();
            }

            public final PaletteColor getMagenta100() {
                return PaletteColor.access$getMagenta100$cp();
            }

            public final PaletteColor getMagenta200() {
                return PaletteColor.access$getMagenta200$cp();
            }

            public final PaletteColor getMagenta300() {
                return PaletteColor.access$getMagenta300$cp();
            }

            public final PaletteColor getMagenta400() {
                return PaletteColor.access$getMagenta400$cp();
            }

            public final PaletteColor getMagenta50() {
                return PaletteColor.access$getMagenta50$cp();
            }

            public final PaletteColor getMagenta500() {
                return PaletteColor.access$getMagenta500$cp();
            }

            public final PaletteColor getMagenta600() {
                return PaletteColor.access$getMagenta600$cp();
            }

            public final PaletteColor getMagenta700() {
                return PaletteColor.access$getMagenta700$cp();
            }

            public final PaletteColor getMagenta800() {
                return PaletteColor.access$getMagenta800$cp();
            }

            public final PaletteColor getMagenta900() {
                return PaletteColor.access$getMagenta900$cp();
            }

            public final PaletteColor getMagenta950() {
                return PaletteColor.access$getMagenta950$cp();
            }

            public final PaletteColor getOrange500() {
                return PaletteColor.access$getOrange500$cp();
            }

            public final PaletteColor getPurple100() {
                return PaletteColor.access$getPurple100$cp();
            }

            public final PaletteColor getPurple200() {
                return PaletteColor.access$getPurple200$cp();
            }

            public final PaletteColor getPurple300() {
                return PaletteColor.access$getPurple300$cp();
            }

            public final PaletteColor getPurple400() {
                return PaletteColor.access$getPurple400$cp();
            }

            public final PaletteColor getPurple50() {
                return PaletteColor.access$getPurple50$cp();
            }

            public final PaletteColor getPurple500() {
                return PaletteColor.access$getPurple500$cp();
            }

            public final PaletteColor getPurple600() {
                return PaletteColor.access$getPurple600$cp();
            }

            public final PaletteColor getPurple700() {
                return PaletteColor.access$getPurple700$cp();
            }

            public final PaletteColor getPurple800() {
                return PaletteColor.access$getPurple800$cp();
            }

            public final PaletteColor getPurple900() {
                return PaletteColor.access$getPurple900$cp();
            }

            public final PaletteColor getPurple950() {
                return PaletteColor.access$getPurple950$cp();
            }

            public final PaletteColor getRed100() {
                return PaletteColor.access$getRed100$cp();
            }

            public final PaletteColor getRed200() {
                return PaletteColor.access$getRed200$cp();
            }

            public final PaletteColor getRed300() {
                return PaletteColor.access$getRed300$cp();
            }

            public final PaletteColor getRed400() {
                return PaletteColor.access$getRed400$cp();
            }

            public final PaletteColor getRed50() {
                return PaletteColor.access$getRed50$cp();
            }

            public final PaletteColor getRed500() {
                return PaletteColor.access$getRed500$cp();
            }

            public final PaletteColor getRed600() {
                return PaletteColor.access$getRed600$cp();
            }

            public final PaletteColor getRed700() {
                return PaletteColor.access$getRed700$cp();
            }

            public final PaletteColor getRed800() {
                return PaletteColor.access$getRed800$cp();
            }

            public final PaletteColor getRed900() {
                return PaletteColor.access$getRed900$cp();
            }

            public final PaletteColor getRed950() {
                return PaletteColor.access$getRed950$cp();
            }

            public final PaletteColor getSkyBlue500() {
                return PaletteColor.access$getSkyBlue500$cp();
            }

            public final PaletteColor getTeal100() {
                return PaletteColor.access$getTeal100$cp();
            }

            public final PaletteColor getTeal200() {
                return PaletteColor.access$getTeal200$cp();
            }

            public final PaletteColor getTeal300() {
                return PaletteColor.access$getTeal300$cp();
            }

            public final PaletteColor getTeal400() {
                return PaletteColor.access$getTeal400$cp();
            }

            public final PaletteColor getTeal50() {
                return PaletteColor.access$getTeal50$cp();
            }

            public final PaletteColor getTeal500() {
                return PaletteColor.access$getTeal500$cp();
            }

            public final PaletteColor getTeal600() {
                return PaletteColor.access$getTeal600$cp();
            }

            public final PaletteColor getTeal700() {
                return PaletteColor.access$getTeal700$cp();
            }

            public final PaletteColor getTeal800() {
                return PaletteColor.access$getTeal800$cp();
            }

            public final PaletteColor getTeal900() {
                return PaletteColor.access$getTeal900$cp();
            }

            public final PaletteColor getTeal950() {
                return PaletteColor.access$getTeal950$cp();
            }

            public final PaletteColor getWhite() {
                return PaletteColor.access$getWhite$cp();
            }

            public final PaletteColor getYellow100() {
                return PaletteColor.access$getYellow100$cp();
            }

            public final PaletteColor getYellow200() {
                return PaletteColor.access$getYellow200$cp();
            }

            public final PaletteColor getYellow300() {
                return PaletteColor.access$getYellow300$cp();
            }

            public final PaletteColor getYellow400() {
                return PaletteColor.access$getYellow400$cp();
            }

            public final PaletteColor getYellow50() {
                return PaletteColor.access$getYellow50$cp();
            }

            public final PaletteColor getYellow500() {
                return PaletteColor.access$getYellow500$cp();
            }

            public final PaletteColor getYellow600() {
                return PaletteColor.access$getYellow600$cp();
            }

            public final PaletteColor getYellow700() {
                return PaletteColor.access$getYellow700$cp();
            }

            public final PaletteColor getYellow800() {
                return PaletteColor.access$getYellow800$cp();
            }

            public final PaletteColor getYellow900() {
                return PaletteColor.access$getYellow900$cp();
            }

            public final PaletteColor getYellow950() {
                return PaletteColor.access$getYellow950$cp();
            }

            private Companion() {
            }
        }

        private PaletteColor() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0013"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$Radius;", "Lskip/lib/CaseIterable;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "none", "extraSmall", "small", RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR, "large", "max", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Radius implements CaseIterable, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Radius[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Radius none = new Radius("none", 0);
        public static final Radius extraSmall = new Radius("extraSmall", 1);
        public static final Radius small = new Radius("small", 2);
        public static final Radius medium = new Radius(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR, 3);
        public static final Radius large = new Radius("large", 4);
        public static final Radius max = new Radius("max", 5);

        private static final /* synthetic */ Radius[] $values() {
            return new Radius[]{none, extraSmall, small, medium, large, max};
        }

        static {
            Radius[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Radius(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Radius valueOf(String str) {
            return (Radius) Enum.valueOf(Radius.class, str);
        }

        public static Radius[] values() {
            return (Radius[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$Radius$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/designtokens/DesignTokens$Radius;", "<init>", "()V", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion implements CaseIterableCompanion<Radius> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<Radius> getAllCases() {
                return ArrayKt.arrayOf(Radius.none, Radius.extraSmall, Radius.small, Radius.medium, Radius.large, Radius.max);
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 N2\u00020\u0001:4\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0011\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0011\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0011\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010\u0082\u00015OPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001¨\u0006\u0082\u0001"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "lightPaletteColor", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "getLightPaletteColor", "()Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "Swift_lightPaletteColor", "className", "", "darkPaletteColor", "getDarkPaletteColor", "Swift_darkPaletteColor", "lightHexValue", "getLightHexValue", "()Ljava/lang/String;", "Swift_lightHexValue", "darkHexValue", "getDarkHexValue", "Swift_darkHexValue", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "ContentPrimaryCase", "ContentSecondaryCase", "ContentTertiaryCase", "ContentQuaternaryCase", "ContentMutedCase", "ContentPositiveCase", "ContentCriticalCase", "ContentWarningCase", "ContentInvertedCase", "ContentTealCase", "ContentMagentaCase", "ContentPurpleCase", "ContentSkyBlueCase", "ContentGoldCase", "ContentOrangeCase", "ContentPlaceholderCase", "ContentAlphaCase", "ContentAccentBrandCase", "ContentAccentYellowCase", "ContentAccentRedCase", "ContentAccentGreenCase", "BackgroundSurfaceCase", "BackgroundElevatedCase", "BackgroundGroupedCase", "BackgroundGroupedElevatedCase", "BackgroundInvertedCase", "BackgroundPositiveLightCase", "BackgroundPositiveDarkCase", "BackgroundWarningLightCase", "BackgroundWarningDarkCase", "BackgroundCriticalLightCase", "BackgroundCriticalDarkCase", "BackgroundGreenSubtleCase", "BackgroundGreenStrongCase", "BackgroundBrandSubtleCase", "BackgroundBrandStrongCase", "BackgroundYellowSubtleCase", "BackgroundYellowStrongCase", "BackgroundRedSubtleCase", "BackgroundRedStrongCase", "ButtonPrimaryCase", "ButtonSecondaryCase", "ButtonBrandCase", "ButtonCriticalCase", "ButtonLabelCase", "ButtonPrimaryLabelCase", "BorderPrimaryCase", "BorderPrimaryElevatedCase", "BorderWarningCase", "BorderAlphaCase", "CustomCase", "Companion", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundBrandStrongCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundBrandSubtleCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundCriticalDarkCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundCriticalLightCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundElevatedCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundGreenStrongCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundGreenSubtleCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundGroupedCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundGroupedElevatedCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundInvertedCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundPositiveDarkCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundPositiveLightCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundRedStrongCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundRedSubtleCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundSurfaceCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundWarningDarkCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundWarningLightCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundYellowStrongCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundYellowSubtleCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BorderAlphaCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BorderPrimaryCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BorderPrimaryElevatedCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BorderWarningCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ButtonBrandCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ButtonCriticalCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ButtonLabelCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ButtonPrimaryCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ButtonPrimaryLabelCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ButtonSecondaryCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentAccentBrandCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentAccentGreenCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentAccentRedCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentAccentYellowCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentAlphaCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentCriticalCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentGoldCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentInvertedCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentMagentaCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentMutedCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentOrangeCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentPlaceholderCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentPositiveCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentPrimaryCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentPurpleCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentQuaternaryCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentSecondaryCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentSkyBlueCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentTealCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentTertiaryCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentWarningCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor$CustomCase;", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class SemanticColor implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final SemanticColor contentPrimary = new ContentPrimaryCase();
        private static final SemanticColor contentSecondary = new ContentSecondaryCase();
        private static final SemanticColor contentTertiary = new ContentTertiaryCase();
        private static final SemanticColor contentQuaternary = new ContentQuaternaryCase();
        private static final SemanticColor contentMuted = new ContentMutedCase();
        private static final SemanticColor contentPositive = new ContentPositiveCase();
        private static final SemanticColor contentCritical = new ContentCriticalCase();
        private static final SemanticColor contentWarning = new ContentWarningCase();
        private static final SemanticColor contentInverted = new ContentInvertedCase();
        private static final SemanticColor contentTeal = new ContentTealCase();
        private static final SemanticColor contentMagenta = new ContentMagentaCase();
        private static final SemanticColor contentPurple = new ContentPurpleCase();
        private static final SemanticColor contentSkyBlue = new ContentSkyBlueCase();
        private static final SemanticColor contentGold = new ContentGoldCase();
        private static final SemanticColor contentOrange = new ContentOrangeCase();
        private static final SemanticColor contentPlaceholder = new ContentPlaceholderCase();
        private static final SemanticColor contentAlpha = new ContentAlphaCase();
        private static final SemanticColor contentAccentBrand = new ContentAccentBrandCase();
        private static final SemanticColor contentAccentYellow = new ContentAccentYellowCase();
        private static final SemanticColor contentAccentRed = new ContentAccentRedCase();
        private static final SemanticColor contentAccentGreen = new ContentAccentGreenCase();
        private static final SemanticColor backgroundSurface = new BackgroundSurfaceCase();
        private static final SemanticColor backgroundElevated = new BackgroundElevatedCase();
        private static final SemanticColor backgroundGrouped = new BackgroundGroupedCase();
        private static final SemanticColor backgroundGroupedElevated = new BackgroundGroupedElevatedCase();
        private static final SemanticColor backgroundInverted = new BackgroundInvertedCase();
        private static final SemanticColor backgroundPositiveLight = new BackgroundPositiveLightCase();
        private static final SemanticColor backgroundPositiveDark = new BackgroundPositiveDarkCase();
        private static final SemanticColor backgroundWarningLight = new BackgroundWarningLightCase();
        private static final SemanticColor backgroundWarningDark = new BackgroundWarningDarkCase();
        private static final SemanticColor backgroundCriticalLight = new BackgroundCriticalLightCase();
        private static final SemanticColor backgroundCriticalDark = new BackgroundCriticalDarkCase();
        private static final SemanticColor backgroundGreenSubtle = new BackgroundGreenSubtleCase();
        private static final SemanticColor backgroundGreenStrong = new BackgroundGreenStrongCase();
        private static final SemanticColor backgroundBrandSubtle = new BackgroundBrandSubtleCase();
        private static final SemanticColor backgroundBrandStrong = new BackgroundBrandStrongCase();
        private static final SemanticColor backgroundYellowSubtle = new BackgroundYellowSubtleCase();
        private static final SemanticColor backgroundYellowStrong = new BackgroundYellowStrongCase();
        private static final SemanticColor backgroundRedSubtle = new BackgroundRedSubtleCase();
        private static final SemanticColor backgroundRedStrong = new BackgroundRedStrongCase();
        private static final SemanticColor buttonPrimary = new ButtonPrimaryCase();
        private static final SemanticColor buttonSecondary = new ButtonSecondaryCase();
        private static final SemanticColor buttonBrand = new ButtonBrandCase();
        private static final SemanticColor buttonCritical = new ButtonCriticalCase();
        private static final SemanticColor buttonLabel = new ButtonLabelCase();
        private static final SemanticColor buttonPrimaryLabel = new ButtonPrimaryLabelCase();
        private static final SemanticColor borderPrimary = new BorderPrimaryCase();
        private static final SemanticColor borderPrimaryElevated = new BorderPrimaryElevatedCase();
        private static final SemanticColor borderWarning = new BorderWarningCase();
        private static final SemanticColor borderAlpha = new BorderAlphaCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundBrandStrongCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BackgroundBrandStrongCase extends SemanticColor {
            public BackgroundBrandStrongCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundBrandSubtleCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BackgroundBrandSubtleCase extends SemanticColor {
            public BackgroundBrandSubtleCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundCriticalDarkCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BackgroundCriticalDarkCase extends SemanticColor {
            public BackgroundCriticalDarkCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundCriticalLightCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BackgroundCriticalLightCase extends SemanticColor {
            public BackgroundCriticalLightCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundElevatedCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BackgroundElevatedCase extends SemanticColor {
            public BackgroundElevatedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundGreenStrongCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BackgroundGreenStrongCase extends SemanticColor {
            public BackgroundGreenStrongCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundGreenSubtleCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BackgroundGreenSubtleCase extends SemanticColor {
            public BackgroundGreenSubtleCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundGroupedCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BackgroundGroupedCase extends SemanticColor {
            public BackgroundGroupedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundGroupedElevatedCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BackgroundGroupedElevatedCase extends SemanticColor {
            public BackgroundGroupedElevatedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundInvertedCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BackgroundInvertedCase extends SemanticColor {
            public BackgroundInvertedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundPositiveDarkCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BackgroundPositiveDarkCase extends SemanticColor {
            public BackgroundPositiveDarkCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundPositiveLightCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BackgroundPositiveLightCase extends SemanticColor {
            public BackgroundPositiveLightCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundRedStrongCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BackgroundRedStrongCase extends SemanticColor {
            public BackgroundRedStrongCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundRedSubtleCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BackgroundRedSubtleCase extends SemanticColor {
            public BackgroundRedSubtleCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundSurfaceCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BackgroundSurfaceCase extends SemanticColor {
            public BackgroundSurfaceCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundWarningDarkCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BackgroundWarningDarkCase extends SemanticColor {
            public BackgroundWarningDarkCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundWarningLightCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BackgroundWarningLightCase extends SemanticColor {
            public BackgroundWarningLightCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundYellowStrongCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BackgroundYellowStrongCase extends SemanticColor {
            public BackgroundYellowStrongCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BackgroundYellowSubtleCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BackgroundYellowSubtleCase extends SemanticColor {
            public BackgroundYellowSubtleCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BorderAlphaCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BorderAlphaCase extends SemanticColor {
            public BorderAlphaCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BorderPrimaryCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BorderPrimaryCase extends SemanticColor {
            public BorderPrimaryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BorderPrimaryElevatedCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BorderPrimaryElevatedCase extends SemanticColor {
            public BorderPrimaryElevatedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$BorderWarningCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BorderWarningCase extends SemanticColor {
            public BorderWarningCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ButtonBrandCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ButtonBrandCase extends SemanticColor {
            public ButtonBrandCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ButtonCriticalCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ButtonCriticalCase extends SemanticColor {
            public ButtonCriticalCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ButtonLabelCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ButtonLabelCase extends SemanticColor {
            public ButtonLabelCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ButtonPrimaryCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ButtonPrimaryCase extends SemanticColor {
            public ButtonPrimaryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ButtonPrimaryLabelCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ButtonPrimaryLabelCase extends SemanticColor {
            public ButtonPrimaryLabelCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ButtonSecondaryCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ButtonSecondaryCase extends SemanticColor {
            public ButtonSecondaryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentAccentBrandCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentAccentBrandCase extends SemanticColor {
            public ContentAccentBrandCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentAccentGreenCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentAccentGreenCase extends SemanticColor {
            public ContentAccentGreenCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentAccentRedCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentAccentRedCase extends SemanticColor {
            public ContentAccentRedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentAccentYellowCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentAccentYellowCase extends SemanticColor {
            public ContentAccentYellowCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentAlphaCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentAlphaCase extends SemanticColor {
            public ContentAlphaCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentCriticalCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentCriticalCase extends SemanticColor {
            public ContentCriticalCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentGoldCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentGoldCase extends SemanticColor {
            public ContentGoldCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentInvertedCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentInvertedCase extends SemanticColor {
            public ContentInvertedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentMagentaCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentMagentaCase extends SemanticColor {
            public ContentMagentaCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentMutedCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentMutedCase extends SemanticColor {
            public ContentMutedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentOrangeCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentOrangeCase extends SemanticColor {
            public ContentOrangeCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentPlaceholderCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentPlaceholderCase extends SemanticColor {
            public ContentPlaceholderCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentPositiveCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentPositiveCase extends SemanticColor {
            public ContentPositiveCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentPrimaryCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentPrimaryCase extends SemanticColor {
            public ContentPrimaryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentPurpleCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentPurpleCase extends SemanticColor {
            public ContentPurpleCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentQuaternaryCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentQuaternaryCase extends SemanticColor {
            public ContentQuaternaryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentSecondaryCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentSecondaryCase extends SemanticColor {
            public ContentSecondaryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentSkyBlueCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentSkyBlueCase extends SemanticColor {
            public ContentSkyBlueCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentTealCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentTealCase extends SemanticColor {
            public ContentTealCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentTertiaryCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentTertiaryCase extends SemanticColor {
            public ContentTertiaryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$ContentWarningCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "<init>", "()V", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ContentWarningCase extends SemanticColor {
            public ContentWarningCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$CustomCase;", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "associated0", "", "associated1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "lightHex", "getLightHex", "darkHex", "getDarkHex", "equals", "", "other", "", "hashCode", "", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class CustomCase extends SemanticColor {
            private final String associated0;
            private final String associated1;
            private final String darkHex;
            private final String lightHex;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CustomCase(String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.associated0 = str;
                this.associated1 = str2;
                this.lightHex = str;
                this.darkHex = str2;
            }

            public boolean equals(Object other) {
                if (!(other instanceof CustomCase)) {
                    return false;
                }
                CustomCase customCase = (CustomCase) other;
                if (!Intrinsics.areEqual(this.associated0, customCase.associated0) || !Intrinsics.areEqual(this.associated1, customCase.associated1)) {
                    return false;
                }
                return true;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final String getAssociated1() {
                return this.associated1;
            }

            public final String getDarkHex() {
                return this.darkHex;
            }

            public final String getLightHex() {
                return this.lightHex;
            }

            public int hashCode() {
                Hasher.Companion companion = Hasher.INSTANCE;
                return companion.combine(companion.combine(1, this.associated0), this.associated1);
            }
        }

        public /* synthetic */ SemanticColor(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native String Swift_darkHexValue(String className);

        private final native PaletteColor Swift_darkPaletteColor(String className);

        private final native String Swift_lightHexValue(String className);

        private final native PaletteColor Swift_lightPaletteColor(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ SemanticColor access$getBackgroundBrandStrong$cp() {
            return backgroundBrandStrong;
        }

        public static final /* synthetic */ SemanticColor access$getBackgroundBrandSubtle$cp() {
            return backgroundBrandSubtle;
        }

        public static final /* synthetic */ SemanticColor access$getBackgroundCriticalDark$cp() {
            return backgroundCriticalDark;
        }

        public static final /* synthetic */ SemanticColor access$getBackgroundCriticalLight$cp() {
            return backgroundCriticalLight;
        }

        public static final /* synthetic */ SemanticColor access$getBackgroundElevated$cp() {
            return backgroundElevated;
        }

        public static final /* synthetic */ SemanticColor access$getBackgroundGreenStrong$cp() {
            return backgroundGreenStrong;
        }

        public static final /* synthetic */ SemanticColor access$getBackgroundGreenSubtle$cp() {
            return backgroundGreenSubtle;
        }

        public static final /* synthetic */ SemanticColor access$getBackgroundGrouped$cp() {
            return backgroundGrouped;
        }

        public static final /* synthetic */ SemanticColor access$getBackgroundGroupedElevated$cp() {
            return backgroundGroupedElevated;
        }

        public static final /* synthetic */ SemanticColor access$getBackgroundInverted$cp() {
            return backgroundInverted;
        }

        public static final /* synthetic */ SemanticColor access$getBackgroundPositiveDark$cp() {
            return backgroundPositiveDark;
        }

        public static final /* synthetic */ SemanticColor access$getBackgroundPositiveLight$cp() {
            return backgroundPositiveLight;
        }

        public static final /* synthetic */ SemanticColor access$getBackgroundRedStrong$cp() {
            return backgroundRedStrong;
        }

        public static final /* synthetic */ SemanticColor access$getBackgroundRedSubtle$cp() {
            return backgroundRedSubtle;
        }

        public static final /* synthetic */ SemanticColor access$getBackgroundSurface$cp() {
            return backgroundSurface;
        }

        public static final /* synthetic */ SemanticColor access$getBackgroundWarningDark$cp() {
            return backgroundWarningDark;
        }

        public static final /* synthetic */ SemanticColor access$getBackgroundWarningLight$cp() {
            return backgroundWarningLight;
        }

        public static final /* synthetic */ SemanticColor access$getBackgroundYellowStrong$cp() {
            return backgroundYellowStrong;
        }

        public static final /* synthetic */ SemanticColor access$getBackgroundYellowSubtle$cp() {
            return backgroundYellowSubtle;
        }

        public static final /* synthetic */ SemanticColor access$getBorderAlpha$cp() {
            return borderAlpha;
        }

        public static final /* synthetic */ SemanticColor access$getBorderPrimary$cp() {
            return borderPrimary;
        }

        public static final /* synthetic */ SemanticColor access$getBorderPrimaryElevated$cp() {
            return borderPrimaryElevated;
        }

        public static final /* synthetic */ SemanticColor access$getBorderWarning$cp() {
            return borderWarning;
        }

        public static final /* synthetic */ SemanticColor access$getButtonBrand$cp() {
            return buttonBrand;
        }

        public static final /* synthetic */ SemanticColor access$getButtonCritical$cp() {
            return buttonCritical;
        }

        public static final /* synthetic */ SemanticColor access$getButtonLabel$cp() {
            return buttonLabel;
        }

        public static final /* synthetic */ SemanticColor access$getButtonPrimary$cp() {
            return buttonPrimary;
        }

        public static final /* synthetic */ SemanticColor access$getButtonPrimaryLabel$cp() {
            return buttonPrimaryLabel;
        }

        public static final /* synthetic */ SemanticColor access$getButtonSecondary$cp() {
            return buttonSecondary;
        }

        public static final /* synthetic */ SemanticColor access$getContentAccentBrand$cp() {
            return contentAccentBrand;
        }

        public static final /* synthetic */ SemanticColor access$getContentAccentGreen$cp() {
            return contentAccentGreen;
        }

        public static final /* synthetic */ SemanticColor access$getContentAccentRed$cp() {
            return contentAccentRed;
        }

        public static final /* synthetic */ SemanticColor access$getContentAccentYellow$cp() {
            return contentAccentYellow;
        }

        public static final /* synthetic */ SemanticColor access$getContentAlpha$cp() {
            return contentAlpha;
        }

        public static final /* synthetic */ SemanticColor access$getContentCritical$cp() {
            return contentCritical;
        }

        public static final /* synthetic */ SemanticColor access$getContentGold$cp() {
            return contentGold;
        }

        public static final /* synthetic */ SemanticColor access$getContentInverted$cp() {
            return contentInverted;
        }

        public static final /* synthetic */ SemanticColor access$getContentMagenta$cp() {
            return contentMagenta;
        }

        public static final /* synthetic */ SemanticColor access$getContentMuted$cp() {
            return contentMuted;
        }

        public static final /* synthetic */ SemanticColor access$getContentOrange$cp() {
            return contentOrange;
        }

        public static final /* synthetic */ SemanticColor access$getContentPlaceholder$cp() {
            return contentPlaceholder;
        }

        public static final /* synthetic */ SemanticColor access$getContentPositive$cp() {
            return contentPositive;
        }

        public static final /* synthetic */ SemanticColor access$getContentPrimary$cp() {
            return contentPrimary;
        }

        public static final /* synthetic */ SemanticColor access$getContentPurple$cp() {
            return contentPurple;
        }

        public static final /* synthetic */ SemanticColor access$getContentQuaternary$cp() {
            return contentQuaternary;
        }

        public static final /* synthetic */ SemanticColor access$getContentSecondary$cp() {
            return contentSecondary;
        }

        public static final /* synthetic */ SemanticColor access$getContentSkyBlue$cp() {
            return contentSkyBlue;
        }

        public static final /* synthetic */ SemanticColor access$getContentTeal$cp() {
            return contentTeal;
        }

        public static final /* synthetic */ SemanticColor access$getContentTertiary$cp() {
            return contentTertiary;
        }

        public static final /* synthetic */ SemanticColor access$getContentWarning$cp() {
            return contentWarning;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final String getDarkHexValue() {
            return Swift_darkHexValue(getClass().getName());
        }

        public final PaletteColor getDarkPaletteColor() {
            return Swift_darkPaletteColor(getClass().getName());
        }

        public final String getLightHexValue() {
            return Swift_lightHexValue(getClass().getName());
        }

        public final PaletteColor getLightPaletteColor() {
            return Swift_lightPaletteColor(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bf\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010j\u001a\u00020\u00052\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020lJ\u000f\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00050oH\u0082 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0011\u0010 \u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0011\u0010\"\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007R\u0011\u0010$\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0011\u0010&\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0007R\u0011\u0010(\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0007R\u0011\u0010*\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0007R\u0011\u0010,\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0007R\u0011\u0010.\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0007R\u0011\u00100\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0007R\u0011\u00102\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0007R\u0011\u00104\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0007R\u0011\u00106\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0007R\u0011\u00108\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0007R\u0011\u0010:\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0007R\u0011\u0010<\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0007R\u0011\u0010>\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0007R\u0011\u0010@\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0007R\u0011\u0010B\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0007R\u0011\u0010D\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\u0007R\u0011\u0010F\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bG\u0010\u0007R\u0011\u0010H\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u0010\u0007R\u0011\u0010J\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u0010\u0007R\u0011\u0010L\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bM\u0010\u0007R\u0011\u0010N\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\u0007R\u0011\u0010P\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010\u0007R\u0011\u0010R\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bS\u0010\u0007R\u0011\u0010T\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bU\u0010\u0007R\u0011\u0010V\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bW\u0010\u0007R\u0011\u0010X\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bY\u0010\u0007R\u0011\u0010Z\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\u0007R\u0011\u0010\\\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b]\u0010\u0007R\u0011\u0010^\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b_\u0010\u0007R\u0011\u0010`\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\ba\u0010\u0007R\u0011\u0010b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bc\u0010\u0007R\u0011\u0010d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\be\u0010\u0007R\u0011\u0010f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bg\u0010\u0007R\u0011\u0010h\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bi\u0010\u0007R\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00050o8F¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006s"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$SemanticColor$Companion;", "", "<init>", "()V", "contentPrimary", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "getContentPrimary", "()Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "contentSecondary", "getContentSecondary", "contentTertiary", "getContentTertiary", "contentQuaternary", "getContentQuaternary", "contentMuted", "getContentMuted", "contentPositive", "getContentPositive", "contentCritical", "getContentCritical", "contentWarning", "getContentWarning", "contentInverted", "getContentInverted", "contentTeal", "getContentTeal", "contentMagenta", "getContentMagenta", "contentPurple", "getContentPurple", "contentSkyBlue", "getContentSkyBlue", "contentGold", "getContentGold", "contentOrange", "getContentOrange", "contentPlaceholder", "getContentPlaceholder", "contentAlpha", "getContentAlpha", "contentAccentBrand", "getContentAccentBrand", "contentAccentYellow", "getContentAccentYellow", "contentAccentRed", "getContentAccentRed", "contentAccentGreen", "getContentAccentGreen", "backgroundSurface", "getBackgroundSurface", "backgroundElevated", "getBackgroundElevated", "backgroundGrouped", "getBackgroundGrouped", "backgroundGroupedElevated", "getBackgroundGroupedElevated", "backgroundInverted", "getBackgroundInverted", "backgroundPositiveLight", "getBackgroundPositiveLight", "backgroundPositiveDark", "getBackgroundPositiveDark", "backgroundWarningLight", "getBackgroundWarningLight", "backgroundWarningDark", "getBackgroundWarningDark", "backgroundCriticalLight", "getBackgroundCriticalLight", "backgroundCriticalDark", "getBackgroundCriticalDark", "backgroundGreenSubtle", "getBackgroundGreenSubtle", "backgroundGreenStrong", "getBackgroundGreenStrong", "backgroundBrandSubtle", "getBackgroundBrandSubtle", "backgroundBrandStrong", "getBackgroundBrandStrong", "backgroundYellowSubtle", "getBackgroundYellowSubtle", "backgroundYellowStrong", "getBackgroundYellowStrong", "backgroundRedSubtle", "getBackgroundRedSubtle", "backgroundRedStrong", "getBackgroundRedStrong", "buttonPrimary", "getButtonPrimary", "buttonSecondary", "getButtonSecondary", "buttonBrand", "getButtonBrand", "buttonCritical", "getButtonCritical", "buttonLabel", "getButtonLabel", "buttonPrimaryLabel", "getButtonPrimaryLabel", "borderPrimary", "getBorderPrimary", "borderPrimaryElevated", "getBorderPrimaryElevated", "borderWarning", "getBorderWarning", "borderAlpha", "getBorderAlpha", "custom", "lightHex", "", "darkHex", "seriesFallbacks", "", "getSeriesFallbacks", "()Ljava/util/List;", "Swift_Companion_seriesFallbacks", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final native List<SemanticColor> Swift_Companion_seriesFallbacks();

            public final SemanticColor custom(String lightHex, String darkHex) {
                lightHex.getClass();
                darkHex.getClass();
                return new CustomCase(lightHex, darkHex);
            }

            public final SemanticColor getBackgroundBrandStrong() {
                return SemanticColor.access$getBackgroundBrandStrong$cp();
            }

            public final SemanticColor getBackgroundBrandSubtle() {
                return SemanticColor.access$getBackgroundBrandSubtle$cp();
            }

            public final SemanticColor getBackgroundCriticalDark() {
                return SemanticColor.access$getBackgroundCriticalDark$cp();
            }

            public final SemanticColor getBackgroundCriticalLight() {
                return SemanticColor.access$getBackgroundCriticalLight$cp();
            }

            public final SemanticColor getBackgroundElevated() {
                return SemanticColor.access$getBackgroundElevated$cp();
            }

            public final SemanticColor getBackgroundGreenStrong() {
                return SemanticColor.access$getBackgroundGreenStrong$cp();
            }

            public final SemanticColor getBackgroundGreenSubtle() {
                return SemanticColor.access$getBackgroundGreenSubtle$cp();
            }

            public final SemanticColor getBackgroundGrouped() {
                return SemanticColor.access$getBackgroundGrouped$cp();
            }

            public final SemanticColor getBackgroundGroupedElevated() {
                return SemanticColor.access$getBackgroundGroupedElevated$cp();
            }

            public final SemanticColor getBackgroundInverted() {
                return SemanticColor.access$getBackgroundInverted$cp();
            }

            public final SemanticColor getBackgroundPositiveDark() {
                return SemanticColor.access$getBackgroundPositiveDark$cp();
            }

            public final SemanticColor getBackgroundPositiveLight() {
                return SemanticColor.access$getBackgroundPositiveLight$cp();
            }

            public final SemanticColor getBackgroundRedStrong() {
                return SemanticColor.access$getBackgroundRedStrong$cp();
            }

            public final SemanticColor getBackgroundRedSubtle() {
                return SemanticColor.access$getBackgroundRedSubtle$cp();
            }

            public final SemanticColor getBackgroundSurface() {
                return SemanticColor.access$getBackgroundSurface$cp();
            }

            public final SemanticColor getBackgroundWarningDark() {
                return SemanticColor.access$getBackgroundWarningDark$cp();
            }

            public final SemanticColor getBackgroundWarningLight() {
                return SemanticColor.access$getBackgroundWarningLight$cp();
            }

            public final SemanticColor getBackgroundYellowStrong() {
                return SemanticColor.access$getBackgroundYellowStrong$cp();
            }

            public final SemanticColor getBackgroundYellowSubtle() {
                return SemanticColor.access$getBackgroundYellowSubtle$cp();
            }

            public final SemanticColor getBorderAlpha() {
                return SemanticColor.access$getBorderAlpha$cp();
            }

            public final SemanticColor getBorderPrimary() {
                return SemanticColor.access$getBorderPrimary$cp();
            }

            public final SemanticColor getBorderPrimaryElevated() {
                return SemanticColor.access$getBorderPrimaryElevated$cp();
            }

            public final SemanticColor getBorderWarning() {
                return SemanticColor.access$getBorderWarning$cp();
            }

            public final SemanticColor getButtonBrand() {
                return SemanticColor.access$getButtonBrand$cp();
            }

            public final SemanticColor getButtonCritical() {
                return SemanticColor.access$getButtonCritical$cp();
            }

            public final SemanticColor getButtonLabel() {
                return SemanticColor.access$getButtonLabel$cp();
            }

            public final SemanticColor getButtonPrimary() {
                return SemanticColor.access$getButtonPrimary$cp();
            }

            public final SemanticColor getButtonPrimaryLabel() {
                return SemanticColor.access$getButtonPrimaryLabel$cp();
            }

            public final SemanticColor getButtonSecondary() {
                return SemanticColor.access$getButtonSecondary$cp();
            }

            public final SemanticColor getContentAccentBrand() {
                return SemanticColor.access$getContentAccentBrand$cp();
            }

            public final SemanticColor getContentAccentGreen() {
                return SemanticColor.access$getContentAccentGreen$cp();
            }

            public final SemanticColor getContentAccentRed() {
                return SemanticColor.access$getContentAccentRed$cp();
            }

            public final SemanticColor getContentAccentYellow() {
                return SemanticColor.access$getContentAccentYellow$cp();
            }

            public final SemanticColor getContentAlpha() {
                return SemanticColor.access$getContentAlpha$cp();
            }

            public final SemanticColor getContentCritical() {
                return SemanticColor.access$getContentCritical$cp();
            }

            public final SemanticColor getContentGold() {
                return SemanticColor.access$getContentGold$cp();
            }

            public final SemanticColor getContentInverted() {
                return SemanticColor.access$getContentInverted$cp();
            }

            public final SemanticColor getContentMagenta() {
                return SemanticColor.access$getContentMagenta$cp();
            }

            public final SemanticColor getContentMuted() {
                return SemanticColor.access$getContentMuted$cp();
            }

            public final SemanticColor getContentOrange() {
                return SemanticColor.access$getContentOrange$cp();
            }

            public final SemanticColor getContentPlaceholder() {
                return SemanticColor.access$getContentPlaceholder$cp();
            }

            public final SemanticColor getContentPositive() {
                return SemanticColor.access$getContentPositive$cp();
            }

            public final SemanticColor getContentPrimary() {
                return SemanticColor.access$getContentPrimary$cp();
            }

            public final SemanticColor getContentPurple() {
                return SemanticColor.access$getContentPurple$cp();
            }

            public final SemanticColor getContentQuaternary() {
                return SemanticColor.access$getContentQuaternary$cp();
            }

            public final SemanticColor getContentSecondary() {
                return SemanticColor.access$getContentSecondary$cp();
            }

            public final SemanticColor getContentSkyBlue() {
                return SemanticColor.access$getContentSkyBlue$cp();
            }

            public final SemanticColor getContentTeal() {
                return SemanticColor.access$getContentTeal$cp();
            }

            public final SemanticColor getContentTertiary() {
                return SemanticColor.access$getContentTertiary$cp();
            }

            public final SemanticColor getContentWarning() {
                return SemanticColor.access$getContentWarning$cp();
            }

            public final List<SemanticColor> getSeriesFallbacks() {
                return Swift_Companion_seriesFallbacks();
            }

            private Companion() {
            }
        }

        private SemanticColor() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001e2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0082 j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u001f"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$Size;", "Lskip/lib/CaseIterable;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "threeXS", "twoXS", "xs", "small", RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR, "large", "xl", "twoXL", "threeXL", "fourXL", "fiveXL", "sixXL", "sevenXL", "eightXL", "nineXL", "tenXL", "elevenXL", "twelveXL", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Size implements CaseIterable, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Size threeXS = new Size("threeXS", 0);
        public static final Size twoXS = new Size("twoXS", 1);
        public static final Size xs = new Size("xs", 2);
        public static final Size small = new Size("small", 3);
        public static final Size medium = new Size(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR, 4);
        public static final Size large = new Size("large", 5);
        public static final Size xl = new Size("xl", 6);
        public static final Size twoXL = new Size("twoXL", 7);
        public static final Size threeXL = new Size("threeXL", 8);
        public static final Size fourXL = new Size("fourXL", 9);
        public static final Size fiveXL = new Size("fiveXL", 10);
        public static final Size sixXL = new Size("sixXL", 11);
        public static final Size sevenXL = new Size("sevenXL", 12);
        public static final Size eightXL = new Size("eightXL", 13);
        public static final Size nineXL = new Size("nineXL", 14);
        public static final Size tenXL = new Size("tenXL", 15);
        public static final Size elevenXL = new Size("elevenXL", 16);
        public static final Size twelveXL = new Size("twelveXL", 17);

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{threeXS, twoXS, xs, small, medium, large, xl, twoXL, threeXL, fourXL, fiveXL, sixXL, sevenXL, eightXL, nineXL, tenXL, elevenXL, twelveXL};
        }

        static {
            Size[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Size(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$Size$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/designtokens/DesignTokens$Size;", "<init>", "()V", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion implements CaseIterableCompanion<Size> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<Size> getAllCases() {
                return ArrayKt.arrayOf(Size.threeXS, Size.twoXS, Size.xs, Size.small, Size.medium, Size.large, Size.xl, Size.twoXL, Size.threeXL, Size.fourXL, Size.fiveXL, Size.sixXL, Size.sevenXL, Size.eightXL, Size.nineXL, Size.tenXL, Size.elevenXL, Size.twelveXL);
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b#\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 Q2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001QB\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020\u0003H\u0082 J\u0011\u00103\u001a\u00020,2\u0006\u00100\u001a\u00020\u0003H\u0082 J\u0011\u00106\u001a\u00020,2\u0006\u00100\u001a\u00020\u0003H\u0082 J\u0011\u00109\u001a\u00020,2\u0006\u00100\u001a\u00020\u0003H\u0082 J\u0011\u0010>\u001a\u00020;2\u0006\u00100\u001a\u00020\u0003H\u0082 J\u0011\u0010C\u001a\u00020@2\u0006\u00100\u001a\u00020\u0003H\u0082 J\u0011\u0010G\u001a\u00020E2\u0006\u00100\u001a\u00020\u0003H\u0082 J\u0011\u0010K\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0003H\u0082 J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020N0M2\u0006\u0010O\u001a\u00020;H\u0016J\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020N0M2\u0006\u0010O\u001a\u00020;H\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010+\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u00101\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b2\u0010.R\u0011\u00104\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b5\u0010.R\u0011\u00107\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b8\u0010.R\u0011\u0010:\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010?\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010D\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bD\u0010FR\u0011\u0010H\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\bI\u0010Jj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006R"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$Typography;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "largeNumber", "smallNumber", "smallerNumber", "largeTitle", "title1", "title2", "title3", "title4", "largeTitleCondensed", "title1Condensed", "title2Condensed", "title3Condensed", "title4Condensed", "body1", "body1Strong", "body2", "body2Light", "body2Strong", "body2Condensed", "body3", "body3Strong", "body4", "body4Strong", "caption1", "caption1Strong", "caption2", "caption2Strong", "caption3Strong", "tagLabel", "tagLabelCondensed", "defaultSize", "", "getDefaultSize", "()D", "Swift_defaultSize", Keys.KEY_NAME, "defaultLineHeight", "getDefaultLineHeight", "Swift_defaultLineHeight", "defaultLetterSpacing", "getDefaultLetterSpacing", "Swift_defaultLetterSpacing", "iOSLetterSpacing", "getIOSLetterSpacing", "Swift_iOSLetterSpacing", "defaultNumericWeight", "", "getDefaultNumericWeight", "()I", "Swift_defaultNumericWeight", "defaultFamily", "Lcom/polymarket/designtokens/DesignTokens$FontFamily;", "getDefaultFamily", "()Lcom/polymarket/designtokens/DesignTokens$FontFamily;", "Swift_defaultFamily", "isStrong", "", "()Z", "Swift_isStrong", "base", "getBase", "()Lcom/polymarket/designtokens/DesignTokens$Typography;", "Swift_base", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Companion", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Typography implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Typography[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final Typography largeNumber = new Typography("largeNumber", 0, "largeNumber", null, 2, null);
        public static final Typography smallNumber = new Typography("smallNumber", 1, "smallNumber", null, 2, null);
        public static final Typography smallerNumber = new Typography("smallerNumber", 2, "smallerNumber", null, 2, null);
        public static final Typography largeTitle = new Typography("largeTitle", 3, "largeTitle", null, 2, null);
        public static final Typography title1 = new Typography("title1", 4, "title1", null, 2, null);
        public static final Typography title2 = new Typography("title2", 5, "title2", null, 2, null);
        public static final Typography title3 = new Typography("title3", 6, "title3", null, 2, null);
        public static final Typography title4 = new Typography("title4", 7, "title4", null, 2, null);
        public static final Typography largeTitleCondensed = new Typography("largeTitleCondensed", 8, "largeTitleCondensed", null, 2, null);
        public static final Typography title1Condensed = new Typography("title1Condensed", 9, "title1Condensed", null, 2, null);
        public static final Typography title2Condensed = new Typography("title2Condensed", 10, "title2Condensed", null, 2, null);
        public static final Typography title3Condensed = new Typography("title3Condensed", 11, "title3Condensed", null, 2, null);
        public static final Typography title4Condensed = new Typography("title4Condensed", 12, "title4Condensed", null, 2, null);
        public static final Typography body1 = new Typography("body1", 13, "body1", null, 2, null);
        public static final Typography body1Strong = new Typography("body1Strong", 14, "body1Strong", null, 2, null);
        public static final Typography body2 = new Typography("body2", 15, "body2", null, 2, null);
        public static final Typography body2Light = new Typography("body2Light", 16, "body2Light", null, 2, null);
        public static final Typography body2Strong = new Typography("body2Strong", 17, "body2Strong", null, 2, null);
        public static final Typography body2Condensed = new Typography("body2Condensed", 18, "body2Condensed", null, 2, null);
        public static final Typography body3 = new Typography("body3", 19, "body3", null, 2, null);
        public static final Typography body3Strong = new Typography("body3Strong", 20, "body3Strong", null, 2, null);
        public static final Typography body4 = new Typography("body4", 21, "body4", null, 2, null);
        public static final Typography body4Strong = new Typography("body4Strong", 22, "body4Strong", null, 2, null);
        public static final Typography caption1 = new Typography("caption1", 23, "caption1", null, 2, null);
        public static final Typography caption1Strong = new Typography("caption1Strong", 24, "caption1Strong", null, 2, null);
        public static final Typography caption2 = new Typography("caption2", 25, "caption2", null, 2, null);
        public static final Typography caption2Strong = new Typography("caption2Strong", 26, "caption2Strong", null, 2, null);
        public static final Typography caption3Strong = new Typography("caption3Strong", 27, "caption3Strong", null, 2, null);
        public static final Typography tagLabel = new Typography("tagLabel", 28, "tagLabel", null, 2, null);
        public static final Typography tagLabelCondensed = new Typography("tagLabelCondensed", 29, "tagLabelCondensed", null, 2, null);

        private static final /* synthetic */ Typography[] $values() {
            return new Typography[]{largeNumber, smallNumber, smallerNumber, largeTitle, title1, title2, title3, title4, largeTitleCondensed, title1Condensed, title2Condensed, title3Condensed, title4Condensed, body1, body1Strong, body2, body2Light, body2Strong, body2Condensed, body3, body3Strong, body4, body4Strong, caption1, caption1Strong, caption2, caption2Strong, caption3Strong, tagLabel, tagLabelCondensed};
        }

        static {
            Typography[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ Typography(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Typography Swift_base(String name);

        private final native FontFamily Swift_defaultFamily(String name);

        private final native double Swift_defaultLetterSpacing(String name);

        private final native double Swift_defaultLineHeight(String name);

        private final native int Swift_defaultNumericWeight(String name);

        private final native double Swift_defaultSize(String name);

        private final native double Swift_iOSLetterSpacing(String name);

        private final native boolean Swift_isStrong(String name);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Typography valueOf(String str) {
            return (Typography) Enum.valueOf(Typography.class, str);
        }

        public static Typography[] values() {
            return (Typography[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final Typography getBase() {
            return Swift_base(name());
        }

        public final FontFamily getDefaultFamily() {
            return Swift_defaultFamily(name());
        }

        public final double getDefaultLetterSpacing() {
            return Swift_defaultLetterSpacing(name());
        }

        public final double getDefaultLineHeight() {
            return Swift_defaultLineHeight(name());
        }

        public final int getDefaultNumericWeight() {
            return Swift_defaultNumericWeight(name());
        }

        public final double getDefaultSize() {
            return Swift_defaultSize(name());
        }

        public final double getIOSLetterSpacing() {
            return Swift_iOSLetterSpacing(name());
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        public final boolean isStrong() {
            return Swift_isStrong(name());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$Typography$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/designtokens/DesignTokens$Typography;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion implements CaseIterableCompanion<Typography> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<Typography> getAllCases() {
                return ArrayKt.arrayOf(Typography.largeNumber, Typography.smallNumber, Typography.smallerNumber, Typography.largeTitle, Typography.title1, Typography.title2, Typography.title3, Typography.title4, Typography.largeTitleCondensed, Typography.title1Condensed, Typography.title2Condensed, Typography.title3Condensed, Typography.title4Condensed, Typography.body1, Typography.body1Strong, Typography.body2, Typography.body2Light, Typography.body2Strong, Typography.body2Condensed, Typography.body3, Typography.body3Strong, Typography.body4, Typography.body4Strong, Typography.caption1, Typography.caption1Strong, Typography.caption2, Typography.caption2Strong, Typography.caption3Strong, Typography.tagLabel, Typography.tagLabelCondensed);
            }

            public final Typography init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -2011399075:
                        if (!rawValue.equals("smallerNumber")) {
                            return null;
                        }
                        return Typography.smallerNumber;
                    case -1786606397:
                        if (rawValue.equals("caption2Strong")) {
                            return Typography.caption2Strong;
                        }
                        return null;
                    case -1661670812:
                        if (rawValue.equals("largeNumber")) {
                            return Typography.largeNumber;
                        }
                        return null;
                    case -1659182387:
                        if (rawValue.equals("tagLabelCondensed")) {
                            return Typography.tagLabelCondensed;
                        }
                        return null;
                    case -1546009018:
                        if (rawValue.equals("body1Strong")) {
                            return Typography.body1Strong;
                        }
                        return null;
                    case -1136423898:
                        if (rawValue.equals("body2Light")) {
                            return Typography.body2Light;
                        }
                        return null;
                    case -1009960144:
                        if (rawValue.equals("smallNumber")) {
                            return Typography.smallNumber;
                        }
                        return null;
                    case -899102716:
                        if (rawValue.equals("caption3Strong")) {
                            return Typography.caption3Strong;
                        }
                        return null;
                    case -873453351:
                        if (rawValue.equals("title1")) {
                            return Typography.title1;
                        }
                        return null;
                    case -873453350:
                        if (rawValue.equals("title2")) {
                            return Typography.title2;
                        }
                        return null;
                    case -873453349:
                        if (rawValue.equals("title3")) {
                            return Typography.title3;
                        }
                        return null;
                    case -873453348:
                        if (rawValue.equals("title4")) {
                            return Typography.title4;
                        }
                        return null;
                    case -781942918:
                        if (rawValue.equals("tagLabel")) {
                            return Typography.tagLabel;
                        }
                        return null;
                    case -658505337:
                        if (rawValue.equals("body2Strong")) {
                            return Typography.body2Strong;
                        }
                        return null;
                    case -50093301:
                        if (rawValue.equals("caption1")) {
                            return Typography.caption1;
                        }
                        return null;
                    case -50093300:
                        if (rawValue.equals("caption2")) {
                            return Typography.caption2;
                        }
                        return null;
                    case 93911759:
                        if (rawValue.equals("body1")) {
                            return Typography.body1;
                        }
                        return null;
                    case 93911760:
                        if (rawValue.equals("body2")) {
                            return Typography.body2;
                        }
                        return null;
                    case 93911761:
                        if (rawValue.equals("body3")) {
                            return Typography.body3;
                        }
                        return null;
                    case 93911762:
                        if (rawValue.equals("body4")) {
                            return Typography.body4;
                        }
                        return null;
                    case 228998344:
                        if (rawValue.equals("body3Strong")) {
                            return Typography.body3Strong;
                        }
                        return null;
                    case 1030539319:
                        if (rawValue.equals("body2Condensed")) {
                            return Typography.body2Condensed;
                        }
                        return null;
                    case 1114004938:
                        if (rawValue.equals("largeTitleCondensed")) {
                            return Typography.largeTitleCondensed;
                        }
                        return null;
                    case 1116502025:
                        if (rawValue.equals("body4Strong")) {
                            return Typography.body4Strong;
                        }
                        return null;
                    case 1320855467:
                        if (rawValue.equals("title4Condensed")) {
                            return Typography.title4Condensed;
                        }
                        return null;
                    case 1517368972:
                        if (rawValue.equals("title3Condensed")) {
                            return Typography.title3Condensed;
                        }
                        return null;
                    case 1620857218:
                        if (rawValue.equals("caption1Strong")) {
                            return Typography.caption1Strong;
                        }
                        return null;
                    case 1713882477:
                        if (rawValue.equals("title2Condensed")) {
                            return Typography.title2Condensed;
                        }
                        return null;
                    case 1910395982:
                        if (rawValue.equals("title1Condensed")) {
                            return Typography.title1Condensed;
                        }
                        return null;
                    case 2029798365:
                        if (rawValue.equals("largeTitle")) {
                            return Typography.largeTitle;
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

        private Typography(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/designtokens/DesignTokens$Companion;", "", "<init>", "()V", "FontFamily", "Lcom/polymarket/designtokens/DesignTokens$FontFamily;", "rawValue", "", "Typography", "Lcom/polymarket/designtokens/DesignTokens$Typography;", "AppDesignTokens"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FontFamily FontFamily(String rawValue) {
            rawValue.getClass();
            return FontFamily.INSTANCE.init(rawValue);
        }

        public final Typography Typography(String rawValue) {
            rawValue.getClass();
            return Typography.INSTANCE.init(rawValue);
        }

        private Companion() {
        }
    }
}
