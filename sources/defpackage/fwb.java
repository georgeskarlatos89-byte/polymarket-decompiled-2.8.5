package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fwb {
    private static final /* synthetic */ fwb[] $VALUES;
    public static final fwb MergePathsApi19;
    public final int minRequiredSdkVersion = 19;

    static {
        fwb fwbVar = new fwb();
        MergePathsApi19 = fwbVar;
        $VALUES = new fwb[]{fwbVar};
    }

    public static fwb valueOf(String str) {
        return (fwb) Enum.valueOf(fwb.class, str);
    }

    public static fwb[] values() {
        return (fwb[]) $VALUES.clone();
    }
}
