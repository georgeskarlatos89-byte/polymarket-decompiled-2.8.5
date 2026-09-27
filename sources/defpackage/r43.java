package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.polymarket.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class r43 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ r43[] $VALUES;
    public static final r43 AmericanExpress;
    private static final int CVC_COMMON_LENGTH = 3;
    public static final r43 CartesBancaires;
    public static final p43 Companion;
    public static final r43 DinersClub;
    public static final r43 Discover;
    public static final r43 Interac;
    public static final r43 JCB;
    public static final r43 MasterCard;
    public static final r43 UnionPay;
    public static final r43 Unknown;
    public static final r43 Visa;
    private static final List<r43> orderedBrands;
    private final String applicationIdentifierPrefix;
    private final String code;
    private final int cvcIcon;
    private final Set<Integer> cvcLength;
    private final int defaultMaxLength;
    private final String displayName;
    private final int errorIcon;
    private final int icon;
    private final Map<Integer, Pattern> partialPatterns;
    private final Pattern pattern;
    private final int renderingOrder;
    private final boolean shouldRender;
    private final Map<Pattern, Integer> variantMaxLength;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, p43] */
    static {
        r43 r43Var = new r43("Visa", 0, "visa", "Visa", R.drawable.stripe_ic_visa, null, 0, Pattern.compile("^(4)[0-9]*$"), c1c.b(new Pair(1, Pattern.compile("^4$"))), null, 1, "A000000003", 1656);
        Visa = r43Var;
        r43 r43Var2 = new r43("MasterCard", 1, "mastercard", "Mastercard", R.drawable.stripe_ic_mastercard, null, 0, Pattern.compile("^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$"), d1c.e(new Pair(1, Pattern.compile("^2|5|6$")), new Pair(2, Pattern.compile("^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$"))), null, 2, "A000000004", 1656);
        MasterCard = r43Var2;
        r43 r43Var3 = new r43("AmericanExpress", 2, "amex", "American Express", R.drawable.stripe_ic_amex, ArraysKt.l0(new Integer[]{3, 4}), 15, Pattern.compile("^(34|37)[0-9]*$"), c1c.b(new Pair(1, Pattern.compile("^3$"))), null, 3, "A000000025", 1552);
        AmericanExpress = r43Var3;
        r43 r43Var4 = new r43("Discover", 3, "discover", "Discover", R.drawable.stripe_ic_discover, null, 0, Pattern.compile("^(60|64|65)[0-9]*$"), c1c.b(new Pair(1, Pattern.compile("^6$"))), null, 4, "A000000152", 1656);
        Discover = r43Var4;
        r43 r43Var5 = new r43("JCB", 4, "jcb", "JCB", R.drawable.stripe_ic_jcb, null, 0, Pattern.compile("^(352[89]|35[3-8][0-9])[0-9]*$"), d1c.e(new Pair(1, Pattern.compile("^3$")), new Pair(2, Pattern.compile("^(35)$")), new Pair(3, Pattern.compile("^(35[2-8])$"))), null, 5, "A000000065", 1656);
        JCB = r43Var5;
        r43 r43Var6 = new r43("DinersClub", 5, "diners", "Diners Club", R.drawable.stripe_ic_diners, null, 16, Pattern.compile("^(36|30|38|39)[0-9]*$"), c1c.b(new Pair(1, Pattern.compile("^3$"))), c1c.b(new Pair(Pattern.compile("^(36)[0-9]*$"), 14)), 6, "A000000152", 1080);
        DinersClub = r43Var6;
        r43 r43Var7 = new r43("UnionPay", 6, "unionpay", "UnionPay", R.drawable.stripe_ic_unionpay, null, 0, Pattern.compile("^(62|81)[0-9]*$"), c1c.b(new Pair(1, Pattern.compile("^6|8$"))), null, 7, "A000000333", 1656);
        UnionPay = r43Var7;
        r43 r43Var8 = new r43("CartesBancaires", 7, "cartes_bancaires", "Cartes Bancaires", R.drawable.stripe_ic_cartes_bancaires, null, 0, Pattern.compile("(^(4)[0-9]*) |^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$"), d1c.e(new Pair(1, Pattern.compile("^4$")), new Pair(2, Pattern.compile("^2|5|6$")), new Pair(3, Pattern.compile("^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$"))), null, 8, null, 4728);
        CartesBancaires = r43Var8;
        r43 r43Var9 = new r43("Interac", 8, "interac", "Interac", R.drawable.stripe_ic_interac, null, 0, Pattern.compile("^(4506|4519|4724|4536|500|5510|629449)[0-9]*$"), d1c.e(new Pair(1, Pattern.compile("^(4|5|6)$")), new Pair(2, Pattern.compile("^(45|50|55|62)$")), new Pair(3, Pattern.compile("^(450|451|472|453|500|551|629)$")), new Pair(4, Pattern.compile("^(4506|4519|4724|4536|5510|6294)$")), new Pair(5, Pattern.compile("^(62944)$")), new Pair(6, Pattern.compile("^(629449)$"))), null, 9, null, 4728);
        Interac = r43Var9;
        Set l0 = ArraysKt.l0(new Integer[]{3, 4});
        zc7 zc7Var = zc7.a;
        zc7Var.getClass();
        r43 r43Var10 = new r43("Unknown", 9, "unknown", "Unknown", R.drawable.stripe_ic_unknown, l0, 0, null, zc7Var, null, -1, null, 5848);
        Unknown = r43Var10;
        r43[] r43VarArr = {r43Var, r43Var2, r43Var3, r43Var4, r43Var5, r43Var6, r43Var7, r43Var8, r43Var9, r43Var10};
        $VALUES = r43VarArr;
        wg7 wg7Var = new wg7(r43VarArr);
        $ENTRIES = wg7Var;
        Companion = new Object();
        ArrayList arrayList = new ArrayList();
        i3 i3Var = new i3(wg7Var, 0);
        while (i3Var.hasNext()) {
            Object next = i3Var.next();
            if (((r43) next).shouldRender) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (((r43) next2).renderingOrder > 0) {
                arrayList2.add(next2);
            }
        }
        orderedBrands = CollectionsKt.z0(arrayList2, new y36(21));
    }

    public r43(String str, int i, String str2, String str3, int i2, Set set, int i3, Pattern pattern, Map map, Map map2, int i4, String str4, int i5) {
        int i6;
        Pattern pattern2;
        Map map3;
        boolean z;
        if ((i5 & 8) != 0) {
            i6 = R.drawable.stripe_ic_cvc;
        } else {
            i6 = R.drawable.stripe_ic_cvc_amex;
        }
        set = (i5 & 32) != 0 ? vzg.b(3) : set;
        i3 = (i5 & 64) != 0 ? 16 : i3;
        if ((i5 & 128) != 0) {
            pattern2 = null;
        } else {
            pattern2 = pattern;
        }
        if ((i5 & Barcode.FORMAT_UPC_A) != 0) {
            map3 = zc7.a;
            map3.getClass();
        } else {
            map3 = map2;
        }
        if ((i5 & Barcode.FORMAT_UPC_E) != 0) {
            z = true;
        } else {
            z = false;
        }
        String str5 = (i5 & 4096) == 0 ? str4 : null;
        this.code = str2;
        this.displayName = str3;
        this.icon = i2;
        this.cvcIcon = i6;
        this.errorIcon = R.drawable.stripe_ic_error;
        this.cvcLength = set;
        this.defaultMaxLength = i3;
        this.pattern = pattern2;
        this.partialPatterns = map;
        this.variantMaxLength = map3;
        this.shouldRender = z;
        this.renderingOrder = i4;
        this.applicationIdentifierPrefix = str5;
    }

    public static final /* synthetic */ String a(r43 r43Var) {
        return r43Var.applicationIdentifierPrefix;
    }

    public static final /* synthetic */ List b() {
        return orderedBrands;
    }

    public static final /* synthetic */ int c(r43 r43Var) {
        return r43Var.renderingOrder;
    }

    public static final /* synthetic */ boolean d(r43 r43Var) {
        return r43Var.shouldRender;
    }

    public static ug7 j() {
        return $ENTRIES;
    }

    public static r43 valueOf(String str) {
        return (r43) Enum.valueOf(r43.class, str);
    }

    public static r43[] values() {
        return (r43[]) $VALUES.clone();
    }

    public final int e() {
        switch (q43.a[ordinal()]) {
            case 1:
                return R.drawable.stripe_ic_visa_unpadded;
            case 2:
                return R.drawable.stripe_ic_amex_unpadded;
            case 3:
                return R.drawable.stripe_ic_discover_unpadded;
            case 4:
                return R.drawable.stripe_ic_jcb_unpadded;
            case 5:
                return R.drawable.stripe_ic_diners_unpadded;
            case 6:
                return R.drawable.stripe_ic_mastercard_unpadded;
            case 7:
                return R.drawable.stripe_ic_unionpay_unpadded;
            case 8:
                return R.drawable.stripe_ic_cartes_bancaires_unpadded;
            case 9:
                return R.drawable.stripe_ic_interac_unpadded;
            case 10:
                return R.drawable.stripe_ic_unknown_brand_unpadded;
            default:
                dmk.a();
                return 0;
        }
    }

    public final String f() {
        return this.code;
    }

    public final int g() {
        return this.cvcIcon;
    }

    public final Set h() {
        return this.cvcLength;
    }

    public final String i() {
        return this.displayName;
    }

    public final int k() {
        return this.errorIcon;
    }

    public final int m() {
        return this.icon;
    }

    public final int n() {
        Integer num = (Integer) CollectionsKt.W(this.cvcLength);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    public final int o(String str) {
        Object obj;
        str.getClass();
        k73 k73Var = new k73(str);
        Iterator<T> it = this.variantMaxLength.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Pattern) ((Map.Entry) obj).getKey()).matcher(k73Var.d).matches()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return ((Number) entry.getValue()).intValue();
        }
        return this.defaultMaxLength;
    }

    public final Pattern p(String str) {
        Pattern pattern = this.partialPatterns.get(Integer.valueOf(str.length()));
        if (pattern == null) {
            return this.pattern;
        }
        return pattern;
    }

    public final boolean q(String str) {
        int i;
        String obj;
        if (str != null && (obj = StringsKt.s0(str).toString()) != null) {
            i = obj.length();
        } else {
            i = 0;
        }
        if (n() != i) {
            return false;
        }
        return true;
    }
}
