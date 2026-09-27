package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class kj8 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ kj8[] $VALUES;
    public static final kj8 Left;
    public static final kj8 Right;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kj8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kj8] */
    static {
        ?? r0 = new Enum("Left", 0);
        Left = r0;
        ?? r1 = new Enum("Right", 1);
        Right = r1;
        kj8[] kj8VarArr = {r0, r1};
        $VALUES = kj8VarArr;
        $ENTRIES = new wg7(kj8VarArr);
    }

    public static kj8 valueOf(String str) {
        return (kj8) Enum.valueOf(kj8.class, str);
    }

    public static kj8[] values() {
        return (kj8[]) $VALUES.clone();
    }
}
