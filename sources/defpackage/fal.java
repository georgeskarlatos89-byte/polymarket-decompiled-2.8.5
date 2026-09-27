package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class fal {
    public static final fal zza;
    public static final fal zzb;
    public static final fal zzc;
    public static final fal zzd;
    public static final fal zze;
    public static final fal zzf;
    public static final fal zzg;
    public static final fal zzh;
    public static final fal zzi;
    public static final fal zzj;
    public static final fal zzk;
    public static final fal zzl;
    public static final fal zzm;
    public static final fal zzn;
    public static final fal zzo;
    public static final fal zzp;
    public static final fal zzq;
    public static final fal zzr;
    private static final /* synthetic */ fal[] zzu;
    private final gal zzs;
    private final int zzt;

    static {
        fal falVar = new fal("DOUBLE", 0, gal.zzd, 1);
        zza = falVar;
        fal falVar2 = new fal("FLOAT", 1, gal.zzc, 5);
        zzb = falVar2;
        gal galVar = gal.zzb;
        fal falVar3 = new fal("INT64", 2, galVar, 0);
        zzc = falVar3;
        fal falVar4 = new fal("UINT64", 3, galVar, 0);
        zzd = falVar4;
        gal galVar2 = gal.zza;
        fal falVar5 = new fal("INT32", 4, galVar2, 0);
        zze = falVar5;
        fal falVar6 = new fal("FIXED64", 5, galVar, 1);
        zzf = falVar6;
        fal falVar7 = new fal("FIXED32", 6, galVar2, 5);
        zzg = falVar7;
        fal falVar8 = new fal("BOOL", 7, gal.zze, 0);
        zzh = falVar8;
        fal falVar9 = new fal("STRING", 8, gal.zzf, 2);
        zzi = falVar9;
        gal galVar3 = gal.zzi;
        fal falVar10 = new fal("GROUP", 9, galVar3, 3);
        zzj = falVar10;
        fal falVar11 = new fal("MESSAGE", 10, galVar3, 2);
        zzk = falVar11;
        fal falVar12 = new fal("BYTES", 11, gal.zzg, 2);
        zzl = falVar12;
        fal falVar13 = new fal("UINT32", 12, galVar2, 0);
        zzm = falVar13;
        fal falVar14 = new fal("ENUM", 13, gal.zzh, 0);
        zzn = falVar14;
        fal falVar15 = new fal("SFIXED32", 14, galVar2, 5);
        zzo = falVar15;
        fal falVar16 = new fal("SFIXED64", 15, galVar, 1);
        zzp = falVar16;
        fal falVar17 = new fal("SINT32", 16, galVar2, 0);
        zzq = falVar17;
        fal falVar18 = new fal("SINT64", 17, galVar, 0);
        zzr = falVar18;
        zzu = new fal[]{falVar, falVar2, falVar3, falVar4, falVar5, falVar6, falVar7, falVar8, falVar9, falVar10, falVar11, falVar12, falVar13, falVar14, falVar15, falVar16, falVar17, falVar18};
    }

    public fal(String str, int i, gal galVar, int i2) {
        this.zzs = galVar;
        this.zzt = i2;
    }

    public static fal[] values() {
        return (fal[]) zzu.clone();
    }

    public final gal a() {
        return this.zzs;
    }

    public final int b() {
        return this.zzt;
    }
}
