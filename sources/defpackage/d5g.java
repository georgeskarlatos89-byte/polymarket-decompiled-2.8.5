package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.Headers;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class d5g {
    public static final d5g b = new d5g(Collections.EMPTY_LIST);
    public final List a;

    public d5g(List list) {
        this.a = list;
    }

    public static d5g a(Headers headers) {
        if (headers != null && headers.size() != 0) {
            ArrayList arrayList = new ArrayList(headers.size());
            for (int i = 0; i < headers.size(); i++) {
                arrayList.add(new av9(headers.name(i), headers.value(i), 1));
            }
            return new d5g(Collections.unmodifiableList(arrayList));
        }
        return b;
    }

    public final String toString() {
        return "ResponseHeaders(" + this.a.size() + " headers)";
    }
}
