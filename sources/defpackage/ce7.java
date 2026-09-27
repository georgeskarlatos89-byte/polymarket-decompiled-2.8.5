package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ce7 {
    private static final /* synthetic */ ce7[] $VALUES;
    public static final ce7 AES256_GCM;
    private final String mAeadKeyTemplateName = "AES256_GCM";

    static {
        ce7 ce7Var = new ce7();
        AES256_GCM = ce7Var;
        $VALUES = new ce7[]{ce7Var};
    }

    public static ce7 valueOf(String str) {
        return (ce7) Enum.valueOf(ce7.class, str);
    }

    public static ce7[] values() {
        return (ce7[]) $VALUES.clone();
    }

    public final xna a() {
        return y1n.b(this.mAeadKeyTemplateName);
    }
}
