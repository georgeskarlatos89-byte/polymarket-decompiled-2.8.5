package bo.app;

import defpackage.c1c;
import defpackage.wg7;
import defpackage.yj9;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class r8 implements yj9 {
    public static final r8 A;
    public static final r8 B;
    public static final r8 C;
    public static final r8 D;
    public static final r8 E;
    public static final r8 F;
    public static final r8 G;
    public static final r8 H;
    public static final r8 I;
    public static final r8 J;
    public static final /* synthetic */ r8[] K;
    public static final q8 b;
    public static final LinkedHashMap c;
    public static final r8 d;
    public static final r8 e;
    public static final r8 f;
    public static final r8 g;
    public static final r8 h;
    public static final r8 i;
    public static final r8 j;
    public static final r8 k;
    public static final r8 l;
    public static final r8 m;
    public static final r8 n;
    public static final r8 o;
    public static final r8 p;
    public static final r8 q;
    public static final r8 r;
    public static final r8 s;
    public static final r8 t;
    public static final r8 u;
    public static final r8 v;
    public static final r8 w;
    public static final r8 x;
    public static final r8 y;
    public static final r8 z;
    public final String a;

    static {
        r8 r8Var = new r8("LOCATION_RECORDED", 0, "lr");
        d = r8Var;
        r8 r8Var2 = new r8("CUSTOM_EVENT", 1, "ce");
        e = r8Var2;
        r8 r8Var3 = new r8("PURCHASE", 2, "p");
        f = r8Var3;
        r8 r8Var4 = new r8("PUSH_STORY_PAGE_CLICK", 3, "cic");
        g = r8Var4;
        r8 r8Var5 = new r8("PUSH_CLICKED", 4, "pc");
        h = r8Var5;
        r8 r8Var6 = new r8("PUSH_ACTION_BUTTON_CLICKED", 5, "ca");
        i = r8Var6;
        r8 r8Var7 = new r8("INTERNAL", 6, "i");
        r8 r8Var8 = new r8("INTERNAL_ERROR", 7, "ie");
        j = r8Var8;
        r8 r8Var9 = new r8("GEOFENCE", 8, "g");
        k = r8Var9;
        r8 r8Var10 = new r8("CONTENT_CARDS_CLICK", 9, "ccc");
        l = r8Var10;
        r8 r8Var11 = new r8("CONTENT_CARDS_IMPRESSION", 10, "cci");
        m = r8Var11;
        r8 r8Var12 = new r8("CONTENT_CARDS_CONTROL_IMPRESSION", 11, "ccic");
        n = r8Var12;
        r8 r8Var13 = new r8("CONTENT_CARDS_DISMISS", 12, "ccd");
        o = r8Var13;
        r8 r8Var14 = new r8("INCREMENT", 13, "inc");
        p = r8Var14;
        r8 r8Var15 = new r8("ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", 14, "add");
        q = r8Var15;
        r8 r8Var16 = new r8("REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", 15, "rem");
        r = r8Var16;
        r8 r8Var17 = new r8("SET_CUSTOM_ATTRIBUTE_ARRAY", 16, "set");
        s = r8Var17;
        r8 r8Var18 = new r8("INAPP_MESSAGE_IMPRESSION", 17, "si");
        t = r8Var18;
        r8 r8Var19 = new r8("INAPP_MESSAGE_CONTROL_IMPRESSION", 18, "iec");
        u = r8Var19;
        r8 r8Var20 = new r8("INAPP_MESSAGE_CLICK", 19, "sc");
        v = r8Var20;
        r8 r8Var21 = new r8("INAPP_MESSAGE_BUTTON_CLICK", 20, "sbc");
        w = r8Var21;
        r8 r8Var22 = new r8("INAPP_MESSAGE_MESSAGE_EXTRAS", 21, "message_extras");
        r8 r8Var23 = new r8("USER_ALIAS", 22, "uae");
        x = r8Var23;
        r8 r8Var24 = new r8("SESSION_START", 23, "ss");
        y = r8Var24;
        r8 r8Var25 = new r8("SESSION_END", 24, "se");
        z = r8Var25;
        r8 r8Var26 = new r8("TEST_TYPE", 25, "tt");
        r8 r8Var27 = new r8("LOCATION_CUSTOM_ATTRIBUTE_ADD", 26, "lcaa");
        A = r8Var27;
        r8 r8Var28 = new r8("LOCATION_CUSTOM_ATTRIBUTE_REMOVE", 27, "lcar");
        B = r8Var28;
        r8 r8Var29 = new r8("NESTED_CUSTOM_ATTRIBUTE_MERGE", 28, "ncam");
        C = r8Var29;
        r8 r8Var30 = new r8("SUBSCRIPTION_GROUP_UPDATE", 29, "sgu");
        D = r8Var30;
        r8 r8Var31 = new r8("FEATURE_FLAG_IMPRESSION_EVENT", 30, "ffi");
        E = r8Var31;
        r8 r8Var32 = new r8("BANNER_IMPRESSION_EVENT", 31, "bi");
        F = r8Var32;
        r8 r8Var33 = new r8("BANNER_CLICK_EVENT", 32, "bc");
        G = r8Var33;
        r8 r8Var34 = new r8("BANNER_DISMISS_EVENT", 33, "bd");
        H = r8Var34;
        r8 r8Var35 = new r8("PUSH_DELIVERY_EVENT", 34, "pde");
        I = r8Var35;
        r8 r8Var36 = new r8("UNKNOWN", 35, "");
        J = r8Var36;
        r8[] r8VarArr = {r8Var, r8Var2, r8Var3, r8Var4, r8Var5, r8Var6, r8Var7, r8Var8, r8Var9, r8Var10, r8Var11, r8Var12, r8Var13, r8Var14, r8Var15, r8Var16, r8Var17, r8Var18, r8Var19, r8Var20, r8Var21, r8Var22, r8Var23, r8Var24, r8Var25, r8Var26, r8Var27, r8Var28, r8Var29, r8Var30, r8Var31, r8Var32, r8Var33, r8Var34, r8Var35, r8Var36};
        K = r8VarArr;
        wg7 wg7Var = new wg7(r8VarArr);
        b = new q8();
        int a = c1c.a(CollectionsKt.w(wg7Var));
        LinkedHashMap linkedHashMap = new LinkedHashMap(a < 16 ? 16 : a);
        defpackage.i3 i3Var = new defpackage.i3(wg7Var, 0);
        while (i3Var.hasNext()) {
            Object next = i3Var.next();
            linkedHashMap.put(((r8) next).a, next);
        }
        c = linkedHashMap;
    }

    public r8(String str, int i2, String str2) {
        this.a = str2;
    }

    public static r8 valueOf(String str) {
        return (r8) Enum.valueOf(r8.class, str);
    }

    public static r8[] values() {
        return (r8[]) K.clone();
    }

    @Override // defpackage.yj9
    public final Object forJsonPut() {
        return this.a;
    }
}
