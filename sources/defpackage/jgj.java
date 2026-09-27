package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class jgj implements Iterable, xja {
    public static final qje b = new qje(25);
    public static final jgj c = new jgj(CollectionsKt.emptyList());
    public final el0 a;

    /* JADX WARN: Type inference failed for: r5v1, types: [el0, java.lang.Object, hl0] */
    public jgj(List list) {
        this.a = lc7.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hc0 hc0Var = (hc0) it.next();
            hc0Var.getClass();
            KClass orCreateKotlinClass = lvf.a.getOrCreateKotlinClass(hc0.class);
            orCreateKotlinClass.getClass();
            String qualifiedName = orCreateKotlinClass.getQualifiedName();
            qualifiedName.getClass();
            int R = b.R(qualifiedName);
            int a = this.a.a();
            if (a != 0) {
                if (a == 1) {
                    el0 el0Var = this.a;
                    try {
                        el0Var.getClass();
                        ejd ejdVar = (ejd) el0Var;
                        int i = ejdVar.b;
                        if (i == R) {
                            this.a = new ejd(hc0Var, R);
                        } else {
                            ?? obj = new Object();
                            obj.a = new Object[20];
                            obj.b = 0;
                            obj.set(i, ejdVar.a);
                            this.a = obj;
                        }
                    } catch (ClassCastException e) {
                        fi9.n(a(el0Var, 1, "OneElementArrayMap"), e);
                        throw null;
                    }
                }
                this.a.set(R, hc0Var);
            } else {
                el0 el0Var2 = this.a;
                if (el0Var2 instanceof lc7) {
                    this.a = new ejd(hc0Var, R);
                } else {
                    dmk.n(a(el0Var2, 0, "EmptyArrayMap"));
                    throw null;
                }
            }
        }
    }

    public static String a(el0 el0Var, int i, String str) {
        Object obj;
        StringBuilder sb = new StringBuilder("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("Type: ");
        sb2.append(el0Var.getClass());
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) b.b;
        sb3.append("[\n");
        ArrayList arrayList = new ArrayList(CollectionsKt.w(el0Var));
        int i2 = 0;
        for (Object obj2 : el0Var) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((Number) ((Map.Entry) obj).getValue()).intValue() == i2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            sb3.append("  " + ((Map.Entry) obj) + '[' + i2 + "]: " + obj2);
            sb3.append('\n');
            arrayList.add(sb3);
            i2 = i3;
        }
        sb3.append("]");
        sb3.append('\n');
        sb.append("Content: ".concat(sb3.toString()));
        sb.append('\n');
        return sb.toString();
    }

    public final boolean isEmpty() {
        if (this.a.a() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
