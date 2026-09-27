package defpackage;

import java.util.Locale;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class r95 {
    public static s95 a(String str) {
        str.getClass();
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return new s95(upperCase);
    }

    public final KSerializer serializer() {
        return q95.a;
    }
}
