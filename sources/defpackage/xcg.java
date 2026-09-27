package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class xcg implements Iterable {
    public ucg a;
    public ucg b;
    private final WeakHashMap<wcg, Boolean> c = new WeakHashMap<>();
    public int d = 0;

    public final tcg a() {
        tcg tcgVar = new tcg(this.b, this.a, 1);
        this.c.put(tcgVar, Boolean.FALSE);
        return tcgVar;
    }

    public ucg b(Object obj) {
        ucg ucgVar = this.a;
        while (ucgVar != null && !ucgVar.a.equals(obj)) {
            ucgVar = ucgVar.c;
        }
        return ucgVar;
    }

    public final vcg c() {
        vcg vcgVar = new vcg(this);
        this.c.put(vcgVar, Boolean.FALSE);
        return vcgVar;
    }

    public Object d(Object obj) {
        ucg b = b(obj);
        if (b == null) {
            return null;
        }
        this.d--;
        if (!this.c.isEmpty()) {
            Iterator<wcg> it = this.c.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(b);
            }
        }
        ucg ucgVar = b.d;
        ucg ucgVar2 = b.c;
        if (ucgVar != null) {
            ucgVar.c = ucgVar2;
        } else {
            this.a = ucgVar2;
        }
        ucg ucgVar3 = b.c;
        if (ucgVar3 != null) {
            ucgVar3.d = ucgVar;
        } else {
            this.b = ucgVar;
        }
        b.c = null;
        b.d = null;
        return b.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((defpackage.tcg) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xcg)) {
            return false;
        }
        xcg xcgVar = (xcg) obj;
        if (this.d != xcgVar.d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = xcgVar.iterator();
        while (true) {
            tcg tcgVar = (tcg) it;
            if (!tcgVar.hasNext()) {
                break;
            }
            tcg tcgVar2 = (tcg) it2;
            if (!tcgVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) tcgVar.next();
            Object next = tcgVar2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            tcg tcgVar = (tcg) it;
            if (tcgVar.hasNext()) {
                i += ((Map.Entry) tcgVar.next()).hashCode();
            } else {
                return i;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        tcg tcgVar = new tcg(this.a, this.b, 0);
        this.c.put(tcgVar, Boolean.FALSE);
        return tcgVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            tcg tcgVar = (tcg) it;
            if (tcgVar.hasNext()) {
                sb.append(((Map.Entry) tcgVar.next()).toString());
                if (tcgVar.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
