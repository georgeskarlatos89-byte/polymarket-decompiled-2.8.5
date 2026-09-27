package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class tf0 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static kpb b(Configuration configuration) {
        return kpb.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(kpb kpbVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(kpbVar.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, kpb kpbVar) {
        configuration.setLocales(LocaleList.forLanguageTags(kpbVar.a.a.toLanguageTags()));
    }
}
