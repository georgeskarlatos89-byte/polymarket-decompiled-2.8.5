package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class c32 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ c32[] $VALUES;
    public static final c32 Horizontal;
    public static final c32 Vertical;

    /* JADX WARN: Type inference failed for: r0v0, types: [c32, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [c32, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Vertical", 0);
        Vertical = r0;
        ?? r1 = new Enum("Horizontal", 1);
        Horizontal = r1;
        c32[] c32VarArr = {r0, r1};
        $VALUES = c32VarArr;
        $ENTRIES = new wg7(c32VarArr);
    }

    public static c32 valueOf(String str) {
        return (c32) Enum.valueOf(c32.class, str);
    }

    public static c32[] values() {
        return (c32[]) $VALUES.clone();
    }
}
