package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class qa1 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ qa1[] $VALUES;
    public static final qa1 Left;
    public static final qa1 Right;

    /* JADX WARN: Type inference failed for: r0v0, types: [qa1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [qa1, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Left", 0);
        Left = r0;
        ?? r1 = new Enum("Right", 1);
        Right = r1;
        qa1[] qa1VarArr = {r0, r1};
        $VALUES = qa1VarArr;
        $ENTRIES = new wg7(qa1VarArr);
    }

    public static qa1 valueOf(String str) {
        return (qa1) Enum.valueOf(qa1.class, str);
    }

    public static qa1[] values() {
        return (qa1[]) $VALUES.clone();
    }
}
