package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zza' uses external variables
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
public final class brm {
    public static final brm zzA;
    public static final brm zzB;
    public static final brm zzC;
    public static final brm zzD;
    public static final brm zzE;
    public static final brm zzF;
    public static final brm zzG;
    public static final brm zzH;
    public static final brm zzI;
    public static final brm zzJ;
    public static final brm zzK;
    public static final brm zzL;
    public static final brm zzM;
    public static final brm zzN;
    public static final brm zzO;
    public static final brm zzP;
    public static final brm zzQ;
    public static final brm zzR;
    public static final brm zzS;
    public static final brm zzT;
    public static final brm zzU;
    public static final brm zzV;
    public static final brm zzW;
    public static final brm zzX;
    public static final brm zzY;
    private static final brm[] zzZ;
    public static final brm zza;
    private static final /* synthetic */ brm[] zzaa;
    public static final brm zzb;
    public static final brm zzc;
    public static final brm zzd;
    public static final brm zze;
    public static final brm zzf;
    public static final brm zzg;
    public static final brm zzh;
    public static final brm zzi;
    public static final brm zzj;
    public static final brm zzk;
    public static final brm zzl;
    public static final brm zzm;
    public static final brm zzn;
    public static final brm zzo;
    public static final brm zzp;
    public static final brm zzq;
    public static final brm zzr;
    public static final brm zzs;
    public static final brm zzt;
    public static final brm zzu;
    public static final brm zzv;
    public static final brm zzw;
    public static final brm zzx;
    public static final brm zzy;
    public static final brm zzz;
    private final int zzab;

    static {
        hvm hvmVar = hvm.zze;
        brm brmVar = new brm("DOUBLE", 0, 0, 1, hvmVar);
        zza = brmVar;
        hvm hvmVar2 = hvm.zzd;
        brm brmVar2 = new brm("FLOAT", 1, 1, 1, hvmVar2);
        zzb = brmVar2;
        hvm hvmVar3 = hvm.zzc;
        brm brmVar3 = new brm("INT64", 2, 2, 1, hvmVar3);
        zzc = brmVar3;
        brm brmVar4 = new brm("UINT64", 3, 3, 1, hvmVar3);
        zzd = brmVar4;
        hvm hvmVar4 = hvm.zzb;
        brm brmVar5 = new brm("INT32", 4, 4, 1, hvmVar4);
        zze = brmVar5;
        brm brmVar6 = new brm("FIXED64", 5, 5, 1, hvmVar3);
        zzf = brmVar6;
        brm brmVar7 = new brm("FIXED32", 6, 6, 1, hvmVar4);
        zzg = brmVar7;
        hvm hvmVar5 = hvm.zzf;
        brm brmVar8 = new brm("BOOL", 7, 7, 1, hvmVar5);
        zzh = brmVar8;
        hvm hvmVar6 = hvm.zzg;
        brm brmVar9 = new brm("STRING", 8, 8, 1, hvmVar6);
        zzi = brmVar9;
        hvm hvmVar7 = hvm.zzj;
        brm brmVar10 = new brm("MESSAGE", 9, 9, 1, hvmVar7);
        zzj = brmVar10;
        hvm hvmVar8 = hvm.zzh;
        brm brmVar11 = new brm("BYTES", 10, 10, 1, hvmVar8);
        zzk = brmVar11;
        brm brmVar12 = new brm("UINT32", 11, 11, 1, hvmVar4);
        zzl = brmVar12;
        hvm hvmVar9 = hvm.zzi;
        brm brmVar13 = new brm("ENUM", 12, 12, 1, hvmVar9);
        zzm = brmVar13;
        brm brmVar14 = new brm("SFIXED32", 13, 13, 1, hvmVar4);
        zzn = brmVar14;
        brm brmVar15 = new brm("SFIXED64", 14, 14, 1, hvmVar3);
        zzo = brmVar15;
        brm brmVar16 = new brm("SINT32", 15, 15, 1, hvmVar4);
        zzp = brmVar16;
        brm brmVar17 = new brm("SINT64", 16, 16, 1, hvmVar3);
        zzq = brmVar17;
        brm brmVar18 = new brm("GROUP", 17, 17, 1, hvmVar7);
        zzr = brmVar18;
        brm brmVar19 = new brm("DOUBLE_LIST", 18, 18, 2, hvmVar);
        zzs = brmVar19;
        brm brmVar20 = new brm("FLOAT_LIST", 19, 19, 2, hvmVar2);
        zzt = brmVar20;
        brm brmVar21 = new brm("INT64_LIST", 20, 20, 2, hvmVar3);
        zzu = brmVar21;
        brm brmVar22 = new brm("UINT64_LIST", 21, 21, 2, hvmVar3);
        zzv = brmVar22;
        brm brmVar23 = new brm("INT32_LIST", 22, 22, 2, hvmVar4);
        zzw = brmVar23;
        brm brmVar24 = new brm("FIXED64_LIST", 23, 23, 2, hvmVar3);
        zzx = brmVar24;
        brm brmVar25 = new brm("FIXED32_LIST", 24, 24, 2, hvmVar4);
        zzy = brmVar25;
        brm brmVar26 = new brm("BOOL_LIST", 25, 25, 2, hvmVar5);
        zzz = brmVar26;
        brm brmVar27 = new brm("STRING_LIST", 26, 26, 2, hvmVar6);
        zzA = brmVar27;
        brm brmVar28 = new brm("MESSAGE_LIST", 27, 27, 2, hvmVar7);
        zzB = brmVar28;
        brm brmVar29 = new brm("BYTES_LIST", 28, 28, 2, hvmVar8);
        zzC = brmVar29;
        brm brmVar30 = new brm("UINT32_LIST", 29, 29, 2, hvmVar4);
        zzD = brmVar30;
        brm brmVar31 = new brm("ENUM_LIST", 30, 30, 2, hvmVar9);
        zzE = brmVar31;
        brm brmVar32 = new brm("SFIXED32_LIST", 31, 31, 2, hvmVar4);
        zzF = brmVar32;
        brm brmVar33 = new brm("SFIXED64_LIST", 32, 32, 2, hvmVar3);
        zzG = brmVar33;
        brm brmVar34 = new brm("SINT32_LIST", 33, 33, 2, hvmVar4);
        zzH = brmVar34;
        brm brmVar35 = new brm("SINT64_LIST", 34, 34, 2, hvmVar3);
        zzI = brmVar35;
        brm brmVar36 = new brm("DOUBLE_LIST_PACKED", 35, 35, 3, hvmVar);
        zzJ = brmVar36;
        brm brmVar37 = new brm("FLOAT_LIST_PACKED", 36, 36, 3, hvmVar2);
        zzK = brmVar37;
        brm brmVar38 = new brm("INT64_LIST_PACKED", 37, 37, 3, hvmVar3);
        zzL = brmVar38;
        brm brmVar39 = new brm("UINT64_LIST_PACKED", 38, 38, 3, hvmVar3);
        zzM = brmVar39;
        brm brmVar40 = new brm("INT32_LIST_PACKED", 39, 39, 3, hvmVar4);
        zzN = brmVar40;
        brm brmVar41 = new brm("FIXED64_LIST_PACKED", 40, 40, 3, hvmVar3);
        zzO = brmVar41;
        brm brmVar42 = new brm("FIXED32_LIST_PACKED", 41, 41, 3, hvmVar4);
        zzP = brmVar42;
        brm brmVar43 = new brm("BOOL_LIST_PACKED", 42, 42, 3, hvmVar5);
        zzQ = brmVar43;
        brm brmVar44 = new brm("UINT32_LIST_PACKED", 43, 43, 3, hvmVar4);
        zzR = brmVar44;
        brm brmVar45 = new brm("ENUM_LIST_PACKED", 44, 44, 3, hvmVar9);
        zzS = brmVar45;
        brm brmVar46 = new brm("SFIXED32_LIST_PACKED", 45, 45, 3, hvmVar4);
        zzT = brmVar46;
        brm brmVar47 = new brm("SFIXED64_LIST_PACKED", 46, 46, 3, hvmVar3);
        zzU = brmVar47;
        brm brmVar48 = new brm("SINT32_LIST_PACKED", 47, 47, 3, hvmVar4);
        zzV = brmVar48;
        brm brmVar49 = new brm("SINT64_LIST_PACKED", 48, 48, 3, hvmVar3);
        zzW = brmVar49;
        brm brmVar50 = new brm("GROUP_LIST", 49, 49, 2, hvmVar7);
        zzX = brmVar50;
        brm brmVar51 = new brm("MAP", 50, 50, 4, hvm.zza);
        zzY = brmVar51;
        zzaa = new brm[]{brmVar, brmVar2, brmVar3, brmVar4, brmVar5, brmVar6, brmVar7, brmVar8, brmVar9, brmVar10, brmVar11, brmVar12, brmVar13, brmVar14, brmVar15, brmVar16, brmVar17, brmVar18, brmVar19, brmVar20, brmVar21, brmVar22, brmVar23, brmVar24, brmVar25, brmVar26, brmVar27, brmVar28, brmVar29, brmVar30, brmVar31, brmVar32, brmVar33, brmVar34, brmVar35, brmVar36, brmVar37, brmVar38, brmVar39, brmVar40, brmVar41, brmVar42, brmVar43, brmVar44, brmVar45, brmVar46, brmVar47, brmVar48, brmVar49, brmVar50, brmVar51};
        brm[] values = values();
        zzZ = new brm[values.length];
        for (brm brmVar52 : values) {
            zzZ[brmVar52.zzab] = brmVar52;
        }
    }

    public brm(String str, int i, int i2, int i3, hvm hvmVar) {
        this.zzab = i2;
        int i4 = i3 - 1;
        if (i4 != 1) {
            if (i4 == 3) {
                hvmVar.getClass();
            }
        } else {
            hvmVar.getClass();
        }
        if (i3 == 1) {
            hvm hvmVar2 = hvm.zza;
            hvmVar.ordinal();
        }
    }

    public static brm[] values() {
        return (brm[]) zzaa.clone();
    }

    public final int zza() {
        return this.zzab;
    }
}
