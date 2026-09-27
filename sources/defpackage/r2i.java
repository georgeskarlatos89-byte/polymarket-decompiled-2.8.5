package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.h;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class r2i extends h {
    public static ArrayList B(CharSequence charSequence) {
        int i;
        int i2;
        charSequence.getClass();
        ail.a(2, 2);
        int length = charSequence.length();
        int i3 = length / 2;
        int i4 = 0;
        if (length % 2 == 0) {
            i = 0;
        } else {
            i = 1;
        }
        ArrayList arrayList = new ArrayList(i3 + i);
        while (i4 >= 0 && i4 < length) {
            int i5 = i4 + 2;
            if (i5 >= 0 && i5 <= length) {
                i2 = i5;
            } else {
                i2 = length;
            }
            CharSequence subSequence = charSequence.subSequence(i4, i2);
            subSequence.getClass();
            arrayList.add(subSequence.toString());
            i4 = i5;
        }
        return arrayList;
    }

    public static String C(int i, String str) {
        str.getClass();
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(i);
        }
        f27.q(sv6.j(i, "Requested character count ", " is less than zero."));
        return null;
    }

    public static String D(int i, String str) {
        str.getClass();
        if (i >= 0) {
            int length = str.length() - i;
            if (length < 0) {
                length = 0;
            }
            return H(length, str);
        }
        f27.q(sv6.j(i, "Requested character count ", " is less than zero."));
        return null;
    }

    public static char E(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        ahh.i("Char sequence is empty.");
        return (char) 0;
    }

    public static char F(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        ahh.i("Char sequence is empty.");
        return (char) 0;
    }

    public static String G(String str, IntRange intRange) {
        str.getClass();
        intRange.getClass();
        if (intRange.isEmpty()) {
            return "";
        }
        return StringsKt.h0(str, intRange);
    }

    public static String H(int i, String str) {
        str.getClass();
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(0, i);
        }
        f27.q(sv6.j(i, "Requested character count ", " is less than zero."));
        return null;
    }

    public static String I(int i, String str) {
        str.getClass();
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(length - i);
        }
        f27.q(sv6.j(i, "Requested character count ", " is less than zero."));
        return null;
    }

    public static List J(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length();
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(charSequence.length());
                for (int i = 0; i < charSequence.length(); i++) {
                    arrayList.add(Character.valueOf(charSequence.charAt(i)));
                }
                return arrayList;
            }
            return eb4.c(Character.valueOf(charSequence.charAt(0)));
        }
        return CollectionsKt.emptyList();
    }

    public static ArrayList K(String str, String str2) {
        str.getClass();
        str2.getClass();
        int min = Math.min(str.length(), str2.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new Pair(Character.valueOf(str.charAt(i)), Character.valueOf(str2.charAt(i))));
        }
        return arrayList;
    }
}
