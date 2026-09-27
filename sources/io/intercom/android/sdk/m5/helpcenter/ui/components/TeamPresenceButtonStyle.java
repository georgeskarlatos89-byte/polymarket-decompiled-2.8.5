package io.intercom.android.sdk.m5.helpcenter.ui.components;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/ui/components/TeamPresenceButtonStyle;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TeamPresenceButtonStyle {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ TeamPresenceButtonStyle[] $VALUES;
    public static final TeamPresenceButtonStyle PRIMARY = new TeamPresenceButtonStyle("PRIMARY", 0);
    public static final TeamPresenceButtonStyle SECONDARY = new TeamPresenceButtonStyle("SECONDARY", 1);

    private static final /* synthetic */ TeamPresenceButtonStyle[] $values() {
        return new TeamPresenceButtonStyle[]{PRIMARY, SECONDARY};
    }

    static {
        TeamPresenceButtonStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private TeamPresenceButtonStyle(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static TeamPresenceButtonStyle valueOf(String str) {
        return (TeamPresenceButtonStyle) Enum.valueOf(TeamPresenceButtonStyle.class, str);
    }

    public static TeamPresenceButtonStyle[] values() {
        return (TeamPresenceButtonStyle[]) $VALUES.clone();
    }
}
