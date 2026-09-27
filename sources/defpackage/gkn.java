package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class gkn {
    public static final String a(long j, String str, Locale locale, LinkedHashMap linkedHashMap) {
        StringBuilder t = sv6.t("S:", str);
        t.append(locale.toLanguageTag());
        String sb = t.toString();
        Object obj = linkedHashMap.get(sb);
        Object obj2 = obj;
        if (obj == null) {
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            instanceForSkeleton.setTimeZone(TimeZone.GMT_ZONE);
            linkedHashMap.put(sb, instanceForSkeleton);
            obj2 = instanceForSkeleton;
        }
        return ((DateFormat) obj2).format(new Date(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(jjc jjcVar, Function0 function0) {
        bgd bgdVar = jjcVar.g;
        if (bgdVar == null) {
            bgdVar = new bgd((agd) jjcVar);
            jjcVar.g = bgdVar;
        }
        gpd snapshotObserver = nj6.i(jjcVar).getSnapshotObserver();
        snapshotObserver.a.d(bgdVar, bgd.b, function0);
    }
}
