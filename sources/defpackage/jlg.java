package defpackage;

import bo.app.p8;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class jlg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Set b;

    public /* synthetic */ jlg(int i, Set set) {
        this.a = i;
        this.b = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Set set = this.b;
        switch (i) {
            case 0:
                return "Found " + set.size() + " metadata tags to migrate";
            default:
                return p8.a(set);
        }
    }
}
