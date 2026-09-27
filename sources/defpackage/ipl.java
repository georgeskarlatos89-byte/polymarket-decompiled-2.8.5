package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ipl {
    public static final ipl zza;
    public static final ipl zzb;
    public static final ipl zzc;
    public static final ipl zzd;
    private static final /* synthetic */ ipl[] zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ipl] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ipl] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ipl] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ipl] */
    static {
        ?? r0 = new Enum("BOOLEAN", 0);
        zza = r0;
        ?? r1 = new Enum("STRING", 1);
        zzb = r1;
        ?? r2 = new Enum("LONG", 2);
        zzc = r2;
        ?? r3 = new Enum("DOUBLE", 3);
        zzd = r3;
        zze = new ipl[]{r0, r1, r2, r3};
    }

    public static /* bridge */ /* synthetic */ ipl a(Object obj) {
        if (obj instanceof String) {
            return zzb;
        }
        if (obj instanceof Boolean) {
            return zza;
        }
        if (obj instanceof Long) {
            return zzc;
        }
        if (obj instanceof Double) {
            return zzd;
        }
        dmk.i("invalid tag type: ".concat(String.valueOf(obj.getClass())));
        return null;
    }

    public static ipl[] values() {
        return (ipl[]) zze.clone();
    }
}
