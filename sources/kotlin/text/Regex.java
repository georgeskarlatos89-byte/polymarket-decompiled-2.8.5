package kotlin.text;

import defpackage.ace;
import defpackage.cwf;
import defpackage.dwf;
import defpackage.eb4;
import defpackage.ewf;
import defpackage.omf;
import defpackage.q7f;
import defpackage.xs8;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\rB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "pattern", "<init>", "(Ljava/lang/String;)V", "", MetricTracker.Object.INPUT, "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "b", "cwf", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Regex implements Serializable {
    public static final cwf b = new cwf(null);
    public final Pattern a;

    public Regex(String str, ewf ewfVar) {
        str.getClass();
        ewfVar.getClass();
        cwf cwfVar = b;
        int a = ewfVar.a();
        cwfVar.getClass();
        Pattern compile = Pattern.compile(str, (a & 2) != 0 ? a | 64 : a);
        compile.getClass();
        this.a = compile;
    }

    public static xs8 a(Regex regex, CharSequence charSequence) {
        regex.getClass();
        charSequence.getClass();
        if (charSequence.length() >= 0) {
            return new xs8(new q7f(9, regex, charSequence), dwf.f);
        }
        omf.e(charSequence.length(), ace.o(0, "Start index out of bounds: ", ", input length: "));
        return null;
    }

    public static MatchResult find$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        regex.getClass();
        charSequence.getClass();
        Matcher matcher = regex.a.matcher(charSequence);
        matcher.getClass();
        if (!matcher.find(i)) {
            return null;
        }
        return new b(matcher, charSequence);
    }

    public final b b(int i, String str) {
        str.getClass();
        Matcher region = this.a.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (region.lookingAt()) {
            return new b(region, str);
        }
        return null;
    }

    public final b c(String str) {
        str.getClass();
        Matcher matcher = this.a.matcher(str);
        matcher.getClass();
        if (!matcher.matches()) {
            return null;
        }
        return new b(matcher, str);
    }

    public final boolean d(CharSequence charSequence) {
        charSequence.getClass();
        return this.a.matcher(charSequence).matches();
    }

    public final String e(String str, Function1 function1) {
        str.getClass();
        function1.getClass();
        int i = 0;
        MatchResult find$default = find$default(this, str, 0, 2, null);
        if (find$default == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append((CharSequence) str, i, find$default.a().a);
            sb.append((CharSequence) function1.invoke(find$default));
            i = find$default.a().b + 1;
            find$default = find$default.next();
            if (i >= length) {
                break;
            }
        } while (find$default != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public final List f(CharSequence charSequence, int i) {
        charSequence.getClass();
        StringsKt__StringsKt.z(i);
        Matcher matcher = this.a.matcher(charSequence);
        if (i != 1 && matcher.find()) {
            int i2 = 10;
            if (i > 0 && i <= 10) {
                i2 = i;
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = i - 1;
            int i4 = 0;
            do {
                arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
                i4 = matcher.end();
                if (i3 >= 0 && arrayList.size() == i3) {
                    break;
                }
            } while (matcher.find());
            arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
            return arrayList;
        }
        return eb4.c(charSequence.toString());
    }

    public final String replace(CharSequence input, String replacement) {
        input.getClass();
        replacement.getClass();
        String replaceAll = this.a.matcher(input).replaceAll(replacement);
        replaceAll.getClass();
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.a.toString();
        pattern.getClass();
        return pattern;
    }

    public Regex(String str) {
        str.getClass();
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        compile.getClass();
        this.a = compile;
    }
}
