package defpackage;

import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class wf5 {
    public static final Map a = c1c.b(new Pair(ArraysKt.l0(new String[]{"UGX", "AFN", "ALL", "AMD", "COP", "IDR", "ISK", "PKR", "LBP", "MMK", "LAK", "RSD", "HUF"}), 2));

    public static int a(Currency currency) {
        currency.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : a.entrySet()) {
            Set set = (Set) entry.getKey();
            String currencyCode = currency.getCurrencyCode();
            currencyCode.getClass();
            String upperCase = currencyCode.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (set.contains(upperCase)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) ((Map.Entry) it.next()).getValue()).intValue()));
        }
        Integer num = (Integer) CollectionsKt.firstOrNull(arrayList);
        if (num != null) {
            return num.intValue();
        }
        return currency.getDefaultFractionDigits();
    }
}
