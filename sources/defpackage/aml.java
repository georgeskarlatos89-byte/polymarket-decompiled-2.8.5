package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class aml {
    public static final aml zza;
    public static final aml zzb;
    public static final aml zzc;
    private static final /* synthetic */ aml[] zzd;

    /* JADX WARN: Type inference failed for: r0v0, types: [aml, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aml, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aml, java.lang.Enum] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        zza = r0;
        ?? r1 = new Enum("SIGNED", 1);
        zzb = r1;
        ?? r2 = new Enum("FIXED", 2);
        zzc = r2;
        zzd = new aml[]{r0, r1, r2};
    }

    public static aml[] values() {
        return (aml[]) zzd.clone();
    }
}
