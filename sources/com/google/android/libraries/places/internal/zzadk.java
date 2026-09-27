package com.google.android.libraries.places.internal;

import defpackage.m51;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzd' uses external variables
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
public final class zzadk {
    public static final zzadk zza;
    public static final zzadk zzb;
    public static final zzadk zzc;
    public static final zzadk zzd;
    public static final zzadk zze;
    public static final zzadk zzf;
    public static final zzadk zzg;
    public static final zzadk zzh;
    public static final zzadk zzi;
    public static final zzadk zzj;
    private static final zzadk[] zzk;
    private static final /* synthetic */ zzadk[] zzp;
    private final char zzl;
    private final zzadm zzm;
    private final int zzn;
    private final String zzo;

    static {
        zzadk zzadkVar = new zzadk("STRING", 0, 's', zzadm.GENERAL, "-#", true);
        zza = zzadkVar;
        zzadk zzadkVar2 = new zzadk("BOOLEAN", 1, 'b', zzadm.BOOLEAN, "-", true);
        zzb = zzadkVar2;
        zzadk zzadkVar3 = new zzadk("CHAR", 2, 'c', zzadm.CHARACTER, "-", true);
        zzc = zzadkVar3;
        zzadm zzadmVar = zzadm.INTEGRAL;
        zzadk zzadkVar4 = new zzadk("DECIMAL", 3, 'd', zzadmVar, "-0+ ,(", false);
        zzd = zzadkVar4;
        zzadk zzadkVar5 = new zzadk("OCTAL", 4, 'o', zzadmVar, "-#0(", false);
        zze = zzadkVar5;
        zzadk zzadkVar6 = new zzadk("HEX", 5, 'x', zzadmVar, "-#0(", true);
        zzf = zzadkVar6;
        zzadm zzadmVar2 = zzadm.FLOAT;
        zzadk zzadkVar7 = new zzadk("FLOAT", 6, 'f', zzadmVar2, "-#0+ ,(", false);
        zzg = zzadkVar7;
        zzadk zzadkVar8 = new zzadk("EXPONENT", 7, 'e', zzadmVar2, "-#0+ (", true);
        zzh = zzadkVar8;
        zzadk zzadkVar9 = new zzadk("GENERAL", 8, 'g', zzadmVar2, "-0+ ,(", true);
        zzi = zzadkVar9;
        zzadk zzadkVar10 = new zzadk("EXPONENT_HEX", 9, 'a', zzadmVar2, "-#0+ ", true);
        zzj = zzadkVar10;
        zzp = new zzadk[]{zzadkVar, zzadkVar2, zzadkVar3, zzadkVar4, zzadkVar5, zzadkVar6, zzadkVar7, zzadkVar8, zzadkVar9, zzadkVar10};
        zzk = new zzadk[26];
        for (zzadk zzadkVar11 : values()) {
            zzk[zzf(zzadkVar11.zzl)] = zzadkVar11;
        }
    }

    private zzadk(String str, int i, char c, zzadm zzadmVar, String str2, boolean z) {
        this.zzl = c;
        this.zzm = zzadmVar;
        this.zzn = zzadl.zzc(str2, z);
        this.zzo = m51.m(new StringBuilder(String.valueOf(c).length() + 1), "%", c);
    }

    public static zzadk[] values() {
        return (zzadk[]) zzp.clone();
    }

    public static zzadk zza(char c) {
        zzadk zzadkVar = zzk[zzf(c)];
        if ((c & ' ') == 0) {
            if (zzadkVar != null && (zzadkVar.zzn & 128) != 0) {
                return zzadkVar;
            }
            return null;
        }
        return zzadkVar;
    }

    private static int zzf(char c) {
        return (c | ' ') - 97;
    }

    public final char zzb() {
        return this.zzl;
    }

    public final zzadm zzc() {
        return this.zzm;
    }

    public final int zzd() {
        return this.zzn;
    }

    public final String zze() {
        return this.zzo;
    }
}
