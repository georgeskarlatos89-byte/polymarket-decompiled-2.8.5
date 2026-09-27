package com.polymarket.data;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.Identifiable;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 #2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u00042\u00020\u00052\b\u0012\u0004\u0012\u00020\u00000\u0006:\u0001#B\u001d\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0082 J\u0011\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0082 J\u0011\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0082 J\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0082 J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020!H\u0016J\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020!H\u0082 R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\rR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006$"}, d2 = {"Lcom/polymarket/data/ETradingMode;", "Lskip/lib/CaseIterable;", "Lskip/lib/Identifiable;", "", "Lskip/lib/RawRepresentable;", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "market", "limit", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "Swift_id", Keys.KEY_NAME, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", "shortTitle", "getShortTitle", "Swift_shortTitle", "subtitle", "getSubtitle", "Swift_subtitle", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ETradingMode implements CaseIterable, Identifiable<String>, RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ETradingMode[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final ETradingMode market = new ETradingMode("market", 0, "market", null, 2, null);
    public static final ETradingMode limit = new ETradingMode("limit", 1, "limit", null, 2, null);

    private static final /* synthetic */ ETradingMode[] $values() {
        return new ETradingMode[]{market, limit};
    }

    static {
        ETradingMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ ETradingMode(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native String Swift_id(String name);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_shortTitle(String name);

    private final native String Swift_subtitle(String name);

    private final native String Swift_title(String name);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ETradingMode valueOf(String str) {
        return (ETradingMode) Enum.valueOf(ETradingMode.class, str);
    }

    public static ETradingMode[] values() {
        return (ETradingMode[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(name());
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    public final String getShortTitle() {
        return Swift_shortTitle(name());
    }

    public final String getSubtitle() {
        return Swift_subtitle(name());
    }

    public final String getTitle() {
        return Swift_title(name());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/data/ETradingMode$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/data/ETradingMode;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion implements CaseIterableCompanion<ETradingMode> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.lib.CaseIterableCompanion
        public Array<ETradingMode> getAllCases() {
            return ArrayKt.arrayOf(ETradingMode.market, ETradingMode.limit);
        }

        public final ETradingMode init(String rawValue) {
            rawValue.getClass();
            if (Intrinsics.areEqual(rawValue, "market")) {
                return ETradingMode.market;
            }
            if (Intrinsics.areEqual(rawValue, "limit")) {
                return ETradingMode.limit;
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

    private ETradingMode(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }
}
