package androidx.lifecycle;

import defpackage.dak;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/lifecycle/ViewModelStore;", "", "<init>", "()V", "", "", "Ldak;", "a", "Ljava/util/Map;", "map", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class ViewModelStore {

    /* renamed from: a, reason: from kotlin metadata */
    private final Map<String, dak> map = new LinkedHashMap();

    public final void a() {
        Iterator<dak> it = this.map.values().iterator();
        while (it.hasNext()) {
            it.next().clear$lifecycle_viewmodel();
        }
        this.map.clear();
    }

    public final dak b(String str) {
        str.getClass();
        return this.map.get(str);
    }

    public final HashSet c() {
        return new HashSet(this.map.keySet());
    }

    public final void d(String str, dak dakVar) {
        dakVar.getClass();
        dak put = this.map.put(str, dakVar);
        if (put != null) {
            put.clear$lifecycle_viewmodel();
        }
    }
}
