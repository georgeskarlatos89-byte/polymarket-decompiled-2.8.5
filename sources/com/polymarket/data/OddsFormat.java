package com.polymarket.data;

import com.polymarket.designtokens.Icon;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000  2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001 B\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0003H\u0082 J\u0011\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0082 J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006!"}, d2 = {"Lcom/polymarket/data/OddsFormat;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "price", "american", "decimal", "percentage", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON, "Lcom/polymarket/designtokens/Icon;", "getIcon", "()Lcom/polymarket/designtokens/Icon;", "Swift_icon", Keys.KEY_NAME, "columnSymbol", "getColumnSymbol", "Swift_columnSymbol", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OddsFormat implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ OddsFormat[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final OddsFormat price = new OddsFormat("price", 0, "price", null, 2, null);
    public static final OddsFormat american = new OddsFormat("american", 1, "american", null, 2, null);
    public static final OddsFormat decimal = new OddsFormat("decimal", 2, "decimal", null, 2, null);
    public static final OddsFormat percentage = new OddsFormat("percentage", 3, "percent", null, 2, null);

    private static final /* synthetic */ OddsFormat[] $values() {
        return new OddsFormat[]{price, american, decimal, percentage};
    }

    static {
        OddsFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ OddsFormat(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native String Swift_columnSymbol(String name);

    private final native Icon Swift_icon(String name);

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static OddsFormat valueOf(String str) {
        return (OddsFormat) Enum.valueOf(OddsFormat.class, str);
    }

    public static OddsFormat[] values() {
        return (OddsFormat[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getColumnSymbol() {
        return Swift_columnSymbol(name());
    }

    public final Icon getIcon() {
        return Swift_icon(name());
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/data/OddsFormat$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/data/OddsFormat;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion implements CaseIterableCompanion<OddsFormat> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.lib.CaseIterableCompanion
        public Array<OddsFormat> getAllCases() {
            return ArrayKt.arrayOf(OddsFormat.price, OddsFormat.american, OddsFormat.decimal, OddsFormat.percentage);
        }

        public final OddsFormat init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -1792383968:
                    if (!rawValue.equals("american")) {
                        return null;
                    }
                    return OddsFormat.american;
                case -678927291:
                    if (rawValue.equals("percent")) {
                        return OddsFormat.percentage;
                    }
                    return null;
                case 106934601:
                    if (rawValue.equals("price")) {
                        return OddsFormat.price;
                    }
                    return null;
                case 1542263633:
                    if (rawValue.equals("decimal")) {
                        return OddsFormat.decimal;
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

    private OddsFormat(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
