package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class jj2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ jj2[] $VALUES;
    public static final jj2 Large;
    public static final jj2 Small;
    private final float cornerRadius;
    private final float height;
    private final float horizontalPadding;

    static {
        jj2 jj2Var = new jj2("Small", 0, 20.0f, 6.0f, 6.0f);
        Small = jj2Var;
        jj2 jj2Var2 = new jj2("Large", 1, 24.0f, 8.0f, 8.0f);
        Large = jj2Var2;
        jj2[] jj2VarArr = {jj2Var, jj2Var2};
        $VALUES = jj2VarArr;
        $ENTRIES = new wg7(jj2VarArr);
    }

    public jj2(String str, int i, float f, float f2, float f3) {
        this.height = f;
        this.horizontalPadding = f2;
        this.cornerRadius = f3;
    }

    public static jj2 valueOf(String str) {
        return (jj2) Enum.valueOf(jj2.class, str);
    }

    public static jj2[] values() {
        return (jj2[]) $VALUES.clone();
    }

    public final float a() {
        return this.cornerRadius;
    }

    public final float b() {
        return this.height;
    }

    public final float c() {
        return this.horizontalPadding;
    }
}
