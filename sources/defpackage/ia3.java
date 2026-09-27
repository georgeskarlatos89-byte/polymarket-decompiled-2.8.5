package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ia3 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ia3[] $VALUES;
    public static final ia3 Compact;
    public static final ia3 Regular;
    private final float cornerRadius;
    private final float height;
    private final float shadowHeight = 4.0f;

    static {
        ia3 ia3Var = new ia3("Compact", 0, 44.0f, 12.0f);
        Compact = ia3Var;
        ia3 ia3Var2 = new ia3("Regular", 1, 52.0f, 16.0f);
        Regular = ia3Var2;
        ia3[] ia3VarArr = {ia3Var, ia3Var2};
        $VALUES = ia3VarArr;
        $ENTRIES = new wg7(ia3VarArr);
    }

    public ia3(String str, int i, float f, float f2) {
        this.height = f;
        this.cornerRadius = f2;
    }

    public static ia3 valueOf(String str) {
        return (ia3) Enum.valueOf(ia3.class, str);
    }

    public static ia3[] values() {
        return (ia3[]) $VALUES.clone();
    }

    public final float a() {
        return this.height - this.shadowHeight;
    }

    public final float b() {
        return this.cornerRadius;
    }

    public final float c() {
        return this.height;
    }

    public final float d() {
        return this.shadowHeight;
    }
}
