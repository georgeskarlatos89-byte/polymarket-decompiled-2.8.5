package bo.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fc extends rb {
    public fc(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // bo.app.aa
    public final boolean a(pa paVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((aa) obj).a(paVar)) {
                return true;
            }
        }
        return false;
    }
}
