package defpackage;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class oxn {
    public static String a(AbstractList abstractList) {
        CharSequence obj;
        CharSequence obj2;
        Iterator it = abstractList.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb.append(obj);
                while (it.hasNext()) {
                    sb.append((CharSequence) "\n");
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb.append(obj2);
                }
            }
            return sb.toString();
        } catch (IOException e) {
            dmk.i(e);
            return null;
        }
    }
}
