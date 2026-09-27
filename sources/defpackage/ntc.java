package defpackage;

import androidx.lifecycle.ViewModelStore;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.UInt;
import kotlin.text.i;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ntc extends dak {
    public final LinkedHashMap b = new LinkedHashMap();

    @Override // defpackage.dak
    public final void onCleared() {
        LinkedHashMap linkedHashMap = this.b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((ViewModelStore) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(i.b(UInt.m886constructorimpl(System.identityHashCode(this))));
        sb.append("} ViewModelStores (");
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
