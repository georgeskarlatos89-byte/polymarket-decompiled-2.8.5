package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class el2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ el2[] $VALUES;
    public static final el2 CompactCard;
    public static final el2 FullCard;
    public static final el2 ListRow;
    private final float bottomCornerRadius;
    private final float bottomPadding;
    private final float horizontalPadding;
    private final boolean showsBackground;
    private final float topPadding;

    static {
        el2 el2Var = new el2("FullCard", 0, 16.0f, 10.0f, 10.0f, true, 20.0f);
        FullCard = el2Var;
        el2 el2Var2 = new el2("CompactCard", 1, 16.0f, 12.0f, 12.0f, true, 20.0f);
        CompactCard = el2Var2;
        el2 el2Var3 = new el2("ListRow", 2, 20.0f, 14.0f, 18.0f, false, 0.0f);
        ListRow = el2Var3;
        el2[] el2VarArr = {el2Var, el2Var2, el2Var3};
        $VALUES = el2VarArr;
        $ENTRIES = new wg7(el2VarArr);
    }

    public el2(String str, int i, float f, float f2, float f3, boolean z, float f4) {
        this.horizontalPadding = f;
        this.topPadding = f2;
        this.bottomPadding = f3;
        this.showsBackground = z;
        this.bottomCornerRadius = f4;
    }

    public static el2 valueOf(String str) {
        return (el2) Enum.valueOf(el2.class, str);
    }

    public static el2[] values() {
        return (el2[]) $VALUES.clone();
    }

    public final float a() {
        return this.bottomCornerRadius;
    }

    public final float b() {
        return this.bottomPadding;
    }

    public final float c() {
        return this.horizontalPadding;
    }

    public final boolean d() {
        return this.showsBackground;
    }

    public final float e() {
        return this.topPadding;
    }
}
