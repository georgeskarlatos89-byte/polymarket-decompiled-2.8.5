package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lza implements q59 {
    public final Map b;
    public volatile Map c;

    public lza(Map map) {
        this.b = Collections.unmodifiableMap(map);
    }

    @Override // defpackage.q59
    public final Map a() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.c = Collections.unmodifiableMap(b());
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((kza) list.get(i)).a;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(entry.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lza) {
            return this.b.equals(((lza) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return hdi.s(new StringBuilder("LazyHeaders{headers="), this.b, '}');
    }
}
