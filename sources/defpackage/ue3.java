package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ue3 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ue3[] $VALUES;
    public static final ue3 BANNER;
    public static final ue3 CONTENT_CARD;
    public static final ue3 INAPP_MESSAGE;
    public static final ue3 PUSH;
    public static final ue3 UNKNOWN;

    /* JADX WARN: Type inference failed for: r0v0, types: [ue3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ue3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ue3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ue3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [ue3, java.lang.Enum] */
    static {
        ?? r0 = new Enum("PUSH", 0);
        PUSH = r0;
        ?? r1 = new Enum("INAPP_MESSAGE", 1);
        INAPP_MESSAGE = r1;
        ?? r2 = new Enum("CONTENT_CARD", 2);
        CONTENT_CARD = r2;
        ?? r3 = new Enum("UNKNOWN", 3);
        UNKNOWN = r3;
        ?? r4 = new Enum("BANNER", 4);
        BANNER = r4;
        ue3[] ue3VarArr = {r0, r1, r2, r3, r4};
        $VALUES = ue3VarArr;
        $ENTRIES = new wg7(ue3VarArr);
    }

    public static ue3 valueOf(String str) {
        return (ue3) Enum.valueOf(ue3.class, str);
    }

    public static ue3[] values() {
        return (ue3[]) $VALUES.clone();
    }
}
