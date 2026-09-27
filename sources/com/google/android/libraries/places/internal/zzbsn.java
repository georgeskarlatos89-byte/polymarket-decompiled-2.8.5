package com.google.android.libraries.places.internal;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
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
public final class zzbsn {
    public static final zzbsn zza;
    public static final zzbsn zzb;
    public static final zzbsn zzc;
    public static final zzbsn zzd;
    public static final zzbsn zze;
    public static final zzbsn zzf;
    public static final zzbsn zzg;
    public static final zzbsn zzh;
    public static final zzbsn zzi;
    public static final zzbsn zzj;
    private static final /* synthetic */ zzbsn[] zzl;
    private final Class zzk;

    static {
        zzbsn zzbsnVar = new zzbsn("VOID", 0, Void.class, Void.class, null);
        zza = zzbsnVar;
        Class cls = Integer.TYPE;
        zzbsn zzbsnVar2 = new zzbsn("INT", 1, cls, Integer.class, 0);
        zzb = zzbsnVar2;
        zzbsn zzbsnVar3 = new zzbsn("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzbsnVar3;
        zzbsn zzbsnVar4 = new zzbsn("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzbsnVar4;
        zzbsn zzbsnVar5 = new zzbsn("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(ConstantsKt.UNSET));
        zze = zzbsnVar5;
        zzbsn zzbsnVar6 = new zzbsn("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzbsnVar6;
        zzbsn zzbsnVar7 = new zzbsn("STRING", 6, String.class, String.class, "");
        zzg = zzbsnVar7;
        zzbsn zzbsnVar8 = new zzbsn("BYTE_STRING", 7, zzbqq.class, zzbqq.class, zzbqq.zza);
        zzh = zzbsnVar8;
        zzbsn zzbsnVar9 = new zzbsn("ENUM", 8, cls, Integer.class, null);
        zzi = zzbsnVar9;
        zzbsn zzbsnVar10 = new zzbsn("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzbsnVar10;
        zzl = new zzbsn[]{zzbsnVar, zzbsnVar2, zzbsnVar3, zzbsnVar4, zzbsnVar5, zzbsnVar6, zzbsnVar7, zzbsnVar8, zzbsnVar9, zzbsnVar10};
    }

    private zzbsn(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzk = cls2;
    }

    public static zzbsn[] values() {
        return (zzbsn[]) zzl.clone();
    }

    public final Class zza() {
        return this.zzk;
    }
}
