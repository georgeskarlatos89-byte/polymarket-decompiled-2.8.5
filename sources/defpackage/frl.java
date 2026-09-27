package defpackage;

import com.checkout.components.wallet.BuildConfig;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class frl implements xic {
    public static final String[] a = {BuildConfig.FLAVOR, "accelerate", "decelerate", "linear"};

    public static ArrayList a(CharSequence charSequence) {
        charSequence.getClass();
        ArrayList arrayList = new ArrayList();
        int length = charSequence.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i2) == '|') {
                int i3 = i2 - 1;
                if (i3 < 0) {
                    i3 = 0;
                }
                if (charSequence.charAt(i3) != '\\') {
                    arrayList.add(charSequence.subSequence(i, i2).toString());
                    i = i2 + 1;
                }
            }
        }
        arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
        return arrayList;
    }
}
