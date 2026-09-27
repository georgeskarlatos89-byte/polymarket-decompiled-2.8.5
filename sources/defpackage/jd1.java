package defpackage;

import android.text.SpannableStringBuilder;
import com.google.mlkit.common.MlKitException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jd1 {
    public static final String b;
    public static final String c;
    public static final jd1 d;
    public static final jd1 e;
    public final boolean a;

    static {
        a56 a56Var = asi.c;
        b = Character.toString((char) 8206);
        c = Character.toString((char) 8207);
        d = new jd1(false);
        e = new jd1(true);
    }

    public jd1(boolean z) {
        a56 a56Var = asi.a;
        this.a = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006d, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0070, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0072, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0075, code lost:
    
        if (r0.c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007b, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007f, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0082, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0085, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0088, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008b, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence) {
        byte directionality;
        id1 id1Var = new id1(charSequence);
        id1Var.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = id1Var.c;
            if (i4 < id1Var.b && i == 0) {
                CharSequence charSequence2 = id1Var.a;
                char charAt = charSequence2.charAt(i4);
                id1Var.d = charAt;
                boolean isHighSurrogate = Character.isHighSurrogate(charAt);
                int i5 = id1Var.c;
                if (isHighSurrogate) {
                    int codePointAt = Character.codePointAt(charSequence2, i5);
                    id1Var.c = Character.charCount(codePointAt) + id1Var.c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    id1Var.c = i5 + 1;
                    char c2 = id1Var.d;
                    if (c2 < 1792) {
                        directionality = id1.e[c2];
                    } else {
                        directionality = Character.getDirectionality(c2);
                    }
                }
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        if (directionality != 9) {
                            switch (directionality) {
                                case 14:
                                case 15:
                                    i3++;
                                    i2 = -1;
                                    continue;
                                case 16:
                                case 17:
                                    i3++;
                                    i2 = 1;
                                    continue;
                                case MlKitException.UNSUPPORTED /* 18 */:
                                    i3--;
                                    i2 = 0;
                                    continue;
                            }
                        }
                    } else if (i3 == 0) {
                    }
                } else if (i3 == 0) {
                }
                i = i3;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        return 1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0020. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(CharSequence charSequence) {
        id1 id1Var = new id1(charSequence);
        id1Var.c = id1Var.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (id1Var.c > 0) {
                byte a = id1Var.a();
                if (a != 0) {
                    if (a != 1 && a != 2) {
                        if (a != 9) {
                            switch (a) {
                                case 14:
                                case 15:
                                    if (i2 == i) {
                                        return -1;
                                    }
                                    i--;
                                    break;
                                case 16:
                                case 17:
                                    if (i2 == i) {
                                        break;
                                    }
                                    i--;
                                    break;
                                case MlKitException.UNSUPPORTED /* 18 */:
                                    i++;
                                    break;
                                default:
                                    if (i2 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            continue;
                        }
                    } else if (i != 0) {
                        if (i2 == 0) {
                            break;
                        }
                    }
                } else {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        a56 a56Var;
        String str;
        a56 a56Var2;
        char c2;
        a56 a56Var3 = asi.c;
        if (charSequence == null) {
            return null;
        }
        boolean h = a56Var3.h(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (h) {
            a56Var = asi.b;
        } else {
            a56Var = asi.a;
        }
        boolean h2 = a56Var.h(charSequence, charSequence.length());
        String str2 = "";
        String str3 = c;
        String str4 = b;
        boolean z = this.a;
        if (!z && (h2 || a(charSequence) == 1)) {
            str = str4;
        } else if (!z || (h2 && a(charSequence) != -1)) {
            str = "";
        } else {
            str = str3;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (h != z) {
            if (h) {
                c2 = 8235;
            } else {
                c2 = 8234;
            }
            spannableStringBuilder.append(c2);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (h) {
            a56Var2 = asi.b;
        } else {
            a56Var2 = asi.a;
        }
        boolean h3 = a56Var2.h(charSequence, charSequence.length());
        if (!z && (h3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!h3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
