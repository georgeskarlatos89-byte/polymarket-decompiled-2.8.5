package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class odl {
    public static final odl zza;
    public static final odl zzb;
    public static final odl zzc;
    private static final /* synthetic */ odl[] zzd;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, odl] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, odl] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, odl] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        zza = r0;
        ?? r1 = new Enum("SIGNED", 1);
        zzb = r1;
        ?? r2 = new Enum("FIXED", 2);
        zzc = r2;
        zzd = new odl[]{r0, r1, r2};
    }

    public static odl[] values() {
        return (odl[]) zzd.clone();
    }
}
