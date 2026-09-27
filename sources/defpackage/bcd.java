package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bcd implements yj9 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ bcd[] $VALUES;
    public static final acd Companion;
    public static final bcd OPTED_IN;
    public static final bcd SUBSCRIBED;
    public static final bcd UNSUBSCRIBED;
    private static final Map<String, bcd> map;
    private final String key;

    /* JADX WARN: Type inference failed for: r0v2, types: [acd, java.lang.Object] */
    static {
        bcd bcdVar = new bcd("OPTED_IN", 0, "opted_in");
        OPTED_IN = bcdVar;
        bcd bcdVar2 = new bcd("SUBSCRIBED", 1, "subscribed");
        SUBSCRIBED = bcdVar2;
        bcd bcdVar3 = new bcd("UNSUBSCRIBED", 2, "unsubscribed");
        UNSUBSCRIBED = bcdVar3;
        bcd[] bcdVarArr = {bcdVar, bcdVar2, bcdVar3};
        $VALUES = bcdVarArr;
        wg7 wg7Var = new wg7(bcdVarArr);
        $ENTRIES = wg7Var;
        Companion = new Object();
        int a = c1c.a(CollectionsKt.w(wg7Var));
        LinkedHashMap linkedHashMap = new LinkedHashMap(a < 16 ? 16 : a);
        Iterator it = wg7Var.iterator();
        while (true) {
            i3 i3Var = (i3) it;
            if (i3Var.hasNext()) {
                Object next = i3Var.next();
                linkedHashMap.put(((bcd) next).key, next);
            } else {
                map = linkedHashMap;
                return;
            }
        }
    }

    public bcd(String str, int i, String str2) {
        this.key = str2;
    }

    public static final /* synthetic */ Map b() {
        return map;
    }

    public static bcd valueOf(String str) {
        return (bcd) Enum.valueOf(bcd.class, str);
    }

    public static bcd[] values() {
        return (bcd[]) $VALUES.clone();
    }

    public final String c() {
        return this.key;
    }

    @Override // defpackage.yj9
    public final Object forJsonPut() {
        return this.key;
    }
}
