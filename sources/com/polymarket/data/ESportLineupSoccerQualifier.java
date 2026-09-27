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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/data/ESportLineupSoccerQualifier;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "home", "away", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESportLineupSoccerQualifier implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ESportLineupSoccerQualifier[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final ESportLineupSoccerQualifier home = new ESportLineupSoccerQualifier("home", 0, "home", null, 2, null);
    public static final ESportLineupSoccerQualifier away = new ESportLineupSoccerQualifier("away", 1, "away", null, 2, null);
    public static final ESportLineupSoccerQualifier unknown = new ESportLineupSoccerQualifier("unknown", 2, "unknown", null, 2, null);

    private static final /* synthetic */ ESportLineupSoccerQualifier[] $values() {
        return new ESportLineupSoccerQualifier[]{home, away, unknown};
    }

    static {
        ESportLineupSoccerQualifier[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ ESportLineupSoccerQualifier(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ESportLineupSoccerQualifier valueOf(String str) {
        return (ESportLineupSoccerQualifier) Enum.valueOf(ESportLineupSoccerQualifier.class, str);
    }

    public static ESportLineupSoccerQualifier[] values() {
        return (ESportLineupSoccerQualifier[]) $VALUES.clone();
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
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/ESportLineupSoccerQualifier$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/ESportLineupSoccerQualifier;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ESportLineupSoccerQualifier init(String rawValue) {
            rawValue.getClass();
            int hashCode = rawValue.hashCode();
            if (hashCode != -284840886) {
                if (hashCode != 3007214) {
                    if (hashCode == 3208415 && rawValue.equals("home")) {
                        return ESportLineupSoccerQualifier.home;
                    }
                    return null;
                }
                if (rawValue.equals("away")) {
                    return ESportLineupSoccerQualifier.away;
                }
                return null;
            }
            if (!rawValue.equals("unknown")) {
                return null;
            }
            return ESportLineupSoccerQualifier.unknown;
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public String getRawValue() {
        return this.rawValue;
    }

    private ESportLineupSoccerQualifier(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
