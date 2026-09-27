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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0017B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0018"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamEntrySource;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "hub", "eventPageHelmet", "teamPicker", "deeplink", "squadsList", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SportsTeamEntrySource implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ SportsTeamEntrySource[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final SportsTeamEntrySource hub = new SportsTeamEntrySource("hub", 0, "hub", null, 2, null);
    public static final SportsTeamEntrySource eventPageHelmet = new SportsTeamEntrySource("eventPageHelmet", 1, "event_page_helmet", null, 2, null);
    public static final SportsTeamEntrySource teamPicker = new SportsTeamEntrySource("teamPicker", 2, "team_picker", null, 2, null);
    public static final SportsTeamEntrySource deeplink = new SportsTeamEntrySource("deeplink", 3, "deeplink", null, 2, null);
    public static final SportsTeamEntrySource squadsList = new SportsTeamEntrySource("squadsList", 4, "squads_list", null, 2, null);

    private static final /* synthetic */ SportsTeamEntrySource[] $values() {
        return new SportsTeamEntrySource[]{hub, eventPageHelmet, teamPicker, deeplink, squadsList};
    }

    static {
        SportsTeamEntrySource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ SportsTeamEntrySource(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static SportsTeamEntrySource valueOf(String str) {
        return (SportsTeamEntrySource) Enum.valueOf(SportsTeamEntrySource.class, str);
    }

    public static SportsTeamEntrySource[] values() {
        return (SportsTeamEntrySource[]) $VALUES.clone();
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
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamEntrySource$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/SportsTeamEntrySource;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SportsTeamEntrySource init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -1477586768:
                    if (!rawValue.equals("team_picker")) {
                        return null;
                    }
                    return SportsTeamEntrySource.teamPicker;
                case -346740232:
                    if (rawValue.equals("event_page_helmet")) {
                        return SportsTeamEntrySource.eventPageHelmet;
                    }
                    return null;
                case 103669:
                    if (rawValue.equals("hub")) {
                        return SportsTeamEntrySource.hub;
                    }
                    return null;
                case 629233382:
                    if (rawValue.equals("deeplink")) {
                        return SportsTeamEntrySource.deeplink;
                    }
                    return null;
                case 1247401380:
                    if (rawValue.equals("squads_list")) {
                        return SportsTeamEntrySource.squadsList;
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

    private SportsTeamEntrySource(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
