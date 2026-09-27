package com.polymarket.data;

import com.google.android.libraries.places.api.model.PlaceTypes;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u001dB\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u001e"}, d2 = {"Lcom/polymarket/data/APIEventCategory;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "climate", "crypto", "culture", PlaceTypes.FINANCE, "geopolitics", "macro", "mentions", "politics", "sports", "technology", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class APIEventCategory implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ APIEventCategory[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final APIEventCategory climate = new APIEventCategory("climate", 0, "climate", null, 2, null);
    public static final APIEventCategory crypto = new APIEventCategory("crypto", 1, "crypto", null, 2, null);
    public static final APIEventCategory culture = new APIEventCategory("culture", 2, "culture", null, 2, null);
    public static final APIEventCategory finance = new APIEventCategory(PlaceTypes.FINANCE, 3, PlaceTypes.FINANCE, null, 2, null);
    public static final APIEventCategory geopolitics = new APIEventCategory("geopolitics", 4, "geopolitics", null, 2, null);
    public static final APIEventCategory macro = new APIEventCategory("macro", 5, "macro", null, 2, null);
    public static final APIEventCategory mentions = new APIEventCategory("mentions", 6, "mentions", null, 2, null);
    public static final APIEventCategory politics = new APIEventCategory("politics", 7, "politics", null, 2, null);
    public static final APIEventCategory sports = new APIEventCategory("sports", 8, "sports", null, 2, null);
    public static final APIEventCategory technology = new APIEventCategory("technology", 9, "technology", null, 2, null);
    public static final APIEventCategory unknown = new APIEventCategory("unknown", 10, "unknown", null, 2, null);
    private final String rawValue;

    private static final /* synthetic */ APIEventCategory[] $values() {
        return new APIEventCategory[]{climate, crypto, culture, finance, geopolitics, macro, mentions, politics, sports, technology, unknown};
    }

    static {
        APIEventCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ APIEventCategory(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static APIEventCategory valueOf(String str) {
        return (APIEventCategory) Enum.valueOf(APIEventCategory.class, str);
    }

    public static APIEventCategory[] values() {
        return (APIEventCategory[]) $VALUES.clone();
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
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/APIEventCategory$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/APIEventCategory;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final APIEventCategory init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -1679325940:
                    if (!rawValue.equals("technology")) {
                        return null;
                    }
                    return APIEventCategory.technology;
                case -1351683903:
                    if (rawValue.equals("crypto")) {
                        return APIEventCategory.crypto;
                    }
                    return null;
                case -1286973006:
                    if (rawValue.equals("geopolitics")) {
                        return APIEventCategory.geopolitics;
                    }
                    return null;
                case -895760513:
                    if (rawValue.equals("sports")) {
                        return APIEventCategory.sports;
                    }
                    return null;
                case -853258278:
                    if (rawValue.equals(PlaceTypes.FINANCE)) {
                        return APIEventCategory.finance;
                    }
                    return null;
                case -604069943:
                    if (rawValue.equals("mentions")) {
                        return APIEventCategory.mentions;
                    }
                    return null;
                case -284840886:
                    if (rawValue.equals("unknown")) {
                        return APIEventCategory.unknown;
                    }
                    return null;
                case 103652300:
                    if (rawValue.equals("macro")) {
                        return APIEventCategory.macro;
                    }
                    return null;
                case 547400545:
                    if (rawValue.equals("politics")) {
                        return APIEventCategory.politics;
                    }
                    return null;
                case 860813349:
                    if (rawValue.equals("climate")) {
                        return APIEventCategory.climate;
                    }
                    return null;
                case 1121473966:
                    if (rawValue.equals("culture")) {
                        return APIEventCategory.culture;
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

    private APIEventCategory(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
