package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qi9 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ qi9[] $VALUES;
    public static final qi9 NOTIFICATION_ACTION_WITH_DEEPLINK;
    public static final qi9 NOTIFICATION_PUSH_STORY_PAGE_CLICK;
    public static final qi9 URI_ACTION_BACK_STACK_GET_ROOT_INTENT;
    public static final qi9 URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT;
    public static final qi9 URI_ACTION_OPEN_WITH_ACTION_VIEW;
    public static final qi9 URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY;
    public static final qi9 URI_UTILS_GET_MAIN_ACTIVITY_INTENT;

    /* JADX WARN: Type inference failed for: r0v0, types: [qi9, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [qi9, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [qi9, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [qi9, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [qi9, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [qi9, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [qi9, java.lang.Enum] */
    static {
        ?? r0 = new Enum("NOTIFICATION_ACTION_WITH_DEEPLINK", 0);
        NOTIFICATION_ACTION_WITH_DEEPLINK = r0;
        ?? r1 = new Enum("NOTIFICATION_PUSH_STORY_PAGE_CLICK", 1);
        NOTIFICATION_PUSH_STORY_PAGE_CLICK = r1;
        ?? r2 = new Enum("URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY", 2);
        URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY = r2;
        ?? r3 = new Enum("URI_ACTION_OPEN_WITH_ACTION_VIEW", 3);
        URI_ACTION_OPEN_WITH_ACTION_VIEW = r3;
        ?? r4 = new Enum("URI_ACTION_BACK_STACK_GET_ROOT_INTENT", 4);
        URI_ACTION_BACK_STACK_GET_ROOT_INTENT = r4;
        ?? r5 = new Enum("URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT", 5);
        URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT = r5;
        ?? r6 = new Enum("URI_UTILS_GET_MAIN_ACTIVITY_INTENT", 6);
        URI_UTILS_GET_MAIN_ACTIVITY_INTENT = r6;
        qi9[] qi9VarArr = {r0, r1, r2, r3, r4, r5, r6};
        $VALUES = qi9VarArr;
        $ENTRIES = new wg7(qi9VarArr);
    }

    public static qi9 valueOf(String str) {
        return (qi9) Enum.valueOf(qi9.class, str);
    }

    public static qi9[] values() {
        return (qi9[]) $VALUES.clone();
    }
}
