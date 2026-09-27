package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class del implements Iterable, ndl {
    public final String a;

    public del(String str) {
        if (str != null) {
            this.a = str;
        } else {
            dmk.v("StringValue cannot be null.");
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02e2, code lost:
    
        if (r4[r1].isEmpty() == false) goto L104;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00b8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ndl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ndl b(String str, a7h a7hVar, ArrayList arrayList) {
        String str2;
        String str3;
        int i;
        double doubleValue;
        double j;
        String zzc;
        double d;
        double min;
        double length;
        double min2;
        long j2;
        int i2;
        int i3;
        int i4;
        int length2;
        a7h a7hVar2;
        double doubleValue2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                dmk.v(str.concat(" is not a String function"));
                return null;
            }
        }
        int hashCode = str.hashCode();
        String str4 = "undefined";
        String str5 = this.a;
        int i5 = 0;
        r8 = false;
        boolean z = false;
        switch (hashCode) {
            case -1789698943:
                String str6 = str2;
                if (str.equals(str6)) {
                    fgn.c(1, str6, arrayList);
                    ndl j3 = ((ubk) a7hVar.b).j(a7hVar, (ndl) arrayList.get(0));
                    boolean equals = "length".equals(j3.zzc());
                    b9l b9lVar = ndl.k1;
                    if (equals) {
                        return b9lVar;
                    }
                    double doubleValue3 = j3.zzd().doubleValue();
                    if (doubleValue3 == Math.floor(doubleValue3) && (i = (int) doubleValue3) >= 0 && i < str5.length()) {
                        return b9lVar;
                    }
                    return ndl.l1;
                }
                dmk.v("Command not supported");
                return null;
            case -1776922004:
                if (str.equals("toString")) {
                    fgn.c(0, "toString", arrayList);
                    return this;
                }
                dmk.v("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    fgn.c(0, "toLocaleLowerCase", arrayList);
                    return new del(str5.toLowerCase());
                }
                dmk.v("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    fgn.e(1, "charAt", arrayList);
                    if (!arrayList.isEmpty()) {
                        i5 = (int) fgn.j(((ubk) a7hVar.b).j(a7hVar, (ndl) arrayList.get(0)).zzd().doubleValue());
                    }
                    if (i5 >= 0 && i5 < str5.length()) {
                        return new del(String.valueOf(str5.charAt(i5)));
                    }
                    return ndl.m1;
                }
                dmk.v("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str5);
                        for (int i6 = 0; i6 < arrayList.size(); i6++) {
                            sb.append(((ubk) a7hVar.b).j(a7hVar, (ndl) arrayList.get(i6)).zzc());
                        }
                        return new del(sb.toString());
                    }
                    return this;
                }
                dmk.v("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    fgn.c(0, "toLowerCase", arrayList);
                    return new del(str5.toLowerCase(Locale.ENGLISH));
                }
                dmk.v("Command not supported");
                return null;
            case -906336856:
                if (str.equals("search")) {
                    fgn.e(1, "search", arrayList);
                    if (!arrayList.isEmpty()) {
                        str4 = ((ubk) a7hVar.b).j(a7hVar, (ndl) arrayList.get(0)).zzc();
                    }
                    if (Pattern.compile(str4).matcher(str5).find()) {
                        return new pal(Double.valueOf(r0.start()));
                    }
                    return new pal(Double.valueOf(-1.0d));
                }
                dmk.v("Command not supported");
                return null;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    fgn.c(0, "toLocaleUpperCase", arrayList);
                    return new del(str5.toUpperCase());
                }
                dmk.v("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    fgn.e(2, "lastIndexOf", arrayList);
                    if (arrayList.size() > 0) {
                        str4 = ((ubk) a7hVar.b).j(a7hVar, (ndl) arrayList.get(0)).zzc();
                    }
                    String str7 = str4;
                    if (arrayList.size() < 2) {
                        doubleValue = Double.NaN;
                    } else {
                        doubleValue = ((ubk) a7hVar.b).j(a7hVar, (ndl) arrayList.get(1)).zzd().doubleValue();
                    }
                    if (Double.isNaN(doubleValue)) {
                        j = Double.POSITIVE_INFINITY;
                    } else {
                        j = fgn.j(doubleValue);
                    }
                    return new pal(Double.valueOf(str5.lastIndexOf(str7, (int) j)));
                }
                dmk.v("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    fgn.c(0, "toUpperCase", arrayList);
                    return new del(str5.toUpperCase(Locale.ENGLISH));
                }
                dmk.v("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str3)) {
                    fgn.c(0, "toUpperCase", arrayList);
                    return new del(str5.trim());
                }
                dmk.v("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    fgn.e(1, "match", arrayList);
                    if (arrayList.size() <= 0) {
                        zzc = "";
                    } else {
                        zzc = ((ubk) a7hVar.b).j(a7hVar, (ndl) arrayList.get(0)).zzc();
                    }
                    Matcher matcher = Pattern.compile(zzc).matcher(str5);
                    if (matcher.find()) {
                        return new h8l(Arrays.asList(new del(matcher.group())));
                    }
                    return ndl.g1;
                }
                dmk.v("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    fgn.e(2, "slice", arrayList);
                    if (!arrayList.isEmpty()) {
                        d = ((ubk) a7hVar.b).j(a7hVar, (ndl) arrayList.get(0)).zzd().doubleValue();
                    } else {
                        d = 0.0d;
                    }
                    double j4 = fgn.j(d);
                    if (j4 < ConstantsKt.UNSET) {
                        min = Math.max(str5.length() + j4, ConstantsKt.UNSET);
                    } else {
                        min = Math.min(j4, str5.length());
                    }
                    if (arrayList.size() > 1) {
                        length = ((ubk) a7hVar.b).j(a7hVar, (ndl) arrayList.get(1)).zzd().doubleValue();
                    } else {
                        length = str5.length();
                    }
                    double j5 = fgn.j(length);
                    if (j5 < ConstantsKt.UNSET) {
                        min2 = Math.max(str5.length() + j5, ConstantsKt.UNSET);
                    } else {
                        min2 = Math.min(j5, str5.length());
                    }
                    int i7 = (int) min;
                    return new del(str5.substring(i7, Math.max(0, ((int) min2) - i7) + i7));
                }
                dmk.v("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    fgn.e(2, "split", arrayList);
                    if (str5.length() == 0) {
                        return new h8l(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String zzc2 = ((ubk) a7hVar.b).j(a7hVar, (ndl) arrayList.get(0)).zzc();
                        if (arrayList.size() > 1) {
                            j2 = fgn.i(((ubk) a7hVar.b).j(a7hVar, (ndl) arrayList.get(1)).zzd().doubleValue()) & 4294967295L;
                        } else {
                            j2 = 2147483647L;
                        }
                        if (j2 == 0) {
                            return new h8l();
                        }
                        String[] split = str5.split(Pattern.quote(zzc2), ((int) j2) + 1);
                        int length3 = split.length;
                        if (zzc2.isEmpty() && length3 > 0) {
                            boolean isEmpty = split[0].isEmpty();
                            i2 = length3 - 1;
                            i3 = isEmpty;
                            z = isEmpty;
                            break;
                        }
                        i2 = length3;
                        i3 = z;
                        if (length3 > j2) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList2.add(new del(split[i3]));
                            i3++;
                        }
                    }
                    return new h8l(arrayList2);
                }
                dmk.v("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    fgn.e(2, "substring", arrayList);
                    if (!arrayList.isEmpty()) {
                        i4 = (int) fgn.j(((ubk) a7hVar.b).j(a7hVar, (ndl) arrayList.get(0)).zzd().doubleValue());
                    } else {
                        i4 = 0;
                    }
                    if (arrayList.size() > 1) {
                        length2 = (int) fgn.j(((ubk) a7hVar.b).j(a7hVar, (ndl) arrayList.get(1)).zzd().doubleValue());
                    } else {
                        length2 = str5.length();
                    }
                    int min3 = Math.min(Math.max(i4, 0), str5.length());
                    int min4 = Math.min(Math.max(length2, 0), str5.length());
                    return new del(str5.substring(Math.min(min3, min4), Math.max(min3, min4)));
                }
                dmk.v("Command not supported");
                return null;
            case 1094496948:
                if (str.equals("replace")) {
                    fgn.e(2, "replace", arrayList);
                    boolean isEmpty2 = arrayList.isEmpty();
                    ndl ndlVar = ndl.e1;
                    if (!isEmpty2) {
                        str4 = ((ubk) a7hVar.b).j(a7hVar, (ndl) arrayList.get(0)).zzc();
                        if (arrayList.size() > 1) {
                            ndlVar = ((ubk) a7hVar.b).j(a7hVar, (ndl) arrayList.get(1));
                        }
                    }
                    String str8 = str4;
                    int indexOf = str5.indexOf(str8);
                    if (indexOf >= 0) {
                        if (ndlVar instanceof lbl) {
                            ndlVar = ((lbl) ndlVar).e(a7hVar, Arrays.asList(new del(str8), new pal(Double.valueOf(indexOf)), this));
                        }
                        String substring = str5.substring(0, indexOf);
                        String zzc3 = ndlVar.zzc();
                        String substring2 = str5.substring(str8.length() + indexOf);
                        return new del(ix2.p(new StringBuilder(substring.length() + String.valueOf(zzc3).length() + substring2.length()), substring, zzc3, substring2));
                    }
                    return this;
                }
                dmk.v("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    fgn.e(2, "indexOf", arrayList);
                    if (arrayList.size() <= 0) {
                        a7hVar2 = a7hVar;
                    } else {
                        a7hVar2 = a7hVar;
                        str4 = ((ubk) a7hVar2.b).j(a7hVar2, (ndl) arrayList.get(0)).zzc();
                    }
                    String str9 = str4;
                    if (arrayList.size() < 2) {
                        doubleValue2 = 0.0d;
                    } else {
                        doubleValue2 = ((ubk) a7hVar2.b).j(a7hVar2, (ndl) arrayList.get(1)).zzd().doubleValue();
                    }
                    return new pal(Double.valueOf(str5.indexOf(str9, (int) fgn.j(doubleValue2))));
                }
                dmk.v("Command not supported");
                return null;
            default:
                dmk.v("Command not supported");
                return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof del)) {
            return false;
        }
        return this.a.equals(((del) obj).a);
    }

    @Override // defpackage.ndl
    public final ndl h() {
        return new del(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new wdl(this, 1);
    }

    public final String toString() {
        String str = this.a;
        return ix2.p(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }

    @Override // defpackage.ndl
    public final String zzc() {
        return this.a;
    }

    @Override // defpackage.ndl
    public final Double zzd() {
        String str = this.a;
        if (!str.isEmpty()) {
            try {
                return Double.valueOf(str);
            } catch (NumberFormatException unused) {
                return Double.valueOf(Double.NaN);
            }
        }
        return Double.valueOf(ConstantsKt.UNSET);
    }

    @Override // defpackage.ndl
    public final Boolean zze() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    @Override // defpackage.ndl
    public final Iterator zzf() {
        return new wdl(this, 0);
    }
}
