package defpackage;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class wca {
    public final String a;

    public wca(String str) {
        str.getClass();
        this.a = str;
    }

    public static CharSequence d(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public void a(StringBuilder sb, Iterator it) {
        if (it.hasNext()) {
            sb.append(d(it.next()));
            while (it.hasNext()) {
                sb.append((CharSequence) this.a);
                sb.append(d(it.next()));
            }
        }
    }

    public final void b(StringBuilder sb, Iterator it) {
        try {
            a(sb, it);
        } catch (IOException e) {
            dmk.i(e);
        }
    }

    public final String c(Collection collection) {
        Iterator it = collection.iterator();
        StringBuilder sb = new StringBuilder();
        b(sb, it);
        return sb.toString();
    }

    public wca(wca wcaVar) {
        this.a = wcaVar.a;
    }
}
