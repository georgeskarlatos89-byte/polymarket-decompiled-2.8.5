package defpackage;

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
public final class tel {
    public static final tel zza;
    public static final tel zzb;
    public static final tel zzc;
    public static final tel zzd;
    public static final tel zze;
    public static final tel zzf;
    public static final tel zzg;
    public static final tel zzh;
    public static final tel zzi;
    public static final tel zzj;
    private static final tel[] zzk;
    private static final /* synthetic */ tel[] zzl;
    private final char zzm;
    private final afl zzn;
    private final int zzo;
    private final String zzp;

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:489)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:492)
        */
    static {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tel.<clinit>():void");
    }

    public tel(String str, int i, char c, afl aflVar, String str2, boolean z) {
        int i2;
        this.zzm = c;
        this.zzn = aflVar;
        wel welVar = wel.e;
        if (true != z) {
            i2 = 0;
        } else {
            i2 = 128;
        }
        for (int i3 = 0; i3 < str2.length(); i3++) {
            int charAt = ((int) ((wel.d >>> ((str2.charAt(i3) - ' ') * 3)) & 7)) - 1;
            if (charAt >= 0) {
                i2 |= 1 << charAt;
            } else {
                dmk.v("invalid flags: ".concat(str2));
                throw null;
            }
        }
        this.zzo = i2;
        this.zzp = "%" + c;
    }

    public static tel c(char c) {
        tel telVar = zzk[(c | ' ') - 97];
        if ((c & ' ') == 0) {
            if (telVar != null && (telVar.zzo & 128) != 0) {
                return telVar;
            }
            return null;
        }
        return telVar;
    }

    public static tel[] values() {
        return (tel[]) zzl.clone();
    }

    public final char a() {
        return this.zzm;
    }

    public final int b() {
        return this.zzo;
    }

    public final afl d() {
        return this.zzn;
    }

    public final String e() {
        return this.zzp;
    }
}
