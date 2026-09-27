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
public final class y7l {
    public static final y7l zzA;
    public static final y7l zzB;
    public static final y7l zzC;
    public static final y7l zzD;
    public static final y7l zzE;
    public static final y7l zzF;
    public static final y7l zzG;
    public static final y7l zzH;
    public static final y7l zzI;
    public static final y7l zzJ;
    public static final y7l zzK;
    public static final y7l zzL;
    public static final y7l zzM;
    public static final y7l zzN;
    public static final y7l zzO;
    public static final y7l zzP;
    public static final y7l zzQ;
    public static final y7l zzR;
    public static final y7l zzS;
    public static final y7l zzT;
    public static final y7l zzU;
    public static final y7l zzV;
    public static final y7l zzW;
    public static final y7l zzX;
    public static final y7l zzY;
    public static final y7l zza;
    private static final y7l[] zzaa;
    private static final /* synthetic */ y7l[] zzab;
    public static final y7l zzb;
    public static final y7l zzc;
    public static final y7l zzd;
    public static final y7l zze;
    public static final y7l zzf;
    public static final y7l zzg;
    public static final y7l zzh;
    public static final y7l zzi;
    public static final y7l zzj;
    public static final y7l zzk;
    public static final y7l zzl;
    public static final y7l zzm;
    public static final y7l zzn;
    public static final y7l zzo;
    public static final y7l zzp;
    public static final y7l zzq;
    public static final y7l zzr;
    public static final y7l zzs;
    public static final y7l zzt;
    public static final y7l zzu;
    public static final y7l zzv;
    public static final y7l zzw;
    public static final y7l zzx;
    public static final y7l zzy;
    public static final y7l zzz;
    private final int zzZ;

    static {
        q8l q8lVar = q8l.zze;
        y7l y7lVar = new y7l("DOUBLE", 0, 0, 1, q8lVar);
        zza = y7lVar;
        q8l q8lVar2 = q8l.zzd;
        y7l y7lVar2 = new y7l("FLOAT", 1, 1, 1, q8lVar2);
        zzb = y7lVar2;
        q8l q8lVar3 = q8l.zzc;
        y7l y7lVar3 = new y7l("INT64", 2, 2, 1, q8lVar3);
        zzc = y7lVar3;
        y7l y7lVar4 = new y7l("UINT64", 3, 3, 1, q8lVar3);
        zzd = y7lVar4;
        q8l q8lVar4 = q8l.zzb;
        y7l y7lVar5 = new y7l("INT32", 4, 4, 1, q8lVar4);
        zze = y7lVar5;
        y7l y7lVar6 = new y7l("FIXED64", 5, 5, 1, q8lVar3);
        zzf = y7lVar6;
        y7l y7lVar7 = new y7l("FIXED32", 6, 6, 1, q8lVar4);
        zzg = y7lVar7;
        q8l q8lVar5 = q8l.zzf;
        y7l y7lVar8 = new y7l("BOOL", 7, 7, 1, q8lVar5);
        zzh = y7lVar8;
        q8l q8lVar6 = q8l.zzg;
        y7l y7lVar9 = new y7l("STRING", 8, 8, 1, q8lVar6);
        zzi = y7lVar9;
        q8l q8lVar7 = q8l.zzj;
        y7l y7lVar10 = new y7l("MESSAGE", 9, 9, 1, q8lVar7);
        zzj = y7lVar10;
        q8l q8lVar8 = q8l.zzh;
        y7l y7lVar11 = new y7l("BYTES", 10, 10, 1, q8lVar8);
        zzk = y7lVar11;
        y7l y7lVar12 = new y7l("UINT32", 11, 11, 1, q8lVar4);
        zzl = y7lVar12;
        q8l q8lVar9 = q8l.zzi;
        y7l y7lVar13 = new y7l("ENUM", 12, 12, 1, q8lVar9);
        zzm = y7lVar13;
        y7l y7lVar14 = new y7l("SFIXED32", 13, 13, 1, q8lVar4);
        zzn = y7lVar14;
        y7l y7lVar15 = new y7l("SFIXED64", 14, 14, 1, q8lVar3);
        zzo = y7lVar15;
        y7l y7lVar16 = new y7l("SINT32", 15, 15, 1, q8lVar4);
        zzp = y7lVar16;
        y7l y7lVar17 = new y7l("SINT64", 16, 16, 1, q8lVar3);
        zzq = y7lVar17;
        y7l y7lVar18 = new y7l("GROUP", 17, 17, 1, q8lVar7);
        zzr = y7lVar18;
        y7l y7lVar19 = new y7l("DOUBLE_LIST", 18, 18, 2, q8lVar);
        zzs = y7lVar19;
        y7l y7lVar20 = new y7l("FLOAT_LIST", 19, 19, 2, q8lVar2);
        zzt = y7lVar20;
        y7l y7lVar21 = new y7l("INT64_LIST", 20, 20, 2, q8lVar3);
        zzu = y7lVar21;
        y7l y7lVar22 = new y7l("UINT64_LIST", 21, 21, 2, q8lVar3);
        zzv = y7lVar22;
        y7l y7lVar23 = new y7l("INT32_LIST", 22, 22, 2, q8lVar4);
        zzw = y7lVar23;
        y7l y7lVar24 = new y7l("FIXED64_LIST", 23, 23, 2, q8lVar3);
        zzx = y7lVar24;
        y7l y7lVar25 = new y7l("FIXED32_LIST", 24, 24, 2, q8lVar4);
        zzy = y7lVar25;
        y7l y7lVar26 = new y7l("BOOL_LIST", 25, 25, 2, q8lVar5);
        zzz = y7lVar26;
        y7l y7lVar27 = new y7l("STRING_LIST", 26, 26, 2, q8lVar6);
        zzA = y7lVar27;
        y7l y7lVar28 = new y7l("MESSAGE_LIST", 27, 27, 2, q8lVar7);
        zzB = y7lVar28;
        y7l y7lVar29 = new y7l("BYTES_LIST", 28, 28, 2, q8lVar8);
        zzC = y7lVar29;
        y7l y7lVar30 = new y7l("UINT32_LIST", 29, 29, 2, q8lVar4);
        zzD = y7lVar30;
        y7l y7lVar31 = new y7l("ENUM_LIST", 30, 30, 2, q8lVar9);
        zzE = y7lVar31;
        y7l y7lVar32 = new y7l("SFIXED32_LIST", 31, 31, 2, q8lVar4);
        zzF = y7lVar32;
        y7l y7lVar33 = new y7l("SFIXED64_LIST", 32, 32, 2, q8lVar3);
        zzG = y7lVar33;
        y7l y7lVar34 = new y7l("SINT32_LIST", 33, 33, 2, q8lVar4);
        zzH = y7lVar34;
        y7l y7lVar35 = new y7l("SINT64_LIST", 34, 34, 2, q8lVar3);
        zzI = y7lVar35;
        y7l y7lVar36 = new y7l("DOUBLE_LIST_PACKED", 35, 35, 3, q8lVar);
        zzJ = y7lVar36;
        y7l y7lVar37 = new y7l("FLOAT_LIST_PACKED", 36, 36, 3, q8lVar2);
        zzK = y7lVar37;
        y7l y7lVar38 = new y7l("INT64_LIST_PACKED", 37, 37, 3, q8lVar3);
        zzL = y7lVar38;
        y7l y7lVar39 = new y7l("UINT64_LIST_PACKED", 38, 38, 3, q8lVar3);
        zzM = y7lVar39;
        y7l y7lVar40 = new y7l("INT32_LIST_PACKED", 39, 39, 3, q8lVar4);
        zzN = y7lVar40;
        y7l y7lVar41 = new y7l("FIXED64_LIST_PACKED", 40, 40, 3, q8lVar3);
        zzO = y7lVar41;
        y7l y7lVar42 = new y7l("FIXED32_LIST_PACKED", 41, 41, 3, q8lVar4);
        zzP = y7lVar42;
        y7l y7lVar43 = new y7l("BOOL_LIST_PACKED", 42, 42, 3, q8lVar5);
        zzQ = y7lVar43;
        y7l y7lVar44 = new y7l("UINT32_LIST_PACKED", 43, 43, 3, q8lVar4);
        zzR = y7lVar44;
        y7l y7lVar45 = new y7l("ENUM_LIST_PACKED", 44, 44, 3, q8lVar9);
        zzS = y7lVar45;
        y7l y7lVar46 = new y7l("SFIXED32_LIST_PACKED", 45, 45, 3, q8lVar4);
        zzT = y7lVar46;
        y7l y7lVar47 = new y7l("SFIXED64_LIST_PACKED", 46, 46, 3, q8lVar3);
        zzU = y7lVar47;
        y7l y7lVar48 = new y7l("SINT32_LIST_PACKED", 47, 47, 3, q8lVar4);
        zzV = y7lVar48;
        y7l y7lVar49 = new y7l("SINT64_LIST_PACKED", 48, 48, 3, q8lVar3);
        zzW = y7lVar49;
        y7l y7lVar50 = new y7l("GROUP_LIST", 49, 49, 2, q8lVar7);
        zzX = y7lVar50;
        y7l y7lVar51 = new y7l("MAP", 50, 50, 4, q8l.zza);
        zzY = y7lVar51;
        zzab = new y7l[]{y7lVar, y7lVar2, y7lVar3, y7lVar4, y7lVar5, y7lVar6, y7lVar7, y7lVar8, y7lVar9, y7lVar10, y7lVar11, y7lVar12, y7lVar13, y7lVar14, y7lVar15, y7lVar16, y7lVar17, y7lVar18, y7lVar19, y7lVar20, y7lVar21, y7lVar22, y7lVar23, y7lVar24, y7lVar25, y7lVar26, y7lVar27, y7lVar28, y7lVar29, y7lVar30, y7lVar31, y7lVar32, y7lVar33, y7lVar34, y7lVar35, y7lVar36, y7lVar37, y7lVar38, y7lVar39, y7lVar40, y7lVar41, y7lVar42, y7lVar43, y7lVar44, y7lVar45, y7lVar46, y7lVar47, y7lVar48, y7lVar49, y7lVar50, y7lVar51};
        y7l[] values = values();
        zzaa = new y7l[values.length];
        for (y7l y7lVar52 : values) {
            zzaa[y7lVar52.zzZ] = y7lVar52;
        }
    }

    public y7l(String str, int i, int i2, int i3, q8l q8lVar) {
        this.zzZ = i2;
        int i4 = i3 - 1;
        if (i4 != 1) {
            if (i4 == 3) {
                q8lVar.getClass();
            }
        } else {
            q8lVar.getClass();
        }
        if (i3 == 1) {
            q8l q8lVar2 = q8l.zza;
            q8lVar.ordinal();
        }
    }

    public static y7l[] values() {
        return (y7l[]) zzab.clone();
    }

    public final int zza() {
        return this.zzZ;
    }
}
