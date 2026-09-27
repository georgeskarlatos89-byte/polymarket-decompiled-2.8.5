package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zm1 {
    public static final vwb T = new vwb(25);
    public final String A;
    public final String B;
    public final String C;
    public final Integer D;
    public final String E;
    public final String F;
    public final boolean G;
    public final String H;
    public final long I;
    public final long J;
    public final String K;
    public final ArrayList L;
    public final int M;
    public final ArrayList N;
    public boolean O;
    public final ArrayList P;
    public final HashMap Q;
    public final String R;
    public final String S;
    public final sl1 a;
    public final Bundle b;
    public final Bundle c;
    public final Map d;
    public final Context e;
    public final Integer f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final String k;
    public final String l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Long p;
    public final Integer q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    /* JADX WARN: Can't wrap try/catch for region: R(48:1|(1:3)(1:126)|4|(1:6)(1:125)|7|(4:9|(7:12|13|14|16|(3:21|22|23)|24|10)|28|29)|30|(1:32)(1:124)|33|(2:34|35)|(32:37|38|(1:120)(1:42)|43|44|45|(1:49)|51|52|(1:118)|56|(2:57|(1:1)(1:61))|63|64|65|(1:111)(1:69)|70|71|(2:72|(1:1)(1:76))|78|(2:79|(1:1)(1:83))|85|(2:86|(1:1)(1:90))|92|(1:94)(1:106)|(1:96)|97|(1:99)|100|(1:102)|103|104)|122|38|(1:40)|120|43|44|45|(2:47|49)|51|52|(1:54)|114|116|118|56|(3:57|(2:59|62)(1:113)|61)|63|64|65|(1:67)|111|70|71|(3:72|(2:74|77)(1:109)|76)|78|(3:79|(2:81|84)(1:108)|83)|85|(3:86|(2:88|91)(1:107)|90)|92|(0)(0)|(0)|97|(0)|100|(0)|103|104) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0246, code lost:
    
        r1 = "";
        defpackage.b69.h(r9, null, null, false, new defpackage.sm1(1, r7), 7);
        r11 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x019f, code lost:
    
        r8 = false;
        defpackage.b69.h(r9, null, null, false, new defpackage.sm1(2, r7), 7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e9  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [int] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [int] */
    /* JADX WARN: Type inference failed for: r11v16, types: [int] */
    /* JADX WARN: Type inference failed for: r11v22, types: [int] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [int] */
    /* JADX WARN: Type inference failed for: r12v10, types: [um1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zm1(Context context, sl1 sl1Var, Bundle bundle, Bundle bundle2) {
        Bundle bundle3;
        Bundle bundle4;
        Context context2;
        Long l;
        boolean z;
        boolean z2;
        String w;
        String str;
        ?? r11;
        String t;
        String str2;
        ?? r112;
        String t2;
        ArrayList arrayList;
        HashMap hashMap;
        ?? r113;
        String t3;
        ?? r114;
        String t4;
        Integer z3;
        boolean z4;
        boolean z5;
        Object obj;
        String string;
        this.a = sl1Var;
        if (bundle == null) {
            bundle3 = new Bundle();
        } else {
            bundle3 = bundle;
        }
        this.b = bundle3;
        if (bundle2 == null) {
            bundle4 = new Bundle();
        } else {
            bundle4 = bundle2;
        }
        this.c = bundle4;
        Map linkedHashMap = new LinkedHashMap();
        if (bundle2 != null) {
            Set<String> keySet = bundle2.keySet();
            keySet.getClass();
            for (String str3 : keySet) {
                try {
                    Object obj2 = bundle2.get(str3);
                    if (obj2 != null && (obj2 instanceof String)) {
                        linkedHashMap.put(str3, obj2);
                    }
                } catch (Exception unused) {
                }
            }
            linkedHashMap = Collections.unmodifiableMap(linkedHashMap);
            linkedHashMap.getClass();
        }
        this.d = linkedHashMap;
        Integer num = null;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.e = context2;
        this.I = 5L;
        this.J = 120L;
        ArrayList arrayList2 = new ArrayList();
        this.L = arrayList2;
        this.N = new ArrayList();
        this.P = new ArrayList();
        this.Q = new HashMap();
        Bundle bundle5 = this.b;
        vwb vwbVar = T;
        this.f = vwbVar.z(bundle5, "nd");
        this.g = bundle5.containsKey("ab_c");
        this.l = vwbVar.x(bundle5, "ab_ct");
        this.m = vwbVar.z(bundle5, "ab_vs");
        this.n = vwbVar.z(bundle5, "ab_bc");
        this.j = vwbVar.x(bundle5, "ab_pn");
        this.o = vwbVar.z(bundle5, "n");
        try {
        } catch (Exception unused2) {
            b69.h(vwbVar, null, null, false, new sm1(3, bundle5), 7);
        }
        if (bundle5.containsKey("braze_push_received_timestamp")) {
            l = Long.valueOf(bundle5.getLong("braze_push_received_timestamp"));
            this.p = l;
            this.h = bundle5.containsKey("ab_iip");
            this.i = bundle5.containsKey("ab_cp");
            this.q = vwbVar.z(bundle5, "p");
            this.r = vwbVar.y(bundle5, "ab_push_fetch_test_triggers_key");
            this.s = vwbVar.y(bundle5, "br_ffr");
            this.t = vwbVar.y(bundle5, "br_br");
            if (bundle5.containsKey("appboy_uninstall_tracking") && !this.c.containsKey("appboy_uninstall_tracking")) {
                z = false;
            } else {
                z = true;
            }
            this.u = z;
            vwbVar.x(bundle5, "uri");
            this.H = vwbVar.x(bundle5, "cid");
            this.v = vwbVar.x(bundle5, "br_p_id");
            vwbVar.y(bundle5, "ab_use_webview");
            this.w = vwbVar.x(bundle5, "ab_cd");
            this.x = vwbVar.x(bundle5, "ab_cd_uid");
            this.k = vwbVar.w(bundle5, "ab_nc");
            this.y = vwbVar.x(bundle5, "t");
            this.z = vwbVar.x(bundle5, "a");
            this.A = vwbVar.x(bundle5, "ab_li");
            this.B = vwbVar.x(bundle5, "sd");
            this.C = vwbVar.x(bundle5, "s");
            if (bundle5.containsKey("ac") && (string = bundle5.getString("ac")) != null) {
                num = Integer.valueOf((int) Long.parseLong(string));
            }
            z2 = false;
            this.D = num;
            this.E = vwbVar.x(bundle5, "ab_bs");
            this.F = vwbVar.x(bundle5, "ab_bt");
            w = vwbVar.w(bundle5, "ab_iu");
            this.K = w;
            if ((w != null || StringsKt.T(w)) && (str = (String) this.d.get("appboy_image_url")) != null && !StringsKt.T(str)) {
                this.K = str;
            }
            arrayList2.clear();
            r11 = z2;
            while (true) {
                t = vwb.t(r11, bundle5, "ab_a*_a", "");
                if (t != null || StringsKt.T(t)) {
                    break;
                }
                ?? obj3 = new Object();
                obj3.a = r11;
                obj3.b = vwb.t(r11, bundle5, "ab_a*_a", "");
                obj3.c = vwb.t(r11, bundle5, "ab_a*_id", "");
                obj3.d = vwb.t(r11, bundle5, "ab_a*_uri", "");
                obj3.e = vwb.t(r11, bundle5, "ab_a*_use_webview", "");
                obj3.f = vwb.t(r11, bundle5, "ab_a*_t", "");
                arrayList2.add(obj3);
                r11++;
            }
            if (!bundle5.containsKey("braze_story_index") && (obj = bundle5.get("braze_story_index")) != null) {
                z5 = Integer.parseInt(obj.toString());
            } else {
                z5 = z2;
            }
            str2 = "";
            ?? r115 = z5;
            this.M = r115;
            r112 = z2;
            while (true) {
                t2 = vwb.t(r112, bundle5, "ab_c*_i", str2);
                if (t2 != null || StringsKt.T(t2)) {
                    break;
                }
                this.N.add(new ym1(r112, bundle5));
                r112++;
            }
            this.O = bundle5.getBoolean("braze_story_newly_received", z2);
            this.R = vwbVar.x(bundle5, "ab_c_si");
            this.S = vwbVar.x(bundle5, "ab_c_rpi");
            arrayList = this.P;
            arrayList.clear();
            hashMap = this.Q;
            hashMap.clear();
            r113 = z2;
            while (true) {
                t3 = vwb.t(r113, bundle5, "ab_c_mt*", str2);
                if (t3 != null || StringsKt.T(t3)) {
                    break;
                }
                arrayList.add(new wm1(r113, bundle5));
                r113++;
            }
            r114 = z2;
            while (true) {
                t4 = vwb.t(r114, bundle5, "ab_c_pi*", str2);
                if (t4 != null || StringsKt.T(t4)) {
                    break;
                }
                xm1 xm1Var = new xm1(r114, bundle5);
                hashMap.put(xm1Var.a, xm1Var);
                r114++;
            }
            z3 = vwbVar.z(bundle5, "bz_p_e");
            if (z3 == null) {
                z4 = z3.intValue();
            } else {
                z4 = z2;
            }
            this.G = !z4 ? z2 : true;
            Long A = vwbVar.A(bundle5, "bz_p_fn");
            this.I = A != null ? A.longValue() : 5L;
            Long A2 = vwbVar.A(bundle5, "bz_p_fx");
            this.J = A2 != null ? A2.longValue() : 120L;
        }
        l = null;
        this.p = l;
        this.h = bundle5.containsKey("ab_iip");
        this.i = bundle5.containsKey("ab_cp");
        this.q = vwbVar.z(bundle5, "p");
        this.r = vwbVar.y(bundle5, "ab_push_fetch_test_triggers_key");
        this.s = vwbVar.y(bundle5, "br_ffr");
        this.t = vwbVar.y(bundle5, "br_br");
        if (bundle5.containsKey("appboy_uninstall_tracking")) {
        }
        z = true;
        this.u = z;
        vwbVar.x(bundle5, "uri");
        this.H = vwbVar.x(bundle5, "cid");
        this.v = vwbVar.x(bundle5, "br_p_id");
        vwbVar.y(bundle5, "ab_use_webview");
        this.w = vwbVar.x(bundle5, "ab_cd");
        this.x = vwbVar.x(bundle5, "ab_cd_uid");
        this.k = vwbVar.w(bundle5, "ab_nc");
        this.y = vwbVar.x(bundle5, "t");
        this.z = vwbVar.x(bundle5, "a");
        this.A = vwbVar.x(bundle5, "ab_li");
        this.B = vwbVar.x(bundle5, "sd");
        this.C = vwbVar.x(bundle5, "s");
        if (bundle5.containsKey("ac")) {
            num = Integer.valueOf((int) Long.parseLong(string));
        }
        z2 = false;
        this.D = num;
        this.E = vwbVar.x(bundle5, "ab_bs");
        this.F = vwbVar.x(bundle5, "ab_bt");
        w = vwbVar.w(bundle5, "ab_iu");
        this.K = w;
        if (w != null) {
        }
        this.K = str;
        arrayList2.clear();
        r11 = z2;
        while (true) {
            t = vwb.t(r11, bundle5, "ab_a*_a", "");
            if (t != null) {
                break;
            } else {
                break;
            }
            ?? obj32 = new Object();
            obj32.a = r11;
            obj32.b = vwb.t(r11, bundle5, "ab_a*_a", "");
            obj32.c = vwb.t(r11, bundle5, "ab_a*_id", "");
            obj32.d = vwb.t(r11, bundle5, "ab_a*_uri", "");
            obj32.e = vwb.t(r11, bundle5, "ab_a*_use_webview", "");
            obj32.f = vwb.t(r11, bundle5, "ab_a*_t", "");
            arrayList2.add(obj32);
            r11++;
        }
        if (!bundle5.containsKey("braze_story_index")) {
        }
        z5 = z2;
        str2 = "";
        ?? r1152 = z5;
        this.M = r1152;
        r112 = z2;
        while (true) {
            t2 = vwb.t(r112, bundle5, "ab_c*_i", str2);
            if (t2 != null) {
                break;
            } else {
                break;
            }
            this.N.add(new ym1(r112, bundle5));
            r112++;
        }
        this.O = bundle5.getBoolean("braze_story_newly_received", z2);
        this.R = vwbVar.x(bundle5, "ab_c_si");
        this.S = vwbVar.x(bundle5, "ab_c_rpi");
        arrayList = this.P;
        arrayList.clear();
        hashMap = this.Q;
        hashMap.clear();
        r113 = z2;
        while (true) {
            t3 = vwb.t(r113, bundle5, "ab_c_mt*", str2);
            if (t3 != null) {
                break;
            } else {
                break;
            }
            arrayList.add(new wm1(r113, bundle5));
            r113++;
        }
        r114 = z2;
        while (true) {
            t4 = vwb.t(r114, bundle5, "ab_c_pi*", str2);
            if (t4 != null) {
                break;
            } else {
                break;
            }
            xm1 xm1Var2 = new xm1(r114, bundle5);
            hashMap.put(xm1Var2.a, xm1Var2);
            r114++;
        }
        z3 = vwbVar.z(bundle5, "bz_p_e");
        if (z3 == null) {
        }
        this.G = !z4 ? z2 : true;
        Long A3 = vwbVar.A(bundle5, "bz_p_fn");
        this.I = A3 != null ? A3.longValue() : 5L;
        Long A22 = vwbVar.A(bundle5, "bz_p_fx");
        this.J = A22 != null ? A22.longValue() : 120L;
    }

    public final String toString() {
        return vwb.C(this.f, "PushDuration") + vwb.C(Boolean.valueOf(this.g), "IsPushStory") + vwb.C(Boolean.valueOf(this.h), "IsInlineImagePush") + vwb.C(Boolean.valueOf(this.i), "IsConversationalPush") + vwb.C(this.j, "PublicNotificationExtras") + vwb.C(this.k, "NotificationChannelId") + vwb.C(this.l, "NotificationCategory") + vwb.C(this.m, "NotificationVisibility") + vwb.C(this.n, "NotificationBadgeNumber") + vwb.C(this.o, "CustomNotificationId") + vwb.C(this.p, "NotificationReceivedTimestampMillis") + vwb.C(this.w, "ContentCardSyncData") + vwb.C(this.x, "ContentCardSyncUserId") + vwb.C(this.y, "TitleText") + vwb.C(this.z, "ContentText") + vwb.C(this.A, "LargeIcon") + vwb.C(this.B, "NotificationSound") + vwb.C(this.C, "SummaryText") + vwb.C(this.D, "AccentColor") + vwb.C(this.E, "BigSummaryText") + vwb.C(this.F, "BigTitleText") + vwb.C(this.K, "BigImageUrl") + vwb.C(this.L, "ActionButtons") + vwb.C(Integer.valueOf(this.M), "PushStoryPageIndex") + vwb.C(this.N, "PushStoryPages") + vwb.C(this.P, "ConversationMessages") + vwb.C(this.Q, "ConversationPersonMap") + vwb.C(Boolean.valueOf(this.G), "PushDeliveryEnabled") + vwb.C(this.v, "PushUniqueId") + vwb.C(this.R, "ConversationShortcutId");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zm1(Bundle bundle, Context context, sl1 sl1Var, int i) {
        this(context, (i & 8) != 0 ? null : sl1Var, bundle, r0);
        Bundle bundle2;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else if (bundle.containsKey("braze_story_newly_received") && !bundle.getBoolean("braze_story_newly_received")) {
            bundle2 = bundle.getBundle("extra");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
        } else if (my4.a) {
            bundle2 = new Bundle(bundle);
        } else {
            Object obj = bundle.get("extra");
            if (obj instanceof String) {
                bundle2 = qga.h((String) obj);
            } else if (obj instanceof Bundle) {
                bundle2 = (Bundle) obj;
            } else {
                bundle2 = new Bundle();
            }
        }
    }
}
