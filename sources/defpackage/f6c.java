package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f6c {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ f6c[] $VALUES;
    public static final f6c Max;
    public static final f6c Min;

    /* JADX WARN: Type inference failed for: r0v0, types: [f6c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [f6c, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Min", 0);
        Min = r0;
        ?? r1 = new Enum("Max", 1);
        Max = r1;
        f6c[] f6cVarArr = {r0, r1};
        $VALUES = f6cVarArr;
        $ENTRIES = new wg7(f6cVarArr);
    }

    public static f6c valueOf(String str) {
        return (f6c) Enum.valueOf(f6c.class, str);
    }

    public static f6c[] values() {
        return (f6c[]) $VALUES.clone();
    }
}
