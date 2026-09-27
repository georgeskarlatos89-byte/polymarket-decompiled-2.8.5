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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamPickerEntrySource;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "followTeamsBanner", "followedTeamsStrip", "squadsTeamsList", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SportsTeamPickerEntrySource implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ SportsTeamPickerEntrySource[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SportsTeamPickerEntrySource followTeamsBanner = new SportsTeamPickerEntrySource("followTeamsBanner", 0, "follow_teams_banner", null, 2, null);
    public static final SportsTeamPickerEntrySource followedTeamsStrip = new SportsTeamPickerEntrySource("followedTeamsStrip", 1, "followed_teams_strip", null, 2, null);
    public static final SportsTeamPickerEntrySource squadsTeamsList = new SportsTeamPickerEntrySource("squadsTeamsList", 2, "squads_teams_list", null, 2, null);
    private final String rawValue;

    private static final /* synthetic */ SportsTeamPickerEntrySource[] $values() {
        return new SportsTeamPickerEntrySource[]{followTeamsBanner, followedTeamsStrip, squadsTeamsList};
    }

    static {
        SportsTeamPickerEntrySource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ SportsTeamPickerEntrySource(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static SportsTeamPickerEntrySource valueOf(String str) {
        return (SportsTeamPickerEntrySource) Enum.valueOf(SportsTeamPickerEntrySource.class, str);
    }

    public static SportsTeamPickerEntrySource[] values() {
        return (SportsTeamPickerEntrySource[]) $VALUES.clone();
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
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SportsTeamPickerEntrySource$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/SportsTeamPickerEntrySource;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SportsTeamPickerEntrySource init(String rawValue) {
            rawValue.getClass();
            int hashCode = rawValue.hashCode();
            if (hashCode != -1187008605) {
                if (hashCode != -806963808) {
                    if (hashCode == 824691213 && rawValue.equals("squads_teams_list")) {
                        return SportsTeamPickerEntrySource.squadsTeamsList;
                    }
                    return null;
                }
                if (rawValue.equals("followed_teams_strip")) {
                    return SportsTeamPickerEntrySource.followedTeamsStrip;
                }
                return null;
            }
            if (rawValue.equals("follow_teams_banner")) {
                return SportsTeamPickerEntrySource.followTeamsBanner;
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

    private SportsTeamPickerEntrySource(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
