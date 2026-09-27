package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class lo7 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ lo7[] $VALUES;
    public static final lo7 Add;
    public static final lo7 Edit;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, lo7] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, lo7] */
    static {
        ?? r0 = new Enum("Edit", 0);
        Edit = r0;
        ?? r1 = new Enum("Add", 1);
        Add = r1;
        lo7[] lo7VarArr = {r0, r1};
        $VALUES = lo7VarArr;
        $ENTRIES = new wg7(lo7VarArr);
    }

    public static lo7 valueOf(String str) {
        return (lo7) Enum.valueOf(lo7.class, str);
    }

    public static lo7[] values() {
        return (lo7[]) $VALUES.clone();
    }
}
