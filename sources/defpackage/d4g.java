package defpackage;

import android.content.Context;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class d4g {
    public final Context a;
    public final Map b;

    public d4g(Map map, Context context) {
        context.getClass();
        this.a = context;
        this.b = map;
    }

    public final String a(int i) {
        return b(i, "");
    }

    public final String b(int i, String... strArr) {
        String str;
        String str2;
        ComponentTranslationKey c = c(i);
        if (c != null) {
            Map map = this.b;
            if (map != null && (str2 = (String) map.get(c)) != null) {
                Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
                str = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
            } else {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String string = this.a.getString(i, Arrays.copyOf(strArr, strArr.length));
        string.getClass();
        return string;
    }

    public abstract ComponentTranslationKey c(int i);
}
