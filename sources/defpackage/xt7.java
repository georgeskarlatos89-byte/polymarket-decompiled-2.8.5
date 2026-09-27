package defpackage;

import com.checkout.components.interfaces.localisation.Locale;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class xt7 {
    public static final Locale a(com.checkout.components.interfaces.localisation.Locale locale) {
        locale.getClass();
        if (Intrinsics.areEqual(locale, Locale.Ar.INSTANCE)) {
            return new java.util.Locale("ar");
        }
        if (Intrinsics.areEqual(locale, Locale.Da.INSTANCE)) {
            return new java.util.Locale("da");
        }
        if (Intrinsics.areEqual(locale, Locale.De.INSTANCE)) {
            return new java.util.Locale("de");
        }
        if (Intrinsics.areEqual(locale, Locale.El.INSTANCE)) {
            return new java.util.Locale("el");
        }
        if (Intrinsics.areEqual(locale, Locale.En.INSTANCE)) {
            return new java.util.Locale("en");
        }
        if (Intrinsics.areEqual(locale, Locale.Es.INSTANCE)) {
            return new java.util.Locale("es");
        }
        if (Intrinsics.areEqual(locale, Locale.Fi.INSTANCE)) {
            return new java.util.Locale("fi");
        }
        if (Intrinsics.areEqual(locale, Locale.Fil.INSTANCE)) {
            return new java.util.Locale("fil");
        }
        if (Intrinsics.areEqual(locale, Locale.Fr.INSTANCE)) {
            return new java.util.Locale("fr");
        }
        if (Intrinsics.areEqual(locale, Locale.Hi.INSTANCE)) {
            return new java.util.Locale("hi");
        }
        if (Intrinsics.areEqual(locale, Locale.Id.INSTANCE)) {
            return new java.util.Locale("in");
        }
        if (Intrinsics.areEqual(locale, Locale.It.INSTANCE)) {
            return new java.util.Locale("it");
        }
        if (Intrinsics.areEqual(locale, Locale.Ja.INSTANCE)) {
            return new java.util.Locale("ja");
        }
        if (Intrinsics.areEqual(locale, Locale.Ms.INSTANCE)) {
            return new java.util.Locale("ms");
        }
        if (Intrinsics.areEqual(locale, Locale.Nb.INSTANCE)) {
            return new java.util.Locale("nb");
        }
        if (Intrinsics.areEqual(locale, Locale.Nl.INSTANCE)) {
            return new java.util.Locale("nl");
        }
        if (Intrinsics.areEqual(locale, Locale.Pt.INSTANCE)) {
            return new java.util.Locale("pt");
        }
        if (Intrinsics.areEqual(locale, Locale.Sv.INSTANCE)) {
            return new java.util.Locale("sv");
        }
        if (Intrinsics.areEqual(locale, Locale.Th.INSTANCE)) {
            return new java.util.Locale("th");
        }
        if (Intrinsics.areEqual(locale, Locale.Vi.INSTANCE)) {
            return new java.util.Locale("vi");
        }
        if (Intrinsics.areEqual(locale, Locale.Zh.INSTANCE)) {
            return new java.util.Locale("zh");
        }
        if (Intrinsics.areEqual(locale, Locale.ZhHk.INSTANCE)) {
            return new java.util.Locale("zh", "hk");
        }
        if (Intrinsics.areEqual(locale, Locale.ZhTw.INSTANCE)) {
            return new java.util.Locale("zh", "tw");
        }
        if (locale instanceof Locale.Customised) {
            return a(iy4.a);
        }
        dmk.a();
        return null;
    }
}
