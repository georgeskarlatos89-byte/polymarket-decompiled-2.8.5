package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class xa8 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ xa8[] $VALUES;
    public static final xa8 BottomLeft;
    public static final xa8 BottomRight;
    public static final xa8 TopLeft;
    public static final xa8 TopRight;
    private final boolean isLeft;
    private final boolean isTop;

    static {
        xa8 xa8Var = new xa8("TopLeft", 0, true, true);
        TopLeft = xa8Var;
        xa8 xa8Var2 = new xa8("TopRight", 1, false, true);
        TopRight = xa8Var2;
        xa8 xa8Var3 = new xa8("BottomLeft", 2, true, false);
        BottomLeft = xa8Var3;
        xa8 xa8Var4 = new xa8("BottomRight", 3, false, false);
        BottomRight = xa8Var4;
        xa8[] xa8VarArr = {xa8Var, xa8Var2, xa8Var3, xa8Var4};
        $VALUES = xa8VarArr;
        $ENTRIES = new wg7(xa8VarArr);
    }

    public xa8(String str, int i, boolean z, boolean z2) {
        this.isLeft = z;
        this.isTop = z2;
    }

    public static xa8 valueOf(String str) {
        return (xa8) Enum.valueOf(xa8.class, str);
    }

    public static xa8[] values() {
        return (xa8[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.isLeft;
    }

    public final boolean b() {
        return this.isTop;
    }
}
