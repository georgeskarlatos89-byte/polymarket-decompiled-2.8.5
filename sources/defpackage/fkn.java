package defpackage;

import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class fkn {
    public static qqc a() {
        return new kvd(Unit.INSTANCE, vwb.l);
    }

    public static DateTimeFormatter b(String str, Locale locale, LinkedHashMap linkedHashMap) {
        StringBuilder t = sv6.t("P:", str);
        t.append(locale.toLanguageTag());
        String sb = t.toString();
        Object obj = linkedHashMap.get(sb);
        if (obj == null) {
            obj = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
            linkedHashMap.put(sb, obj);
        }
        obj.getClass();
        return (DateTimeFormatter) obj;
    }

    public static final void c(qqc qqcVar) {
        qqcVar.setValue(Unit.INSTANCE);
    }
}
