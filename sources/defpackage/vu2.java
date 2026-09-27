package defpackage;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class vu2 {
    public static final WeakHashMap a = new WeakHashMap();

    public static String a(int i, Locale locale, int i2) {
        int i3;
        if ((i2 & 1) != 0) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        if ((i2 & 8) != 0) {
            locale = null;
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String str = i3 + ".40.false." + locale.toLanguageTag();
        WeakHashMap weakHashMap = a;
        Object obj = weakHashMap.get(str);
        Object obj2 = obj;
        if (obj == null) {
            NumberFormat integerInstance = NumberFormat.getIntegerInstance(locale);
            integerInstance.setGroupingUsed(false);
            integerInstance.setMinimumIntegerDigits(i3);
            integerInstance.setMaximumIntegerDigits(40);
            weakHashMap.put(str, integerInstance);
            obj2 = integerInstance;
        }
        return ((NumberFormat) obj2).format(Integer.valueOf(i));
    }
}
