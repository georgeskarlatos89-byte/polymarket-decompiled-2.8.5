package defpackage;

import com.squareup.moshi.JsonReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class i0n {
    public static final e78 a = new e78(9);
    public static final yuh b = new yuh(1);
    public static final yuh c = new yuh(2);
    public static final yuh d = new yuh(3);
    public static final yuh e = new yuh(4);
    public static final yuh f = new yuh(5);
    public static final yuh g = new yuh(6);
    public static final yuh h = new yuh(7);
    public static final yuh i = new yuh(8);
    public static final yuh j = new yuh(0);

    /* JADX WARN: Type inference failed for: r8v1, types: [wud, h2i] */
    public static final wud a(r59 r59Var) {
        r59 r59Var2 = new r59(1);
        for (String str : ((Map) r59Var.a).keySet()) {
            List I0 = r59Var.I0(str);
            if (I0 == null) {
                I0 = CollectionsKt.emptyList();
            }
            String d2 = r84.d(str, 0, 0, 15);
            List list = I0;
            ArrayList arrayList = new ArrayList(CollectionsKt.w(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(r84.d((String) it.next(), 0, 0, 11));
            }
            r59Var2.G(d2, arrayList);
        }
        return new h2i((Map) r59Var2.a);
    }

    public static int b(JsonReader jsonReader, String str, int i2, int i3) {
        int nextInt = jsonReader.nextInt();
        if (nextInt >= i2 && nextInt <= i3) {
            return nextInt;
        }
        String e2 = jsonReader.e();
        StringBuilder q = m51.q("Expected ", str, " but was ", nextInt, " at path ");
        q.append(e2);
        throw new RuntimeException(q.toString());
    }
}
