package defpackage;

import io.radar.sdk.RadarTrackingOptions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class yyh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ yyh[] $VALUES;
    public static final yyh APP_BUILD;
    public static final yyh APP_VERSION;
    public static final yyh Events;
    public static final yyh LAST_EVENT_ID;
    public static final yyh LAST_EVENT_TIME;
    public static final yyh OPT_OUT;
    public static final yyh PREVIOUS_SESSION_ID;
    public static final yyh REMOTE_CONFIG;
    public static final yyh REMOTE_CONFIG_TIMESTAMP;
    private final String rawVal;

    static {
        yyh yyhVar = new yyh("LAST_EVENT_ID", 0, "last_event_id");
        LAST_EVENT_ID = yyhVar;
        yyh yyhVar2 = new yyh("PREVIOUS_SESSION_ID", 1, "previous_session_id");
        PREVIOUS_SESSION_ID = yyhVar2;
        yyh yyhVar3 = new yyh("LAST_EVENT_TIME", 2, "last_event_time");
        LAST_EVENT_TIME = yyhVar3;
        yyh yyhVar4 = new yyh("OPT_OUT", 3, "opt_out");
        OPT_OUT = yyhVar4;
        yyh yyhVar5 = new yyh("Events", 4, RadarTrackingOptions.RadarTrackingOptionsSync.EVENTS_STR);
        Events = yyhVar5;
        yyh yyhVar6 = new yyh("APP_VERSION", 5, "app_version");
        APP_VERSION = yyhVar6;
        yyh yyhVar7 = new yyh("APP_BUILD", 6, "app_build");
        APP_BUILD = yyhVar7;
        yyh yyhVar8 = new yyh("REMOTE_CONFIG", 7, "remote_config");
        REMOTE_CONFIG = yyhVar8;
        yyh yyhVar9 = new yyh("REMOTE_CONFIG_TIMESTAMP", 8, "remote_config_timestamp");
        REMOTE_CONFIG_TIMESTAMP = yyhVar9;
        yyh[] yyhVarArr = {yyhVar, yyhVar2, yyhVar3, yyhVar4, yyhVar5, yyhVar6, yyhVar7, yyhVar8, yyhVar9};
        $VALUES = yyhVarArr;
        $ENTRIES = new wg7(yyhVarArr);
    }

    public yyh(String str, int i, String str2) {
        this.rawVal = str2;
    }

    public static yyh valueOf(String str) {
        return (yyh) Enum.valueOf(yyh.class, str);
    }

    public static yyh[] values() {
        return (yyh[]) $VALUES.clone();
    }

    public final String a() {
        return this.rawVal;
    }
}
