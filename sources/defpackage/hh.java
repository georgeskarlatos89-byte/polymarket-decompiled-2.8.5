package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class hh implements i80 {
    public final /* synthetic */ int a;
    public final List b;

    public /* synthetic */ hh(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.i80
    public List b() {
        return this.b;
    }

    @Override // defpackage.i80
    public boolean c() {
        List list = this.b;
        if (list.isEmpty() || (list.size() == 1 && ((soa) list.get(0)).c())) {
            return true;
        }
        return false;
    }

    public abstract List d();

    public abstract int e();

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                List list = this.b;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
