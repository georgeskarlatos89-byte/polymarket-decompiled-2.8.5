package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class be7 {
    private static final /* synthetic */ be7[] $VALUES;
    public static final be7 AES256_SIV;
    private final String mDeterministicAeadKeyTemplateName = "AES256_SIV";

    static {
        be7 be7Var = new be7();
        AES256_SIV = be7Var;
        $VALUES = new be7[]{be7Var};
    }

    public static be7 valueOf(String str) {
        return (be7) Enum.valueOf(be7.class, str);
    }

    public static be7[] values() {
        return (be7[]) $VALUES.clone();
    }

    public final xna a() {
        return y1n.b(this.mDeterministicAeadKeyTemplateName);
    }
}
