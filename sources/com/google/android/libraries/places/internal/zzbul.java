package com.google.android.libraries.places.internal;

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
public final class zzbul {
    public static final zzbul zza;
    public static final zzbul zzb;
    public static final zzbul zzc;
    public static final zzbul zzd;
    public static final zzbul zze;
    public static final zzbul zzf;
    public static final zzbul zzg;
    public static final zzbul zzh;
    public static final zzbul zzi;
    public static final zzbul zzj;
    public static final zzbul zzk;
    public static final zzbul zzl;
    public static final zzbul zzm;
    public static final zzbul zzn;
    public static final zzbul zzo;
    public static final zzbul zzp;
    public static final zzbul zzq;
    public static final zzbul zzr;
    private static final /* synthetic */ zzbul[] zzu;
    private final zzbum zzs;
    private final int zzt;

    static {
        zzbul zzbulVar = new zzbul("DOUBLE", 0, zzbum.DOUBLE, 1);
        zza = zzbulVar;
        zzbul zzbulVar2 = new zzbul("FLOAT", 1, zzbum.FLOAT, 5);
        zzb = zzbulVar2;
        zzbum zzbumVar = zzbum.LONG;
        zzbul zzbulVar3 = new zzbul("INT64", 2, zzbumVar, 0);
        zzc = zzbulVar3;
        zzbul zzbulVar4 = new zzbul("UINT64", 3, zzbumVar, 0);
        zzd = zzbulVar4;
        zzbum zzbumVar2 = zzbum.INT;
        zzbul zzbulVar5 = new zzbul("INT32", 4, zzbumVar2, 0);
        zze = zzbulVar5;
        zzbul zzbulVar6 = new zzbul("FIXED64", 5, zzbumVar, 1);
        zzf = zzbulVar6;
        zzbul zzbulVar7 = new zzbul("FIXED32", 6, zzbumVar2, 5);
        zzg = zzbulVar7;
        zzbul zzbulVar8 = new zzbul("BOOL", 7, zzbum.BOOLEAN, 0);
        zzh = zzbulVar8;
        zzbul zzbulVar9 = new zzbul("STRING", 8, zzbum.STRING, 2);
        zzi = zzbulVar9;
        zzbum zzbumVar3 = zzbum.MESSAGE;
        zzbul zzbulVar10 = new zzbul("GROUP", 9, zzbumVar3, 3);
        zzj = zzbulVar10;
        zzbul zzbulVar11 = new zzbul("MESSAGE", 10, zzbumVar3, 2);
        zzk = zzbulVar11;
        zzbul zzbulVar12 = new zzbul("BYTES", 11, zzbum.BYTE_STRING, 2);
        zzl = zzbulVar12;
        zzbul zzbulVar13 = new zzbul("UINT32", 12, zzbumVar2, 0);
        zzm = zzbulVar13;
        zzbul zzbulVar14 = new zzbul("ENUM", 13, zzbum.ENUM, 0);
        zzn = zzbulVar14;
        zzbul zzbulVar15 = new zzbul("SFIXED32", 14, zzbumVar2, 5);
        zzo = zzbulVar15;
        zzbul zzbulVar16 = new zzbul("SFIXED64", 15, zzbumVar, 1);
        zzp = zzbulVar16;
        zzbul zzbulVar17 = new zzbul("SINT32", 16, zzbumVar2, 0);
        zzq = zzbulVar17;
        zzbul zzbulVar18 = new zzbul("SINT64", 17, zzbumVar, 0);
        zzr = zzbulVar18;
        zzu = new zzbul[]{zzbulVar, zzbulVar2, zzbulVar3, zzbulVar4, zzbulVar5, zzbulVar6, zzbulVar7, zzbulVar8, zzbulVar9, zzbulVar10, zzbulVar11, zzbulVar12, zzbulVar13, zzbulVar14, zzbulVar15, zzbulVar16, zzbulVar17, zzbulVar18};
    }

    private zzbul(String str, int i, zzbum zzbumVar, int i2) {
        this.zzs = zzbumVar;
        this.zzt = i2;
    }

    public static zzbul[] values() {
        return (zzbul[]) zzu.clone();
    }

    public final zzbum zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
