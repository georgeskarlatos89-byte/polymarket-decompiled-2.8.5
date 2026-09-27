package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class n8g {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ n8g[] $VALUES;
    public static final n8g COLLECTED;
    public static final n8g LOAD_FAILURE;
    public static final n8g PUBLISHED;
    public static final n8g PUBLISH_DISABLED;
    public static final n8g PUBLISH_FAILURE;
    private final String rawValue;

    static {
        n8g n8gVar = new n8g("PUBLISH_DISABLED", 0, "riskDataPublishDisabled");
        PUBLISH_DISABLED = n8gVar;
        n8g n8gVar2 = new n8g("PUBLISHED", 1, "riskDataPublished");
        PUBLISHED = n8gVar2;
        n8g n8gVar3 = new n8g("PUBLISH_FAILURE", 2, "riskDataPublishFailure");
        PUBLISH_FAILURE = n8gVar3;
        n8g n8gVar4 = new n8g("COLLECTED", 3, "riskDataCollected");
        COLLECTED = n8gVar4;
        n8g n8gVar5 = new n8g("LOAD_FAILURE", 4, "riskLoadFailure");
        LOAD_FAILURE = n8gVar5;
        n8g[] n8gVarArr = {n8gVar, n8gVar2, n8gVar3, n8gVar4, n8gVar5};
        $VALUES = n8gVarArr;
        $ENTRIES = new wg7(n8gVarArr);
    }

    public n8g(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static n8g valueOf(String str) {
        return (n8g) Enum.valueOf(n8g.class, str);
    }

    public static n8g[] values() {
        return (n8g[]) $VALUES.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
