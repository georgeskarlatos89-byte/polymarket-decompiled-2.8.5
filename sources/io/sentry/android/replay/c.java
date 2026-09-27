package io.sentry.android.replay;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.st;
import defpackage.w4b;
import defpackage.xh6;
import io.getstream.chat.android.models.MessageType;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.p5;
import io.sentry.w3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class c implements w3 {
    public static final Lazy c = LazyKt.a(w4b.NONE, a.i);
    public static final HashSet d;
    public String a;
    public final Map b = Collections.synchronizedMap(new st(2));

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(Keys.KEY_STATUS_CODE);
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add("http.response_content_length");
        hashSet.add("http.request_content_length");
        d = hashSet;
    }

    public c(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setBeforeBreadcrumb(new io.sentry.internal.debugmeta.c(this, sentryAndroidOptions.getBeforeBreadcrumb(), false, 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    @Override // io.sentry.w3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.sentry.rrweb.b a(io.sentry.e eVar) {
        String str;
        p5 p5Var;
        String str2;
        Object obj;
        String str3;
        String str4;
        String str5;
        String str6;
        double longValue;
        double longValue2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (Intrinsics.areEqual(eVar.g, "http")) {
            Object obj2 = eVar.b().get("url");
            if (obj2 instanceof String) {
                str6 = (String) obj2;
            } else {
                str6 = null;
            }
            if (str6 == null || str6.length() == 0) {
                return null;
            }
            Map b = eVar.b();
            b.getClass();
            if (!b.containsKey("http.start_timestamp")) {
                return null;
            }
            Map b2 = eVar.b();
            b2.getClass();
            if (!b2.containsKey("http.end_timestamp")) {
                return null;
            }
            Object obj3 = eVar.b().get("http.start_timestamp");
            Object obj4 = eVar.b().get("http.end_timestamp");
            io.sentry.rrweb.l lVar = new io.sentry.rrweb.l();
            lVar.b = eVar.c().getTime();
            lVar.d = "resource.http";
            Object obj5 = eVar.b().get("url");
            obj5.getClass();
            lVar.e = (String) obj5;
            if (obj3 instanceof Double) {
                longValue = ((Number) obj3).doubleValue();
            } else {
                obj3.getClass();
                longValue = ((Long) obj3).longValue();
            }
            lVar.f = longValue / 1000.0d;
            if (obj4 instanceof Double) {
                longValue2 = ((Number) obj4).doubleValue();
            } else {
                obj4.getClass();
                longValue2 = ((Long) obj4).longValue();
            }
            lVar.g = longValue2 / 1000.0d;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            io.sentry.util.network.d dVar = (io.sentry.util.network.d) this.b.remove(eVar);
            if (dVar != null) {
                String str7 = dVar.a;
                if (str7 != null) {
                    linkedHashMap2.put("method", str7);
                }
                Integer num = dVar.b;
                if (num != null) {
                    linkedHashMap2.put("statusCode", num);
                }
                Long l = dVar.c;
                if (l != null) {
                    linkedHashMap2.put("requestBodySize", l);
                }
                Long l2 = dVar.d;
                if (l2 != null) {
                    linkedHashMap2.put("responseBodySize", l2);
                }
                com.socure.docv.capturesdk.core.extractor.c cVar = dVar.e;
                if (cVar != null) {
                    LinkedHashMap linkedHashMap3 = (LinkedHashMap) cVar.d;
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    Long l3 = (Long) cVar.b;
                    if (l3 != null) {
                        linkedHashMap4.put("size", l3);
                    }
                    xh6 xh6Var = (xh6) cVar.c;
                    if (xh6Var != null) {
                        linkedHashMap4.put("body", xh6Var.c);
                        List list = (List) xh6Var.d;
                        if (list != null) {
                            List list2 = list;
                            ArrayList arrayList = new ArrayList(CollectionsKt.w(list2));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((io.sentry.util.network.a) it.next()).getValue());
                            }
                            linkedHashMap4.put("warnings", arrayList);
                        }
                    }
                    if (!linkedHashMap3.isEmpty()) {
                        linkedHashMap4.put("headers", linkedHashMap3);
                    }
                    if (!linkedHashMap4.isEmpty()) {
                        linkedHashMap2.put("request", linkedHashMap4);
                    }
                }
                com.socure.docv.capturesdk.core.extractor.c cVar2 = dVar.f;
                if (cVar2 != null) {
                    LinkedHashMap linkedHashMap5 = (LinkedHashMap) cVar2.d;
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                    Long l4 = (Long) cVar2.b;
                    if (l4 != null) {
                        linkedHashMap6.put("size", l4);
                    }
                    xh6 xh6Var2 = (xh6) cVar2.c;
                    if (xh6Var2 != null) {
                        linkedHashMap6.put("body", xh6Var2.c);
                        List list3 = (List) xh6Var2.d;
                        if (list3 != null) {
                            List list4 = list3;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.w(list4));
                            Iterator it2 = list4.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((io.sentry.util.network.a) it2.next()).getValue());
                            }
                            linkedHashMap6.put("warnings", arrayList2);
                        }
                    }
                    if (!linkedHashMap5.isEmpty()) {
                        linkedHashMap6.put("headers", linkedHashMap5);
                    }
                    if (!linkedHashMap6.isEmpty()) {
                        linkedHashMap2.put("response", linkedHashMap6);
                    }
                }
            }
            Map b3 = eVar.b();
            b3.getClass();
            for (Map.Entry entry : b3.entrySet()) {
                String str8 = (String) entry.getKey();
                Object value = entry.getValue();
                if (d.contains(str8)) {
                    str8.getClass();
                    String s = kotlin.text.e.s(str8, "content_length", "body_size");
                    linkedHashMap2.put(((Regex) c.getValue()).e(StringsKt.j0(s, ".", s), b.i), value);
                }
            }
            lVar.h = new ConcurrentHashMap(linkedHashMap2);
            return lVar;
        }
        String str9 = "navigation";
        if (Intrinsics.areEqual(eVar.e, "navigation") && Intrinsics.areEqual(eVar.g, "app.lifecycle")) {
            str9 = "app." + eVar.b().get("state");
        } else if (Intrinsics.areEqual(eVar.e, "navigation") && Intrinsics.areEqual(eVar.g, "device.orientation")) {
            str9 = eVar.g;
            str9.getClass();
            Object obj6 = eVar.b().get("position");
            if (!Intrinsics.areEqual(obj6, "landscape") && !Intrinsics.areEqual(obj6, "portrait")) {
                return null;
            }
            linkedHashMap.put("position", obj6);
        } else if (Intrinsics.areEqual(eVar.e, "navigation")) {
            if (Intrinsics.areEqual(eVar.b().get("state"), "resumed")) {
                Object obj7 = eVar.b().get("screen");
                if (obj7 instanceof String) {
                    str5 = (String) obj7;
                } else {
                    str5 = null;
                }
                if (str5 != null) {
                    str4 = StringsKt.k0(str5, str5, '.');
                    if (str4 != null) {
                        return null;
                    }
                    linkedHashMap.put("to", str4);
                }
                str4 = null;
                if (str4 != null) {
                }
            } else {
                Map b4 = eVar.b();
                b4.getClass();
                if (b4.containsKey("to")) {
                    Object obj8 = eVar.b().get("to");
                    if (obj8 instanceof String) {
                        str4 = (String) obj8;
                        if (str4 != null) {
                        }
                    }
                }
                str4 = null;
                if (str4 != null) {
                }
            }
        } else {
            if (Intrinsics.areEqual(eVar.g, "ui.click")) {
                Object obj9 = eVar.b().get("view.id");
                if (obj9 == null && (obj9 = eVar.b().get("view.tag")) == null) {
                    obj9 = eVar.b().get("view.class");
                }
                if (obj9 instanceof String) {
                    str = (String) obj9;
                } else {
                    str = null;
                }
                if (str == null) {
                    return null;
                }
                Map b5 = eVar.b();
                b5.getClass();
                linkedHashMap.putAll(b5);
                str9 = "ui.tap";
                p5Var = null;
            } else if (Intrinsics.areEqual(eVar.e, MessageType.SYSTEM) && Intrinsics.areEqual(eVar.g, "network.event")) {
                if (Intrinsics.areEqual(eVar.b().get("action"), "NETWORK_LOST")) {
                    obj = "offline";
                } else {
                    Map b6 = eVar.b();
                    b6.getClass();
                    if (!b6.containsKey("network_type")) {
                        return null;
                    }
                    Object obj10 = eVar.b().get("network_type");
                    if (obj10 instanceof String) {
                        str2 = (String) obj10;
                    } else {
                        str2 = null;
                    }
                    if (str2 == null || str2.length() == 0) {
                        return null;
                    }
                    obj = eVar.b().get("network_type");
                }
                linkedHashMap.put("state", obj);
                if (Intrinsics.areEqual(this.a, linkedHashMap.get("state"))) {
                    return null;
                }
                Object obj11 = linkedHashMap.get("state");
                if (obj11 instanceof String) {
                    str3 = (String) obj11;
                } else {
                    str3 = null;
                }
                this.a = str3;
                str9 = "device.connectivity";
            } else if (Intrinsics.areEqual(eVar.b().get("action"), "BATTERY_CHANGED")) {
                Map b7 = eVar.b();
                b7.getClass();
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                for (Map.Entry entry2 : b7.entrySet()) {
                    String str10 = (String) entry2.getKey();
                    if (Intrinsics.areEqual(str10, "level") || Intrinsics.areEqual(str10, "charging")) {
                        linkedHashMap7.put(entry2.getKey(), entry2.getValue());
                    }
                }
                linkedHashMap.putAll(linkedHashMap7);
                str9 = "device.battery";
            } else {
                str9 = eVar.g;
                str = eVar.d;
                p5Var = eVar.i;
                Map b8 = eVar.b();
                b8.getClass();
                linkedHashMap.putAll(b8);
            }
            if (str9 == null && str9.length() != 0) {
                io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
                aVar.b = eVar.c().getTime();
                aVar.d = eVar.c().getTime() / 1000.0d;
                aVar.e = "default";
                aVar.f = str9;
                aVar.g = str;
                aVar.h = p5Var;
                aVar.i = new ConcurrentHashMap(linkedHashMap);
                return aVar;
            }
        }
        str = null;
        p5Var = null;
        return str9 == null ? null : null;
    }
}
