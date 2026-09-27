package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class qbn {
    public static final qbn zza;
    public static final qbn zzb;
    public static final qbn zzc;
    public static final qbn zzd;
    private static final /* synthetic */ qbn[] zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qbn] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, qbn] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, qbn] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, qbn] */
    static {
        ?? r0 = new Enum("CONSENT", 0);
        zza = r0;
        ?? r1 = new Enum("LEGITIMATE_INTEREST", 1);
        zzb = r1;
        ?? r2 = new Enum("FLEXIBLE_CONSENT", 2);
        zzc = r2;
        ?? r3 = new Enum("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        zzd = r3;
        zze = new qbn[]{r0, r1, r2, r3};
    }

    public static qbn[] values() {
        return (qbn[]) zze.clone();
    }
}
