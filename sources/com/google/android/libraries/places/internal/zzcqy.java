package com.google.android.libraries.places.internal;

import com.socure.docv.capturesdk.common.utils.SelfieConstants;
import defpackage.dmk;
import io.intercom.android.sdk.models.carousel.Carousel;
import javax.security.auth.x500.X500Principal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcqy {
    private final String zza;
    private final int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private char[] zzg;

    public zzcqy(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.zza = name;
        this.zzb = name.length();
    }

    private final String zzb() {
        int i;
        int i2;
        int i3;
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        while (true) {
            i = this.zzc;
            i2 = this.zzb;
            if (i >= i2 || this.zzg[i] != ' ') {
                break;
            }
            this.zzc = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.zzd = i;
        this.zzc = i + 1;
        while (true) {
            i3 = this.zzc;
            if (i3 >= i2 || (c5 = this.zzg[i3]) == '=' || c5 == ' ') {
                break;
            }
            this.zzc = i3 + 1;
        }
        if (i3 < i2) {
            this.zze = i3;
            if (this.zzg[i3] == ' ') {
                while (true) {
                    i3 = this.zzc;
                    if (i3 >= i2 || (c4 = this.zzg[i3]) == '=' || c4 != ' ') {
                        break;
                    }
                    this.zzc = i3 + 1;
                }
                if (this.zzg[i3] != '=' || i3 == i2) {
                    dmk.n("Unexpected end of DN: ".concat(String.valueOf(this.zza)));
                    return null;
                }
            }
            this.zzc = i3 + 1;
            while (true) {
                int i4 = this.zzc;
                if (i4 >= i2 || this.zzg[i4] != ' ') {
                    break;
                }
                this.zzc = i4 + 1;
            }
            int i5 = this.zze;
            int i6 = this.zzd;
            if (i5 - i6 > 4) {
                char[] cArr = this.zzg;
                if (cArr[i6 + 3] == '.' && (((c = cArr[i6]) == 'O' || c == 'o') && (((c2 = cArr[i6 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[i6 + 2]) == 'D' || c3 == 'd')))) {
                    i6 += 4;
                    this.zzd = i6;
                }
            }
            return new String(this.zzg, i6, i5 - i6);
        }
        dmk.n("Unexpected end of DN: ".concat(String.valueOf(this.zza)));
        return null;
    }

    private final char zzc() {
        int i;
        int i2;
        int i3 = this.zzc + 1;
        this.zzc = i3;
        int i4 = this.zzb;
        if (i3 != i4) {
            char c = this.zzg[i3];
            if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
                switch (c) {
                    default:
                        switch (c) {
                            case ';':
                            case SelfieConstants.SELFIE_OVAL_TOP_MARGIN /* 60 */:
                            case '=':
                            case '>':
                                break;
                            default:
                                int zzd = zzd(i3);
                                this.zzc++;
                                if (zzd >= 128) {
                                    if (zzd >= 192 && zzd <= 247) {
                                        if (zzd <= 223) {
                                            i = zzd & 31;
                                            i2 = 1;
                                        } else if (zzd <= 239) {
                                            i = zzd & 15;
                                            i2 = 2;
                                        } else {
                                            i = zzd & 7;
                                            i2 = 3;
                                        }
                                        for (int i5 = 0; i5 < i2; i5++) {
                                            int i6 = this.zzc;
                                            int i7 = i6 + 1;
                                            this.zzc = i7;
                                            if (i7 != i4 && this.zzg[i7] == '\\') {
                                                int i8 = i6 + 2;
                                                this.zzc = i8;
                                                int zzd2 = zzd(i8);
                                                this.zzc++;
                                                if ((zzd2 & 192) == 128) {
                                                    i = (i << 6) + (zzd2 & 63);
                                                }
                                            }
                                        }
                                        zzd = (char) i;
                                    }
                                    zzd = 63;
                                }
                                return (char) zzd;
                        }
                    case '*':
                    case '+':
                    case Carousel.ENTITY_TYPE /* 44 */:
                        return c;
                }
            }
            return c;
        }
        dmk.n("Unexpected end of DN: ".concat(String.valueOf(this.zza)));
        return (char) 0;
    }

    private final int zzd(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.zzb) {
            char[] cArr = this.zzg;
            char c = cArr[i];
            if (c >= '0' && c <= '9') {
                i2 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i2 = c - 'W';
            } else if (c >= 'A' && c <= 'F') {
                i2 = c - '7';
            } else {
                dmk.n("Malformed DN: ".concat(String.valueOf(this.zza)));
                return 0;
            }
            char c2 = cArr[i4];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 >= 'A' && c2 <= 'F') {
                i3 = c2 - '7';
            } else {
                dmk.n("Malformed DN: ".concat(String.valueOf(this.zza)));
                return 0;
            }
            return (i2 << 4) + i3;
        }
        dmk.n("Malformed DN: ".concat(String.valueOf(this.zza)));
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00ef, code lost:
    
        r3 = r14.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00f1, code lost:
    
        if (r3 >= r4) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00f7, code lost:
    
        if (r14.zzg[r3] != ' ') goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f9, code lost:
    
        r14.zzc = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0110, code lost:
    
        r3 = r14.zze;
        r5 = r14.zzd;
        r3 = r3 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0116, code lost:
    
        if (r3 < 5) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x011a, code lost:
    
        if ((r3 & 1) == 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r5 == ',') goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x011c, code lost:
    
        r6 = r3 >> 1;
        r5 = r5 + 1;
        r7 = new byte[r6];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0123, code lost:
    
        if (r8 >= r6) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0125, code lost:
    
        r7[r8] = (byte) zzd(r5);
        r8 = r8 + 1;
        r5 = r5 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0131, code lost:
    
        r3 = new java.lang.String(r14.zzg, r14.zzd, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x013c, code lost:
    
        defpackage.dmk.n("Unexpected end of DN: ".concat(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0143, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (r5 == ';') goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x010e, code lost:
    
        r14.zze = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0144, code lost:
    
        defpackage.dmk.n("Unexpected end of DN: ".concat(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x014b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x014c, code lost:
    
        r3 = r3 + 1;
        r14.zzc = r3;
        r14.zzd = r3;
        r14.zze = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0154, code lost:
    
        r3 = r14.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        r14.zzd = r3;
        r14.zze = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0156, code lost:
    
        if (r3 == r4) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0158, code lost:
    
        r5 = r14.zzg;
        r13 = r5[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x015c, code lost:
    
        if (r13 != '\"') goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01b5, code lost:
    
        r3 = r14.zze;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01b7, code lost:
    
        if (r13 != '\\') goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01b9, code lost:
    
        r5[r3] = zzc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01c2, code lost:
    
        r14.zzc++;
        r14.zze++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01c0, code lost:
    
        r5[r3] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        r3 = r14.zzc;
        r5 = r14.zzg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x015e, code lost:
    
        r14.zzc = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0162, code lost:
    
        r3 = r14.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0164, code lost:
    
        if (r3 >= r4) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x016a, code lost:
    
        if (r14.zzg[r3] != ' ') goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x016c, code lost:
    
        r14.zzc = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0171, code lost:
    
        r5 = r14.zzg;
        r6 = r14.zzd;
        r3 = new java.lang.String(r5, r6, r14.zze - r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r3 < r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01cf, code lost:
    
        defpackage.dmk.n("Unexpected end of DN: ".concat(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x001e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01d6, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        r6 = r5[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r6 == ' ') goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        r6 = r14.zze;
        r14.zzf = r6;
        r14.zzc = r3 + 1;
        r14.zze = r6 + 1;
        r5[r6] = ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        r3 = r14.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        if (r3 >= r4) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
    
        r5 = r14.zzg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a1, code lost:
    
        if (r5[r3] != ' ') goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
    
        r6 = r14.zze;
        r14.zze = r6 + 1;
        r5[r6] = ' ';
        r14.zzc = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        if (r3 == r4) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b2, code lost:
    
        r3 = r14.zzg[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        if (r3 == ',') goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        if (r3 == '+') goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
    
        if (r3 != ';') goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0016, code lost:
    
        if (r1 != null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
    
        r5 = r14.zzg;
        r6 = r14.zzd;
        r3 = new java.lang.String(r5, r6, r14.zzf - r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0183, code lost:
    
        if ("cn".equalsIgnoreCase(r1) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0186, code lost:
    
        r1 = r14.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0188, code lost:
    
        if (r1 < r4) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x018b, code lost:
    
        r3 = r14.zzg[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0191, code lost:
    
        if (r3 == ',') goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0193, code lost:
    
        if (r3 != ';') goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0196, code lost:
    
        if (r3 != '+') goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0018, code lost:
    
        r3 = r14.zzc;
        r4 = r14.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0199, code lost:
    
        defpackage.dmk.n("Malformed DN: ".concat(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a0, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01a1, code lost:
    
        r14.zzc = r1 + 1;
        r1 = zzb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a9, code lost:
    
        if (r1 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ad, code lost:
    
        defpackage.dmk.n("Malformed DN: ".concat(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b4, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r3 != r4) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0185, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        r5 = r14.zzg[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0057, code lost:
    
        if (r6 == ';') goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0059, code lost:
    
        if (r6 == '\\') goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x006c, code lost:
    
        r3 = r14.zze;
        r14.zze = r3 + 1;
        r5[r3] = zzc();
        r14.zzc++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x005b, code lost:
    
        if (r6 == '+') goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x005d, code lost:
    
        if (r6 == ',') goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x005f, code lost:
    
        r8 = r14.zze;
        r14.zze = r8 + 1;
        r5[r8] = r6;
        r14.zzc = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if (r5 == '\"') goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x007f, code lost:
    
        r6 = r14.zzd;
        r3 = new java.lang.String(r5, r6, r14.zze - r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0047, code lost:
    
        r6 = r14.zzd;
        r3 = new java.lang.String(r5, r6, r14.zze - r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ca, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d0, code lost:
    
        if ((r3 + 4) >= r4) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d2, code lost:
    
        r14.zzd = r3;
        r14.zzc = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00d8, code lost:
    
        r3 = r14.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00da, code lost:
    
        if (r3 == r4) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00dc, code lost:
    
        r5 = r14.zzg;
        r7 = r5[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e0, code lost:
    
        if (r7 == '+') goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e2, code lost:
    
        if (r7 == ',') goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00e4, code lost:
    
        if (r7 != ';') goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00e7, code lost:
    
        r8 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00e9, code lost:
    
        if (r7 != ' ') goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r5 == '#') goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0100, code lost:
    
        if (r7 < 'A') goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0104, code lost:
    
        if (r7 > 'F') goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0106, code lost:
    
        r5[r3] = (char) (r7 + ' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x010b, code lost:
    
        r14.zzc = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00eb, code lost:
    
        r14.zze = r3;
        r14.zzc = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (r5 == '+') goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zza(String str) {
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        String str2 = this.zza;
        this.zzg = str2.toCharArray();
        String zzb = zzb();
    }
}
