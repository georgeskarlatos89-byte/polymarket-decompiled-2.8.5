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
public final class j2o {
    public static final j2o zza;
    public static final j2o zzb;
    public static final j2o zzc;
    public static final j2o zzd;
    public static final j2o zze;
    public static final j2o zzf;
    public static final j2o zzg;
    public static final j2o zzh;
    public static final j2o zzi;
    public static final j2o zzj;
    private static final j2o[] zzk;
    private static final /* synthetic */ j2o[] zzp;
    private final char zzl;
    private final o2o zzm;
    private final int zzn;
    private final String zzo;

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    static {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j2o.<clinit>():void");
    }

    public j2o(String str, int i, char c, o2o o2oVar, String str2, boolean z) {
        int i2;
        this.zzl = c;
        this.zzm = o2oVar;
        n2o n2oVar = n2o.e;
        if (true != z) {
            i2 = 0;
        } else {
            i2 = 128;
        }
        for (int i3 = 0; i3 < str2.length(); i3++) {
            int charAt = ((int) ((n2o.d >>> ((str2.charAt(i3) - ' ') * 3)) & 7)) - 1;
            if (charAt >= 0) {
                i2 |= 1 << charAt;
            } else {
                dmk.v("invalid flags: ".concat(str2));
                throw null;
            }
        }
        this.zzn = i2;
        this.zzo = m51.m(new StringBuilder(String.valueOf(c).length() + 1), "%", c);
    }

    public static j2o a(char c) {
        j2o j2oVar = zzk[(c | ' ') - 97];
        if ((c & ' ') == 0) {
            if (j2oVar != null && (j2oVar.zzn & 128) != 0) {
                return j2oVar;
            }
            return null;
        }
        return j2oVar;
    }

    public static j2o[] values() {
        return (j2o[]) zzp.clone();
    }

    public final char b() {
        return this.zzl;
    }

    public final o2o c() {
        return this.zzm;
    }

    public final int d() {
        return this.zzn;
    }

    public final String e() {
        return this.zzo;
    }
}
