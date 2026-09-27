package defpackage;

import com.socure.idplus.device.internal.mediaDevice.manager.d;
import io.ably.lib.transport.Defaults;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Map;
import kotlin.Pair;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class y63 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ y63[] $VALUES;
    public static final y63 CAPTIONED_IMAGE_ALT_IMAGE;
    public static final y63 CAPTIONED_IMAGE_ASPECT_RATIO;
    public static final y63 CAPTIONED_IMAGE_DESCRIPTION;
    public static final y63 CAPTIONED_IMAGE_DOMAIN;
    public static final y63 CAPTIONED_IMAGE_IMAGE;
    private static final String CAPTIONED_IMAGE_KEY = "captioned_image";
    public static final y63 CAPTIONED_IMAGE_TITLE;
    public static final y63 CAPTIONED_IMAGE_URL;
    public static final y63 CLICKED;
    private static final String CONTROL_KEY = "control";
    public static final y63 CREATED;
    public static final x63 Companion;
    public static final y63 DISMISSED;
    public static final y63 DISMISSIBLE;
    public static final y63 EXPIRES_AT;
    public static final y63 EXTRAS;
    public static final y63 ID;
    public static final y63 IMAGE_ONLY_ALT_IMAGE;
    public static final y63 IMAGE_ONLY_ASPECT_RATIO;
    public static final y63 IMAGE_ONLY_IMAGE;
    private static final String IMAGE_ONLY_KEY = "banner_image";
    public static final y63 IMAGE_ONLY_URL;
    public static final y63 IS_TEST;
    public static final y63 OPEN_URI_IN_WEBVIEW;
    public static final y63 PINNED;
    public static final y63 READ;
    public static final y63 REMOVED;
    public static final y63 SHORT_NEWS_ALT_IMAGE;
    public static final y63 SHORT_NEWS_DESCRIPTION;
    public static final y63 SHORT_NEWS_DOMAIN;
    public static final y63 SHORT_NEWS_IMAGE;
    private static final String SHORT_NEWS_KEY = "short_news";
    public static final y63 SHORT_NEWS_TITLE;
    public static final y63 SHORT_NEWS_URL;
    public static final y63 TEXT_ANNOUNCEMENT_DESCRIPTION;
    public static final y63 TEXT_ANNOUNCEMENT_DOMAIN;
    private static final String TEXT_ANNOUNCEMENT_KEY = "text_announcement";
    public static final y63 TEXT_ANNOUNCEMENT_TITLE;
    public static final y63 TEXT_ANNOUNCEMENT_URL;
    public static final y63 TYPE;
    public static final y63 VIEWED;
    private static final Map<String, f93> cardTypeMap;
    private final String key;

    /* JADX WARN: Type inference failed for: r0v31, types: [x63, java.lang.Object] */
    static {
        y63 y63Var = new y63("ID", 0, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID);
        ID = y63Var;
        y63 y63Var2 = new y63("VIEWED", 1, Defaults.ABLY_PROTOCOL_VERSION_PARAM);
        VIEWED = y63Var2;
        y63 y63Var3 = new y63("CREATED", 2, "ca");
        CREATED = y63Var3;
        y63 y63Var4 = new y63("EXPIRES_AT", 3, "ea");
        EXPIRES_AT = y63Var4;
        y63 y63Var5 = new y63("EXTRAS", 4, "e");
        EXTRAS = y63Var5;
        y63 y63Var6 = new y63("OPEN_URI_IN_WEBVIEW", 5, "uw");
        OPEN_URI_IN_WEBVIEW = y63Var6;
        y63 y63Var7 = new y63("TYPE", 6, "tp");
        TYPE = y63Var7;
        y63 y63Var8 = new y63("DISMISSED", 7, d.d);
        DISMISSED = y63Var8;
        y63 y63Var9 = new y63("REMOVED", 8, "r");
        REMOVED = y63Var9;
        y63 y63Var10 = new y63("PINNED", 9, "p");
        PINNED = y63Var10;
        y63 y63Var11 = new y63("DISMISSIBLE", 10, "db");
        DISMISSIBLE = y63Var11;
        y63 y63Var12 = new y63("IS_TEST", 11, "t");
        IS_TEST = y63Var12;
        y63 y63Var13 = new y63("READ", 12, "read");
        READ = y63Var13;
        y63 y63Var14 = new y63("CLICKED", 13, "cl");
        CLICKED = y63Var14;
        y63 y63Var15 = new y63("IMAGE_ONLY_IMAGE", 14, "i");
        IMAGE_ONLY_IMAGE = y63Var15;
        y63 y63Var16 = new y63("IMAGE_ONLY_ALT_IMAGE", 15, "image_alt");
        IMAGE_ONLY_ALT_IMAGE = y63Var16;
        y63 y63Var17 = new y63("IMAGE_ONLY_URL", 16, "u");
        IMAGE_ONLY_URL = y63Var17;
        y63 y63Var18 = new y63("IMAGE_ONLY_ASPECT_RATIO", 17, "ar");
        IMAGE_ONLY_ASPECT_RATIO = y63Var18;
        y63 y63Var19 = new y63("CAPTIONED_IMAGE_IMAGE", 18, "i");
        CAPTIONED_IMAGE_IMAGE = y63Var19;
        y63 y63Var20 = new y63("CAPTIONED_IMAGE_ALT_IMAGE", 19, "image_alt");
        CAPTIONED_IMAGE_ALT_IMAGE = y63Var20;
        y63 y63Var21 = new y63("CAPTIONED_IMAGE_TITLE", 20, "tt");
        CAPTIONED_IMAGE_TITLE = y63Var21;
        y63 y63Var22 = new y63("CAPTIONED_IMAGE_DESCRIPTION", 21, "ds");
        CAPTIONED_IMAGE_DESCRIPTION = y63Var22;
        y63 y63Var23 = new y63("CAPTIONED_IMAGE_URL", 22, "u");
        CAPTIONED_IMAGE_URL = y63Var23;
        y63 y63Var24 = new y63("CAPTIONED_IMAGE_DOMAIN", 23, "dm");
        CAPTIONED_IMAGE_DOMAIN = y63Var24;
        y63 y63Var25 = new y63("CAPTIONED_IMAGE_ASPECT_RATIO", 24, "ar");
        CAPTIONED_IMAGE_ASPECT_RATIO = y63Var25;
        y63 y63Var26 = new y63("TEXT_ANNOUNCEMENT_TITLE", 25, "tt");
        TEXT_ANNOUNCEMENT_TITLE = y63Var26;
        y63 y63Var27 = new y63("TEXT_ANNOUNCEMENT_DESCRIPTION", 26, "ds");
        TEXT_ANNOUNCEMENT_DESCRIPTION = y63Var27;
        y63 y63Var28 = new y63("TEXT_ANNOUNCEMENT_URL", 27, "u");
        TEXT_ANNOUNCEMENT_URL = y63Var28;
        y63 y63Var29 = new y63("TEXT_ANNOUNCEMENT_DOMAIN", 28, "dm");
        TEXT_ANNOUNCEMENT_DOMAIN = y63Var29;
        y63 y63Var30 = new y63("SHORT_NEWS_IMAGE", 29, "i");
        SHORT_NEWS_IMAGE = y63Var30;
        y63 y63Var31 = new y63("SHORT_NEWS_ALT_IMAGE", 30, "image_alt");
        SHORT_NEWS_ALT_IMAGE = y63Var31;
        y63 y63Var32 = new y63("SHORT_NEWS_TITLE", 31, "tt");
        SHORT_NEWS_TITLE = y63Var32;
        y63 y63Var33 = new y63("SHORT_NEWS_DESCRIPTION", 32, "ds");
        SHORT_NEWS_DESCRIPTION = y63Var33;
        y63 y63Var34 = new y63("SHORT_NEWS_URL", 33, "u");
        SHORT_NEWS_URL = y63Var34;
        y63 y63Var35 = new y63("SHORT_NEWS_DOMAIN", 34, "dm");
        SHORT_NEWS_DOMAIN = y63Var35;
        y63[] y63VarArr = {y63Var, y63Var2, y63Var3, y63Var4, y63Var5, y63Var6, y63Var7, y63Var8, y63Var9, y63Var10, y63Var11, y63Var12, y63Var13, y63Var14, y63Var15, y63Var16, y63Var17, y63Var18, y63Var19, y63Var20, y63Var21, y63Var22, y63Var23, y63Var24, y63Var25, y63Var26, y63Var27, y63Var28, y63Var29, y63Var30, y63Var31, y63Var32, y63Var33, y63Var34, y63Var35};
        $VALUES = y63VarArr;
        $ENTRIES = new wg7(y63VarArr);
        Companion = new Object();
        cardTypeMap = d1c.e(new Pair(IMAGE_ONLY_KEY, f93.IMAGE), new Pair(CAPTIONED_IMAGE_KEY, f93.CAPTIONED_IMAGE), new Pair(TEXT_ANNOUNCEMENT_KEY, f93.TEXT_ANNOUNCEMENT), new Pair(SHORT_NEWS_KEY, f93.SHORT_NEWS), new Pair(CONTROL_KEY, f93.CONTROL));
    }

    public y63(String str, int i, String str2) {
        this.key = str2;
    }

    public static final /* synthetic */ Map a() {
        return cardTypeMap;
    }

    public static y63 valueOf(String str) {
        return (y63) Enum.valueOf(y63.class, str);
    }

    public static y63[] values() {
        return (y63[]) $VALUES.clone();
    }

    public final String b() {
        return this.key;
    }
}
