package com.polymarket.data;

import com.polymarket.designtokens.Icon;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001&B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0082 J\u0011\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0082 J\u0011\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0002H\u0082 J\u0011\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0002H\u0082 J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$H\u0016J\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0011\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bR\u0011\u0010\u0015\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006'"}, d2 = {"Lcom/polymarket/data/EAppTab;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "home", "live", "profile", "squads", "search", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", Keys.KEY_NAME, "label", "getLabel", "Swift_label", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON, "Lcom/polymarket/designtokens/Icon;", "getIcon", "()Lcom/polymarket/designtokens/Icon;", "Swift_icon", "selectedIcon", "getSelectedIcon", "Swift_selectedIcon", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EAppTab implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ EAppTab[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final EAppTab home = new EAppTab("home", 0, "home", null, 2, null);
    public static final EAppTab live = new EAppTab("live", 1, "live", null, 2, null);
    public static final EAppTab profile = new EAppTab("profile", 2, "profile", null, 2, null);
    public static final EAppTab squads = new EAppTab("squads", 3, "squads", null, 2, null);
    public static final EAppTab search = new EAppTab("search", 4, "search", null, 2, null);

    private static final /* synthetic */ EAppTab[] $values() {
        return new EAppTab[]{home, live, profile, squads, search};
    }

    static {
        EAppTab[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ EAppTab(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Icon Swift_icon(String name);

    private final native String Swift_label(String name);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native Icon Swift_selectedIcon(String name);

    private final native String Swift_title(String name);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static EAppTab valueOf(String str) {
        return (EAppTab) Enum.valueOf(EAppTab.class, str);
    }

    public static EAppTab[] values() {
        return (EAppTab[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final Icon getIcon() {
        return Swift_icon(name());
    }

    public final String getLabel() {
        return Swift_label(name());
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    public final Icon getSelectedIcon() {
        return Swift_selectedIcon(name());
    }

    public final String getTitle() {
        return Swift_title(name());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EAppTab$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EAppTab;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EAppTab init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -906336856:
                    if (!rawValue.equals("search")) {
                        return null;
                    }
                    return EAppTab.search;
                case -894675079:
                    if (rawValue.equals("squads")) {
                        return EAppTab.squads;
                    }
                    return null;
                case -309425751:
                    if (rawValue.equals("profile")) {
                        return EAppTab.profile;
                    }
                    return null;
                case 3208415:
                    if (rawValue.equals("home")) {
                        return EAppTab.home;
                    }
                    return null;
                case 3322092:
                    if (rawValue.equals("live")) {
                        return EAppTab.live;
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

    private EAppTab(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
